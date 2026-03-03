package repasoparcial1java;

import java.util.Scanner;

public class Main {
	static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
    	 int opcion = 0;

         while (opcion != 6) {
        	 System.out.println("\n===== MENÚ PRINCIPAL =====");
             System.out.println(" Parte 1 – Ciclos y Operaciones Numéricas.");
             System.out.println(" Parte 2 – Condiciones y Divisibilidad. ");
             System.out.println(" Parte 3 – Uso de switch. ");
             System.out.println(" Parte 4 – Análisis Numérico. ");
             System.out.println(" Parte 5 – Patrones y Transformaciones. ");
             System.out.println(" 6. SALIR ");
             System.out.print("Seleccione una opción: ");
             
             try {
                 opcion = sc.nextInt();

                 switch (opcion) {
                     case 1:
                    	 cicloyOperaciones();
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
//             VALIDACIONES
    
    public static int leerEntero(String mensaje) {

        int numero = 0;

        while (true) {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                sc.nextLine(); 
            }
        }

        return numero;
    }
    
    
    
            //	Parte 1 ciclos y Operaciones 
 
    
    public static void cicloyOperaciones() {
   	 int opcion = 0;

     while (opcion != 6) {
    	 System.out.println("\n=====Ciclos y Operaciones Numéricas. =====");
         System.out.println("1. Suma de Divisibles en 4 ");
         System.out.println(" 2. Calculo de un factorial");
         System.out.println(" 3. Conteo de positivos, negativos y cero ");
         System.out.println(" 4. Promedio de numero pares");
         System.out.println(" 5. Suma de los digitos de un numero");
         System.out.println(" 6. SALIR");
         System.out.print("Seleccione una opción: ");
         
         try {
             opcion = sc.nextInt();

             switch (opcion) {
                 case 1:
                	 sumadeDivisibles();
                     break;
                 case 2:
                	 	factorial();
                     break;
                 case 3:
                	 	negativosPositivosyCero();
                     break;
                 case 4:
                	 	promediodePares();
                     break;
                 case 5:
                	 sumadesusDigitos();
                	 break;
                 case 6:
                 System.out.println("Saliendo del programa...");
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
    	
   
    
    public static void sumadeDivisibles() {
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

    
    
    public static long calcularFactorial(int numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
    
    public static void factorial() {

        int numero = leerEntero("Ingrese un número entero (no negativo): ");

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            return;
        }

        long resultado = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
    
    public static void negativosPositivosyCero() {
    	  int numeros = solicitarCantidad();
          int[] resultados = contarNumeros(numeros);
          mostrarResultados(resultados);
      }
    	
    public static int solicitarCantidad() {
        return leerEntero("Ingrese el número: ");
        	
        }
    	
        public static int[] contarNumeros(int n) {

            int positivos = 0;
            int negativos = 0;
            int ceros = 0;

            for (int i = 1; i <= n; i++) {

                int numero = leerEntero("Ingrese el número " + i + ": ");

                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }				

            return new int[]{positivos, negativos, ceros};
        }

        public static void mostrarResultados(int[] resultados) {
            System.out.println("\nResultados:");
            System.out.println("Positivos: " + resultados[0]);
            System.out.println("Negativos: " + resultados[1]);
            System.out.println("Ceros: " + resultados[2]);
        }

        
        public static void promediodePares() {
        	int numeros = solicitarCantidad();
        	double promedio = calcularPromedioPares(numeros);
        	   if (promedio == -1) {
                   System.out.println("No hay números pares en el rango.");
               } else {
                   System.out.println("El promedio de los números pares entre 1 y " + numeros + " es: " + promedio);
               }
        }
        
        public static double calcularPromedioPares(int numeros) {
        	int suma = 0 ;
        	int cantidad = 0;
        			
        			 for (int i = 1; i <= numeros; i++) {

        		            if (i % 2 == 0) {   
        		                suma += i;
        		                cantidad++;
        		            }
        		        }

        		        if (cantidad == 0) {
        		            return -1; 
        		        }

        		        return (double) suma / cantidad;
        }
        
       public static void sumadesusDigitos() {
    	   int n = solicitarCantidad();
    	   int suma = calcularsumadedigitos(n);
           System.out.println("La suma de los dígitos es: " + suma);
       }
       public static int calcularsumadedigitos(int n) {
    	   n = Math.abs(n); // Por si el número es negativo
    	   int suma = 0;
    	   while (n>0) {
    		   int digito = n%10;
    		   suma+=digito;
    		   n = n / 10; 
    	   }
    	   return suma;
    	   
    	   
    	   
    	   
    	   
    	   
       }
        
        
        
        
        
        
        
    }
    		
    	
    	