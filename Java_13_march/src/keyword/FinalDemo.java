package keyword;
/*
 * Final constant at value side
 * use with variable;
 * 1. value must be defined at the time of declaration.
 * 2. value can not be changed at runtime as well as as at compile
 * 
 * 
 */

final class FDemo{
	final int roll_no=12;
	String name;
	
	public final void setData() {
		name="namam";
		
		
	}
	
	public void show() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
		
	}
}


public class FinalDemo {
public static void main(String[] args) {
	FDemo f1=new FDemo();
	f1.setData();
	f1.show();
	
	
}

}
