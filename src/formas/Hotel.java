package formas;

import interfaces.Registro;

public abstract class Hotel{
	
	private int numQuarto;
	private String andar;
	
	public Hotel(int numQuarto, String andar) {
		this.numQuarto = numQuarto;
		this.andar = andar;
		
	}

	public abstract void armazenaDados();

	

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}
	
	

}
