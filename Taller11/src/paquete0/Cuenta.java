/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

import java.util.List;

/**
 *
 * @author luisa
 */
public class Cuenta {
    private String nombreCliente;
    private List<Menu> menu;
    private double valorTotal;
    private double valorSubtotal;
    private double valorIva;

    public Cuenta(String nomClie, List<Menu> men, double valIv) {
        nombreCliente = nomClie;
        menu = men;
        valorIva = valIv;
    }

    

    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }
    
    public void establecerMenus(List<Menu> x) {
        menu = x;
    }
    
     public void calcularValorTotal() {
        double add = (valorSubtotal * valorIva)/100;
        valorTotal = valorSubtotal + add;
    }
    
     public void calcularValorSubtotal() {
        double suma = 0;
        for (int i = 0; i < menu.size(); i++) {
            suma += menu.get(i).obtenerValorMenu();
        }

        valorSubtotal = suma;
    }
     
     public void establecerValorIva(double v) {
        valorIva = v;
    }
     
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public List<Menu> obtenerMenus() {
        return menu;
    }


    public double obtenerValorTotal() {
        return valorTotal;
    }

    public double obtenerValorSubtotal() {
        return valorSubtotal;
    }

    

    public double obtenerValorIva() {
        return valorIva;
    }

    @Override
    public String toString() {
        String Cadena = String.format("Factura\n"
                + "Cliente: %s", 
                nombreCliente);

        for (int i = 0; i < menu.size(); i++) {
           Cadena  = String.format("%s%s",Cadena,menu.get(i));
        }
        Cadena = String.format("%sSubtotal: $%.2f\n"
                + "IVA: %.2f porciento\n"
                + "Total a Pagar: $%.2f\n",
                Cadena,
                valorSubtotal,
                valorIva,
                valorTotal);

        return Cadena;
    }

}
