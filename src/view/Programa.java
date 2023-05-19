package view;

import formas.Cliente;
import formas.Quarto;


public class Programa {
	public static void main(String[] args)
	{
		
		Quarto quarto = new Quarto(1, "Primeiro andar", "Quarto de Solteiro");
		quarto.armazenaDados();
		quarto.Cadastro();
		
		Cliente cliente = new Cliente(1, "Primeiro andar", "Liver");
		cliente.armazenaDados();
		
		
	}

}
