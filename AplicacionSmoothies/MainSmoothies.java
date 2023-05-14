
/**
 * Write a description of class MainSmoothies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class MainSmoothies
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        SmoothiesPOO smoothies = new SmoothiesPOO();
        SmoothiesPOO[] smoothiesTotales = new SmoothiesPOO[1000];
        
        
        String codigo = "";
        String nombre = "";
        String base = "";
        double precio = 0;
        String azucar = "";
        int cantidad = 0;
        int i = 0;

        int contadorFresaArandanos = 0;
        int contadorPinaNaranja = 0;
        int contadorMangoUchuva = 0;
        int contadorSandiaLimon = 0;
        int contadorBananoPapaya = 0;
        
        double totalFresaArandanos = 0;
        double totalPinaNaranja = 0;
        double totalMangoUchuva = 0;
        double totalSandiaLimon = 0;
        double totalBananoPapaya = 0;
        
        
        
        System.out.println("Bienvenido al Sistema de Smoothies!");
        System.out.println("Tu Smoothie a 6000 y 8000 pesos!");
        
        System.out.println("*********************************************************");        
        System.out.println("Seleccione su sabor:");
        System.out.println("1=Fresa Arandanos");
        System.out.println("2=Piña Naranja");
        System.out.println("3=Mango Uchuva");
        System.out.println("4=Sandia Limon");
        System.out.println("5=Banano Papaya");
        System.out.println("6=Ver Reporte de Ventas");
        System.out.println("*********************************************************");
    
    
    do{
            codigo = sc.next();
            
            switch(codigo){
                case"1":
                nombre = "Fresa Arandanos";
                break;
               
                case"2":
                nombre = "Piña Naranja";
                break;
                
                case"3":
                nombre = "Mango Uchuva"; 
                break;
                
                case"4":
                nombre = "Sandia Limon"; 
                break;
                
                case"5":
                nombre = "Banano Papaya"; 
                break;
               }
               
            if(!codigo.equals("6")) {
                
                System.out.println("Seleccione la base de su smmoothie");
		System.out.println("1=Leche tiene un costo de 6000");
		System.out.println("2=Yogurt tiene un costo de 8000");
                
		base = sc.next();
		
	        switch(base){
	           
	            case"1":
	            precio = 6000;
                    break; 
                    
                    case"2":
	            precio = 8000;
                    break;
                    
                    default:
                        System.out.println("Opción inválida");
                        
                    
		    
                  }
                  
                  System.out.println("Desea agregar azúcar");
                  System.out.println("1=Si");
                  System.out.println("2=No");
                  azucar = sc.next();
                  
                  System.out.println("Su pedido será preparado: ");
                  System.out.println("Sabor   : " + nombre);
                  System.out.println("Base    : " + (base.equals("1")?"Leche":"Yogurt"));
                  System.out.println("Azucar  : " + (azucar.equals("1")?"Si":"No"));
                  System.out.println("Total compra: $" + precio);
               
                  // guarda en memoria cada venta
                  smoothies = new SmoothiesPOO();
                  smoothies.codigo = codigo;
                  smoothies.nombre = nombre;
                  smoothies.precio = precio;
                  smoothies.base = base;
                  smoothies.azucar = azucar;
                  smoothiesTotales[cantidad++] = smoothies;
                  
                  
                
            }
                
        
        
        }while(!codigo.equals("6"));
        
    // reporte de ventas          
    System.out.println("Total ventas: " + cantidad);
    for(i=0; i<cantidad; i++){
        smoothies = new SmoothiesPOO();
        smoothies = smoothiesTotales[i];
        
        switch(smoothies.codigo){
            case"1":
            contadorFresaArandanos++;    // suma cada sabor
            totalFresaArandanos = totalFresaArandanos + smoothies.precio; // suma el precio que lleva mas la nueva venta
            break;
           
            case"2":
            contadorPinaNaranja++; // suma cada sabor
            totalPinaNaranja = totalPinaNaranja + smoothies.precio; // suma el precio que lleva mas la nueva venta
            break;
            
            case"3":
            contadorMangoUchuva++; // suma cada sabor
            totalMangoUchuva = totalMangoUchuva + smoothies.precio; // suma el precio que lleva mas la nueva venta
            break;
            
            case"4":
            contadorSandiaLimon++; // suma cada sabor
            totalSandiaLimon = totalSandiaLimon + smoothies.precio; // suma el precio que lleva mas la nueva venta
            break;
            
            case"5":
            contadorBananoPapaya++; // suma cada sabor
            totalBananoPapaya = totalBananoPapaya + smoothies.precio; // suma el precio que lleva mas la nueva venta
            break;
        }
        
    }
    
    System.out.println("Total Smoothies Fresa Arandanos         : " + contadorFresaArandanos);
    System.out.println("Total Recaudo Smoothies Fresa Arandanos : " + totalFresaArandanos );
    
    System.out.println("Total Smoothies Piña Naranja            : " + contadorPinaNaranja);
    System.out.println("Total Recaudo Smoothies Piña Naranja    : " + totalPinaNaranja );
    
    System.out.println("Total Smoothies Mango Uchuva            : " + contadorMangoUchuva);
    System.out.println("Total Recaudo Smoothies Mango Uchuva    : " + totalMangoUchuva );
    
    System.out.println("Total Smoothies Sandia Limon            : " + contadorSandiaLimon);
    System.out.println("Total Recaudo Smoothies Sandia Limon    : " + totalSandiaLimon );
    
    System.out.println("Total Smoothies Banano Papaya           : " + contadorBananoPapaya);
    System.out.println("Total Recaudo Smoothies Banano Papaya   : " + totalBananoPapaya );
    
    System.out.println("*********************************************************");
    System.out.println("Total Smoothies vendidos   : " + cantidad);
    System.out.println("Total Recaudad             : " + (totalFresaArandanos + totalPinaNaranja + totalMangoUchuva + totalSandiaLimon + totalBananoPapaya));
    System.out.println("*********************************************************");
    
    System.out.println("Gracias por usar nuestro sistema ");
    
         
        
    }
}
