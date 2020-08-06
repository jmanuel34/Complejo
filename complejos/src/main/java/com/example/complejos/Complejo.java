package com.example.complejos;

public class Complejo {
    private double real, imaginario;


    //    private double modulo, fase;
    public Complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
//        modulo = Math.hypot(real, imaginario);
//        fase = Math.atan2(imaginario, real);
    }

    public String toString() {
        return real+" "+imaginario+"i";
    }
    public void suma(Complejo v){
        real= real+v.real;
        imaginario = imaginario+v.imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
}