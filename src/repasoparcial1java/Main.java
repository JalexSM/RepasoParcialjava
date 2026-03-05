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
                    	 condicionesyDivisivilidad();
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
    
    
    public static double leerDouble(String mensaje) {

        double numero = 0;

        while (true) {
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
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
    	
       public static int solicitarCantidad() {
        return leerEntero("Ingrese el número: ");
        	
        }
    
    public static void sumadeDivisibles() {
    	int numero = solicitarCantidad();
    	int suma = calcularSumaDivisibles(numero);
    	System.out.println("La suma de los números divisibles entre 4 es: " + suma);


     }
    
    public static int calcularSumaDivisibles(int numero) {
    	int inter = 0;
    	int suma = 0;
    	
    	while( inter <= numero) {
    		inter += 1 ;
    		 if  ((inter % 4 )==0) {
    			 suma += inter;
    
    }
    	 }
    	 return suma;}
    
    
    
    public static long calcularFactorial(int numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
    
    public static void factorial() {

        int numero = solicitarCantidad();

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
        
       //	Parte 2 – Condiciones y Divisibilidad. 
        
       public static void condicionesyDivisivilidad() {
    	   	 int opcion = 0;

    	     while (opcion != 4) {
    	    	 System.out.println("\n=====Ciclos y Operaciones Numéricas. =====");
    	         System.out.println("1. Multiplo de 7 o de 11");
    	         System.out.println(" 2.Numeros divisbles en 3 pero no en 2 ");
    	         System.out.println(" 3.Tiempos del dia segun la hora ");
    	         System.out.println(" 4.Salir ");

    	         System.out.print("Seleccione una opción: ");
    	         
    	         try {
    	             opcion = sc.nextInt();

    	             switch (opcion) {
    	                 case 1:
    	                	 multiplos();
    	                     break;
    	                 case 2:
    	                	 divisiblesyNo();
    	                     break;
    	                 case 3:
    	                	 periodosDia();
    	                	 break;
    	                 case 4:
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
       
      public static void multiplos() {
    	   
    	   int numero = solicitarCantidad();
    	   String respuesta = evaluarMultiplos(numero);
    	    System.out.println(respuesta);

    	 }
       public static String evaluarMultiplos(int numero) {
    	    if (numero % 7 == 0 && numero % 11 == 0) {
    	        return "El numero es multiplo de 7 y de 11";
    	    } else if (numero % 7 == 0) {
    	        return "El numero es multiplo de 7";
    	    } else if (numero % 11 == 0) {
    	        return "El numero es multiplo de 11";
    	    } else {
    	        return "El numero no es multiplo de 7 ni de 11";
    	    }
    	}
    	   
       public static void divisiblesyNo() {
    	   int numero = solicitarCantidad();
    	   mostrarnumeros(numero);
       }
       
       
       public static void  mostrarnumeros(int numero) {
    	   System.out.println("Números divisibles entre 3 pero no entre 2:");
    	   for (int i = 1; i <= numero; i++) {
    		   if ((i % 3) == 0 &&( i % 2 )!= 0) {
    			   System.out.println(i);
    		   }
    	   }
       }
    	   
       public static int leerHora(String mensaje) {

    	   int numero;

    	    while (true) {
    	        try {
    	            System.out.print(mensaje);
    	            numero = Integer.parseInt(sc.nextLine());

    	            if (numero >= 0 && numero <= 23) {
    	                return numero;
    	            } else {
    	                System.out.println("La hora debe estar entre 0 y 23.");
    	            }

    	        } catch (NumberFormatException e) {
    	            System.out.println("Entrada inválida. Debe ingresar un número.");
    	        }
    	    }
       }

      public static void periodosDia() {
    	  int hora = leerHora("ingrese la hora entre las 0-23: ");
    	  String tiempo = evaluarHora(hora);
    	  System.out.println(tiempo);
      }
      
       public static String evaluarHora(int hora) {
    	   if ( hora>=0 && hora <= 11 ) {
    		   return ("Es de mañana");
    	   }else if(hora>=12 && hora <= 17) {
    		   return ("Es de tarde");
    	   }else {
    		   return ("Es de noche");
    	   
    	   
       }
       
        
        
        
        
    }
    	
       //  Parte 3 – Uso de switch
       public static void usoDeSwitch() {
  	   	 int opcion = 0;

  	     while (opcion != 3) {
  	    	 System.out.println("\n===== Uso de switch =====");
  	         System.out.println("1. Numero a numero romano");
  	         System.out.println(" 2. Calculadora");
  	         System.out.println(" 3.Salir ");

  	         System.out.print("Seleccione una opción: ");
  	         
  	         try {
  	             opcion = sc.nextInt();

  	             switch (opcion) {
  	                 case 1:
  	                	calculadoraBasica();
  	                     break;
  	                 case 2:
  	                	 numerosARomanos();
  	                     break;
  	                 case 3:
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
       
       
       public static void numerosARomanos() {
       
       int opcion = 0;

       while (opcion != 6) {

           System.out.println("\n===== Numero a numero romano =====");
           System.out.println("1. 1 a Romano");
           System.out.println("2. 2 a Romano");
           System.out.println("3. 3 a Romano");
           System.out.println("4. 4 a Romano");
           System.out.println("5. 5 a Romano");
           System.out.println("6. Salir");

           System.out.print("Seleccione una opción: ");

           try {
               opcion = Integer.parseInt(sc.nextLine());

               switch (opcion) {
                   case 1:
                       System.out.println("1 es I en Romano");
                       break;
                   case 2:
                       System.out.println("2 es II en Romano");
                       break;
                   case 3:
                       System.out.println("3 es III en Romano");
                       break;
                   case 4:
                       System.out.println("4 es IV en Romano");
                       break;
                   case 5:
                       System.out.println("5 es V en Romano");
                       break;
                   case 6:
                       System.out.println("Saliendo del programa...");
                       break;
                   default:
                       System.out.println("Opción inválida.");
               }

           } catch (NumberFormatException e) {
               System.out.println("Debe ingresar un número válido.");
           }
         }
       }  
       

       
       public static void calculadoraBasica() {
    	   
           double numero1 = leerDouble("Ingrese el primer número: ");
           double numero2 = leerDouble("Ingrese el segundo número: ");
           int operacion = 0;
           
           
           System.out.println("\nSeleccione operación:");
           System.out.println("1. Suma");
           System.out.println("2. Resta");
           System.out.println("3. Multiplicación");
           System.out.println("4. División");
           System.out.print("Opción: ");

         

           try {
               operacion = sc.nextInt();
           } catch (Exception e) {
               System.out.println("Operación inválida.");
               sc.nextLine();
               return;
           }

           switch (operacion) {
               case 1:
                   System.out.println("Resultado: " + suma(numero1, numero2));
                   break;
               case 2:
                   System.out.println("Resultado: " + resta(numero1, numero2));
                   break;
               case 3:
                   System.out.println("Resultado: " + multiplicacion(numero1, numero2));
                   break;
               case 4:
                   if (numero2 == 0) {
                       System.out.println("No se puede dividir entre cero.");
                   } else {
                       System.out.println("Resultado: " + division(numero1, numero2));
                   }
                   break;
               default:
                   System.out.println("Operación no válida.");
           }
       }
       
       public static double suma(double a, double b) {
           return a + b;
       }

       public static double resta(double a, double b) {
           return a - b;
       }

       public static double multiplicacion(double a, double b) {
           return a * b;
       }

       public static double division(double a, double b) {
           return a / b;
       }

       
       
       
       
}
    	