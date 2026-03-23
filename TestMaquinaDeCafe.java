import org.junit.Test;
import static org.junit.Assert.*;

public class TestMaquinaDeCafe {
    @Test
    public void deberiaDevolverNoHayVasos() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setVasosPequenos(new Vaso(0, 3)); 
        String resultado = maquina.getVasoDeCafe("pequeno", 1, 1);
        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void deberiaRestarCafe() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        Cafetera miCafetera = new Cafetera(10);
        maquina.setCafetera(miCafetera);
        maquina.setVasosPequenos(new Vaso(5, 3));
        maquina.setAzucarero(new Azucarero(10));
        maquina.getVasoDeCafe("pequeno", 1, 0); 
        assertEquals(7, miCafetera.getCantidadDeCafe());
    }
}
