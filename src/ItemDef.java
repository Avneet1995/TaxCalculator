import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemDef {

	public static void main(String args[] ) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	System.out.println("Enter the item name: ");
	String itemName=br.readLine();
	
	System.out.println("Enter the cost of the item: ");
	double itemCost = Double.parseDouble(br.readLine());
	
	System.out.println("Enter item quantity: ");
	int itemQuantity=Integer.parseInt(br.readLine());
	
	System.out.println("Enter the type(1-Raw,2-Manufactured,3-Imported): ");
	int typeOption=Integer.parseInt(br.readLine());
	
	double finalCost;
	
	switch(typeOption) {
	case 1:System.out.println("Raw type chosen.");
	       finalCost=(1.125*itemCost)*itemQuantity;
	       System.out.println("Amount to be paid after taxes "+"for item "+
	       itemName+" $"+finalCost);
	       break;
	       
	case 2:System.out.println("Manufactured type chosen.");
    	   finalCost=(1.125*itemCost+0.02*(1.125*itemCost))*itemQuantity;
    	   System.out.println("Amount to be paid after taxes "+"for item "+
    	   itemName+" $"+finalCost);
    	   break;
    	 
	case 3:System.out.println("Imported type chosen.");
    	   finalCost=(1.1*itemCost);
    	   		if(finalCost<=100) {
    	   			finalCost = (finalCost+5)*itemQuantity;
    	   		}
    	   		else if(finalCost>100 && finalCost<200) {
    	   			finalCost=(finalCost+10)*itemQuantity;
    	   		}
    	   		else 
    	   			finalCost=(1.05*finalCost)*itemQuantity;
    	   System.out.println("Amount to be paid after taxes "+"for item "+
    	   itemName+" $"+finalCost);
    	   break;
	default : System.out.println("Invalid Option");
	}
		
	}
	
}

