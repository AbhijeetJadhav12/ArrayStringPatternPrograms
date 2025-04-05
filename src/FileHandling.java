
import java.io.*;
import java.util.*;

public class FileHandling {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("1 Write Data");
			System.out.println("2 Read using fileReader");
			System.out.println("3 Read using buffer Reader");
			System.out.println("4 Write using Buffered Writer");
			System.out.println("11 Exit");
			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter data for file");
				String s = sc.nextLine();
				writeData(s);
				break;
			case 2:
				readData();
				break;
			case 3:
				readUsingBufferReader();
				break;
			case 4:
				sc.nextLine();
				s = sc.nextLine();
				writeUsingBufferedWriter(s);
				break;
			case 5:
				sc.nextLine();
				s = sc.nextLine();
				writeForCSV(s);
			case 6:
				readCSV();
				break;
			case 11:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Wrong choice");
			}
		} while (true);
	}

	static void readCSV() throws Exception {

		Reader f = new FileReader("D://practise//doc.txt");
		BufferedReader br = new BufferedReader(f);
		String line;
		br.readLine();

	}

	private static void writeForCSV(String s) throws Exception {
		Writer f = new FileWriter("D://practise//doc.txt", true);
		BufferedWriter bw = new BufferedWriter(f);
		bw.write(s);
		bw.newLine();
		bw.close();
	}

	static void writeUsingBufferedWriter(String s) throws Exception {

		Writer f = new FileWriter("d://practise//abc.txt", true);
		BufferedWriter bw = new BufferedWriter(f);
		bw.write(s);
		bw.newLine();
		bw.close();
	}

	static void readUsingBufferReader() throws IOException {

		File f = new File("D://practise//abc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int length = (int) f.length();
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}

	static void writeData(String s) throws IOException {

		File f = new File("D://practise//abc.txt");
		boolean b = false;
		if (!f.exists()) {
			b = f.createNewFile();
		}
		Writer wr = new FileWriter(f, true);
		wr.write(s);
		System.out.println("success");
		wr.close();
	}

	static void readData() throws Exception {

		File f = new File("D://practise//abc.txt");
		int data = 0;
		Reader r = new FileReader(f);
		int len = (int) f.length();
		char ch[] = new char[(int) f.length()];
		int count = 0;
		r.read(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			count++;
		}
		System.out.println(count);
		r.close();
	}
}