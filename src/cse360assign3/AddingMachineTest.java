package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AddingMachineTest {
	   public static void main(String[] args) {
	       // create Calculator class object
		   AddingMachine a1=new AddingMachine();
		   a1.add(4); // call add() method
		   a1.subtract(2); // call subtract() method
		   a1.add(5);
	       System.out.println(a1.toString());
	       System.out.println("Total= "+a1.getTotal());
	   }
	}
