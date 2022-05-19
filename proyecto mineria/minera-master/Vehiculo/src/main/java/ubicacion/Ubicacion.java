/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicacion;


public class Ubicacion {
        
    private double longitud;
    private double latitud;
    private double altitud;

    public Ubicacion() {
    }

    public Ubicacion(double longitud, double latitud, double altitud) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.altitud = altitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "longitud=" + longitud + ", latitud=" + latitud + ", altitud=" + altitud + '}';
    }            
}
