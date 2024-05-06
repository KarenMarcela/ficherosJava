
package com.mycompany.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Archivos {

    public static void main(String[] args) throws IOException {
        File file = new File ("./archivo.txt"); //para crear un nuevo archivo
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("¡Archivo creado!");
            }catch(IOException e){
                System.out.println("No se pudo crear el archivo");
            }
            
            
        }else{
            System.out.println("El archivo ya existe");
        }
        
        //Persistencia de datos
        FileReader reader = new FileReader(file, Charset.forName("UTF8"));
        System.out.println(reader.getEncoding()); //    Para que me muestre con que codificacion esta cargada el archivo
        
        //Acceder caracter a caracter
        /*char[] data = new char[50];
        reader.read(data);
        
        System.out.println(data);
        */
        
        //reader.close(); //Para no dejar nuestros archivos abiertos
        
        //Acceder lìnea a lìnea
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while((line = buffer.readLine()) != null){
            System.out.println("Line: "+line);
        }
        reader.close();
    }
}
