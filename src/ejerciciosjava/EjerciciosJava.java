/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author Jesus
 */
public class EjerciciosJava {

    public boolean fiestasArdillas(int numBellotas,boolean finDeSemana){
       if(finDeSemana){
        return true;
    }
       if(40<=numBellotas && numBellotas<=60){
           return true;
       }
       return false;
    }
    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava();
        System.out.println("Ejercicio 01:ARDILLAS");
        System.out.println("30,false"+ejercicio.fiestasArdillas(30,false));
        System.out.println("50,false"+ejercicio.fiestasArdillas(50,false));
        System.out.println("70,true"+ejercicio.fiestasArdillas(70,true));
    }
    
}
