//Sidney Mcclendon smcclendon1@toromail.csudh.edu

import java.util.Scanner;

public class BillCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        double additional_voice = 0;
        double sms = 0;
        double mb = 0;
        double total;
        double tax;
        
        System.out.print("Voice call minutes: ");
        double voice=input.nextInt();
        if(voice<0)
        {
            System.out.println("Please enter a positive value: "); 
            voice=input.nextInt();
        }
        System.out.print("Text messages sent: ");
        double message=input.nextInt();
        if(message<0)
        {
            System.out.println("Please enter a positive value: "); 
            message=input.nextInt();
        }
        System.out.print("MBs of data used  : ");
        double data=input.nextInt();
        if(data<0)
        {
            System.out.println("Please enter a positive value: "); 
            data=input.nextInt();
        }
        System.out.print("Package Code [1-3]: ");
        int n=input.nextInt();
        if(n<0)
        {
            System.out.println("Please enter a positive value [1-3]:"); 
            n=input.nextInt();
        }
        
        System.out.print("\nSummary of Usage:\n");
        input.close();
        
        if(n==1)
        {
            if(voice>100)
        {
            System.out.print("You used "+voice+"/100 minutes, you exceeded your monthly limit\n"); 
            additional_voice=voice-100;
        }
        else
        {
            System.out.print("You used "+voice+"/100 minutes, you are within your monthly limit\n"); 
        }

        if(message>150)
        {
            System.out.print("You used "+message+"/150 SMS messages, you exceeded your monthly limit\n");
            sms=message-150;
        }
        else
        {
            System.out.print("You used "+message+"/150 SMS messages, you are within your monthly limit\n"); 
        }

        if(data>1024)
        {
            System.out.print("You used "+data+"/1024 MB of data, you exceeded your monthly limit\n"); 
            mb = mb - 1024;
        }
        else
        {
            System.out.print("You used "+data+"/1024 MB of data, you are within your monthly limit\n"); 
        }

        System.out.println("\nCharges:\n");

        System.out.print("Package code                                          : "+n);
        System.out.print("\nMonthly charges                                       : 20.00");
        System.out.print("\nAdditional voice charges (1 minute @ 0.20 per minute)" + " : " + additional_voice*0.20);
        System.out.print("\nAdditional SMS charges (0 SMS @ 0.20 per SMS)         : "+sms*0.20);
        System.out.print("\nAdditional data charges (0 MB @ 0.25 per minute)      : "+sms*0.25);
        total=(additional_voice*0.20)+(sms*0.20)+(sms*0.25);
        System.out.print("\nSub Total                                             : "+(20+total));
        tax=(((total+20)/100)*6.5);
        System.out.printf("\nState Tax(6.5%%)                                       : "+"%.2f",tax);
        System.out.printf("\nTotal due                                             : "+"%.2f",(total+tax+20));

            
        } 
        
        if(n==2)
        {
            if(voice>200)
        {
            System.out.print("You used "+voice+"/200 minutes, you exceeded your monthly limit\n"); 
            additional_voice=voice-200;
        }
        else
        {
            System.out.print("You used "+voice+"/200 minutes, you are within your monthly limit\n"); 
        }

        if(message>300)
        {
            System.out.print("You used "+message+"/300 SMS messages, you exceeded your monthly limit\n");
            sms = message-300;
        }
        else
        {
            System.out.print("You used "+message+"/300 SMS messages, you are within your monthly limit\n"); 
        }

        if(data>2048)
        {
            System.out.print("You used "+data+"/2048 MB of data, you exceeded your monthly limit\n"); 
            mb = mb - 2048;
        }
        else
        {
            System.out.print("You used "+data+"/2048 MB of data, you are within your monthly limit\n"); 
        }
        
        System.out.println("\nCharges:\n");
        
        System.out.print("Package code                                          : "+n);
        System.out.print("\nMonthly charges                                       : 30.00");
        System.out.print("\nAdditional voice charges (1 minute @ 0.13 per minute) : "+additional_voice*0.13);
        System.out.print("\nAdditional SMS charges (0 SMS @ 0.10 per SMS)         : "+sms*0.10);
        System.out.println("\nAdditional data charges (0 MB @ 0.20 per minute)      : "+sms*0.20);
        total=(additional_voice*0.13)+(sms*0.10)+(sms*0.20);
        System.out.print("Sub Total                                             : "+(30+total));
        tax=(((30+total)/100)*6.5);
        System.out.printf("\nState Tax(6.5%%)                                       : "+"%.2f",tax);
        System.out.printf("\nTotal due                                             : "+"%.2f",(total+tax+30));
        
        } 
        
        if(n==3)
        {
            if(voice>400)
        {
            System.out.print("You used "+voice+"/400 minutes, you exceeded your monthly limit\n"); 
            additional_voice=voice-400;
        }
        else
        {
            System.out.print("You used "+voice+"/400 minutes, you are within your monthly limit\n"); 
        }

        if(message>600)
        {
            System.out.print("You used "+message+"/600 SMS messages, you exceeded your monthly limit\n");
            sms = message - 600;
        }
        else
        {
            System.out.print("You used "+message+"/600 SMS messages, you are within your monthly limit\n"); 
        }

        if(data>4096)
        {
            System.out.print("You used "+data+"/4096 MB of data, you exceeded your monthly limit\n"); 
            mb = mb - 4096;
        }
        else
        {
            System.out.print("You used "+data+"/4096 MB of data, you are within your monthly limit\n"); 
        }
        
        System.out.println("\nCharges:\n");
        
        System.out.print("Package code                                         : "+n);
        System.out.print("\nMonthly charges                                      : 40.00");
        System.out.print("\nAdditional voice charges (1 minute @ 0.8 per minute) : "+additional_voice*0.8);
        System.out.print("\nAdditional SMS charges (0 SMS @ 0.8 per SMS)         : "+sms*0.8);
        System.out.print("\nAdditional data charges (0 MB @ 0 per minute)        : "+sms);
        total=(additional_voice*0.8)+(sms*0.8);
        System.out.print("\nSub Total                                            : "+(40+total));
        tax=(((40+total)/100)*6.5); 
        System.out.printf("\nState Tax(6.5%%)                                      : "+"%.2f",tax);
        System.out.printf("\nTotal due                                            : "+"%.2f",(total+tax+40));
            
        }
	}
}