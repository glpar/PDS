
public class Secao{
	private Boolean funcionamento;
	private Double caixa;
	

	void abrirSecao(Boolean funcionamento) {
		if(funcionamento == true) {
			funcionamento = true;
			System.out.println("A se��o est� aberta");
		}else {
			funcionamento = false;
			System.out.println("A se��o est� fechada");
		}
	}
	
	public void AdicionarFaturaSecao(Double cont) {
		
		caixa += cont;
		System.out.println("Valor adicionado � conta");
		
	
}
	
	
	
	public Boolean getFuncionamento() {
		return funcionamento;
	}

	public void setFuncionamento(Boolean funcionamento) {
		this.funcionamento = funcionamento;
	}

	public Double getCaixa() {
		return caixa;
	}

	public void setCaixa(Double fatura) {
		this.caixa = fatura;
	}

	

}
