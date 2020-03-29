package br.fai.t1;

public class ServicoDeCachorros implements Runnable{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Id do serviço: " + id + " | valor: " + i);
		}
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
