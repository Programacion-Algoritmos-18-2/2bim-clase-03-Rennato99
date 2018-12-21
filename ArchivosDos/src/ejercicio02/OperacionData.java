/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionData {
    ArrayList<Estadio> informacion;
    
    public void agregarInformacion(ArrayList<Estadio> info){
        informacion = info;
    }
    
    public ArrayList<Estadio> obtenerInformacion(){
        return informacion;
    }
    
    public double obtenerPromedio(){
        double suma=0;
            // Recorremos la lista
            for(int i = 0; i < informacion.size(); i++){
                suma += obtenerInformacion().get(i).getCapacidad();
            }
            double promedio = suma/informacion.size();
            return promedio;
    }
    
}
