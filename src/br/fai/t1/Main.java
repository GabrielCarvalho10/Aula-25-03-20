package br.fai.t1;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		ServicoDeCachorros aroldo = new ServicoDeCachorros();
		aroldo.setId(1);

		ServicoDeCachorros tiburssinho = new ServicoDeCachorros();
		tiburssinho.setId(2);

		ServicoDeCachorros tobias = new ServicoDeCachorros();
		tobias.setId(3);

		Thread thread1 = new Thread(aroldo);
		thread1.start();

		Thread thread2 = new Thread(tiburssinho);
		thread2.start();

		Thread thread3 = new Thread(tobias);
		thread3.start();
	}

		
}

