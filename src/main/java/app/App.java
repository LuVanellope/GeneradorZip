/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sie.mycompany.auxiliares.FolderManager;
import sie.mycompany.auxiliares.ZipManager;
import static sie.mycompany.clasificador.Clasificador.orderGomList;
import sie.mycompany.modelo.Gom;

/**
 *
 * @author lu
 */
public class App {

    public static FolderManager manager;

    public static void main(String[] args) {
        manager = new FolderManager();
        try {
            List<Gom> listaDeGoms = new ArrayList<>();
            listaDeGoms.add(new Gom());
            listaDeGoms.get(0).setDia("03");
            listaDeGoms.get(0).setMes("Octubre");
            listaDeGoms.get(0).setNumeroGom(1);

            listaDeGoms.add(new Gom());
            listaDeGoms.get(1).setDia("04");
            listaDeGoms.get(1).setMes("Agosto");
            listaDeGoms.get(1).setNumeroGom(1);

            listaDeGoms.add(new Gom());
            listaDeGoms.get(2).setDia("04");
            listaDeGoms.get(2).setMes("Agosto");
            listaDeGoms.get(2).setNumeroGom(2);

            Map<String, Map< String, List<Gom>>> mostrar = orderGomList(listaDeGoms);

            for (Map.Entry<String, Map<String, List<Gom>>> entry : mostrar.entrySet()) {
                String key = entry.getKey();
                Map<String, List<Gom>> value = entry.getValue();
                for (Map.Entry<String, List<Gom>> entry1 : value.entrySet()) {
                    String key1 = entry1.getKey();
                    List<Gom> value1 = entry1.getValue();
                    for (Gom listaDeGom : value1) {
                        manager.crear(key + "/" + key1 +"-"+ key, "gom" + listaDeGom.getNumeroGom()
                                + ".txt", "contenido del gom" + listaDeGom.getNumeroGom());
                    }

                }
            }
            
            ZipManager.folderToZip(FolderManager.BIG_FOLDER) ;

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}
