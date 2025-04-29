package study.cls.cls01;

public class claculator {
	//계산기
	
	//필드
	String brand;
	
	//생성자
	
	
	//메소드
	
	
	
	/*
	 	리턴	 매개변수
	 	O		O
	 	O		X
	 	X		O
	 	X		X
	 	
	 	리턴 X : void
	 	리턴 O :리턴할 타입
	  
	
	 */
	
	//리턴 X 매개변수 X
	//계산기 전원켜는 메소드 
	void powerOn() {
		System.out.println("Power On!!");
	}	
	
	//리턴X 매개변수O
	//원하는 밝기 수치를 받아서 밝기 조절가능 메소드
	void setBrigjtness(int bright) {
		System.out.println("밝기 수치" + bright + "로 조정합니다");
	}
	//리턴O 매개변수X
	String getInfo() {
		
		//메소즈 실행후 변환(retrun)할 값을 작성
		//return "전자계산기"
		
		String s = "전자계산기";
		return s;
		
		//String s = "전자계산기";
		
	
	}
	
	//리턴O 매개변수O
	int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	String sum22(int x, int y) {
		int result = x + y;
		return result+"";
	}
	
	int sum(double x, double y) {
		return (int)(x + y);
	}
	
int sumArr(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	int sum(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
				sum = sum + arr[i];
	
	return sum;
}
}


