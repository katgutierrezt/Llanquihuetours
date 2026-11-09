/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import model.Direccion;
import model.Empleado;
import model.Persona;

/**
 *
 * @author katae
 */
public class Main {
    public static void main (String [] args){
        System.out.println("=======================");
       System.out.println("   SISTEMA DE GESTION - LLANQUIHUE TOUR   ");
       System.out.println("===========================\n");
       
       Direccion dir1= new Direccion("Costanera", 150, "Llanquihue");
       Direccion dir2 = new Direccion ("Del Salvedor", 320, "Puerto Varas");
       Direccion dir3 = new Direccion("Vicente Perez Rosales", 890, "Ensenada");
       
       Persona cliente1= new Persona("18235567-8", "Carla Soto", "carla.soto@gmail.com", dir1);
       Persona cliente2= new Persona("19886643-2", "Matias Rojas", "matias.rojas@gmail.com", dir2);
       Empleado empleado1 = new Empleado("15987654-K", "Alejandro Perez", "alejandro.perez@llanquihuetour.cl", dir3, "Guia Turistico Bilingue", 950000);
       System.out.println("--- LISTADO CLIENTES REGISTRADOS ---");
       System.out.println("1. "+ cliente1.toString());
       System.out.println("2. "+ cliente2.toString());
       
       System.out.println("\n--- LISTADO DE PERSONAL DE LA AGENCIA ---");
       System.out.println("1. " + empleado1.toString());
       
       System.out.println("\n========================");
       System.out.println("     EJECUCION FINALIZADA CORRECTAMENTE     ");
       System.out.println("=============================");
       
    }
    
    
    
}
