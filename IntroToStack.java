package Level3;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	
	
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		Random rando = new Random();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			
			Double random = rando.nextDouble();
			doubles.push(random*100);
			
		}
	
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String n1 = JOptionPane.showInputDialog("Insert first number between 0 and 100");
		String n2 = JOptionPane.showInputDialog("Input second number between 0 and 100");
		
		int n21 = Integer.parseInt(n1);
		int n11 = Integer.parseInt(n2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		int sz = doubles.size();
		for (int i = 0; i < sz; i++) {
			Double val = doubles.pop();
			if((val >= n11 && val<= n21) || (val <= n11 && val >= n21)) {
				System.out.println(val);
			}
		}
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}