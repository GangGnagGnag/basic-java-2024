package Music;

public class Music2 {
    public static void main(String[] args) {    //MusicPlayerData 클래스 사용
        MusicPlayerData data = new MusicPlayerData();


        on(data);   // 메서드 호출
        volumeUp(data);
        volumeUp(data);
        volumemin(data);
        showStatus(data);
        off(data);

    }

    //    메서드 생성
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");

    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨을 증가 합니다" + data.volume);
    }

    static void volumemin(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨을 증가 합니다" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어를 확인합니다");
        if (data.isOn) {
            System.out.println("음악 플레이어on, 볼륨: " + data.volume);

        } else {
            System.out.println("프로그램을 종료합니다");
        }
    }
}

/* 뮤직 , 뮤직 1클래스와 동일한 결과값이 출력됨
메서드를 호출해서 더욱 간결하게 코드를 만들 수 있다.
 */




