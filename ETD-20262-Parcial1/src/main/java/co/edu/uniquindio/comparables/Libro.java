package co.edu.uniquindio.comparables;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private int anio;

    public Libro(int anio, String titulo) {
        this.anio = anio;
        this.titulo = titulo;
    }

    @Override
    public int compareTo(Libro l2) {
        //return titulo.compareTo(l2.getTitulo());
        return Integer.compare(anio,l2.getAnio());
    }

    @Override
    public String toString() {
        return "{ " +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return this.anio == libro.anio && Objects.equals(this.titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
