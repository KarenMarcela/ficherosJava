
package com.mycompany.files;

import java.io.File;

public class Files {

    public static void main(String[] args) {
        File file = new File("C:/hola.txt");
        if(file.exists()){
            System.out.println("Nombre: "+file.getName());
            System.out.println("Ruta: "+file.getPath());
            System.out.println("Ruta absoluta: "+file.getAbsolutePath());
            System.out.println("Permite escribir? : "+file.canWrite());
            System.out.println("Permite leer? : "+file.canRead());
            System.out.println("Tamaño : "+file.length());
        }else{
            System.out.println("El fichero no existe");
        }
        
    }
}
