package sie.mycompany.clasificador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import sie.mycompany.auxiliares.AuxiliarMap;
import sie.mycompany.modelo.Gom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lu
 */
public class Clasificador extends AuxiliarMap {

    private Gom gom;

    public Gom getGom() {
        return gom;
    }

    public void setGom(Gom gom) {
        this.gom = gom;
    }
    
   

    /**public void testmethod() {
        try {
            orderGomList(null);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }*/

    public static Map<String, Map< String, List<Gom>>> orderGomList(List<Gom> goms) throws Exception {

        Map<String, Map< String, List<Gom>>> myGom = new TreeMap<>();
//        String[] goms={""};

        if (goms != null && !goms.isEmpty()) {

            for (Gom gom1 : goms) {
                if (myGom.isEmpty()) {
                    crearMesYDia(myGom, gom1);
                } else if (myGom.get(gom1.getMes()) != null && myGom.get(gom1.getMes()).get(gom1.getDia()) != null) {
                    myGom.get(gom1.getMes()).get(gom1.getDia()).add( gom1);
                } else if (myGom.get(gom1.getMes()) == null) {
                    crearMesYDia(myGom, gom1);
                }else if (myGom.get(gom1.getMes()).get(gom1.getDia()) == null){
                    crearDia(myGom.get(gom1.getMes()), gom1);
                }
            }

        } else {
            throw new Exception("Te faltan datos para la busqueda");
        }

          
        return myGom;
    }
    
    
    
    
    

}
