package edificio;

import edificio.entidades.CasaDeCampo;
import edificio.entidades.Edificio;
//import edificio.entidades.Estructura;

public class EdificioMain {

    public static void main(String[] args) {

        CasaDeCampo casaDeCampo = new CasaDeCampo(true, 1000d);
        casaDeCampo.calcularSuperficie(10, 30);
        System.out.println("La superficie cubierta de la casa de campo es: " 
                + casaDeCampo.getSuperficieCubierta() + " mt2");

        Edificio edificio = new Edificio(4, 300d);
        edificio.calcularSuperficie(10, 30);
        System.out.println("La superficie cubierta del edificio es: " 
                + edificio.getSuperficieCubierta() + " mt2");
        /*
        Para usar esta forma debemos tener definidos getters y setters de nuestra clase abstracta
         */
 /*
        Estructura e1 = new CasaDeCampo(true, 1000d);
        e1.calcularSuperficie(10, 30);
        System.out.println("La superficie cubierta de la casa de campo es: " + e1.getSuperficieCubierta() + " mt2");
         */
    }

}
