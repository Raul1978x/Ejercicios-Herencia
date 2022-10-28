package ejemploherenciahoteles.entidades;

public class Hotel3 extends Hotel2{

    protected Boolean aireAcondicionado = true;
    protected Boolean bar = true;

    public Hotel3(Double precio, Double superficie, Integer cantDeHabitaciones) {
        super(precio, superficie, cantDeHabitaciones);
    }
    
}
