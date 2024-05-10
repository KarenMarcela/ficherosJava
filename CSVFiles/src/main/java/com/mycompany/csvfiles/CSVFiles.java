
package com.mycompany.csvfiles;

import com.mycompany.csvfiles.manageFile.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;


public class CSVFiles {
    public static void main(String[] args) throws FileNotFoundException {
        //Creo un paquete manageFile y luego la clase llamada ReadFile para leer el archivo y leerme la data
        File file = new File ("./data.csv");
        
        ReadFile readFile = new ReadFile(file);
        
        List<String> data = readFile.loadData();
        for(String line : data){
//         System.out.println(line);
           String[] splited = new String[3];
           splited = line.split(";");
            System.out.println("Hola "+splited[1]+ " "+splited[2]+ " tu codigo es: "+splited[0]); //splited[1]: nombre, splited[2]: apellido
        } 
    }
}
