
package www.educacion.com.archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Archivo {
    public static void main(String[] args) throws IOException {
        File file = new File ("./archivo.txt"); //Para crear un nuevo archivo
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("Archivo creado! ");
            }catch(IOException e){
                System.out.println("No se pudo crear el archivo");
            }
        }
        else{
            System.out.println("El archivo ya existe");
        }
        
        //Persistencia de datos
        //Primero tener la instancia y luego tener un lector
        
        FileReader reader = new FileReader(file, Charset.forName("UTF8"));
        System.out.println(reader.getEncoding());
        
        //Acceder caracter a caracter
        /*
        char[] data = new char[50];
        reader.read( data);
        
        System.out.println(data[2]);
        */
        //reader.close();
        
        //Acceder línea a línea
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while((line = buffer.readLine())!= null){
            System.out.println("Line: "+ line);
            
        }
        reader.close();
    }
}
