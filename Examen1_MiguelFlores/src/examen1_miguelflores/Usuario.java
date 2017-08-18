/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_miguelflores;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Miguel Flores
 */
public class Usuario {

    private String usuario;
    private String contrasena;
    private Date fechaNacimiento;
    private String telefono;
    private String correo;
    private String nombre;
    private String generoFavorito;
    private ArrayList<Usuario> ListAmigos = new ArrayList();
    private ArrayList<Libros> ListLibros = new ArrayList();

    public Usuario(String usuario, String contrasena, Date fechaNacimiento, String telefono, String correo, String nombre, String generoFavorito) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.generoFavorito = generoFavorito;
    }

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public ArrayList<Usuario> getListAmigos() {
        return ListAmigos;
    }

    public void setListAmigos(ArrayList<Usuario> ListAmigos) {
        this.ListAmigos = ListAmigos;
    }

    public ArrayList<Libros> getListLibros() {
        return ListLibros;
    }

    public void setListLibros(ArrayList<Libros> ListLibros) {
        this.ListLibros = ListLibros;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre;
    }

}
