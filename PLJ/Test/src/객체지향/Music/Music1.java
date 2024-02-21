package 객체지향.Music;

public class Music1 {
    public static void main(String[] args) {    //MusicPlayerData 클래스 사용
        MusicPlayerData data = new MusicPlayerData();   //
//     new 키워드는 클래스의 생성자를 호출하여 객체를 생성합니다. 생성자는 객체를 초기화하는 역할을 합니다.
//        생성된 객채는 . 을 통해 접근가능


//        음악 플레이어를 시작합니다
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
//        음악 플레이어 볼륨:1
        data.volume++;
        System.out.println("볼륨을 증가 합니다" + data.volume);
//        음악 플레이어 볼륨:2
        data.volume++;
        System.out.println("볼륨을 증가 합니다" + data.volume);
//        음악 플레이어 볼륨:1
        data.volume--;
        System.out.println("볼륨을 감소 합니다" + data.volume);
//        음악 플레이어 상태 확인
        System.out.println("음악 플레이어를 확인합니다");
        if(data.isOn) {
            System.out.println("음악 플레이어on, 볼륨: " + data.volume);
//            음악 플레이어 ON, 볼륨:1
        } else {
            System.out.println("프로그램을 종료합니다");
        }
//        음악 플레이어를 종료합니다
    }
}
