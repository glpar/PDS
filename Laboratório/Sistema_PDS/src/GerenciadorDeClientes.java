import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


public class GerenciadorDeClientes extends Thread {
	
	private Socket cliente;
	private String nomeCliente;
	private PrintWriter escritor;
	private BufferedReader leitor;
	private static final Map<String,GerenciadorDeClientes> clientes = new HashMap<String,GerenciadorDeClientes>();

	public GerenciadorDeClientes(Socket cliente) {
		this.cliente = cliente;
		start();
	}
	/**
	 * 
	 */
	@Override
	public void run() {
		try {
			leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			escritor = new PrintWriter(cliente.getOutputStream(), true);
			escritor.println("Conexao estabelecida!");
			escritor.println("escreva seu nome: ");
			String msg = leitor.readLine();
			this.nomeCliente = msg.toLowerCase();
			escritor.println("Olá, " + this.nomeCliente);
			clientes.put(this.nomeCliente, this);
			
			while(true) {
				msg = leitor.readLine();
				if(msg.equalsIgnoreCase("::SAIR")) {
					this.cliente.close();
				} else if(msg.toLowerCase().startsWith("::msg")) {
					String nomeDestinatario = msg.substring(5, msg.length());
					System.out.println("enviando para: " + nomeDestinatario);
					GerenciadorDeClientes destinatario = clientes.get(nomeDestinatario);
					if(destinatario == null){
						escritor.println("O cliente informado nao existe");
					}else {
						escritor.println("Digite uma mensagem para o cliente " + destinatario.getNomeCliente());
						destinatario.getEscritor().println(this.nomeCliente + " disse: " + leitor.readLine());
					}
				}
				else if(msg.equals("::listar-clientes")) {
					StringBuffer str = new StringBuffer();
					for(String c: clientes.keySet()) {
						str.append(c);
						str.append(",");
					}
					str.delete(str.length()-1, str.length());
					escritor.println(str.toString());
				}else
						escritor.println(this.nomeCliente + ", você disse: " + msg);
			}
		} catch (IOException e) {
			System.err.println("O cliente fechou a conexao");
			clientes.remove(this.nomeCliente);
			e.printStackTrace();
		}
	
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public PrintWriter getEscritor() {
		return escritor;
	}
	
}
