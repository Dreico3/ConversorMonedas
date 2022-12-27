package com.mycompany.conversormonedas;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 *
 * @author erik-
 */
public class Funcion {
    private Conversor conversor=new Conversor();
    public void ConvertirMonedas(double valor){
        Object lista[] = new Object[] {
                    "Dolar a Boliviano",
                    "Boliviano a Dolar",
                    "Euro a Boliviano",
                    "Boliviano a Euro"
                };
        String opciones = (JOptionPane.showInputDialog(
                null,
                "seleccione una opcione una obccion", 
                "menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                lista,
                "selecciovn")).toString();
        double resultado = 0;
        switch (opciones) {
            case "Dolar a Boliviano":
                resultado = conversor.ConvertirDolarABol(valor);
                JOptionPane.showMessageDialog(
                        null, 
                        String.format("Dolares: %.2f%nBolivianos: %.2f", valor,resultado));
                break;
            case "Boliviano a Dolar":
                resultado = conversor.ConvertirBolADolar(valor);
                JOptionPane.showMessageDialog(
                        null, 
                        String.format("Bolivianos: %.2f%nDolares: %.2f", valor,resultado));
                break;
            default:
                throw new AssertionError();
        }

    }
}
