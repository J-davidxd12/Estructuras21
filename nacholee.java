import java.util.Scanner;

public class nacholee {
    public static void main(String[] args) {
        System.out.println("Vamos a sumar dos numeros :D");

        int n1 = 0, n2=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero 1");
        n1 = sc.nextInt();

        System.out.println("ingrese el numero 2");
        n2 = sc.nextInt();

        System.out.println(sumaNumeros(n1, n2));
    }

    public static  int sumaNumeros(int n1, int n2){
        return n1 + n2;
    }
}
