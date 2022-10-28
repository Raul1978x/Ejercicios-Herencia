package edificio.entidades;

public abstract class Estructura {

    protected Double superficieCubierta;
    protected Double superficieTotal;

    public Estructura(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    /* Puedo sacar los qetter y setters si creo objetos especificos 
    (ej casa de campo o edificio) pero si deseo crear 
    Estructura e1 = new casaCampo(); nesecito ahi los getters y setters de la 
    clase abstacta Estructura
     */

 /*
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
     */
    public abstract void calcularSuperficie(double ancho, double largo);

}
