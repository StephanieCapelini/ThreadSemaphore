package controller;

import java.util.concurrent.Semaphore;

public class Carro extends Thread {
	int idThread;
	Semaphore semaforo;
	
	public Carro(int carros, Semaphore semaforo) {
		this.idThread= carros;
		this.semaforo= semaforo;
	}
	@Override 
	public void run() {
		try {
			semaforo.acquire();
			Semaforo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
	private void Semaforo() {
		if(idThread== 1) {
			System.out.println("o carro #" + idThread + " esta passando do norte para o sul");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(idThread== 2) {
			System.out.println("o carro #" + idThread + " esta passando do leste para o oeste");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(idThread== 3) {
			System.out.println("o carro #" + idThread + " esta passando do sul para o norte");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(idThread== 4) {
			System.out.println("o carro #" + idThread + " esta passando do oeste para o leste");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
