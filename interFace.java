//Interface is same as normal class only difference is all the methods of interface are implicitly abstract
//Interface provides 100% Abstraction 
//It supports multiple inheritance 
//To Complete all the methods of interface we have to inherit that interface in the child class
//Child CLass must override all the methods of interface if child class does override all the methods of interface then that child class will act as an abstract class
//As interface is an incomplete we cannot create instance of it








package interFace;


	
	interface i1{
		public int a=10;
		public void add();
		public void sub();
	}
	
	interface i2{
		public void add();
		public void mul();
	}
	
	class xyz extends abc implements i1,i2{

		@Override
		public void mul() {
			System.out.println("MULTIPLICATION CALLED");
		}

//		@Override
//		public void add() {
//			System.out.println("ADDITION CALLED");
//			
//		}

		@Override
		public void sub() {
			System.out.println("A : "+a);
			System.out.println("SUBTRACTION CALLED");
			
		}
		public void dis() {
			System.out.println("DISPLAY CALLED");

		}
		
	}
	
	class abc{
		public void add() {
			System.out.println("Hi Hello");
		}
	}
	
	public class interFace {

	public static void main(String[] args) {
		
		
		System.out.println("XYZ CLASS : ");
		xyz ob = new xyz();
		ob.add();
		ob.dis();
		ob.mul();
		ob.sub();
		
		
		System.out.println("I1 INTERFACE : ");
		i1 ob1 = new xyz();
		ob1.add();
		ob1.sub();
		
		System.out.println("I2 INTERFACE : ");
		i2 ob2 = new xyz();
		ob2.add();
		ob2.mul();

	}
}


