package formas;

public class Cliente extends Hotel {
	private String nome;
	
	
	public Cliente(int numQuarto, String andar, String nome )
	{
		super(numQuarto, andar);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void armazenaDados()
	{
		System.out.println("Cliente do Quarto: " + getNumQuarto() );
		System.out.println("Piso / Andar: " + getAndar());
		System.out.println("Nome do Cliente: " + nome);
	}

	
}
