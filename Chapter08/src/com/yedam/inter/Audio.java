package com.yedam.inter;

public class Audio implements RemoteControl{

	
	//필드
	//setVolume을 통해서 볼륨 조절을 위해서 private
	private int volume;
	//생성자
	
	//메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
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
		
		System.out.println("현재 Audio 볼륨 : "+this.volume);
		
	}
	
}
