package conversorMonedas;

import javax.swing.*;

public class ConvertirMonedasASoles {
    public void ConvertirDolaresASoles(double valor) {
        double monedaDolar = valor * 3.76;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes S/: " + monedaDolar + " Soles.");
    }

    public void ConvertirEurosASoles(double valor) {
        double monedaEuro = valor * 4.10;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes S/: " + monedaEuro + " Soles.");
    }

    public void ConvertirLibrasASoles(double valor) {
        double monedaLibra = valor * 4.67;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes S/: " + monedaLibra + " Soles.");
    }

    public void ConvertiYenesASoles(double valor) {
        double monedaYen = valor * 0.028;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes S/: " + monedaYen + " Soles.");
    }

    public void ConvertirWonsASoles(double valor) {
        double monedaWon = valor * 0.061;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes S/: " + monedaWon + " Soles.");
    }
}
