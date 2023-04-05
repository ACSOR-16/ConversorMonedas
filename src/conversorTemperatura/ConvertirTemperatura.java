package conversorTemperatura;

import javax.swing.*;

public class ConvertirTemperatura {
    public double ConvertirCelciusAFarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, + valor + " Grados Celcius son: " + farenheit + " Grados Farenheit.");
        return farenheit;
    }

    public void ConvertirCelciusAKelvin(double valor) {
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, + valor + " Grados Celcius son: " + kelvin + " Grados kelvin.");
    }

    public void ConvertirFarenheitACelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, + valor + " Grados Farenheit son: " + celcius + " Grados Celcius.");
    }

    public double ConvertirKelvinACelcius(double valor) {
        double KelvinCelcuis = valor - 273.15;
        KelvinCelcuis = (double) Math.round(KelvinCelcuis * 100d) / 100;
        JOptionPane.showMessageDialog(null, + valor + " Grados Kelvin son: " + KelvinCelcuis + " Grados Celcius.");
        return KelvinCelcuis;
    }

    public void ConvertirKelvinAFarenheit(double valor) {
        double kelinFarenheit = ConvertirKelvinACelcius(valor);
        kelinFarenheit = ConvertirCelciusAFarenheit(kelinFarenheit);
        kelinFarenheit = (double) Math.round(kelinFarenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, + valor + " Kelvin son: " + kelinFarenheit + " Grados Celcius");
    }
}
