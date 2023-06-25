/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

/**
 *
 * @author luisa
 */
public class MenuNinos extends Menu{
    private double valorH;
    private double valorP;
    
    public MenuNinos(double vH,double vP,String nomPlat, double valInM) {
        super(nomPlat, valInM);
         valorH = vH;
        valorP = vP;
    }

    

    public void establecerValorHelado(double h) {
        valorH= h;
    }
    
    public void establecerValorPastel(double p) {
        valorP = p;
    }
    
    public double obtenerValorPastel() {
        return valorP;
    }
    
    public double obtenerValorHelado() {
        return valorH;
    }
    

    @Override
    public void calcularValorMenu() {
        valorM = valorI + valorH + valorP;
    }

    @Override
    public String toString() {
                String Cadena = String.format("\nMenu de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial menu: $%.2f\n"
                + "\tValor porcion helado: $%.2f\n"
                + "\tValor porcion pastel: $%.2f\n"
                + "\tValor Menu: $%.2f\n\n",
                nombreP,
                valorI,
                valorH,
                valorP,
                valorM);
        return Cadena;
    }
    
}
