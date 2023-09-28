package com.mycompany.cashcontroljava;

public class Cuenta {
    private String nombre;
    private Boolean Tipo;
    private Boolean mensual;
    Float valor;

    public Cuenta(String nombre,Boolean Tipo, Boolean mensual, Float valor) {
        this.nombre = nombre;
        this.Tipo = Tipo;
        this.mensual = mensual;
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
        return "Nombre: " + this.nombre + ", Mensual: " + this.mensual + ", Valor: " + this.valor + ".";
    }
}
