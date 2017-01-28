
public class LearningFunction {
	
	public static int a = 30;
	public static int b = 20;
	
	
	public static void print(){
		System.out.println("Learning Function");
	}

	
	
	public  static void addNumber(){
		int c = a+b;
		System.out.println("Addition of two numbers are :"+c);
	}
	// other way i can add two numbers
	
	public static void addNumbers(int r, int s ){
		int add = r+s;
		System.out.println("Addition of two numbers are :"+ add);
	}

	public static void main(String[] args) {
	print();
	addNumber();
	addNumbers(34,43);

}

}