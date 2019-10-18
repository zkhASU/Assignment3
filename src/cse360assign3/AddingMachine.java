//Author : Kunhao Zhang
//ASU ID :1211784571
//class ID : 70642 Wednesday
//Description: This is a program which for simple calculation with add, subtract, multiply and divide

//URL: https://github.com/zkhASU/Assignment3/blob/master/src/cse360assign3/AddingMachine.java

package cse360assign3;
public class AddingMachine {
	protected int total;
	protected String b = " 0 ";
	

	public AddingMachine () {
       total =0 ;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void add (int value) {
		
		total = total + value; 
		
		b = b +" + " + value;
		
	}

	public void subtract (int value) {
		
		total = total - value;
		
		b = b +" - " + value;
	}
		
	public String toString () {
		return b;
	}

	public void clear() {
		
	}

}