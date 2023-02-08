import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
        //Declare variables
        float extravoice=0,extrasms=0,extramb=0;
        double total,tax;
        //Read the inputs from user (line 11-38).Validate inputs
        System.out.print("Voice call minuts:");
        float voice=in.nextInt();
        if(voice<0)
        {
            System.out.println("Please enter a positive value:"); 
            voice=in.nextInt();
        }
        System.out.print("Text messages sent:");
        float message=in.nextInt();
        if(message<0)
        {
            System.out.println("Please enter a positive value:"); 
            message=in.nextInt();
        }
        System.out.print("MBs of data used:");
        float data=in.nextInt();
        if(data<0)
        {
            System.out.println("Please enter a positive value:"); 
            data=in.nextInt();
        }
        System.out.print("Package code [1-3] :");
        int n=in.nextInt();
        if(n<0)
        {
            System.out.println("Please enter a positive value [1-3]:"); 
            n=in.nextInt();
        }

        System.out.print("\nSummary of usages :\n");
        
        //If package number is 1 .do the following
        if(n==1)
        {
            if(voice>100)
        {
            System.out.print("You used "+voice+"/100 minuts,you exceeded your monthly limit.\n"); 
            extravoice=voice-100;
        }
        else
        {
            System.out.print("You used "+voice+"/100 minuts,you are within your monthly limit.\n"); 
        }

        if(message>150)
        {
            System.out.print("You used "+message+"/150 minuts,you exceeded your monthly limit.\n");
            extrasms=message-150;
        }
        else
        {
            System.out.print("You used "+message+"/150 minuts,you are within your monthly limit.\n"); 
        }

        if(data>1024)
        {
            System.out.print("You used "+data+"/1024 minuts,you exceeded your monthly limit.\n"); 
            extramb=extramb-1024;
        }
        else
        {
            System.out.print("You used "+data+"/1024 minuts,you are within your monthly limit.\n"); 
        }

        System.out.println("\nCharges :\n");

            System.out.print("Package code                  :"+n);
            System.out.print("\nMonthly charges               :20.00");
            System.out.print("\nAdditional voice charges      :"+extravoice*0.20);
            System.out.print("\nAdditional SMS charges        :"+extrasms*0.20);
            System.out.print("\nAdditional SMS charges        :"+extrasms*0.24);
            total=(extravoice*0.20)+(extrasms*0.20)+(extrasms*0.24);
            System.out.print("\nsub total                     :"+(20+total));
            tax=(((total+20)/100)*6.5);
            System.out.format("\nstate tax                     :"+"%.2f",tax);
            System.out.format("\nTotal due                     :"+"%.2f",(total+tax+20));

            
        } 
        //If package number is 2 .do the following
        if(n==2)
        {
            if(voice>200)
        {
            System.out.print("You used "+voice+"/200 minuts,you exceeded your monthly limit.\n"); 
            extravoice=voice-200;
        }
        else
        {
            System.out.print("You used "+voice+"/200 minuts,you are within your monthly limit.\n"); 
        }

        if(message>300)
        {
            System.out.print("You used "+message+"/300 minuts,you exceeded your monthly limit.\n");
            extrasms=message-300;
        }
        else
        {
            System.out.print("You used "+message+"/300 minuts,you are within your monthly limit.\n"); 
        }

        if(data>2048)
        {
            System.out.print("You used "+data+"/2048 minuts,you exceeded your monthly limit.\n"); 
            extramb=extramb-2048;
        }
        else
        {
            System.out.print("You used "+data+"/2048 minuts,you are within your monthly limit.\n"); 
        }

        System.out.println("\nCharges :\n");

            System.out.print("Package code                  :"+n);
            System.out.print("\nMonthly charges               :30.00");
            System.out.print("\nAdditional voice charges      :"+extravoice*0.13);
            System.out.print("\nAdditional SMS charges        :"+extrasms*0.10);
            System.out.print("\nAdditional SMS charges        :"+extrasms*0.20);
            total=(extravoice*0.13)+(extrasms*0.10)+(extrasms*0.20);
            System.out.print("sub total                     :"+(30+total));
            tax=(((30+total)/100)*6.5);
            System.out.format("\nstate tax                     :"+"%.2f",tax);
            System.out.format("\nTotal due                     :"+"%.2f",(total+tax+30));

            
        } 
        //If package number is 3 .do the following
        if(n==3)
        {
            if(voice>400)
        {
            System.out.print("You used "+voice+"/400 minuts,you exceeded your monthly limit.\n"); 
            extravoice=voice-400;
        }
        else
        {
            System.out.print("You used "+voice+"/400 minuts,you are within your monthly limit.\n"); 
        }

        if(message>600)
        {
            System.out.print("You used "+message+"/600 minuts,you exceeded your monthly limit.\n");
            extrasms=message-600;
        }
        else
        {
            System.out.print("You used "+message+"/600 minuts,you are within your monthly limit.\n"); 
        }

        if(data>4096)
        {
            System.out.print("You used "+data+"/4096 minuts,you exceeded your monthly limit.\n"); 
            extramb=extramb-4096;
        }
        else
        {
            System.out.print("You used "+data+"/4096 minuts,you are within your monthly limit.\n"); 
        }

        System.out.println("\nCharges :\n");

        System.out.print("Package code                  :"+n);
            System.out.print("\nMonthly charges               :40.00");
            System.out.print("\nAdditional voice charges      :"+extravoice*0.8);
            System.out.print("\nAdditional SMS charges        :"+extrasms*0.8);
            System.out.print("\nAdditional SMS charges        :"+extrasms*0.13);
            total=(extravoice*0.8)+(extrasms*0.8)+(extrasms*0.13);
            System.out.print("\nsub total                     :"+(40+total));
            tax=(((40+total)/100)*6.5);
            System.out.format("\nstate tax                     :"+"%.2f",tax);
            System.out.format("\nTotal due                     :"+"%.2f",(total+tax+40));
        }

    }
}