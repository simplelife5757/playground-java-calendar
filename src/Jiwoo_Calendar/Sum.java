package Jiwoo_Calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input_numbers = scanner.nextLine();
		String[] splited_number = input_numbers.split(" ");
		int x = Integer.parseInt(splited_number[0]);
		int y = Integer.parseInt(splited_number[1]);
		System.out.println(x+y);
		
		String s1, s2; // scanner의 return은 반드시 string
		s1 = scanner.next();
		s2 = scanner.next();
		int a,b;
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
		scanner.close();
	}
}
