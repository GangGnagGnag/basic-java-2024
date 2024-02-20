package ch13.sec02.exam01;

public class Product< K, M >{   // 제네릭 타입
//                    타입 파라미터로 K, M 정의
//    필드
    private K kind;
    private M model;
//    타입 파라미터를 필드타입으로 사용
    
    
//    메소드
//    타입 파라미터를 리턴 타입과 매게 변수 타입으로 사용

    public K getKind() { return this.kind; }
    public M getModel() { return this.model; }
    public void setKind(K kind) { this.kind = kind; }
    public void setmodel(M model) { this.model = model; }
}
