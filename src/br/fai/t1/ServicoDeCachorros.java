package br.fai.t1;

///class ServicoDeCachorros implements Runnable serve para que possa usar o metodo run para usar thread.
public class ServicoDeCachorros implements Runnable{
	///Metodo que vai utilizar o thread e vai printar valores de 0 a 100 utilizando o for.
	public void run() {
		for (int i = 0; i < 100; i++) {
			///plintar os numeros 
			System.out.println("Id do serviço: " + id + " | valor: " + i);
		}
	}
	///Uma variavel privada e de numero inteiro 
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
