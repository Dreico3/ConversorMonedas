package com.mycompany.conversormonedas;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author erik-
 */
public class ConversorMonedas{
    public static void main(String[] args) {
        String opciones = (JOptionPane.showInputDialog(null,"seleccione una opcion de conversion", "menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"bola","orela"},"seleccion")).toString();
    }
}
