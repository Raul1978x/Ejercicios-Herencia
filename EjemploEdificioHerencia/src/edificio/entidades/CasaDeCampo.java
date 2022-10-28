package edificio.entidades;

public final class CasaDeCampo extends Estructura{

    private boolean casaArbol;

    public CasaDeCampo(boolean casaArbol, Double superficieTotal) {
        super(superficieTotal);
        this.casaArbol = casaArbol;
    }

    public boolean isCasaArbol() {
        return casaArbol;
    }

    public void setCasaArbol(boolean casaArbol) {
        this.casaArbol = casaArbol;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        this.superficieCubierta = ancho * largo;
    }
    
    
}
