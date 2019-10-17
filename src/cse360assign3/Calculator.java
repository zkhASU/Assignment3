//Author : Kunhao Zhang
//ASU ID :1211784571
//class ID : 70642 Wednesday
//Description: This is a program which for simple calculation with add, subtract, multiply and divide

//URL: 

package cse360assign3;

public class Calculator extends AddingMachine{
    
 
	
	public void setmultiply( int a1)
	{
		
		total = total * a1;
		b = b + " * " + a1;
		
	}
	
	 public void setDivide( int a1)
	 {

		if(a1 == 0)
		{
			total = 0;
		}
		else {
			total = total/a1;
		}
		
		b = b + " / " + a1;
		
		
	 }
	 
			
	 public void setPower( int a1) {
		 if(a1<0)
		 {
			 total = 0;
		 }
	  
		 else {
			total = Math.pow(total, a1)  ;
			 
		 }
		 
		 b = b + " ^ " + a1;
		 
	}
	 
	 public String toString()
	 {
		 return b;
	 }
	 
	
}
