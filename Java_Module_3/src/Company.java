
public class Company {

	public static void main(String[] args) {
		
		Department d = new Department();
        Department d1 = new Department();
        Department.company_name="Microsoft";
        Department.nationla_holiday();
        
        d.dep_id=10;
		d.dep_name="Telecom";
		d.no_emp=1000;
		
		d.add_dept();
		d.change_dept();
		
		
		
		d1.dep_id=100;
		d1.dep_name="MobilePhone";
		d1.no_emp=5000;
		
		d1.add_dept();
		d1.change_dept();
		
		System.out.println("Department_id: "+ d.dep_id);
		System.out.println("Department_name: "+ d.dep_name);
		System.out.println("No of Emp : "+ d.no_emp);


		System.out.println("Department_id: "+ d1.dep_id);
		System.out.println("Department_name: "+ d1.dep_name);
		System.out.println("No of Emp : "+ d1.no_emp);
		
		
	}

}
