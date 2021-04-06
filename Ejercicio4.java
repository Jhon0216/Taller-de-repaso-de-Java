import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String []args){
      Scanner leer = new Scanner (System.in);
      int Num1,Num2,Pot;
      System.out.println("Ingrese el numero a calcular");
      Num1 = leer.nextInt();
      System.out.println("Ingrese el numero de la potencia");
      Num2 = leer.nextInt();
      Pot = Potencia(Num1,Num2);
      System.out.println("El resultado es: " + Pot);
    }
    static int Potencia(int Num1, int Num2){
        if(Num2 == 0){
          return 1;
        }
        else{
          return (Num1 * Potencia(Num1,Num2 - 1)); 
        }
    }
    
}
