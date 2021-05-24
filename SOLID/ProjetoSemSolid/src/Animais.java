
public class Animais implements AcaoAnimal{
	private String raca;
	private String especie;
	
	public Animais(String raca, String especie) {
		this.raca = raca;
		this.especie = especie;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}


	@Override
	public void bicar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chocar() {
		// TODO Auto-generated method stub
		
	}

	
	

}
