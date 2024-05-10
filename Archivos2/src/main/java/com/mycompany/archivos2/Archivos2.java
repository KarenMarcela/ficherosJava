

package com.mycompany.archivos2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Archivos2 {

    public static void main(String[] args) {
        try {
            createFile("./archivo.txt");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public static void createFile(String filePath) throws IOException { 
        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("Archivo creado: " + file.getName());
            writerAndFile(file);
        } else {
            System.out.println("El archivo ya existe.");
        }
    }

    public static void writerAndFile(File file) throws IOException { //Escribir y Imprimir en el archivo
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                pw.println("Línea: " + (i + 1));
            }
            System.out.println("Contenido agregado al archivo.");
        }
        

    }
//        
//        File file = new File("./archivo.txt");
//        file.createNewFile(); //TODO: Crear un mètodo para crear un archivo y maneajar la excepcion
//        
//        FileWriter writer = new FileWriter(file); //escribir en el archivo 
//        PrintWriter pw = new PrintWriter(writer); //Imprimir sobre el archivo creado
//        
//        for(int i=0; i<10 ; i++){  
//            pw.println("Lìnea: "+(i+1));
//        }
//        writer.close();
//    }
//

}
