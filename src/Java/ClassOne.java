package Java;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstmethod();
		secondmethod();
		Thirdmethod();
		fourthmethod();
		fifthmethod();
		sixthMethod();
		
		}
	public static void firstmethod() {
		char initial='S';
		String name="Sivathanu";
		System.out.println("My Name Is :" + name +" "+initial);
	}
	
	public static void secondmethod() {
		int age = 25;
		System.out.println("My Age is :" + age);
	}
	
	public static void Thirdmethod() {
		char initial='S';
		System.out.println(initial);
	}
	
	public static void fourthmethod() {
		boolean b= true;
		System.out.println("Is above details are correct?:" + " "+ b);
	}
	
	public static void fifthmethod() {
		String s= "Murali";
		int a = 25;
		char c= 'R';
		boolean o= true;
		System.out.println(s+"."+c +" "+ "age:" + a+" "+ o);
		
	}
	
	public static void sixthMethod()
	{
		fifthmethod();
	}
	
	

}