package co.edu.uniquindio.comparables.ejemplo;

public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private String identificacion;
    private int edad;
    private double altura;

    public Estudiante(String nombre, String identificacion, int edad, double altura) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
//        return identificacion.compareTo(otroEstudiante.getIdentificacion());
        return otroEstudiante.getIdentificacion().compareTo(identificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nombre + " " + identificacion + " " + edad + " " + altura;
    }


}
