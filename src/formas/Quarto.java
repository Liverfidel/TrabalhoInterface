package formas;

import interfaces.Registro;

public class Quarto extends Hotel implements Registro {
	private String tipo;
	
	public Quarto(int numQuarto, String andar, String tipo) {
		super(numQuarto, andar);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void armazenaDados()
	{
		System.out.println("Id do Quarto: " + getNumQuarto());
		System.out.println("Piso / Andar: " + getAndar());
		System.out.println("Tipo do Quarto: " + tipo );
	}
	
	@Override
	public void Cadastro()
	{
		 System.out.println("Cadastrando Hospede...");
	}

}
