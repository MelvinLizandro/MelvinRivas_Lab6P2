/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melvinrivas_lab6p2;

/**
 *
 * @author l3306
 */
public class Equipos {
    
   protected String pais;
   protected String equiponom;
   protected String cuidad;
   protected String estadio;

    public Equipos(String pais, String equiponom, String cuidad, String estadio) {
        this.pais = pais;
        this.equiponom = equiponom;
        this.cuidad = cuidad;
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEquiponom() {
        return equiponom;
    }

    public void setEquiponom(String equiponom) {
        this.equiponom = equiponom;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Equipos{" + "pais=" + pais + ", equiponom=" + equiponom + ", cuidad=" + cuidad + ", estadio=" + estadio + '}';
    }
   
   
   
  
}
