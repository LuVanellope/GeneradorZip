/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sie.mycompany.auxiliares;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author lu
 */
public class FolderManager {

    public static String BIG_FOLDER = System.getProperty("user.home") +"/zippers" ;

    /**
     * Recibe tres parametros, para crear carpetas y archivos con un contenido 
     * 
     * @param path Ruta donde se almacena las carpetas.
     * @param fileName el nombre del archivo. 
     * @param content contenido que debe ir dentro del archivo.
     * @throws IOException 
     */
    public void crear(String path, String fileName, String content) throws IOException {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        String toFIlePath = BIG_FOLDER + "/" + path;

        try {
            File file = new File(toFIlePath);
            //if(bool1 != bool2)
            if (!file.exists()) {
                file.mkdirs();
            }

            fileWriter = new FileWriter(toFIlePath + "/" + fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(content);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }

            if (fileWriter != null) {
                fileWriter.close();
            }

        }

    }
}
