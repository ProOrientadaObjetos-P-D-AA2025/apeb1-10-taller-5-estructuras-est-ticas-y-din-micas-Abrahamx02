/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author abrah
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        Estudiante estudiante = new Estudiante(nombre, edad);
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = sc.nextLine();
        System.out.print("Ingrese la nota ACD (sobre 3.5): ");
        double acd = sc.nextDouble();
        System.out.print("Ingrese la nota APE (sobre 3.5): ");
        double ape = sc.nextDouble();
        System.out.print("Ingrese la nota AA (sobre 3.0): ");
        double aa = sc.nextDouble();

        Materia materia = new Materia(nombreMateria, acd, ape, aa);
        estudiante.asignarMateria(materia);
        estudiante.verificarAprobacion();
    }
}


