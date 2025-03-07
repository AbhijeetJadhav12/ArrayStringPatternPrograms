import java.util.*;

public class ArrayProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		do {
			System.out.println();
			System.out.println("1. Find Mission Number in array");
			System.out.println("2. Reverse Array");
			System.out.println("3. Largest And Smallest Element");
			System.out.println("4. Sum of elements");
			System.out.println("5. Second largest Element");
			System.out.println("6. Occurance of every element");
			System.out.println("7. Missing number from of size n-1");
			System.out.println("8. Merge two Sorted Array");
			System.out.println("9. Move zeroes to end");
			System.out.println("10. Inteserction of two array");
			System.out.println("11. Unique Elements");
			System.out.println("12. Majority of Array");
			System.out.println("13. Subarray with Max Sum(kadane's algorithm)");
			System.out.println("14. Subarray with given sum");
			System.out.println("15. Rotate array from N position");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if (arr[i] < arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
				System.out.println("Sorted Array");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + "\t");
				}

				System.out.println("\nMissing Element");
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
						System.out.print(j + "\t");
					}
				}
				break;
			case 2:
				int mid = arr.length / 2;
				int end = arr.length - 1;
				for (int i = 0; i < mid; i++) {
					int temp = arr[i];
					arr[i] = arr[end];
					arr[end] = temp;
					end--;
				}
				for (int i : arr) {
					System.out.print(i + "\t");
				}
				break;
			case 3:
				int largest = Integer.MIN_VALUE;
				int smalest = Integer.MAX_VALUE;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] >= largest) {
						largest = arr[i];
					}
					if (arr[i] <= smalest) {
						smalest = arr[i];
					}
				}
				System.out.println("Largest Element: " + largest);
				System.out.println("Smallest Ellement: " + smalest);
				break;
			case 4:
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
				}
				System.out.println("Sum of Elements: " + sum);
				break;
			case 5:
				int largestEle = Integer.MIN_VALUE;
				int secondLargest = arr[0];
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] >= largestEle) {
						secondLargest = largestEle;
						largestEle = arr[i];
					} else if (arr[i] <= largestEle && arr[i] > secondLargest) {
						secondLargest = arr[i];
					}
				}
				System.out.println("Second Largest Elements: " + secondLargest);
				break;
			case 6:
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] < arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
				int count = 1;
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i] == arr[i + 1]) {
						count++;
					} else {
						System.out.println(arr[i] + " occur " + count + " times");
						count = 1;
					}

				}
				System.out.println(arr[arr.length - 1] + " occur " + count + " times");

				break;
			case 7:
				System.out.println("Enter value of n");
				int n = sc.nextInt();
				boolean[] isPresent = new boolean[n + 1];
				System.out.println("Enter size of array");
				int newSize = sc.nextInt();
				int a[] = new int[newSize];
				for (int i = 0; i < a.length; i++) {
					a[i] = sc.nextInt();
					if (a[i] > n) {
						System.out.println("Entered element is expected");
						System.exit(0);
					}
				}
				for (int i = 0; i < a.length; i++) {
					if (a[i] <= n) {
						isPresent[a[i]] = true;
					}
				}
				for (int i = 1; i < isPresent.length; i++) {
					if (!(isPresent[i])) {
						System.out.print(i + "\t");
					}
				}
				break;
			case 8:
				System.out.println("Enter size for second Array");
				int sSize = sc.nextInt();
				int b[] = new int[sSize];
				for (int i = 0; i < b.length; i++) {
					b[i] = sc.nextInt();
				}
				int mergeLength = arr.length + b.length;
				int k = 0;
				int mergedArray[] = new int[mergeLength];
				for (int i = 0; i < arr.length; i++) {
					mergedArray[k] = arr[i];
					k++;
				}
				for (int i = 0; i < b.length; i++) {
					mergedArray[k] = b[i];
					k++;
				}
				System.out.println("Merged Array");
				for (int i = 0; i < mergedArray.length; i++) {
					System.out.print(mergedArray[i] + "\t");
				}
				break;
			case 9:
				int m = 0;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != 0) {
						arr[m++] = arr[i];
					}
				}
				while (m < arr.length) {
					arr[m] = 0;
					m++;
				}

				System.out.println("Array After zero at end");
				for (int i1 = 0; i1 < arr.length; i1++) {
					System.out.print(arr[i1] + "\t");
				}
				break;
			case 10:
				System.out.println("size of second aray");
				sSize = sc.nextInt();
				int c[] = new int[sSize];
				for (int i = 0; i < c.length; i++) {
					c[i] = sc.nextInt();
				}
				System.out.println("Common elements");
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < c.length; j++) {
						if (arr[i] == c[j]) {
							System.out.print(c[j] + "\t");
							break;
						}
					}
				}
				break;
			case 11:
				System.out.println("size of second aray");
				sSize = sc.nextInt();
				int d[] = new int[sSize];
				for (int i = 0; i < d.length; i++) {
					d[i] = sc.nextInt();
				}
				System.out.println("unique elements");
				for (int i = 0; i < arr.length; i++) {
					boolean isCommon = false;
					for (int j = 0; j < d.length; j++) {
						if (arr[i] == d[j]) {
							isCommon = true;
						}
					}
					if (!isCommon) {
						System.out.print(arr[i] + "\t");
					}
				}
				for (int i = 0; i < d.length; i++) {
					boolean isCommon = false;
					for (int j = 0; j < arr.length; j++) {
						if (arr[j] == d[i]) {
							isCommon = true;
						}
					}
					if (!isCommon) {
						System.out.print(d[i] + "\t");
					}
				}
				break;
			case 12:

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if (arr[i] < arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
				count = 1;
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i] == arr[i + 1]) {
						count++;
					} else {
						System.out.println(arr[i] + " occur " + count + " times");
						if (count > arr.length / 2) {
							System.out.println(arr[i]);
						}
						count = 1;
					}
				}
				System.out.println(arr[arr.length - 1] + " occurs " + count + " times");
				break;
			case 13:
				sum = 0;
				int hSum = Integer.MIN_VALUE;
				int tempstart = 0, start = 0;
				end = 0;
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
					if (hSum < sum) {
						hSum = sum;
						start = tempstart;
						end = i;
					}
					if (sum < 0) {
						sum = 0;
						tempstart = i + 1;
					}
				}
				System.out.print(hSum);
				System.out.println();
				for (int i = start; i <= end; i++) {
					System.out.print(arr[i] + "\t");
				}
				break;
			case 14:
				System.out.println("Enter sum");
				int target = sc.nextInt();
				sum = 0;
				boolean found = false;
				for (int i = 0; i < arr.length; i++) {
					sum = 0;
					for (int j = i; j < arr.length; j++) {
						sum += arr[j];
						if (sum == target) {
							System.out.println("\nSubArray Found");
							for (int k1 = i; k1 <= j; k1++) {
								System.out.print(arr[k1] + "\t");
								found = true;
							}
						}
					}
				}
				if (!found) {
					System.out.println("No subArray found");
				}
				break;
			case 15:
				System.out.println("Enter index from you want to rotate array");
				int index = sc.nextInt();
				for (int i = 0; i < index; i++) {
					int temp = arr[0];
					for (int j = 0; j < size - 1; j++) {
						arr[j] = arr[j + 1];
					}
					arr[size - 1] = temp;
				}
				System.out.println("Array after rotating");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + "\t");
				}
				break;
			case 16:
				System.out.println("Enter value for which index and floor have to find");
				n = sc.nextInt();
				int ceil = -1, floor = -1;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > n) {
						ceil = arr[i];
						floor = -1;
						break;
					} else if (n == arr[i]) {
						ceil = arr[i];
						floor = arr[i];
						break;
					} else if (arr[arr.length - 1] < n) {
						floor = arr.length - 1;
						ceil = -1;
						break;
					} else {
						floor = arr[i];
						ceil = arr[i + 1];
						break;
					}
				}
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (true);
	}
}
