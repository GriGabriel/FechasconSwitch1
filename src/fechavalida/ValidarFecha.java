import java.util.Scanner;

public class ValidarFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Introduce el día (1-31): ");
        int dia = sc.nextInt();

        System.out.print("Introduce el año (1900-2023): ");
        int año = sc.nextInt();

        boolean esAñoBisiesto = ((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0);
        int diasEnMes = 31;

        switch (mes) {
            case 2:
                diasEnMes = esAñoBisiesto ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasEnMes = 30;
                break;
        }

        if (año >= 1900 && año <= 2023 && dia >= 1 && dia <= diasEnMes) {
            System.out.println("La fecha introducida es: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha introducida es incorrecta.");
        }

        sc.close();
    }
}