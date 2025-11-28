package com.demo;

public class JavaCar extends Accerlate implements Breakable , Coolable , Audible{

	@Override
	public void breake() {
		System.out.println("brteak");
		
	}
	
	public static void main(String[] args) {
		JavaCar car = new JavaCar();
		car.acce();
		car.breake();
		car.cool();
		car.playMusic();
	}

	@Override
	public void playMusic() {
		System.out.println(" want to make music ");
	}

	@Override
	public void cool() {
		System.out.println("want to make freeze ");
	}

}
