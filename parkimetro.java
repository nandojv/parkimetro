package profesercizi;


import java.util.ArrayList;
import java.util.Scanner;





public class parkimetro {

	int ore;
    int numeroposto;
    
    
public  parkimetro(int ore,int numeroposto) {
	
	this.numeroposto=numeroposto;
	this.ore=ore;
	
	
}
public String toString() {
	
	return ore+"  "+numeroposto;
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int scelta;
        int numeroposto;
     
     System.out.println("Parkeggio in funzione");
		System.out.println(" -----euro 1----- per 1h------");
		System.out.println("inserire numero ore sosta");
		
		Scanner sc = new Scanner(System.in);
        int ore =sc.nextInt();
		
        
        	System.out.println("inserire numeroposto");
        	
        	Scanner sc1 = new Scanner(System.in);
            numeroposto =sc1.nextInt();
        	
            System.out.println("inserire "+ore+"euro");
           
            Scanner sc2 = new Scanner(System.in);
             int  soldi =sc2.nextInt();
             
             
	
              if(ore==soldi && soldi==ore) {
        		
        		System.out.println("erogazione tiket");
        		System.out.println(numeroposto+" "+ore);
        	}
             if(ore>1 && soldi <ore) {
          		System.out.println("inserire credito o premere per resto");
          		
          	}
             
	}

}
