import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number <= 5) {
			System.out.println("Elementary School");
		}else if(number >= 6 && number <= 8) {
			System.out.println("Middle School");
		}else if(number >= 9 && number <=12) {
			System.out.println("High School");
		}else {
			System.out.println("College");
		}

	}

}
