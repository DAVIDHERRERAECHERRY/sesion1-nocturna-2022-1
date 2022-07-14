/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;


public class EJERCICIO6 {
//HACER UNA APLICACION QUE TENGA VALIDACION EN UN PARQUEADERO DE PARQUIMETRO
    
    public static void main(String[] args) {
        String vehiculo="auto";
        
        //PROCESO
        if (vehiculo.equals("auto")||vehiculo.equals("camion")||vehiculo.equals("suv")){
        
        //SALIDA
        
         System.out.println(" tiene acceso al parquimetro"+vehiculo);
        }else{
            System.out.println("no tiene acceso al parquimetro");
        }
    }
    
}
