/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author abrah
 */
public class Estudiante {

   

        public String nombre;
        public int edad;
        public Materia materia;

        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void asignarMateria(Materia materia) {
            this.materia = materia;
        }

        public void verificarAprobacion() {
            if (materia == null) {
                System.out.println("El estudiante no tiene materia asignada.");
                return;
            }
            System.out.println("Estudiante: " + nombre + " - Edad: " + edad);
            System.out.println(materia);

            if (materia.determinarAprobado()) {
                System.out.println("Resultado: ¡Aprobado!");
            } else {
                System.out.println("Resultado: No aprobado.");
                System.out.println("Debe rendir examen de recuperación (mínimo 3.5/10).");
                double notaRec = materia.notaRecuperacion(3.5);
                System.out.println("Nota con recuperación: " + notaRec + "/10.0");
            }
        }
    }

