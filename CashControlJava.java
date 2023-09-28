package com.mycompany.cashcontroljava;
import javax.swing.JOptionPane;

public class CashControlJava {
    
    
    public void menu(){
        
    }
    
    public static void main(String[] args) {
        int opc,a;
        Usuario usuario = new Usuario("Pibe1","Pibe1@gmail.com","12EA56");
        String name;
        float valor;
        boolean mensual;
        
        do{
        opc = Integer.parseInt(JOptionPane.showInputDialog("""
                                            1. Agregar un ingreso.
                                            2. Agregar un Gasto
                                            3. Crear una meta de ahorro
                                            4. Lista de ingresos
                                            5 Lista de gatos.
                                            6. Porcentaje de ahorro
                                            7. Ver diferencia de gastos
                                            Salir."""));
        switch(opc){
            case 1: name = JOptionPane.showInputDialog("Digite el nombre que tendra el ingreso:");
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del ingreso"));
                    a = JOptionPane.showConfirmDialog(null, "Es un valor de cobro mensual?");
                    if(a == 0){
                        mensual = true;
                    }else{
                        mensual = false;
                    }
                    Cuenta nuevoI = new Cuenta(name,true,mensual,valor);
                    usuario.AñadirCuenta(nuevoI);
                    JOptionPane.showMessageDialog(null, "Ingreso Añadido correctamente");
                    break;
                    
            case 2: name = JOptionPane.showInputDialog("Digite el nombre que tendra el gasto:");
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del gasto:"));
                    a = JOptionPane.showConfirmDialog(null, "Es un valor de cobro mensual?");
                    if(a == 0){
                        mensual = true;
                    }else{
                        mensual = false;
                    }
                    Cuenta nuevo = new Cuenta(name,false,mensual,valor);
                    usuario.AñadirCuenta(nuevo);
                    JOptionPane.showMessageDialog(null, "Gasto Añadido correctamente");
                    break;
                    
            case 3: valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de su meta de ahorro:")); 
                    usuario.setMetaAhorro(valor);
                    JOptionPane.showMessageDialog(null, "Meta creada por un valor de: $"+ valor+", BUENA SUERTE");
                    break;
            case 4: JOptionPane.showMessageDialog(null,usuario.LecturaIngresos());
                    break;
            case 5: JOptionPane.showMessageDialog(null,usuario.LecturaGastos());
                    break;
            case 6: valor = Integer.parseInt(JOptionPane.showInputDialog("Cantidad ahorrada: "));
                    JOptionPane.showMessageDialog(null,usuario.PorcentajeMetaDeAhorro(valor) + "% Ahorrado de " + usuario.MetaAhorro);
                    break;
            case 7: JOptionPane.showMessageDialog(null,usuario.Diferencia());
                    break;
            case 8: JOptionPane.showMessageDialog(null, "Hasta luego crack.");
                    break;
            default: JOptionPane.showMessageDialog(null,"Opci+on no valida");
        }
        }while(opc != 8);
    }
}
