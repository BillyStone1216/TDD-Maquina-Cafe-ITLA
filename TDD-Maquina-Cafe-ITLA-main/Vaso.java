public class Vaso {
    private int cantidadVasos;
    private int contenido;

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public boolean hasVasos(int cantidad) {
        return this.cantidadVasos >= cantidad;
    }

    public void giveVasos(int cantidad) {
        this.cantidadVasos -= cantidad; // Restamos la cantidad del inventario
    }



    public int getCantidadVasos() {
        return cantidadVasos;
    }
}




