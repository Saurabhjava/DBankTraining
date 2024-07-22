package foo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter Name"); String
		 * name=sc.next(); System.out.println("Enter Email"); String email=sc.next();
		 * System.out.println("Enter Age"); int age=sc.nextInt();
		 * 
		 * try { FileWriter fw=new FileWriter("c:/userData.txt",true);
		 * fw.write(name+"\t"+email+"\t"+age+"\n"); fw.close();
		 * System.out.println("Data Saved..."); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		try {
			FileReader fr=new FileReader("c:/userData.txt");
			int data;
			while((data=fr.read())!=-1)
				System.out.print((char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
