
public class SwapNumbers {
	
/*	int s;
	int t;   // This  two are variable
	
	public static void swap(int a, int b){
		//pass by value
		
		int temp = a;
		          a=b;
				 b=temp;
	}
	
	public static void swap(SwapNumbers p){  // pass by reference 
		int temp = p.s;
		p.s = p.t;
		p.t = temp;
		
	}
	
	public static void main(String[] args) {
		
		SwapNumbers sw = new SwapNumbers();
		sw.s = 50;
		sw.t = 100;
	
		swap(sw.s, sw.t);// pass by value
		System.out.println("Pass by value s is :" +sw.s);
		System.out.println("Pass by value t is :" +sw.t);
		swap(sw);
		System.out.println("pass by reference s is : " + sw.s);
		System.out.println("pass by reference t is : " + sw.t);
		
	
	}*/
	
	int s;
	int t;
	
	public static void swap(int x,int y){
		
		//pass by value
		
		int temp = x;
		x=y;
		y= temp;
	}
	
	public static void swap(SwapNumbers p){
		
		int temp = p.s;
		p.s = p.t;
		p.t = temp;
		
	}
	
	
	
public static void main(String[] args) {
	
	SwapNumbers kabir = new SwapNumbers();
	
	kabir.s = 500;
	kabir.t =1000;
	
	swap(kabir.s,kabir.t);
	System.out.println("pass by value :" + kabir.s);
	System.out.println("pass by value :" + kabir.t);
	
	swap(kabir);
	System.out.println("pass by reference s is :" + kabir.s);
	System.out.println("pass by reference t is :" + kabir.t);
	
}

	
	

}
