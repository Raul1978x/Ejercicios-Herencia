package ejemploherenciahoteles.entidades;

public class Hotel1 extends Hotel  {

    protected Double precio;
    protected Double superficie;
    protected Boolean banio = true;
    protected Boolean ascensor = true;
    protected Boolean calefacion = true;

    public Hotel1(Double precio, Double superficie, Integer cantDeHabitaciones) {
        super(cantDeHabitaciones);
        this.precio = precio;
        this.superficie = superficie;
    }

}
