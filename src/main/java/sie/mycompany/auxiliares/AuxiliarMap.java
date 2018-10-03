/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sie.mycompany.auxiliares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import sie.mycompany.modelo.Gom;

/**
 *
 * @author lu
 */
public class AuxiliarMap {

    /**
     *
     * @param meses = Son los meses ya listados en el map
     * @param mes = Es el mes a agregar en el map
     */
    public static void crearMesYDia(Map<String, Map< String, List<Gom>>> meses, Gom mes) {
        meses.put(mes.getMes(), new TreeMap<>());
        crearDia(meses.get(mes.getMes()), mes);

    }

    public static void crearDia(Map< String, List<Gom>> dias, Gom dia) {
        dias.put(dia.getDia(), new ArrayList<>());
        if (dias.get(dia.getDia()) == null) {
            dias.get(dia.getDia()).addAll(new ArrayList<>());
        }
        dias.get(dia.getDia()).add(dia);
    }

}
