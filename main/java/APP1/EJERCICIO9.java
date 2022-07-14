/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;


public class EJERCICIO9 {
//REALIZAR UNA PLICACION CON EL SUELDO DE UN EMPLEADO PARA PAGAR POR LAS HORAS EXTRAS APORTACIONES AL IESS
//SUELDO NETO A RECIBIR    
  
    public static void main(String[] args) {
       String empleado="DAVID HERRERA";
       String cargo="gerente general de la empresa";
       
       double pagohora=20.0;
       int numerohora=160;
       double sueldo=0.0;
       double iess=0.0;
       double netorecibir=0.0;
       
       //PROCESO
       sueldo =numerohora * pagohora;
       iess= sueldo * 0.09;
       netorecibir = sueldo-iess;
       
       //SALIDA
       System.out.println("---ROL DE PAGO DEL MSC DAVID HERRERA ECHERRY---");
       System.out.println("EMPLEADO:"+empleado);
       System.out.println("Su cargo:"+cargo);
       System.out.println("Su sueldo es:"+sueldo);
       System.out.println("Numero de horas trabajadas es:"+numerohora);
       System.out.println("Su pago por hora es: "+pagohora);
       System.out.println("Descuento iess es: "+iess);
       System.out.println("Sueldo neto a recibir:"+netorecibir);
    }
    
}
