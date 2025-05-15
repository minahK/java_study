package study.practice;

import java.util.Scanner;

public class Minah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner(System.in);
		
		 int out = 0;

	        while (out < 3) {
	            int number = (int)(Math.random() * 10) + 1;
	            

	            System.out.println("1~10 중 숫자를 입력하세요: ");
	            int user = scanner.nextInt();
	            
	            System.out.println("투수의 값: " + number);
	            
	            if (user == number) {
	                System.out.println("안타!");
	            } else {
	                System.out.println("아웃!");
	                out++;
	            }

	            System.out.println("현재 아웃 수: " + out);
	        }

	        System.out.println("3아웃! 게임 종료!");
	        scanner.close();
	    }
	

		public static void basic() {
			
			Scanner scanner = new Scanner(System.in);
			
			 int out = 0;

	        while (out < 3) {
		            int number = (int)(Math.random() * 10) + 1;
	            

		            System.out.println("1~10 중 숫자를 입력하세요: ");
		            int user = scanner.nextInt();
	            
		            System.out.println("투수의 값: " + number);
		            
	            if (user == number) {
		                System.out.println("안타!");
	            } else {
	                System.out.println("아웃!");
	                out++;
		            }

		            System.out.println("현재 아웃 수: " + out);
		        }

	        System.out.println("3아웃입니다! 경기 종료!");
		        
		    }
		
		public static void level1() {
			
			Scanner scanner = new Scanner(System.in);
			
			 for (int ber = 1; ber <= 3; ber++) {
		            int out = 0;

		            System.out.println(">> [" + ber + "회차 경기] 시작");
		            System.out.println("현재 아웃 수: " + out); 

		            while (out < 3) {
		                int num = (int)(Math.random() * 10) + 1;

		                System.out.print("1~10 중 숫자를 입력하세요: ");
		                int user = scanner.nextInt();
		                
		                System.out.println("투수의 값: " + num);

		                if (user == num) {
		                    System.out.println("안타!");
		                } else {
		                    System.out.println("아웃!");
		                    out++;
		                }

		              
		                if (out < 3) {
		                    System.out.println("현재 아웃 수: " + out);
		                }
		            }

		            System.out.println(">> [3아웃] [" + ber + "회차 경기] 종료 \n");
		        }

		        System.out.println("3회 끝 경기 종료");
	   }
		
		
		public static void level2() {
			
			Scanner scanner = new Scanner(System.in);

			String[] name = {"민아" , "민수" , "민경" , "민희" , "민정" ,"민주" , "민재", "민성", "민시"};
			
			
				int person = 0;
	            int out = 0;

		        while (out < 3) {
		        	String human = name[person];
		        	System.out.println((person + 1) + "번 타자 " + human + " 선수가 나왔습니다");
		        	
			            int number = (int)(Math.random() * 10) + 1;
		            

			            System.out.println("1~10 중 숫자를 입력하세요: ");
			            int user = scanner.nextInt();
		            
			            System.out.println("투수의 값: " + number);
			            
		            if (user == number) {
			                System.out.println("안타!");
		            } else {
		                System.out.println("아웃!");
		                out++;
			            }

		            person = (person + 1) % 9;

		            System.out.println("현재 아웃 수: " + out);
		            System.out.println("----------------------");
		        }

		        System.out.println("경기가 종료되었습니다");
			        
			    }
}
		
		
	//	public static void level3()
			//야구를 잘 몰라서 무슨 소리인지 전혀 이해가 안갑니다 죄송합니다.. 
			
		
		






			
