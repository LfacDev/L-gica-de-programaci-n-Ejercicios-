/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio15 {

    /**
     * 15.Realizar un programa que calcule el valor a pagar por algunos galones de gasolina si sabemos
     * que cada litro de gasolina vale 9.500.Imprimir la cantidad de galones, precio por galón,
     * cantidad de litros y precio a pagar.
     * @param args
     */
    //Datos entrada:Numero de galones
    //datos de salida: la cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double cantidadG;
        double precioLitroG;
        double cantidadL;
        double conversion;
        double valorTotal;
        double precioG;
        double valorLitros;
        
        precioLitroG = 9500;
        conversion = 0;
        cantidadL = 0;
        valorTotal = 0;
        
        System.out.println("Ingrese Cantidad de galones");
        cantidadG = leer.nextDouble();
        
        //conversion de galones a litros
        conversion = cantidadG * 3.78;
        
        //Valor litros
        valorLitros = conversion * precioLitroG;
        
        
        //valor por galon
        precioG =3.78 * 9500; 
        
        //Valor total
        valorTotal = cantidadG * precioG;
        
        System.out.println("La cantidad de galones son:" + cantidadG);
        System.out.println("El precio por galon es de " + precioG);
        System.out.println("La cantidad total de litros son:" + conversion);
        System.out.println("El precio a pagar es de :" + valorTotal);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
