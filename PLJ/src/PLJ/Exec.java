package PLJ;

public class Exec {
	            public static void main(String[] args) {
	                CustomClass c1 = new CustomClass(1, "박창현", 28, new ProductClass[10]);       // 회원 생성과 동시에 장바구니 초기화
	                CustomClass c2 = new CustomClass(2, "한국진", 29, new ProductClass[10]);
	                CustomClass c3 = new CustomClass(3, "장경호", 29, new ProductClass[10]);
     
	                System.out.println("--------------------------------------");
	                c1.customInfo();
	                System.out.println();
	                c2.customInfo();
	                System.out.println();
	                c3.customInfo();
	                System.out.println();
	                System.out.println("--------------------------------------");


	//   상품등록 : 새우깡(1000 - 100), 콜라(500 - 2000), 천하장사(1000 - 800),
	//   빼빼로(300 - 1500), 사이다 (500 - 2000)
	                ProductClass p1 = new ProductClass(1,"새우깡",1000,100);
	                ProductClass p2 = new ProductClass(2,"콜라",2000,100);
	                ProductClass p3 = new ProductClass(3,"천하장사",1000,100);
	                ProductClass p4 = new ProductClass(4,"빼빼로",1500,100);
	                ProductClass p5 = new ProductClass(5,"사이다",2000,100);
	                

	                p1.productInfo();
	                System.out.println();
	                p2.productInfo();
	                System.out.println();
	                p3.productInfo();
	                System.out.println();
	                p4.productInfo();
	                System.out.println();
	                p5.productInfo();
	                System.out.println("--------------------------------------");
	                //상품구매 - 장바구니에 담기

//	        객체 하나씩 배열로넣고 ,
//	       c3.adtToCart(물건(객체하나 ), 수량(입력))배열에 저장되게하기
//	        카트에 상품이랑 갯수를 담고 결제를 하고
	                c1.addToCart(p1, 10);       //새우깡 10봉지 구입
	                c1.addToCart(p2, 30);       //콜라 30봉지 구입
	                c1.addToCart(p3, 20);       //천하장사 20봉지 구입
	                c1.addToCart(p4, 20);       //빼빼로 20봉지 구입
	                c1.addToCart(p5, 20);       //사이다 20봉지 구입
	                System.out.println("---------------------------------------");

	                c2.addToCart(p1, 10);       //사이다 10봉지 구입
	                c2.addToCart(p2, 20);       //콜라 20봉지 구입
	                c2.addToCart(p3, 20);       //천하장사 20봉지 구입
	                c2.addToCart(p4, 40);       //빼빼로 40봉지 구입
	                c2.addToCart(p5, 50);       //사이다 50봉지 구입
	                System.out.println("---------------------------------------");

	                c3.addToCart(p1, 20);       //사이다 20봉지 구입
	                c3.addToCart(p2, 10);       //콜라 10봉지 구입
	                c3.addToCart(p3, 40);       //천하장사 40봉지 구입
	                c3.addToCart(p4, 30);       //빼빼로 30봉지 구입
	                c3.addToCart(p5, 10);       //사이다 10봉지 구입
	                System.out.println("---------------------------------------");

	                // 상품구매 - 결제
//	        c3.purchase();		???이 구매했습니다 로 나오게 하기
	                c1.purchase();
	                c2.purchase();
	                c3.purchase();


	            }
	        }

