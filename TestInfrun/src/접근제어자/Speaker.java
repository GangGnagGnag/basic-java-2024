package 접근제어자;

public class Speaker {
    //생성자를 통해서 초기음량 값 지정
    private int volume;
    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 다운 호출");
    }
    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
