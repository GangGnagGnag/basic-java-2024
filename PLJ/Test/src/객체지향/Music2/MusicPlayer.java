package 객체지향.Music2;

/*
음악 플레이어
속성: volume , isOn
기능: on() , off() , volumeUp() , volumeDown() , showStatus()
 */

public class MusicPlayer {
    int volume = 0;                 //volum, isOn 맴버변수
    boolean isOn = false;

    //    메서드 생성

  void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

   void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");

    }

 void volumeUp() {
        volume++;
        System.out.println("볼륨을 증가 합니다" + volume);
    }

    void volumemin() {
        volume--;
        System.out.println("볼륨을 증가 합니다" + volume);
    }

 void showStatus() {
        System.out.println("음악 플레이어를 확인합니다");
        if (isOn) {
            System.out.println("음악 플레이어on, 볼륨: " + volume);

        } else {
            System.out.println("프로그램을 종료합니다");
        }
    }
}

