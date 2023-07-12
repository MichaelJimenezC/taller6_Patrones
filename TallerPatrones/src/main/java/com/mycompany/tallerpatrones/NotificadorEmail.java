/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class NotificadorEmail implements Notificador{
    @Override
    public void notificar() {
        // Aquí estaría el código para enviar el informe por correo electrónico
        System.out.println("Notificando por correo electrónico...");
    }
    
}
