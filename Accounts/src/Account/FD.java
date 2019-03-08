package Account;

import java.util.Scanner;

public class FD extends Account{

	int noofdays;
	int ageofholder;
	public static double  benefit;
	
	
   
	public  double CalculateInterest()
	{
    	System.out.println("Enter amount,noofdays and ageofholder");
    	Scanner scn1=new Scanner(System.in);
    	amount=scn1.nextDouble();
    	noofdays=scn1.nextInt();
    	ageofholder=scn1.nextInt();
    
    	
    	if ((amount<=100000) && (ageofholder>=20 && ageofholder<=40))
    	{
    	   
    		   if(noofdays>=7 && noofdays<=14)
    		     {
    			interestrate=4.50;
    			benefit=amount+(amount*interestrate)/100;
    			setBenefit(benefit);
    		     }
    		   
    	       
    		   if(noofdays>=15 && noofdays<=29)
  		        {
  			    interestrate=4.75;
  			    benefit=amount+(amount*interestrate)/100;
  			     setBenefit(benefit);
  		        }
        
    	}
    	
    	return interestrate;
     }



	public static double getBenefit() {
		return benefit;
	}



	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}
	
	
	
}

