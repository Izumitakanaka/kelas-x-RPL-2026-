
import java.util.Scanner;





public class looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan urutan bentuk : ");
        int u = input.nextInt();
        System.out.println("");
      if ( u == 1){
        for (int a =1; a<=5;a++){
            System.out.println("M. Fatchurrahman. H");
        }
        System.out.println("");
        
        System.out.println("");
        
      }else if (u == 2){
        for (int a = 1; a <=5;a++){ 
            
            for (int b = 1; b <=a;b++){
           System.out.print("0");
            }
            System.out.println("");
        }
        System.out.println("");
      
      }else if (u == 3){
        for (int a= 5; a>=1; a--){
            for (int b= 1; b<=a;b++){
                System.out.print("0");
            }
            System.out.println("");
        }
            System.out.println("");
            
      }else if (u == 4){
        for (int a=1;a<=5;a++){
            for (int b=5;b>=a;b--){
                System.out.print(" ");
        } 
            for (int c=1;c<=a;c++){
                System.out.print("0");  
            }
            System.out.println("");
        }
            System.out.println("");
        
      }else if (u == 5){    
        for (int a=5;a>=1;a--){
            for (int b=5;b>=a;b--){
                System.out.print(" ");
            }
            for (int c=1;c<=a;c++){
            System.out.print("0");
        }
            System.out.println("");
        }   
        System.out.println("");
         }
        }

   }         
