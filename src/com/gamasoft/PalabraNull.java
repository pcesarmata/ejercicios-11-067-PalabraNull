package com.gamasoft;

public class PalabraNull {
    public static void main(String[] args) {
        Persona objPersona = new Persona("César");
        System.out.println("objPersona = " + objPersona.obtenerNombre());

        Persona objPersonaDos = objPersona;
        System.out.println("objPersonaDos = " + objPersonaDos.obtenerNombre());

        objPersona = null; // Variable candidata al GarbageCollector
        System.gc();
        objPersonaDos = null;

        if (objPersona != null){
            System.out.println("objPersonaDos = " + objPersona.obtenerNombre());
        }
    }
}

class Persona{
    String nombre;

    Persona (String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}