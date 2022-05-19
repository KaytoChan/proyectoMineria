/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congestiones;

import com.google.gson.JsonObject;


public interface ICongestiones {
    public void agregarVehiculo(JsonObject json);
    public void agregarACongestiones(Integer posicion);
    public boolean detectarCongestion(JsonObject json);
    public boolean crearReporteC(JsonObject json);
    public boolean distanciaVehiculos(Integer vehiculo1, Integer vehiculo2);
}
