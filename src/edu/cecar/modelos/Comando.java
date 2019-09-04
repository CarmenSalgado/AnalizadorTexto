package edu.cecar.modelos;

import edu.cecar.vistas.*;
import static edu.cecar.vistas.ArchivoTexto.LeerScript;

/**
*
* Clase: Expression class is undefined on line 3, column 12 in Templates/Classes/Class.java.
*
* versión:0.1
*
* fecha Creación: 3/09/2019
*
* fecha Modificación: 3/09/2019
*
* Autor: Carmen Salgado...
*
* @author Casalg
*
* Copyright: CECAR
*
**//**
*
* ESTA CLASE PERMITE CREAR LOS MODIFICADORES DE ACCESO...
*
**/

public class Comando {
    
 private String cadena;
 private String cadenaOrdenada;
 private int numeroPositivo;
 private int numeroPositivoReq;
 
  public Comando(String cadena, String cadenaOrdenada, int numeroPositivo, int numeroPositivoReq) {
    this.cadena = cadena;
    this.cadenaOrdenada = cadenaOrdenada;
    this.numeroPositivo = numeroPositivo;
    this.numeroPositivoReq = numeroPositivoReq;
  }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadenaOrganizada() {
        return cadenaOrdenada;
    }

    public void setCadenaOrganizada(String cadenaOrdenada) {
        this.cadenaOrdenada = cadenaOrdenada;
    }

    public int getNumeroPositivo() {
        return numeroPositivo;
    }

    public void setNumeroPositivo(int numeroPositivo) {
        this.numeroPositivo = numeroPositivo;
    }

    public int getNumeroPositivoReq() {
        return numeroPositivoReq;
    }

    public void setNumeroPositivoReq(int numeroPositivoReq) {
        this.numeroPositivoReq = numeroPositivoReq;
    }
  
    

         

         
}
