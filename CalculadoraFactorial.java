import java.util.*;
public class CalculadoraFactorial {
    public static void main(String[] args) {
        //Calcular el factorial de un numero! Se calcula de la siguiente fotma 5!= igual a la m,ultiplicación de los siguiente numeros anteriores 5!=1*2*3*4*5=120
        int numero;
        int res=1;

        do{
        System.out.println("Indique un numero: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        } while (numero<1);
        for ( int i=1; i<=numero; i++) res*=i;

        System.out.println(numero + "!= " + res);


    }
}
