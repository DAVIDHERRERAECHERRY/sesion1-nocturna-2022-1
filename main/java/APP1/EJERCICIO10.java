/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;

import java.util.Scanner;


public class EJERCICIO10 {
//ENTRADA DE DATOS POR CONSOLA DE PRODUCTOS POR CONSOLA CANTIDAD DE PRODUCTOS VENTA DE PRODUCTOS 
//RESULTADO FINAL    
   
    public static void main(String[] args) {
        //ENTRADA DE DATOS
        Scanner entrada = new Scanner(System.in);
        String producto = "";
        int cantidad = 0;
        float precio,total =0.0f;
        
        System.out.println("----VENTAS DE PRODUCTOS----");
        
        //ENTRADA DE DATOS DEL USUARIO
        System.out.print("INGRESE EL PRODUCTO QUE DESEA");
        producto=entrada.nextLine();
        System.out.print("INGRESE LA CANTIDAD DE PTODUCTOS");
        cantidad=entrada.nextInt();
        System.out.print("INGRESE EL PRECIO DEL PRODUCTO");
        precio=entrada.nextFloat();
        
        //PROCESO
        total= cantidad*precio;
        
        //SALIDA DE DATOS
        System.out.println("EL SALDO TOTAL DE CANCELAR ES :$"+total);
        
        
        
    }
    
}
