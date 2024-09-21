package keyword;
/*
 * static constant at memory side
 * variable:
 * 1.opp of final variable
 * 
 * 
 * method:
 * 1. static method is called when class is called
 * 2. static method can have only static variable
 * 3. Before static was called by class name only but right now we can call with object
 * 4. All variable inside static method are static by default
 * 
 *
 */
class SDemo{
	int no;
	static int s_no;
	
	public static void show() {
		s_no=150;
		System.out.println("static value is :"+s_no);
		int r_no=85;
		System.out.println("r_no is :"+r_no);
		
	}
	
}
public class StaticDemo {
public static void main(String[] args) {
	
	SDemo s1=new SDemo();
	SDemo s2=new SDemo();
	SDemo s3=new SDemo();
	
	s1.no=10;
	s2.no=20;
	s3.no=30;
	
	System.out.println("s_no is :"+s1.no);
	System.out.println("s_no is :"+s2.no);
	System.out.println("s_no is :"+s3.no);
	
	SDemo.s_no=1;
	SDemo.s_no=2;
	SDemo.s_no=3;
	
	System.out.println("s_no is :"+SDemo.s_no);
	System.out.println("s_no is :"+SDemo.s_no);
	System.out.println("s_no is :"+SDemo.s_no);
	
	
	
	
	
}

}
