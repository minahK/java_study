package study.cls.cls01;

public class claculatorMain {
	
	public static void main(String[] args) {

		claculator c1 = new claculator();
	
		c1.brand = "카시오";
		c1.powerOn();
		
		claculator c2 = new claculator();
		c2.powerOn();
		
		c1.setBrigjtness(10);
		c1.setBrigjtness(8);
		
		c2.setBrigjtness(3);
		
		//c2.getInfo();
		String s = c2.getInfo();
		System.out.println(s);
		
		
		System.out.println(c1.getInfo());
		
		int result = c2.sum(10, 20);
		System.out.println(result);
		
		System.out.println(c2.sum(50, 80));
		
		int[] arr = {1,5,6,3,45,56};
		
		int result2 = c1.sumArr(arr);
		System.out.println(result2);
	
	}
	
}

	
	