// I am creating a constractar 
public class Students { 
	
	/*String name;
	int roll;
	int age;
	
public Students(){
		
		System.out.println("adding students record");
		
	}
	public Students (String name, int age, int roll){ // this is also call overloding constractor
		this.name=name;
		this.age= age;
		this.roll= roll;
		
	}
	
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.name="Rohim";
		s1.roll=1;
		s1.age=15;
		
		Students s2 = new Students();
		s1.name="Rahman";
		s1.roll=2;
		s1.age=16;
		
		Students s3 = new Students("kabir",15,3);
		System.out.println("Argumrnted constuctor name :" + s3.name);
		System.out.println("Argumrnted constuctor age :" + s3.age);
		System.out.println("Argumrnted constuctor roll :" + s3.roll);

	
	}*/
	
	String name;
	int age;
	int roll;
	
	public Students(){
		System.out.println("adding students record ");
	}
	
	public Students(String name,int age,int roll){
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	


public static void main(String[]args){
	
	Students s1 = new Students();
	s1.name="Rohim";
	s1.age=13;
	s1.roll=1;
	

	Students s2 = new Students();
	s1.name="Rohan";
	s1.age=14;
	s1.roll=2;
	
	Students s3 = new Students("kabir",15,3);
	System.out.println("Argumented constructor name : "+s3.name);
	System.out.println("Argumented constructor age : "+s3.age);
	System.out.println("Argumented constructor age : "+s3.roll);
	
	
	
}


}


