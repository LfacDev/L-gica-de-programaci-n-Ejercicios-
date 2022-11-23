/*16.Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente
y mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo 
de 56h.  Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro
del rango permitido, también se debe pedir el precio de la hora. 
Imprimir la cantidad
de horas trabajadas y el pago.
 * 
 */
package taller4;

import java.util.Scanner;

/**
 *Datos de entrada: horas trabajadas, precio de la hora
 * Datos de salida: horas trabajadas y pago
 * 
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        double horasTrabajadas;
        double precioHora;
        double totalPagoS;
        double totalPagoM;
        double horaTM;
        
        totalPagoS= 0;
        totalPagoM= 0;
        horaTM= 0;
        
        
        System.out.println("Ingrese horas trabajadas");
        horasTrabajadas = leer.nextDouble();
        
        System.out.println("ingrese el valor de la hora");
        precioHora = leer.nextDouble();
        
        if (horasTrabajadas >=38.0 && horasTrabajadas<=56.0){
            
            System.out.println("La horas trabajas semanalmente son:" + horasTrabajadas);
            
            totalPagoS = horasTrabajadas * precioHora;
            
            System.out.println("El pago total semanal es de :" + totalPagoS);
            
            horaTM = horasTrabajadas * 4;
            
            System.out.println("Las horas trabajadas mensuales son:" + horaTM);
            
            totalPagoM = horaTM * precioHora;
            
            System.out.println("El pago total del mes es: " + totalPagoM);
            
            
            
        }else{
            System.out.println("Ingrese numero de horas validas");
        }
        
        
        
        
        
    }
    
}
