/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sie.mycompany.modelo;

/**
 *
 * @author lu
 */
public class Ipo {
    
    private String nombre;
    private  String codigoIpo;
    
    public void setCodigoIpo(String codigoIpo){
        this.codigoIpo = codigoIpo;
    }
    
    public String getCodigoIpo(){
        return this.codigoIpo; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
