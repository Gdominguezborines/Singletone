package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");

        //intento instanciar un objeto con el constructor privado
         // Singleton miUnicaInstancia = new Singleton();

        // esto es un error
        // Singleton miUnicaInstancia = new Singleton();

        // creamos un objeto
        Singleton miUnicaInstancia = Singleton.getInstance();
        // rellenamos los atributos
        miUnicaInstancia.setEdad(20);
        miUnicaInstancia.setNombre("Pepe");

        // creamos otro objeto Singleton
        // como la única manera es con getInstance(), este método se encargará
        // de devolvernos el objeto creado anteriormente
        Singleton otraInstanciaSeraLaMisma = Singleton.getInstance();
        // podemos cambiar la edad
        // comprobar con el debug que los dos objetos:
        // miUnicaInstancia y otraInstanciaSeraLaMisma son el mismo
        otraInstanciaSeraLaMisma.setEdad(34);

    }
}
