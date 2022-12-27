package com.mycompany.conversormonedas;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author erik-
 */
public class ConversorMonedas{
    public static void main(String[] args) {
        String opciones = (JOptionPane.showInputDialog(null,"seleccione una opcion de conversion", "menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"conversor monedas","conversor temperatura"},"selecciovn")).toString();
        Conversor com= new Conversor();
        Funcion monedas = new Funcion();
        switch (opciones) {
            case "conversor monedas":
                double input = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor"));
                monedas.ConvertirMonedas(input);
                break;
            default:
                throw new AssertionError();
        }
    }
}
