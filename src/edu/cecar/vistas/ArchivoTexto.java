package edu.cecar.vistas;

import java.io.*;

/**
*
* Clase: Expression class is undefined on line 3, column 12 in Templates/Classes/Class.java.
*
* versiÃ³n:0.1
*
* fecha CreaciÃ³n: 28/08/2019
*
* fecha ModificaciÃ³n: 03/09/2019
*
* Autor: Carmen Salgado...
*
* @author Casalg
*
* Copyright: CECAR
*
*
* ESTA CLASE PERMITE LEER UN SCRIPT ALMACENADO EN MEMORIA MEDIANTE EL USO DE FILEREADER Y BUFFEREDREADER...
*
**/

public class ArchivoTexto {
    File CrearArchivoTXT;

    public ArchivoTexto(File Script) {
        this.CrearArchivoTXT = Script;
    }
    
    
 public static String LeerScript(String archivo){
  String Script = null;
        
     try {
                 
      BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
       String Provicional =null, bfRead;
       
         while ((bfRead = bufferedReader.readLine())!= null) {  
             
          Provicional = Provicional + bfRead;
             
         }
        Script =Provicional;
     } catch (Exception e) {
         
         System.out.println("No Hay Archivo: "+ e);   
     }
 return Script;
 }
 

}