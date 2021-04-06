
import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int Max;
    int Num;
    int Mayor = 0;
    int i;
    
    System.out.println("Numero maximo de numeros a ingresar");
    Max = leer.nextInt();
    for(i = 0; i < Max; i++){
        System.out.println("Ingrese un numero: ");
        Num = leer.nextInt();
    if(Num > Mayor){
        Mayor=Num;
    }
    }
    System.out.println("El numero mayor es: " + Mayor);
}
    
}
