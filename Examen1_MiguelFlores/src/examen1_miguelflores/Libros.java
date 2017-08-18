/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_miguelflores;

import java.util.Date;

/**
 *
 * @author Miguel Flores
 */
public class Libros {

    private String titulo;
    private String descripcion;
    private int puntaje;
    private int copias_Disponibles;
    private String genero;
    private double valor;
    private String edicion;
    private String autor;
    private Date anoPublicacion;

    public Libros() {
    }

    public Libros(String titulo, String descripcion, int puntaje, int copias_Disponibles, String genero, double valor, String edicion, String autor, Date anoPublicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias_Disponibles = copias_Disponibles;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias_Disponibles() {
        return copias_Disponibles;
    }

    public void setCopias_Disponibles(int copias_Disponibles) {
        this.copias_Disponibles = copias_Disponibles;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(Date anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
