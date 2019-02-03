package cas.lab1.firstEclipsePackage;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class FirstEclipseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector input = new Vector();
		input.add("A");
		input.add("B");
		input.add("C");
		input.add("D");
		printVector(input, 3);
		Vector<String> results = readFromFile();
		writeToFile(results);
	}
	public static void writeToFile(Vector<String> results) {
		try
		{
			FileWriter f = new FileWriter("output.txt");
			for(String result: results )
				f.write(result + "\n");
			f.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static Vector<String> readFromFile() {
		Vector<String> result = new Vector<String>();
		
		try
		{
			File f = new File("input.txt");
			Scanner s = new Scanner(f);
		
			while(s.hasNextLine()) 
			{
				int i = s.nextInt();
				if(i % 2 == 0)
					result.add("Even");
				else
					result.add("Odd");
				System.out.println(i);
			}
			
			s.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return result;
	}

	public static void printVector(Vector input, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(input.get(i));
		}
	}
}
