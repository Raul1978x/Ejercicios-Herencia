package ejemploherenciahoteles.entidades;

import interfaces.AccionHotel;

public class Hotel implements AccionHotel{

    protected Integer cantDeHabitaciones;

    public Hotel(Integer cantDeHabitaciones) {
        this.cantDeHabitaciones = cantDeHabitaciones;
    }

    public Integer getCantDeHabitaciones() {
        return cantDeHabitaciones;
    }

    public void setCantDeHabitaciones(Integer cantDeHabitaciones) {
        this.cantDeHabitaciones = cantDeHabitaciones;
    }
     @Override
    public void reservarHabitacion(int cantidad, double precioDiario) {
        System.out.println("Ha reservado " + cantidad 
                + " habitacion/es a un precio por dia de $ " 
                + precioDiario + "con un valor total de reserva de $" 
                + (cantidad * precioDiario));
    }
}
