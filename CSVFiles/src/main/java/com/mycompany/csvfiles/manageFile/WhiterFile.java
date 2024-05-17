
package com.mycompany.csvfiles.manageFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//Co
public class WhiterFile {
     private File file;

    public WhiterFile(File file) {
        this.file = file;
    }

    
    
    public void writerData (List <String> data) throws IOException{
        
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter (fileWriter);
            
            for(String line : data){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo: "+e.getMessage());
            e.printStackTrace();
        }finally{
            try{
                if(bufferedWriter != null){
                    bufferedWriter.close();
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