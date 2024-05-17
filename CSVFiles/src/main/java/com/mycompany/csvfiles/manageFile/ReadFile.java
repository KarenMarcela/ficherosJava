
package com.mycompany.csvfiles.manageFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    //Buffered: cargar la info 
    
    private File file;
    private FileReader fileReader; //Para leerlo
    private BufferedReader bufferedReader;

    public ReadFile(File file) throws FileNotFoundException { //Solo del file porque el reader y el buffer se crea cuandos se haga la instancia
        this.file = file;
        try{
            this.fileReader = new FileReader(file); //se debe informar de la excepcion porque esta tarea probablemente genere excepciones
            this.bufferedReader = new BufferedReader(fileReader);
        }catch(Exception e){
            System.out.println("Archivo no encontrado "+e.getMessage());
            e.printStackTrace(); // Imprime el stack trace del FileNotFoundException
        }
        //TAREA: Capturar la excepcion
    }
    
    //Crear metodo para leer el archivo
    public List<String> loadData(){
        String line = null; 
        List<String> data = new ArrayList<>();//Para almacenar la informacion
        
        try{
            while((line = bufferedReader.readLine()) != null){
                data.add(line);
            }
        }catch(IOException e){
            
        }finally{
            try{
                if(fileReader != null){
                    fileReader.close();
                }
            }catch(IOException e2){
                System.out.println("Error al cerrar el archivo: "+e2.getMessage());
                e2.printStackTrace();
            }
        }
        
        return data;
    }

}
