package PLJ;

public class ProductClass {

	    int id;             //물건번호
	    String name;        //물품이름
	    int price;          //물품 가격
	    int quantity;       //수량
	    ProductClass[] shoppingBasket; //물품을 저장할 장바구니
	    ProductClass(int id, String name, int price, int quantity){

	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }
	    void productInfo () {
	        String var = "물품번호: " + this.id + " 물품이름: " + this.name + " 물품가격: " + this.price + "원" + " 수량: " + this.quantity;
	        var += "개.";
	        System.out.println(var);
	    }
//	        메소드 생성시 기본적으로 void 로 시작하고 입력값이 있으면 나중에 뒤에 해주기
	        boolean checkQty(int purchaseQty) {         // 구입 가능한지 확인
	            return this.quantity >= purchaseQty ? true : false;
	        }
	    }




