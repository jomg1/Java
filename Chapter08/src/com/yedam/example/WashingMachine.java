package com.yedam.example;

public interface WashingMachine extends Dry{
	public void start();
	public void pause();
	public void stop();
	public int changeSpeed(int speed);
	
	
	
}
