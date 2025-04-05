import java.util.*;

public class CheckNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value up to number find");
		int n = sc.nextInt();
		do {
			System.out.println();
			System.out.println("1 Prime");
			System.out.println("2 Armstrong");
			System.out.println("3 Strong");
			System.out.println("4 Perfect");
			System.out.println("5 Duck");
			System.out.println("6 Fabonacii");
			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				checkPrime(n);
				break;
			case 2:
				checkArmStrong(n);
				break;
			case 3:
				checkStrong(n);
				break;
			case 4:
				checkPerfect(n);
				break;
			case 5:
				checkDuck(n);
				break;
			case 6:
				printFabonacii(n);
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
			}

		} while (true);
	}

	public static void printFabonacii(int n) {

		int first=0;
		int second=1;
		for(int i=0;i<=n;i++)
		{
			System.out.print(first+",");
			int third=first+second;
			second=first;
			first=third;
			
		}
	}

	public static void checkPrime(int n) {
		int nCount = 0;
		for (int i = 2; i <= n; i++) {
			int no = i;
			int count = 0;
			for (int j = 1; j <= no; j++) {
				if (no % j == 0) {
					count++;
				}
			}
			if (count <= 2) {
				System.out.println(no);
				nCount++;
			}
		}
		System.out.println("Total: " + nCount);
	}

	public static void checkArmStrong(int n) {
		System.out.println("Checking ....");
		for (int i = 1; i <= n; i++) {
			int no = i;
			int sum = 0;
			int count = 0;
			int temp = no;
			while (no != 0) {
				no /= 10;
				count++;
			}
			no = temp;
			int rem = 0;
			int fact = 1;
			while (no != 0) {
				rem = no % 10;
				fact = 1;
				for (int k = 1; k <= count; k++) {
					fact *= rem;
				}
				sum += fact;
				no /= 10;
			}
			if (sum == temp) {
				System.out.println(temp);
			}
		}
	}

	public static void checkPerfect(int n) {

		for (int i = 1; i <= n; i++) {
			int no = i;
			int sum = 0;
			int temp = no;
			for (int j = 1; j < no; j++) {
				if (temp % j == 0) {
					sum += j;
				}

			}
			if (sum == no) {
				System.out.println(no);
			}
		}
	}

	public static void checkStrong(int n) {

		for (int i = 1; i <= n; i++) {
			int no = i;
			int temp = no;
			int rem = 0;
			int sum = 0;
			while (no != 0) {
				rem = no % 10;
				int fact = 1;
				for (int j = 1; j <= rem; j++) {
					fact *= j;
				}
				sum += fact;
				no /= 10;
			}
			if (sum == temp) {
				System.out.println(temp);
			}
		}
	}

	public static void checkDuck(int n) {

		for (int i = 0; i <= n; i++) {
			boolean found = false;
			int no = i;
			int rem = 0;
			int temp = no;
			while (no != 0) {
				rem = no % 10;
				if (rem == 0) {
					found = true;
				}
				no /= 10;
			}
			if (found) {
				System.out.println(temp);
			}
		}
	}
}
