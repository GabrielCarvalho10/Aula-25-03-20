package br.fai.t1;

public class Main {

	public static void main(String[] args) {
		///Ganha uma instacia  do Main
		Main app = new Main();
		///Chama o método start, para executar o programa 
		app.start();

	}

	private void start() {
		///Cria um objeto da classe ServicoDeCachorros e renomea como aroldo
		ServicoDeCachorros aroldo = new ServicoDeCachorros();
		///O objeto aroldo é iniciado com o valor 1
		aroldo.setId(1);
		
		///Cria um objeto da classe ServicoDeCachorros e renomea como tiburssinho
		ServicoDeCachorros tiburssinho = new ServicoDeCachorros();
		///O objeto tiburssinho é iniciado com o valor 2
		tiburssinho.setId(2);

		///Cria um objeto da classe ServicoDeCachorros e renomea tobias
		ServicoDeCachorros tobias = new ServicoDeCachorros();
		///O objeto tiburssinho é iniciado com o valor 3
		tobias.setId(3);

		///Cria uma thread e chama o objeto aroldo
		Thread thread1 = new Thread(aroldo);
		///Coloca em execuçao a thread1
		thread1.start();

		///Cria uma thread e chama o objeto tiburssinho
		Thread thread2 = new Thread(tiburssinho);
		///Coloca em execuçao a thread2
		thread2.start();

		///Cria uma thread e chama o objeto tobias
		Thread thread3 = new Thread(tobias);
		///Coloca em execuçao a thread2
		thread3.start();
	}

		
}

