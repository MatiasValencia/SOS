import java.util.ArrayList;

public class Main{
    
    public static void main (String[] args){
        //Generar 3 correas (correa1, correa2, correa3) donde correa1 en un comienzo transporta piedras, minerales y basura
        Correa correa1 = new Correa();
        Correa correa2 = new Correa();
        Correa correa3 = new Correa();
        // Se crean los objetos que correa1 va a transportar
        Piedra piedra = new Piedra();
        Mineral mineral = new Mineral();
        Basura basura = new Basura();
        // Se clonan los objetos
        Object Opiedra = piedra.clone();
        Object Omineral = mineral.clone();
        Object Obasura = basura.clone();
        // Se agregan los objetos a correa1
        correa1.addTransporte(Opiedra);
        correa1.addTransporte(Omineral);
        correa1.addTransporte(Obasura);

        //Generar una funcion que revise correa1 y mueva las piedras a correa2 y las minerales a correa3 y las basura la deje en correa1
        ArrayList<Object> listaCorrea1 = correa1.getCorrea();
        ArrayList<Object> listaCorrea2 = correa2.getCorrea();
        ArrayList<Object> listaCorrea3 = correa3.getCorrea();

        for (int i = 0; i < listaCorrea1.size(); i++) {
            if (listaCorrea1.get(i) == Opiedra) {
                correa2.addTransporte(Opiedra);
                correa1.removeTransporte(Opiedra);
            }
            if (listaCorrea1.get(i) == Omineral) {
                correa3.addTransporte(Omineral);
                correa1.removeTransporte(Omineral);
            }
        }
        
        //El programa tiene que mostrar por consola los movimientos realizados
        System.out.println("Objetos en la correa 1: " + listaCorrea1);
        System.out.println("Objetos en la correa 2: " + listaCorrea2);
        System.out.println("Objetos en la correa 3: " + listaCorrea3);

        //Modificar la clase Correa para que se genere un atributo para la cantidad de mineral de cada tipo en la correa.
        //Modificar la clase Correa para poder saber que tipo de objeto existe en la correa (piedra, minerales o basura).
        //Pueden haber minerales de 3 tipos: Cobre, Plata y Oro.
        //Generar una función que al final de los movimientos sume la cantidad de mineral de cada tipo en la correa 3 y muestre la cantidad de basura y piedras en las otras dos correas.
    }
}