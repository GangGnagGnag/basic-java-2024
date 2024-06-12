package ch06.sec14;

public class Car {
	
//	필드선언
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
//		speed 필드와 Gettet/Setter 선언
		
		}
	public void setSpeed(int speed) {// 초기화 메서드
		if(speed <0) {
		this.speed = 0;		// 초기화
		return;
	} else {
		this.speed = speed;
		}
	}
// 	stop 필드의 getter/setter 선언
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}


/*public Car(){
	
}*/
//생성자는 일케 생김

