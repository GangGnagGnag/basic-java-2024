package 생성자;

public class MemberThis {
    String nameField;
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
/*
nameField 는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다.
이 경우 없으므로 맴버 변수에서 찾는다.
nameParameter 는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다.
이 경우 매개변수가 있으므로 매개변수를 사용한다.
 */
