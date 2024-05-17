
package com.mycompany.csvfiles.manageFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//Co
public class WhiterFile {
     private File file;

    public WhiterFile(File file) {
        this.file = file;
    }

    public void writerData (List <String> data) throws IOException{
        
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try{
            fileWriter = new FileWriter(file,false); //Se le pone true para que escriba despues del contenido que tengamos
            //si quisieramos que escribiera desde el inicio o desde cero, habria que poner false en vez de true
            printWriter = new PrintWriter (fileWriter);
            
            for(String line : data){
                printWriter.write(line);
                printWriter.println();
            }
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo: "+e.getMessage());
            e.printStackTrace();
        }finally{
            try{
                if(printWriter != null){
                    printWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }   
                
            }catch(IOException e2){
                System.out.println("Error al cerrar el archivo despues de escribir: "+e2.getMessage());
                e2.printStackTrace();
            }
        }
    }
    
}