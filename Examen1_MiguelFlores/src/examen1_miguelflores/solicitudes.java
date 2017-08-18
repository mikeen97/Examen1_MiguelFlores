/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_miguelflores;

/**
 *
 * @author Miguel Flores
 */
public class solicitudes {

    private String receptor;
    private String emisor;

    public solicitudes(String receptor, String emisor) {
        this.receptor = receptor;
        this.emisor = emisor;
    }

    public solicitudes() {
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    @Override
    public String toString() {
        return receptor;
    }
}
