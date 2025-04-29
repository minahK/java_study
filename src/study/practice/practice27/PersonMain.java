package study.practice.practice27;

public class PersonMain {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		Person p6 = new Person();
		
		p1.name = "김민아";
		System.out.println("이름: " +p1.name);
		
		p2.gender = "여자";
		System.out.println("성별:  "+  p2.gender);
		
		int age = 23;
		System.out.println("나이: " + age);
		
		int height = 168;
		System.out.println("키: " + height);
		
		int weight = 1;
		System.out.println("몸무게: " + weight);
		
		
		p3.job = "백수";
		System.out.println("직업: " +p3.job);
		
		p4.blood = "A";
		System.out.println("혈액형: " +p4.blood);
		
		p5.health = "아주좋습니다!";
		System.out.println("건강상태: " +p5.health);
		
		p6.sleep = "X";
		System.out.println("수면중인가요?: " +p6.sleep);
		
		
	
	}
}