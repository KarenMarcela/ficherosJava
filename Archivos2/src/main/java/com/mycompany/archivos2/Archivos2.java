

package com.mycompany.archivos2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Archivos2 {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        file.createNewFile(); //TODO: Crear un mètodo para crear un archivo y maneajar la excepcion
        
        FileWriter writer = new FileWriter(file); //escribir en el archivo 
        PrintWriter pw = new PrintWriter(writer); //Imprimir sobre el archivo creado
        
        for(int i=0; i<10 ; i++){
            pw.println("Lìnea: "+(i+1));
        }
        writer.close();
    }
}
