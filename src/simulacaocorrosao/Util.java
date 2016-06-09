/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaocorrosao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author charleshenriqueportoferreira
 */
public class Util {
    
     public static void printFile(String fileName, String texto) throws IOException {
        try (FileWriter fw = new FileWriter(fileName); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(texto);
            bw.close();
            fw.close();
        }
    }
     
     public static void createFolder(String folderName){
         if(!new File(folderName).exists()){
             new File(folderName).mkdir();
         }
     }
    
}
