package calculator;
import java.util.Scanner;
//Arithmetic logical unit
public class ALU {

	public static void main(String[] args) {
		Scanner operation = new Scanner(System.in);
		System.out.print("Which Operation do you want? \n"
				+ "Press '+' for addition \n"
				+ "press '*' for multiplication \n"
				+ "press '-' for substraction \n"
				+ "press '/' for division \n");
		String choose = operation.nextLine();
		if(choose.equals("+")) {
			addition();
			
		}
		else if(choose.equals("*")) {
			multiplication();
			
		}
		else if(choose.equals("-")) {
			substraction();
		}
		else if (choose.equals("/")) {
			division();
		}
		else {
			System.out.println("Please type a valid input");
			return;
		}
	}
	
	public static void addition() {
		System.out.println("Hello to add two numbers just proceed with the following instruction");
		System.out.println("What is your x?");
		Scanner addx =new Scanner(System.in);
		int i1 = addx.nextInt();
		
		System.out.println("What is your y");
		Scanner addy = new Scanner(System.in);
		int i2 = addy.nextInt();
		int e = i1 + i2;
		System.out.println(i1+" + "+ i2 +" = "+ e);	
		return;
	}
	public static void multiplication() {
			System.out.println("Hello to multiply just type in the following instruction");
			System.out.println("What is your x");
			Scanner mulx = new Scanner(System.in);
			int m1 = mulx.nextInt();
			System.out.println("What is your y");
			Scanner muly = new Scanner(System.in);
			int m2 = muly.nextInt();
			int e = m1 * m2;
			System.out.println (m1 +" * "+ m2 +" = "+ e);	
			return;
	}
	public static void substraction() {
		System.out.println("to substract two numbers (x - y) just follow the instructions");
		System.out.println("what is your x");
		Scanner subx = new Scanner(System.in);
		int s1 = subx.nextInt();
		System.out.println("What is your y");
		Scanner suby = new Scanner(System.in);
		int s2 = suby.nextInt();
		int e = s1 - s2;
		System.out.println(s1 +" - "+ s2 + " = " + e);
	return;
				
	}
	public static void division() {
	System.out.println("To divide two numbers (x / y) just follow the instructions");
	System.out.println("What is your x");
	Scanner divx = new Scanner(System.in);
	float d1 = divx.nextFloat();
	System.out.println("What is your y");
	Scanner divy = new Scanner(System.in);
	float d2 = divy.nextFloat();
	float e = d1 / d2;
	System.out.println(d1 + "/"+ d2 +" = " + e) ;
	return;

		
	
		
	}
}


