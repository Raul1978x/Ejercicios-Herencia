package ejercicioHerenciaN01;

import animal.entidades.Animal;
import animal.entidades.Caballo;
import animal.entidades.Gato;
import animal.entidades.Perro;

public class EjercicioHerenciaN01 {
    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "carniboro", 15, "Doberman");
        perro1.alimentarse();
        Animal perro2 = new Perro("Teddy", "croquetas", 10, "Chiguagua");
        perro2.alimentarse();
        Animal gato1 = new Gato("Pelusa", "galletas", 15, "Siames");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Spark", "pasto", 25, "Fino");
        caballo1.alimentarse();
    }
}
