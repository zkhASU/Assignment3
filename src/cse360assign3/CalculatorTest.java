package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
   public static void main(String[] args) {
	   AddingMachine bb = new AddingMachine();
	   Calculator myCalculator = new Calculator();
	   myCalculator.add(4);
	   myCalculator.subtract(2);  

	  
	   
	   myCalculator.setmultiply(8);
	   myCalculator.setDivide(4);
	   myCalculator.setPower(3);
	  
	  System.out.println(myCalculator.toString());
	  System.out.println("Total = "+ myCalculator.getTotal());
	   
	   
	   
   

}
}
