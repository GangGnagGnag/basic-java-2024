package PLJ;

public class CustomClass {

	    int id;            // 회원 번호
	    String name;        // 회원 이름
	    int age;            //회원 나이

	    ProductClass[] shoppingBasket;          //물품을 저장할 바구니 배열생성
	    int [] count = new int[10];      // 물건을 가져오는 값 타입이 int 이기 때문에 타입을 int 로 잡아줘야함

	    int purchaseIdx = 0;


	    CustomClass(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    CustomClass(int id, String name, int age, ProductClass[] shoppingBasket) {
	//  매게 변수로 그대로 사용, 배열은 생성과 동시에 초기화를 해주어야하는데 여기서는 나중에 배열을 선언 해주기로 함
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.shoppingBasket = shoppingBasket;
	    }

	    void addToCart(ProductClass product, int purchaseQty) {
	        boolean isOK = product.checkQty(purchaseQty);      // 구입물량과 재고물량을 확인해줌
	        if (!isOK) {
	            System.out.printf("수량이 부족합니다. 구입 가능 수량은 %d 입니다.", product.quantity);
	        } else {      // 구입가능한경우
	            shoppingBasket[this.purchaseIdx] = product;     //배열에서 대괄호 인덱스
//	            this.purchaseIdx++;         // 1씩 증가 시켜줘야함
	            count[this.purchaseIdx] = purchaseQty;      //구입수량을 int타입에 count배열에 저장                
	            // 인덱스에 0을 넣게 되면 0 에만 값이 들어가기 때문에 purchaseIdx++ 에서 1씩 올라가면서 저장이 되게끔 해주기
	            product.quantity -= purchaseQty;        // 재고수량 = 재고수량 - 구입수량
	            String msg = "나이가 " + this.age + "인 " + this.name + "이 ";
	            msg += product.price + "원짜리 " + shoppingBasket[this.purchaseIdx].name + "을(를) ";
	            msg += product.quantity + "개 만큼 " + purchaseIdx + "에 담았습니다";
	            System.out.println();
	            System.out.println(msg);
	            this.purchaseIdx++;
	        }
	    }           // return값 없음


	    void customInfo() {
	        String msg = "회원번호: " + this.id + " 이름: " + name + " 나이: " + this.age;
	        msg += "인 회원 생성.";
	        System.out.println(msg);
	    }

	    public void purchase() {
	        for (int i = 0; i < shoppingBasket.length; i++) {
	            if (shoppingBasket[i] != null) {
	                System.out.println(this.name + "고객님이 " + shoppingBasket[i].name + "을 " + count[i] + "개 구매하셨습니다.");
//	                System.out.println(count[i]);
	                System.out.println("--------------------------------------------------------");
	            }
	        }
	    }
	}






