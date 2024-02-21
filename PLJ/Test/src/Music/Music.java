/*
1. 음악 플레이어를 켜고 끌 수 있어야 한다.
2. 음악 프레이어의 볼륨을 증가, 감소할 수 있어야 한다.
3. 음악 플레이어의 상태를 확인할 수 있어야 한다.
 */

package Music;

public class Music {
    public static void main(String[] args) {

        int volume = 0;
        boolean isOn= false;

//        음악 플레이어를 시작합니다
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
//        음악 플레이어 볼륨:1
        volume++;
        System.out.println("볼륨을 증가 합니다" + volume);
//        음악 플레이어 볼륨:2
        volume++;
        System.out.println("볼륨을 증가 합니다" + volume);
//        음악 플레이어 볼륨:1
        volume--;
        System.out.println("볼륨을 감소 합니다" + volume);
//        음악 플레이어 상태 확인
        System.out.println("음악 플레이어를 확인합니다");
        if(isOn) {
            System.out.println("음악 플레이어on, 볼륨: " + volume);
//            음악 플레이어 ON, 볼륨:1
        } else {
            System.out.println("프로그램을 종료합니다");
        }
//        음악 플레이어를 종료합니다
    }
}
