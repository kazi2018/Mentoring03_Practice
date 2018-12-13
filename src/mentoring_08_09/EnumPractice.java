package mentoring_08_09;

enum Mobile {
	
	apple, samsung, htc;
}

public class EnumPractice {

	public static void main(String[] args) {
		
		Mobile m = Mobile.apple;
		
		switch(m) {
		
		case apple:
			
			System.out.println("Apple mobile is best");
			
			break;
			
		case samsung:
			
			System.out.println("Samsung mobile compete with Apple mobile");
			
			break;
			
		case htc:
			
			System.out.println("htc alos compete with apple and samsung");
			
			
		}
		
		
		}
}
