/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete0.Cuenta;
import paquete0.Menu;
import paquete0.MenuCarta;
import paquete0.MenuDia;
import paquete0.MenuEconomico;
import paquete0.MenuNinos;

public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        ArrayList<Menu> lista = new ArrayList<>();

        String nombrePlato = "";
        double vInicial = 0;

        double vH = 0;
        double vP = 0;

        double pD = 0;

        double valP = 0;
        double valB = 0;

        double valG = 0;
        double valBC = 0;
        double porcen = 0;

        // Datos 001
        for (int i = 0; i < datos001.length; i++) {
            for (int j = 0; j < datos001[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos001[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos001[i][j]);
                        break;
                    case 2:
                        vH = Double.parseDouble(datos001[i][j]);
                        break;
                    case 3:
                        vP = Double.parseDouble(datos001[i][j]);
                        break;
                }
            }
            MenuNinos menuNinios
                    = new MenuNinos(vH, vP,
                            nombrePlato, vInicial);
            lista.add(menuNinios);
        }

        // Datos 002
        for (int i = 0; i < datos002.length; i++) {
            for (int j = 0; j < datos002[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos002[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos002[i][j]);
                        break;
                    case 2:
                        pD = Double.parseDouble(datos002[i][j]);
                        break;
                }
            }
            MenuEconomico menuEconomico
                    = new MenuEconomico(pD, nombrePlato,
                            vInicial);
            lista.add(menuEconomico);
        }

        // Datos 003
        for (int i = 0; i < datos003.length; i++) {
            for (int j = 0; j < datos003[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos003[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos003[i][j]);
                        break;
                    case 2:
                        valP = Double.parseDouble(datos003[i][j]);
                        break;
                    case 3:
                        valB = Double.parseDouble(datos003[i][j]);
                        break;
                }
            }
            MenuDia menuDia
                    = new MenuDia(valP, valB,
                            nombrePlato, vInicial);
            lista.add(menuDia);
        }

        // Datos004
        for (int i = 0; i < datos004.length; i++) {
            for (int j = 0; j < datos004[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos004[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos004[i][j]);
                        break;
                    case 2:
                        valG = Double.parseDouble(datos004[i][j]);
                        break;
                    case 3:
                        valBC = Double.parseDouble(datos004[i][j]);
                        break;
                    case 4:
                        porcen = Double.parseDouble(datos004[i][j]);
                        break;
                }
            }
            MenuCarta menuCarta
                    = new MenuCarta(valG, valBC,
                            porcen, nombrePlato,
                            vInicial);
            lista.add(menuCarta);
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularValorMenu();
        }

        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.calcularValorSubtotal();
        miCuenta.calcularValorTotal();
        System.out.printf("%s\n", miCuenta);

    }
}
