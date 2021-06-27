import java.util.Scanner;
public class Main {
	
	public static boolean isPrime(int number) {
		 boolean result = false;
		 
         int control = 0;

         for (int i = 2; i < number; i++) {
             if (number % i == 0) {
                 control = 1;
                 break;
             }
         }
         if (control == 1)
         {
             result= false;
         }
         else
         {
             result= true;
         }

         return result;
		}

	public static void main(String[] args) {
		
		 int count = 0;
		 Scanner inp = new Scanner(System.in);
         System.out.print("Sayýyý Girin : ");
         int n = inp.nextInt();
         
         if (isPrime(n)== true)
         {
            System.out.println(n + " sayýsý ASALDIR.");
         }
         else
         {
        	 System.out.println(n + " sayýsý ASAL DEÐÝLDÝR.");         }

         }
         }

