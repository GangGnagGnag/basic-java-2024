package 장바구니;

public class Pro {
    public int num; // 물품번호
    public String name; // 물품 이름
    public int price; //가격
    public int qut; // 갯수

    Pro(int num, String name, int price, int qut){
        this.num = num;
        this.name = name;
        this.price = price;
        this.qut = qut;
    }

    void ProInfo(){
        String mart = "물품 번호는 " + num + "물건은 " + name + "가격은 " + price + "수량은 " + qut + "개 ";
        mart += "물품등록 완료";
        System.out.println(mart);
    }
}
