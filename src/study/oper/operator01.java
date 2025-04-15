package study.oper;

public class operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//연산자
		
		//산술 연산
		System.out.println(1+1);
		System.out.println(2-1);
		System.out.println(3*2);
		System.out.println(4/2);
		System.out.println(9%5);
		
		//부호
		System.out.println(30);
		System.out.println(+30);
		System.out.println(-30);
		System.out.println(-(-30));
		
		//증강 연산
		System.out.println("======증강======");
		
		int x = 10;
		int y = 20;
		int z = 30;
		
		System.out.println(x--);
		System.out.println(x);
		
		System.out.println(++y);
		System.out.println(y);
		
		System.out.println(z+1);
		System.out.println(z);
		
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w --;
		
		System.out.printf("%d %d %d %d \n" , q , w , e , r);
		
		
		//논리 부정 연상 ! true < - > false
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry);
		
		System.out.println("======비교 연산======");
		//비교연산
		System.out.println(10==10); //같으냐
		System.out.println(5!=5); //다르냐
		System.out.println(5>3);
		System.out.println(5>=3);
		System.out.println(5<3);
		System.out.println(5<=3);
		boolean b1 = (9>=8);
		System.out.println(b1);
		
		//논리 연산자  &&and ㅣㅣor
		System.out.println("======논리 연산======");
		boolean b2 = (10>6) && (10>5);
				//		true && true - > true
		System.out.println(b2);
		
		boolean b3 = (5 != 1) || (10<4); // || = 하나라도 참이면 참이나옴 
				// true		  ||	false		-> true
		System.out.println(b3);
		
		boolean b4 = (2>=1) && !(3<4); // && = 둘다 참이어야 참이 나옴 
				// true		&&	false -> false
		System.out.println(b4);
		
		//대입 연산
		int a = 30; //단순 대입
		
		//복합대입 
		a+= 5;		//a = a + 5;
		a-=3;		//a = a - 3;
		a*=3;		//a = a * 3;
		a/=2;		//a = a / 2;
		a%=4;		//a = a % 4;
		
		//삼항 연산자 
		// (조각상) ? 앞 : 뒤
		
		int point = 250;
		
		String item = ( point > 100 ) ? "커피" : "생수";
		System.out.println(item);
		
		item = (point < 100) ? "생수" : "커피";
		
		//point >= 100 --> point < 100
		//point > 50 --> point <=50
		
		//이벤트 음료 조건
		//0~100 :생수
		//101~200 :커피
		//201~ :맥주
		
		point = 40;
		item = (point <= 100) ? "생수" : (point > 200 ? "맥주" : "커피");
		
		System.out.println(item);
		
		item = (point <= 200 ) ? (point > 100 ? "커피" : "생수") : "맥주";
		System.out.println(item);
	}

}
