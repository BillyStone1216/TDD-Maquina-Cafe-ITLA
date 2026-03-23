class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidad) { this.cantidadCafe = cantidad; }
    public boolean hasCafe(int cantidad) { return this.cantidadCafe >= cantidad; }
    public void giveCafe(int cantidad) { this.cantidadCafe -= cantidad; }
    public int getCantidadDeCafe() { return cantidadCafe; }
}

class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(int cantidad) { this.cantidadDeAzucar = cantidad; }
    public boolean hasAzucar(int cantidad) { return this.cantidadDeAzucar >= cantidad; }
    public void giveAzucar(int cantidad) { this.cantidadDeAzucar -= cantidad; }
    public int getCantidadDeAzucar() { return cantidadDeAzucar; }
}
