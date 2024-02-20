package ch16.sec03;

import java.security.SecurityPermission;

public class Person {
    public void action1(Workable workable) {
        workable.work("한국진", "프로그래밍");
    }

    public void action2(Speakable speakable) {
        speakable.speak("반갑노");
    }
}
