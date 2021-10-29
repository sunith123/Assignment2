import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double ctc=s.nextDouble();
        double tax;
        if (ctc>=0&&ctc<=180000) {
            System.out.println("tax payable in % is : NILL ");
		
        }
        else if(ctc>180000&&ctc<=300000) {
            System.out.println(" tax payable in % is : 10 ");
	     tax=(ctc*10)/100;
	    System.out.println(" Tax amount is "+tax);
        }
        else if(ctc>300000&&ctc<=500000) {
            System.out.println(" tax payable in % is : 20 ");
		tax=(ctc*20)/100;
	    System.out.println(" Tax amount is "+tax);
        }
        else if(ctc>500000&&ctc<=1000000) {
            System.out.println(" tax payable in % is : 30 ");
		tax=(ctc*30)/100;
	    System.out.println(" Tax amount is "+tax);
        }
	else{
	System.out.println("Enter ammount btw 0 and 1000000");
       
    }
}
}