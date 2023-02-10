package com.mycompany.wsclient_flight.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MessageManager {
    public static void showErrorMessage(Component parentComponent, String message, String title) {
        JOptionPane.showMessageDialog(parentComponent, message, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showInformMessage(Component parentComponent, String message, String title) {
        JOptionPane.showMessageDialog(parentComponent, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}
