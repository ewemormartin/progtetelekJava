package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n  = -1;
        while (n < 0){
            System.out.println("N= ");
            n = sc.nextInt();
            
            
        }
        int ossz = 0;
        for (int i = 0; i < n+1; i++) {
            ossz += i;
            
        }
        System.out.printf("Az első %d szám összege: %d \n ",n,ossz);
        
        
        
        
        
        System.out.println("MEGSZÁMLÁLÁS");
        int db = 0;
        for (int i = 10; i < 100; i++) {
            if ( i % 2 == 0){
                db++;
            }
        }
        System.out.printf("Kétjegyű párosak száma: %d \n",db);
        System.out.println("");
        
        
        
        
        System.out.println("MIN KIVÁLASZTÁS");
        int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE;
        int szam;
        while((szam = sc.nextInt()) != VEGE){
            if (szam < min){
                min = szam;
                
            }
        db++;
    }
        System.out.printf("A legkisseb szám: %d", min);   
        
        
        
        
        System.out.println("Eldöntés tétel");
        n = sc.nextInt();
        int i;
        boolean prim;
        if(n < 2){
            prim = false;
        }
        else{
           i = 2;
           while(i <= Math.sqrt(n) && n % i !=0 ){
               i++;
               prim = i > Math.sqrt(n); 
           }
        }
        if (prim = true){
            System.out.println("Prim");
        }
        else{
            System.out.println("Nem prím");
        }
        
       
    }
    
}
