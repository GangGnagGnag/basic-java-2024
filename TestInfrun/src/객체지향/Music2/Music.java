package 객체지향.Music2;

public class Music {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();     //객체 생성

//        플레이어 켜기
        mp.on();
//        볼륨 증가
        mp.volumeUp();
//        볼륨 증가
        mp.volumeUp();
//            볼륨 감소
        mp.volumemin();
//        상태 확인
        mp.showStatus();
//        전원 끄기
        mp.off();
    }
}
