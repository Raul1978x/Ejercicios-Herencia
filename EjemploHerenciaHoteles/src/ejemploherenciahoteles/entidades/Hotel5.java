package ejemploherenciahoteles.entidades;

public final class Hotel5 extends Hotel4{

    protected Boolean casino = true;
    protected Boolean restaurt = true;

    public Hotel5(Double precio, Double superficie, Integer cantDeHabitaciones) {
        super(precio, superficie, cantDeHabitaciones);
    }
}
