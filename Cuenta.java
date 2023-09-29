package com.mycompany.cashcontroljava;

public class Cuenta {
    private String nombre;
    private Boolean Tipo;
    Float valor;

    public Cuenta(String nombre,Boolean Tipo, Float valor) {
        this.nombre = nombre;
        this.Tipo = Tipo;
        this.valor = valor;
    }

    public void ModificarValor(Float valor) {
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }

    public Boolean getTipo() {
        return Tipo;
    }

    public void setTipo(Boolean Tipo) {
        this.Tipo = Tipo;
    }
    
    public String ImprimirInfo(){
        return "Nombre: " + this.nombre + ", Valor: " + this.valor + ".";
    }
}
