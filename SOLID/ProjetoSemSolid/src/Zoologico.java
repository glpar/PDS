import java.util.ArrayList;

public class Zoologico extends Animais{
	
	double caixa;
	ArrayList<Animais> animais = new ArrayList<Animais>();
	ArrayList<Secao> secao = new ArrayList<Secao>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	Pagamento pagamento;

	public Zoologico(String raca, String especie) {
		super(raca, especie);
	}
	
	public void adicionarAnimal(Animais animal) {
		animais.add(animal);
	}
	
	public void removerAnimal(Animais animal) {
		animais.remove(animal);
	}
	
	public void Pagamento(Pagamento pagamento) {
		if(pagamento.getTipo() == "cartao" ) {
		
			caixa += pagamento.getValor();
			System.out.println("Pagamento feito no cartão");
			
		}else if(pagamento.getTipo() == "dinheiro"){
			caixa += pagamento.getValor();
			System.out.println("Pagamento a vista");
		}else {
			System.out.println("Pagamento não efetuado");
		}
	}

	
	public double getCaixa() {
		return caixa;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public ArrayList<Animais> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animais> animais) {
		this.animais = animais;
	}

	public ArrayList<Secao> getSecao() {
		return secao;
	}

	public void setSecao(ArrayList<Secao> secao) {
		this.secao = secao;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}



}
