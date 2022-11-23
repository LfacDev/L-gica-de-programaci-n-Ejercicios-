/*
 * 18.Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes parámetros: 
•Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y más Aux. de transporte= +11%.
•Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-6% y más Aux. de transporte= +9%.
•Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, descuento de segurode vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
•Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
•Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida 6%, descuento de salud =-10% y más Aux. de transporte= +9%.
 */
package taller4;

import java.util.Scanner;

/**
 *Datos de entrada= salario neto;
 * Datos de salida = salario con descuentos;
 * 
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
        double salarioNeto;
        double salarioTotal;
        double descuentoP;
        double descuentoS;
        double descuentoT;
        double descuentoV;
            
        salarioTotal =0;    
                
        System.out.println("Ingrese el salario");
        salarioNeto = leer.nextDouble();
               
        if(salarioNeto <= 700000){
         
            descuentoP= salarioNeto*2/100;
            descuentoS= salarioNeto*4/100;
            descuentoT= salarioNeto*11/100;
            salarioTotal= salarioNeto-descuentoP-descuentoS+descuentoT;
                            
            System.out.println("El salario total es: " + salarioTotal);
                                     
        }
        
        if(salarioNeto >= 741000 && salarioNeto<=999999 ){  
           
            descuentoP= salarioNeto*4/100;
            descuentoS= salarioNeto*6/100;
            descuentoT= salarioNeto*9/100;
            salarioTotal= salarioNeto-descuentoP-descuentoS+descuentoT;
            System.out.println("El salario total es: " + salarioTotal);  
        }
        
        if(salarioNeto >= 1000000 && salarioNeto<=1800000 ){  
           
            descuentoP= salarioNeto*6/100;
            descuentoV = salarioNeto*5/100;
            descuentoS= salarioNeto*6/100;
            descuentoT= salarioNeto*9/100;
            
            salarioTotal= salarioNeto-descuentoP-descuentoV-descuentoS+descuentoT;
            System.out.println("El salario total es: " + salarioTotal);  
        }
        
        if(salarioNeto >= 1800000 && salarioNeto<=2500000 ){  
           
            descuentoP= salarioNeto*6/100;
            descuentoV = salarioNeto*5/100;
            descuentoS= salarioNeto*8/100;
            descuentoT= salarioNeto*8/100;
            
            salarioTotal= salarioNeto-descuentoP-descuentoV-descuentoS+descuentoT;
            System.out.println("El salario total es: " + salarioTotal);  
        }
        
        if(salarioNeto >= 2500000){  
           
            descuentoP= salarioNeto*8/100;
            descuentoV = salarioNeto*6/100;
            descuentoS= salarioNeto*10/100;
            descuentoT= salarioNeto*9/100;
            
            salarioTotal= salarioNeto-descuentoP-descuentoV-descuentoS+descuentoT;
            System.out.println("El salario total es: " + salarioTotal);  
        }
     }
    
}
