package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
//        HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();

//        Member 객체 저장
        set.add(new Member("한국진", 29));
        set.add(new Member("한국이", 29));

//        저장된 객체 수 출력
        System.out.println("총 객체수 : " + set.size());
    }
}
