import java.util.*;
public class Fibonacci {
	public static void main (String[] args) {
		int f_b, f_b_1, f_b_2, b;
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Mengambil nilai Fibonacci ke - :");
		b = inputUser.nextInt();

		f_b_2 = 0;
		f_b_1 = 1;
		f_b = 1;

		for(int i = 1; i <= b; i++) {
			System.out.println("Nilai ke - "+ i + " adalah " + f_b);
			f_b = f_b_1 + f_b_2;
			f_b_2 = f_b_1;
			f_b_1 = f_b;
		}
	}
}
