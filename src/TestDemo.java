import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("1:\n2:\n3:\n4:\n5:");
		System.out.println("enter choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			d.one();
			break;
		case 2:
			d.two();
			break;
		case 3:
			d.three();
			break;
		case 4:
			d.four();
			break;
		case 5:
			d.five();
			break;
		case 6:
			d.six();
			break;

		}

	}

}
