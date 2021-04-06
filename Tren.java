
package Ejercicio6;

import java.util.Scanner;

public class Tren {
    
    private int Identificacion;
    private String Marca;
    private int Modelo;
    private int Año;
    private boolean AltaVelocidad = false;
    
    //Contructores
    public Tren(int Identificacion, String Marca, int Modelo, int Año) {
        this.Identificacion = Identificacion;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
    }
    
    //Get y Set
    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public boolean isAltaVelocidad() {
        return AltaVelocidad;
    }

    public void setAltaVelocidad(boolean AltaVelocidad) {
        this.AltaVelocidad = AltaVelocidad;
    }
    
    //Metodo
    public void ModeloAño(){
        Scanner leer = new Scanner(System.in);
        int Mod;
        System.out.println("Ingrese el año en que fue fabricado el tren");
        Mod = leer.nextInt();
        if(Mod > 2022){
            System.out.println("El tren es Modelo Futuro");
        }
        if(Mod == 2021){
            System.out.println("El tren es Ultimo Modelo");
        }
        if(Mod == 2020){
            System.out.println("El tren es Modelo Nuevo");
        }
        if(Mod > 2017 && Mod < 2019){
            System.out.println("El tren es Modelo Reciente");
        }
        if(Mod <= 2016){
            System.out.println("El tren es Modelo Antiguo");
        }
    }
}
