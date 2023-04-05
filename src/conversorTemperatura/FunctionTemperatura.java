package conversorTemperatura;

import javax.swing.*;

public class FunctionTemperatura {

    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    public void ConvertirTemperatura(double Minput) {
        String opcion = (JOptionPane.showInputDialog(
                null,
                " Elije una opcion para convertir",
                "Temperatura",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{
                        "Grados Celciues a Grados Farenheit",
                        "Grados Celcius a Grados Kevin",
                        "Grados Farenheit a Grados Celcius",
                        "Grados Kelvin a Grados Celcius",
                        "Grados kelvin a Grados Farenheit"
                }, "Seleccion")).toString();
        switch (opcion) {
            case "Grados Celcius a Grados Farenheit":
                temperatura.ConvertirCelciusAFarenheit(Minput);
                break;
            case "Grados Celcius a Grados Kevin":
                temperatura.ConvertirCelciusAKelvin(Minput);
                break;
            case "Grados Farenheit a Grados Celcius":
                temperatura.ConvertirFarenheitACelcius(Minput);
                break;
            case "Grados Kelvin a Grados Celcius":
                temperatura.ConvertirKelvinACelcius(Minput);
                break;
            case "Grados kelvin a Grados Farenheit":
                temperatura.ConvertirKelvinAFarenheit(Minput);
                break;
        }
    }
}
