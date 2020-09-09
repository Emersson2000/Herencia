
package Herencia;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos() {
        System.out.println("El nombre es: "+getNombre()+
                "\nEl apellido es: "+getApellido()+
                "\nLa edad es: "+getEdad()+
                "\nEl código del estudiante es: "+codigoEstudiante+
                "\nLa nota final es: "+notaFinal);
    }
}
