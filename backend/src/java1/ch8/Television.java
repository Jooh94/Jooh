package java1.ch8;

public class Television implements RemoteControl {
		// [implements 인터페이스] :구현하다(추상을 구현)
		//	[extends 클래스] 	:연장하다 (상속)
	// RemoteControl 인터페이스의 추상 메소드를 구현하자
	private int volume;

	public void turnOn() {System.out.println("Tv를 켭니다");}
	
	public void turnOff() {System.out.println("TV를 끕니다");}
	
	public void setVolume(int volume) {
		// 만일 현재 tv 소음이 리모콘의 최대소음보다 크면
		if(volume> RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; 
		}else if( volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+ this.volume);
	}
	
}
