package conversorMonedas;

import javax.swing.*;

public class ConvertirMonedas {
    public void ConvertirSolesADolares(double valor) {
        double monedaDolar = valor / 3.76;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showConfirmDialog(null,"Tienes $: " + monedaDolar + " Dolares.");
    }

    public void ConvertirSolesAEuros(double valor) {
        double monedaEuro = valor / 4.10;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showConfirmDialog(null,"Tienes-EUR: " + monedaEuro + " Euros.");
    }

    public void ConvertirSolesALibras(double valor) {
        double monedaLibra = valor / 4.67;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showConfirmDialog(null,"Tienes-GBP: " + monedaLibra + " Libras Esterlinas.");
    }

    public void ConvertirSolesAYenes(double valor) {
        double monedaYen = valor / 0.028;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showConfirmDialog(null,"Tienes-JPY: " + monedaYen + " Yenes.");
    }

    public void ConvertirSolesAWons(double valor) {
        double monedaWon = valor / 0.061;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showConfirmDialog(null,"Tienes-KRN: " + monedaWon + " Wons.");
    }
}
