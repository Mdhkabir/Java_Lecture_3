import javax.swing.plaf.synth.SynthStyle;

public class Department {
	
	// non static globel veriable
	
	public String dep_name;
	public int dep_id;
	public int no_emp;
	
	// global static variable
	
	
	public static String company_name;
	
	// non static finction 
	public void add_dept(){
		
		System.out.println("Department added");
		
	}
	public void change_dept(){
		System.out.println("Department changed");
	}
	// static method
	public static void nationla_holiday(){
		System.out.println("National holiday granted");
	}
	

}
