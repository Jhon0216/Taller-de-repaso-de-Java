public class Ejercicio2 {
    
    public static boolean isPalindroma(String s)
    {
     int N = s.length();
     for (int i = 0; i < N/2; i++)
     if (s.charAt(i) != s.charAt(N-1-i))
     return false;
     return true;
    }
    
    public static void main(String[] args){
        boolean valor = isPalindroma("anitalabalatina");
        if(valor==true){
            System.out.println ("si es un palindromo");
        }else{
            System.out.println ("no es un palindromo");
            }
    }
    
}
