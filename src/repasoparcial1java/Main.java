package repasoparcial1java;

import java.util.Scanner;

public class Main {
	static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
    	 int opcion = 0;

         while (opcion != 5) {
        	 System.out.println("\n===== MENÚ PRINCIPAL =====");
             System.out.println("1. divisibles en 4 ");
             System.out.println("2. ");
             System.out.println("3. ");
             System.out.println("4. ");
             System.out.println("5. ");
             System.out.print("Seleccione una opción: ");
             
             try {
                 opcion = sc.nextInt();

                 switch (opcion) {
                     case 1:
                    	 sumadedivisibles();
                         break;
                     case 2:
                     	;
                         break;
                     case 3:
                    	 ;
                         break;
                     case 4:
                     	;
                         break;
                     case 5:
                     	;
                     case 6:
                     ;
                     break;
                     default:
                         System.out.println("Opción inválida.");
                 }
             
                 } catch (Exception e) {
                     System.out.println("Debe ingresar un número válido.");
                     sc.nextLine(); 
                 }
             }
         }
             
            //	Parte 1 ciclos y Operaciones 
 
    
    public static void sumadedivisibles() {
    	 int numero = 0;
    	 int inter=0;
    	 int suma = 0;
    	 System.out.print("Ingrese un número entero : ");
         numero = sc.nextInt();
    	
    	while( inter <= numero) {
    		inter += 1 ;
    		 if  ((inter % 4 )==0) {
    			 suma = inter + suma;
    			
    		 }
    		
    	 }
    	System.out.print("la suma de los numero divisibles entre 4 es : " + suma);
    	 


     }

    
    public static void numeroFactorial() {
    	int numero = 0 ;
    	int inter= 0;
    	int facto = 0;
    	 System.out.print("Ingrese un número entero : ");
         numero = sc.nextInt();
    	
    	while( inter <= numero) {
    		inter += 1;
    		facto 
    		
    	}
    	
    }
    
    
}
    
    
    
    
    
    
    	
   
    	
    	
    	
    	
    	
    	
    

	
	

