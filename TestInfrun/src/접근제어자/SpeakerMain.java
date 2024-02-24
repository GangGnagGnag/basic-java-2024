package 접근제어자;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
//        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume  = 200;
//        speaker.showVolume();
//        speaker에 있는 volume을 private 로 사용했기 때문에 접근을 못함.
    }
}
