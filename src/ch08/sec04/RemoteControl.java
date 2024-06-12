package ch08.sec04;

public interface RemoteControl {
//	상수필드				
//	interface 안에서는 pulic static final 을 붙이지 않아도 상수로 인식함
//	아니면 아래처럼 굵은 글자로 되어 있을때도 상수라고 인식해도됨
	int MAX_VOLUME = 10;	//상수필드는 대문자로 작성하는것이 관례이다.
	int MIN_VOLUME = 0;		// 필드에 대문자로 작성되어 있으면 상수필드
		
//	추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
