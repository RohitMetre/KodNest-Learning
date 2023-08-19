package ConditionalConstructs;

public class NestedIfElse2App {
 
	 void CheckAmount(int ticket)
    {
   	 if(ticket>=500)
   	 {
   		 System.out.println("Lets's Watch Salaar Movie ");
   	 }
   	 else
   	 {
   		 if(ticket<=500)
   		 {
   			 System.out.println("Let's Watch Toby movie");
   		 }
   		 else
   		 {
   			 System.out.println("Let's watch Jawan movie ");
   		 }
   	 }
   	 	
    }
}
