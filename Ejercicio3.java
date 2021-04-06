import java.util.Scanner;

public class Ejercicio3 {
 
    public static void main(String []args){
      Scanner leer = new Scanner (System.in);
      int Num1,Num2,Mul;
      System.out.println("Ingrese dos numeros");
      Num1 = leer.nextInt();
      Num2 = leer.nextInt();
      Mul = Multiplicacion(Num1,Num2);
      System.out.println("El resultado es: " + Mul);
    }
    static int Multiplicacion(int Num1, int Num2){
        if(Num2 == 0){
          return 0;
        }
        else{
          return (Num1 + Multiplicacion(Num1,Num2 - 1)); 
        }
    }
    
}
