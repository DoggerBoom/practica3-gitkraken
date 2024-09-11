import java.util.Scanner;

public class NumerosPrimos {
    
    

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Intoduce un numero: ");
     int primo = scanner.nextInt();
    
     
     if(nPrimo(primo) ){
         System.out.println("El " + primo + " si es primo");
     }else{
         System.out.println("El "+ primo + " no es primo");
     }





     public static boolean nPrimo(int numero){
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;



    
        }
    }
}