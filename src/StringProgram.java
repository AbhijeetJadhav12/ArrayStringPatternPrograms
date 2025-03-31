import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("1 Reverse");
			System.out.println("2 Anagram String");
			System.out.println("3 Convert to lowerString");
			System.out.println("4 Copy to another String");
			System.out.println("5 Toggle case for String");
			System.out.println("6 Count total number of String");
			System.out.println("7 Occurance of characters");
			System.out.println("8 First occurance of characters in string");
			System.out.println("9 Total occurance on indeces of char");
			System.out.println("10 Reverse only all the vowels in the string");
			System.out.println("11 Compare after backSpace");
			System.out.println("12 Rverse each Word");
			System.out.println("13. Permutation of String");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sc.nextLine();
				String s = sc.nextLine();
				String s1 = "";
				for (int i = s.length() - 1; i >= 0; i--) {
					s1 = s1 + s.charAt(i);
				}
				System.out.println("Reversed String: " + s1);
				break;
			case 2:
				sc.nextLine();
				s1 = sc.nextLine();
				String s2 = sc.nextLine();
				s1 = s1.toLowerCase();
				s2 = s2.toLowerCase();
				int[] ch = new int[26];
				if (s1.length() != s2.length()) {
					System.out.println("Not Anagram String");
				} else {
					for (int i = 0; i < s1.length(); i++) {
						ch[s1.charAt(i) - 'a']++;
					}
					for (int i = 0; i < s2.length(); i++) {
						ch[s2.charAt(i) - 'a']--;
					}
				}
				boolean isAnagram = true;
				for (int i = 0; i < 26; i++) {
					if (ch[i] != 0) {
						isAnagram = false;
					}
				}
				if (isAnagram) {
					System.out.println("Anagram String");
				} else {
					System.out.println("Not");
				}
				break;
			case 3:
				sc.nextLine();
				s = sc.nextLine();
				s1 = "";
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (c >= 'A' && c <= 'Z') {
						c = (char) (c + 32);
					}
					s1 = s1 + c;
				}
				System.out.println(s1);
				break;
			case 4:
				sc.nextLine();
				s = sc.nextLine();
				s1 = "";
				for (int i = 0; i < s.length(); i++) {
					s1 = s1 + s.charAt(i);
				}
				System.out.println(s1);
				break;
			case 5:
				sc.nextLine();
				s = sc.nextLine();
				s1 = "";
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (c >= 'A' && c <= 'Z') {
						c = (char) (c + 32);
					} else if (c >= 'a' && c <= 'z') {
						c = (char) (c - 32);
					}
					s1 += c;
				}
				System.out.println(s1);
				break;
			case 6:
				sc.nextLine();
				s = sc.nextLine();
				s1 = "";
				int count = 1;
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (c == ' ') {
						count++;
					}
				}
				System.out.println(count);
				break;
			case 7:
				sc.nextLine();
				s = sc.nextLine();
				int arr[] = new int[256];
				for (int i = 0; i < s.length(); i++) {
					arr[s.charAt(i)]++;
				}
				boolean b[] = new boolean[256];
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (!b[c]) {
						System.out.println(c + " occurs " + arr[c] + " times");
						b[c] = true;
					}
				}
				break;
			case 8:
				sc.nextLine();
				s = sc.nextLine();

				b = new boolean[256];
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (!b[c]) {
						b[c] = true;
						System.out.println(s.charAt(i) + " is first occured at " + i);
					}
				}
				break;
			case 9:
				sc.nextLine();
				s = sc.nextLine();
				arr = new int[256];
				for (int i = 0; i < s.length(); i++) {
					arr[s.charAt(i)]++;
				}

				b = new boolean[256];
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (!b[c]) {
						System.out.println((char) ('a' + i) + " occured at indeces ");
						for (int j = 0; j < s.length(); j++) {
							if (c == s.charAt(j)) {
								System.out.print(j + " ");
							}
						}
						System.out.println();
						b[c] = true;
					}
				}
				break;
			case 10:
				sc.nextLine();
				System.out.println("Enter String");
				s = sc.nextLine();
				int j = s.length() - 1;
				StringBuilder output = new StringBuilder(s);
				for (int i = 0; i < output.length(); i++) {
					if (output.charAt(i) == 'a' || output.charAt(i) == 'e' || output.charAt(i) == 'i'
							|| output.charAt(i) == 'o' || output.charAt(i) == 'u' || output.charAt(i) == 'A'
							|| output.charAt(i) == 'E' || output.charAt(i) == 'I' || output.charAt(i) == 'O'
							|| output.charAt(i) == 'U') {
						while (j > i) {
							if (output.charAt(j) == 'a' || output.charAt(j) == 'e' || output.charAt(j) == 'i'
									|| output.charAt(j) == 'o' || output.charAt(j) == 'u' || output.charAt(j) == 'A'
									|| output.charAt(j) == 'E' || output.charAt(j) == 'I' || output.charAt(j) == 'O'
									|| output.charAt(j) == 'U') {
								char temp = output.charAt(i);
								output.setCharAt(i, output.charAt(j));
								output.setCharAt(j, temp);
								j--;
								break;
							}
							j--;
						}
					}
				}
				System.out.println("Output: " + output);
				break;
			case 11:
				sc.nextLine();
				s = sc.nextLine();
				s1 = sc.nextLine();
				StringBuilder sb = new StringBuilder();
				StringBuilder sb1 = new StringBuilder();

				for (char c : s.toCharArray()) {
					if (c == '#') {
						if (sb.length() > 0) {
							sb.deleteCharAt(sb.length() - 1);
						}
					} else {
						sb.append(c);
					}
				}
				for (char c : s1.toCharArray()) {
					if (c == '#') {
						if (sb1.length() > 0) {
							sb1.deleteCharAt(sb1.length() - 1);
						}
					} else {
						sb1.append(c);
					}
				}
				System.out.println(sb.toString().equals(sb1.toString()));
				break;
			case 12:
				sc.nextLine();
				s = sc.nextLine();
				s1 = "";
				for (int i = 0; i < s.length(); i++) {
					for (int k = i; k <= s.length(); k++) {
						if (k == s.length() || s.charAt(k) == ' ') {
							String f = s.substring(i, k);
							for (int m = f.length() - 1; m >= 0; m--) {
								s1 += f.charAt(m);
							}
						}
						s1 += ' ';
						i = k;
					}
				}
				System.out.println(s1);
				break;
			case 13:
				sc.nextLine();
				System.out.println("ENter String: ");
				s = sc.nextLine();

				char c[] = new char[s.length()];
				for (int i = 0; i < c.length; i++) {
					c[i] = s.charAt(i);
				}
				System.out.println("Permutations");
				permutation(c, 0);

				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (true);
	}

	static void permutation(char[] c, int index) {
		if (index == c.length - 1) {
			System.out.println(new String(c));
			return;
		}
		for (int i = index; i < c.length; i++) {
			swap(c, index, i);

			permutation(c, index + 1);

			swap(c, index, i);
		}
	}

	static void swap(char[] c, int index, int i) {
		char temp = c[index];
		c[index] = c[i];
		c[i] = temp;
	}

}
