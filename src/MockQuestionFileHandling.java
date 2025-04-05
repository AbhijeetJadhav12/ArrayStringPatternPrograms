import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.util.Scanner;

public class MockQuestionFileHandling {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("1 create text file store data");
			System.out.println("2 Read file using FileReader, count lines, words and character");
			System.out.println("3 Read image from one Loaction and write in Another location");
			System.out.println("4 Perform serialization and deserialization");
			System.out.println("5 Read CSV file");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				File file = new File("D:\\practise\\text.txt");
				if (!file.exists()) {
					if (file.createNewFile()) {
						System.out.println("File created");
					}
				}
				Writer fw = new FileWriter(file);
				System.out.println("Enter data for File");
				sc.nextLine();
				String data = sc.nextLine();
				fw.write(data);
				fw.close();
				break;
			case 2:
				File f = new File("D:\\practise\\abc.txt");
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				int wordCount = 0, charCount = 0, lineCount = 0;
				String line;
				while ((line = br.readLine()) != null) {
//					System.out.println(line);
					lineCount++;
					String words[] = line.toLowerCase().split(" ");
					for (int i = 0; i < words.length; i++) {
						wordCount++;
						for (int j = 0; j < words[i].length(); j++) {
							if (words[i].charAt(j) >= 'A' || words[i].charAt(j) <= 'Z' || words[i].charAt(j) > 'a'
									|| words[i].charAt(j) <= 'z') {
								charCount++;
							}
						}
					}
				}
				System.out.println("Line Count: " + lineCount);
				System.out.println("Word Count: " + wordCount);
				System.out.println("Char Count: " + charCount);
				break;
			case 3:
//				File sourseFile = new File("D:\\Template\\Abhi2.JPG");
//				FileInputStream fis = new FileInputStream(sourseFile);
//				File destFile = new File("D:\\Template\\Abhi2_copy.JPG");
//				FileOutputStream fos = new FileOutputStream(destFile);
//				int imgRead;
//				while ((imgRead = fis.read()) != -1) {
//					fos.write(imgRead);
//				}
				break;
			case 4:
				System.out.println("Enter 1 to Insert data and 2 to get");
				int c=sc.nextInt();
				switch(c) {
				
				case 1:
					f = new File("D:\\practise\\seria.txt");
					FileOutputStream fos=new FileOutputStream(f);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					Player pl[]=new Player[2];
					for(int i=0;i<pl.length;i++) {
						System.out.println("enter is,name,runs");
						int id=sc.nextInt();
						sc.nextLine();
						String name=sc.nextLine();
						int runs=sc.nextInt();
						pl[i]=new Player(id,name,runs);
						
					}
					oos.writeObject(pl);
					
					System.out.println("Success...");
					break;
				case 2:
					f = new File("D:\\practise\\seria.txt");
					FileInputStream fis=new FileInputStream(f);
					ObjectInputStream ios=new ObjectInputStream(fis);
						Player []pi=(Player[])ios.readObject();
						for(Player p:pi) {
							System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns());
						}

					break;
				}
				break;
			case 5:
				System.out.println("Enter 1 for Write and 2 for Read");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					try {
						f=new File("D:\\practise\\exForCSV.csv");
						if(!f.exists()) {
							if(f.createNewFile()) {
								System.out.println("File Created");
							}
						}
						System.out.println("Enter id,name,salary in (id,name,salary) format");
						sc.nextLine();
						data=sc.nextLine();
						fw=new FileWriter(f,true);
						fw.write(data+"\n");
						System.out.println("Data Added");
						fw.close();
					}catch(IOException e) {
						System.out.println("Error is: "+e);
					}
					
					break;
				case 2:
					f=new File("D:\\practise\\exForCSV.csv");
				fr=new FileReader(f);
				br=new BufferedReader(fr);
				while((line=br.readLine())!=null)
				{
					String d[]=line.split(",");
					for(int i=0;i<d.length;i++) {
						System.out.print(d[i]+"\t");
					}
					System.out.println();
				}
				br.close();
					break;
					default:
						System.out.println("Invalid Choice");
				}
				
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Ivalid Choice");
			}
		} while (true);

	}

}
