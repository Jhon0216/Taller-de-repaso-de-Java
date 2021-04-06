package Ejercicio5;

import javax.swing.JOptionPane;

public class Estudiante {
    
    private int Cedula;
    private String Nombre;
    private String Apellidos;
    private boolean Becado = false;
    private double Matricula = 600000;
    
    //Constructores
    public Estudiante(int Cedula, String Nombre, String Apellidos, double Matricula) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Matricula = 600000;
    }
    
    //Get y Set
    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public boolean isBecado() {
        return Becado;
    }

    public void setBecado(boolean Becado) {
        this.Becado = Becado;
    }

    public double getMatricula() {
        return Matricula;
    }

    public void setMatricula(double Matricula) {
        this.Matricula = 600000;
    }
    
    //Metodos
    public void AsignarMatricula(){
        double Descuento = Matricula * 0.1 ;
        String Mat = JOptionPane.showInputDialog(null, "¿El estudiante es Becado?..  Si / No");
        switch(Mat){
            case "Si": {
            double Desc = Matricula - Descuento;
            JOptionPane.showMessageDialog(null, "El valor de su matricula es: " + Desc);
            break;
        } 
            case "No": {
            JOptionPane.showMessageDialog(null, "El valor de su matricula es: " + Matricula);
            break;
        }
      }
    }
}
