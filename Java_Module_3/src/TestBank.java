
public class TestBank {

	public static void main(String[] args) {
	
		
		Bank b1 = new Bank();
		b1.name =" city";
		b1.accountbalence=10000;
		b1.interesgained(500);
		System.out.println(b1.accountbalence);
		
		
		//  here we create an object of membler class;
		Members m = new Members();
		m.add = "1801 south ave california";
		m.name="md.Kabir";
		
		b1.men=m;
		
		System.out.println(b1.men.add);
		System.out.println(b1.men.name);
		
        Bank b2 = new Bank();
        b2.name= "HSBC";
        b2.accountbalence=20000;
        b2.men = new Members();
        
        b2.men.add="12 road street,la";
        b2.men.name="md";
		
		System.out.println(b2.men.add);
		System.out.println(b2.men.name);
		
		b2.getBalance();
		Members m2 = b2.getBalance();
		
		m2.Diposit();
		m2.withdrawl();
		
		//you can write other way
		
		b2.getBalance().Diposit();
		b2.getBalance().withdrawl();


	}

}
