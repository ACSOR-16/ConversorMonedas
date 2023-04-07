package principal;
import conversorMonedas.Function;
import conversorTemperatura.FunctionTemperatura;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Function monedas = new Function();
        FunctionTemperatura temperatura = new FunctionTemperatura();

        while (true) {
            String opciones = (JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opcion de conversion",
                    "Menu",
                    JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{
                            "Conversor de Moneda",
                            "Conversor de Temperatura"
                    },
                    "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinera que deseas convertir: ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Slecciona opcion afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Progreama terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                    }

                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "Desea Continuar");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor Invalido");
                    }

                    break;
            }
        }
    }
    public static boolean ValidarNumero(String input) {
        try {
            double num = Double.parseDouble(input);
            if (num >= 0 || num < 0);
                return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}

