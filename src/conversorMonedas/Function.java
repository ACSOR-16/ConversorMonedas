package conversorMonedas;

import javax.swing.*;

public class Function {
    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirMonedasASoles soles = new ConvertirMonedasASoles();

    public void ConvertirMonedas(double Minput) {
        String opcion = (
                JOptionPane.showInputDialog(null, "Elije la moneda que deseas convertir tu dinero",
                        "Monedas",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                                "De Soles a Dolar",
                                "De Soles a Euro",
                                "De Soles a Libras Esterlinas",
                                "De Soles a Yen",
                                "De Soles a Won Coreano",
                                "De Dolar a Soles",
                                "De Euros a Soles",
                                "De Libras Esterlinas a Soles",
                                "De Yen a Soles",
                                "De Won Coreano a Soles"
                        }, "Seleccion")).toString();
        switch(opcion) {
            case "De Soles a Dólar":
                monedas.ConvertirSolesADolares(Minput);
                break;
            case "De Soles a Euro":
                monedas.ConvertirSolesAEuros(Minput);
                break;
            case "De Soles a Libras":
                monedas.ConvertirSolesALibras(Minput);
                break;
            case "De Soles a Yen":
                monedas.ConvertirSolesAYenes(Minput);
                break;
            case "De Soles a Won Coreano":
                monedas.ConvertirSolesAWons(Minput);
                break;
            case "De Dólar a Soles":
                soles.ConvertirDolaresASoles(Minput);
                break;
            case "De Euro a Soles":
                soles.ConvertirEurosASoles(Minput);
                break;
            case "De Libras a Soles":
                soles.ConvertirLibrasASoles(Minput);
                break;
            case "De Yen a Soles":
                soles.ConvertiYenesASoles(Minput);
                break;
            case "De Won Coreano a Soles":
                soles.ConvertirWonsASoles(Minput);
                break;
        }
    }

}
