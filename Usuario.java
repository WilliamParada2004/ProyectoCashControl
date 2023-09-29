package com.mycompany.cashcontroljava;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String correo;
    private String clave;
    public float MetaAhorro;
    private final List<Cuenta> Ingresos;
    private final List<Cuenta> Gastos;
    float totalI=0,totalG=0;
    int contI=0,contG=0;
    
    String reporte="";
    
    public Usuario(String nombre, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        MetaAhorro=0;
        this.Ingresos = new ArrayList<>();
        this.Gastos = new ArrayList<>();
    }

    
    public void AñadirCuenta(Cuenta nueva){
        if(nueva.getTipo()==true){
            this.Ingresos.add(nueva);
            totalI += Ingresos.get(contI).getValor();
            contI++;
        }else{
            this.Gastos.add(nueva);
            totalG += Gastos.get(contG).getValor();
            contG++;
        }
    } 
    
    public void setMetaAhorro(float MetaAhorro) {
        this.MetaAhorro = MetaAhorro;
    }
    
    public float PorcentajeMetaDeAhorro(float cantidad){
        return (cantidad/this.MetaAhorro)*100;
    }
    
    public String Diferencia(){
        reporte = "";
        float diferenci = totalI - totalG;
      
        if(diferenci > 0){
            reporte += "Valor: " + diferenci + " Diferencia positiva.";
        }else if(diferenci == 0){
            reporte += "Valor: " + diferenci + " Diferencia neutra.";
        }else{
            reporte += "Valor: " + diferenci + " Diferencia negativa.";
        }
        return reporte;
    }
    
    public String LecturaIngresos(){
        reporte="";
        
        if(contI!=0){
            for(int i=0;i<contI;i++){
                reporte+=" "+(i+1)+". "+Ingresos.get(i).ImprimirInfo()+"\n";
            }
        }
        
        reporte+="Suma Total: "+totalI;
        return reporte;
    }
    
    
    public String LecturaGastos(){
        reporte="";
        
        if(contG!=0){
            for(int i=0;i<contG;i++){
                reporte+=" "+(i+1)+". "+Gastos.get(i).ImprimirInfo()+"\n";
            }
        }
        
        reporte+="Suma Total: "+totalG;
        return reporte;
    }
    
}
