package java1.ch8;

public class Audio implements RemoteControl{
	private int volume;

	public void turnOn() {System.out.println("Audio를 켭니다");}
	
	public void turnOff() {System.out.println("Audio를 끕니다");}
	
	public void setVolume(int volume) {
		// 만일 현재 tv 소음이 리모콘의 최대소음보다 크면
		if(volume> RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; 
		}else if( volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨 : "+ this.volume);
	}
}
