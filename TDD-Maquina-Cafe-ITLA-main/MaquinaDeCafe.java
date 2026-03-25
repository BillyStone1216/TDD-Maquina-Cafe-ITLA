public class MaquinaDeCafe {
    private Cafetera cafe;
    private Vaso vasosPequenos;
    private Vaso vasosMedianos;
    private Vaso vasosGrandes;
    private Azucarero azucar;

    public void setCafetera(Cafetera cafe) { this.cafe = cafe; }
    public void setVasosPequenos(Vaso vasos) { this.vasosPequenos = vasos; }
    public void setVasosMedianos(Vaso vasos) { this.vasosMedianos = vasos; }
    public void setVasosGrandes(Vaso vasos) { this.vasosGrandes = vasos; }
    public void setAzucarero(Azucarero azucar) { this.azucar = azucar; }

    public String getVasoDeCafe(String tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        Vaso vasoSeleccionado = getTipoVaso(tipoDeVaso);

        if (vasoSeleccionado == null || !vasoSeleccionado.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }

        int cafeNecesario = calcularCafe(tipoDeVaso) * cantidadDeVasos;
        if (!cafe.hasCafe(cafeNecesario)) {
            return "No hay Cafe";
        }

        if (!azucar.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar";
        }

        vasoSeleccionado.giveVasos(cantidadDeVasos);
        cafe.giveCafe(cafeNecesario);
        azucar.giveAzucar(cantidadDeAzucar);
        return "Felicitaciones";
    }

    private Vaso getTipoVaso(String tipo) {
        if (tipo.equalsIgnoreCase("pequeno")) return vasosPequenos;
        if (tipo.equalsIgnoreCase("mediano")) return vasosMedianos;
        if (tipo.equalsIgnoreCase("grande")) return vasosGrandes;
        return null;
    }

    private int calcularCafe(String tipo) {
        if (tipo.equalsIgnoreCase("pequeno")) return 3;
        if (tipo.equalsIgnoreCase("mediano")) return 5;
        if (tipo.equalsIgnoreCase("grande")) return 7;
        return 0;
    }
}
