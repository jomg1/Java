package com.yedam.inter;

public class Televison implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		//interface내의 상수이기 때문에 . 붙여 사용
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					//volume 0 < volume < 10
					this.volume = volume;
				}
				
				System.out.println("현재 TV 볼륨 : "+this.volume);

	}

}
