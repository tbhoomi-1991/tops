package keyword;
/*
 * Interface :
 * 1. Same as class but we cannot create object of interface
 * 2. Interface only contain variable and method (exclude constructor)
 * 3. All data member (variable) are final by default
 * 4. All member function are abstract by default
 * 5. Use "Implement" method to inherit into some other child class
 * 6. main purpose is to resolve multiple inheritance problem
 * 7. Pure data hiding
 * 
 */

class Result{
	String grade="A+";
	
class IDemo extends Result implements InterDemo,interDemo2{

	@Override
	public void show() {
		System.out.println("i no :"+i_no);
		System.out.println("grade is :"+grade);
		System.out.println("i 2 :"+i2);
		
		
	}
	
}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	
	
	
      
 
	
	
	
}

}
