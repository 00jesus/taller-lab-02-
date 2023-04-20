import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    }

    @Test
    void mostrarCantidadMenores() {
    }

    @Test
    void mostrarCantidadTerceraEdad() {
    }
}