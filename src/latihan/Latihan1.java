/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author ONE
 */
public class Latihan1 {
   public static void main(String[] args) {
       String identitas = "nashiya alfi ramadhani / XRPL5 / 29";
       System.out.println("Identitas :"+ identitas);
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nilai a ? ");
       int a = scanner.nextInt();

       System.out.println("\nIF.. 1");
       if(a < 5) System.out.println("Nilai a kurang dari 5"); 
       
       System.out.println("\nIF.. 2");
       if(a == 5)
           System.out.println("Nilai a sama dengan 5");
       
       System.out.println("nIF.. 3");
       if(a > 5) {
           System.out.println("isi variabel a : "+ a);
           System.out.println("Nilai a lebih dari 5");    
       
           System.out.println("\nIF..ELSE..");
           if (a < 5) {
               System.out.println("isi variabel a :" +a);
               System.out.println("nilai a kurang dari 5");
           } else System.out.println("nilai lebih dari atau sama dengan 5");
       }
   }
}
           
           

   
           
          
    
    

