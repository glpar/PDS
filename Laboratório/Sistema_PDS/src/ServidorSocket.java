import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket{
	public static void main(String[] args) {
		
		 ServerSocket servidor = null;
		 try {
			 System.out.println("Iniciando o Servidor..");
			 servidor = new ServerSocket(9999);
			 System.out.println("Servidor iniciado");
			 System.out.println("Comandos:\n ::msg envia uma mensagem para um cliente especifico (nao separe com espaços) \n ::sair vocÃª se desconecta do servidor"
			 		+ "\n ::listar-clientes lista todos os clientes logados");
			 
			 while(true) {
				 Socket cliente = servidor.accept();
				 new GerenciadorDeClientes(cliente);
				 System.out.println("Cliente conectado");
			 }
			
			 
		 } catch (IOException e) {
			 try {
				 if(servidor != null)
					 servidor.close();
			 } catch (IOException e1) {}
			 
			 System.err.println("Porto ocupada ou servidor ja foi fechado");
			 e.printStackTrace();
		 }
		 
		
	}

}
