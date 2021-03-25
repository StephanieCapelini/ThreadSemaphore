package view;

import java.util.concurrent.Semaphore;
import controller.Carro;

public class main {

	public static void main(String[] args) {
	
		Semaphore semaforo= new Semaphore(1);
		
		for(int idThread= 1; idThread<5; idThread++) {
			Thread Start= new Carro(idThread, semaforo);
			Start.start();
		}
				

	}

}
