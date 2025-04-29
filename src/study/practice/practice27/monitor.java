package study.practice.practice27;

public class monitor {
			
	
	//필드
	int inch;
	String made;
	String model;
	
	
	//생성자
	monitor (int inch, String made, String model) {
	this.inch = inch;
	this.made = made;
	this.model = model;
}
	//메소드
	void printInfo() {

//		System.out.println(inch);
//		System.out.println(made);
//		System.out.println(model);
		System.out.printf("제조사:%s  모델명:%s  인치:%d",made , model , inch);
		System.out.println();
	}
	
}
