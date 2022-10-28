package ejemploherenciahoteles.entidades;

public class Hotel2 extends Hotel1{

    protected Boolean cajaFuerte = true;

    public Hotel2(Double precio, Double superficie, Integer cantDeHabitaciones) {
        super(precio, superficie, cantDeHabitaciones);
    }
    
}
