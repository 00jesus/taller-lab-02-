import java.sql.SQLOutput;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {


    }
    public static void menu(){

        System.out.println("Bienvenido, ingrese un numero"
                + "\n1) Agregar persona:"
                + "\n2) Mostrar personas mayores de edad"
                + "\n3) Mostrar personas menores de edad"
                + "\n4) Mostrar cantidad de personas de tercera dedad"
                + "\n5) Mostar cantidad de personas segun estado civil"
                + "\n6) salir");
    }
    public static String teclado(){
        return new Scanner(System.in).nextLine();
    }
    private static void salir(){
        System.exit(0);
    }
}
