import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class RegistroTest {


    @Test
    void stringToInt() {
        int esperado = 10;
        String proceso = "10";
        int resultado = Registro.stringToInt(proceso);
        Assertions.assertEquals(esperado, resultado);
    }
    @Test
    void  stringToInt1 () {
        int esperado = 100;
        String proceso = "100";
        int resultado = Registro.stringToInt(proceso);
        Assertions.assertEquals(esperado, resultado);
    }


    @Test
    void mostrarCantidadMayores() {
        String [][] registro = new String[50][3];
        String aux;
        for (int i = 0; i < 3; i++) {
            registro[i][2] = "25";
        }
        int esperado = 3;
        int resultado = Registro.mostrarCantidadMayores(registro);
        System.out.println(resultado);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void mostrarCantidadMenores() {
        String [][] registro = new String[50][3];
        String aux;
        for (int i = 0; i < 5; i++) { //son 5 menores de 15años
            registro[i][2] = "15";
        }
        int esperado = 5;
        int resultado = Registro.mostrarCantidadMenores(registro);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void mostrarCantidadTerceraEdad() {
        String [][] registro = new String[50][3];
        String aux;
        for (int i = 0; i < 17; i++) { //son 17 tercera edad de 77años
            registro[i][2] = "77";
        }
        int esperado = 17;
        int resultado = Registro.mostrarCantidadTerceraEdad(registro);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void validarEntero() {
        String esperado = "5";
        String resultado = Registro.validarEntero();
    }
}