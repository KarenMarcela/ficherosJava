
package com.mycompany.csvfiles.manageFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class WhiterFile {
//        public static void whiterInFile(String list) throws IOException{
//        try (FileWriter writer = new FileWriter(list)) {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Línea: " + (i + 1));
//            }
//            System.out.println("Contenido agregado al archivo.");
//            
//        }
//       
//    }
    private File file;
    private FileWriter fileWriter; //Para escribir
    private BufferedWriter bufferedReader;

    public WhiterFile(File file) throws IOException {
        this.file = file;
        this.fileWriter = new FileWriter(file);
        this.bufferedReader = new BufferedWriter(fileWriter);
        
    }
    public List<String> whiterData(){
        String line = null;
        List<String > data = new ArrayList<>();
        return data;
    }
}
