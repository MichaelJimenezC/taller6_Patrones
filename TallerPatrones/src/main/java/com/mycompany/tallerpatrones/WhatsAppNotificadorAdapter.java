/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class WhatsAppNotificadorAdapter implements Notificador {

    private WhatsApp whatsapp;
    private Informe informe;

    public WhatsAppNotificadorAdapter(WhatsApp whatsapp, Informe informe) {
        this.whatsapp = whatsapp;
        this.informe = informe;
    }

    @Override
    public void notificar() {
        String mensaje = generarMensaje();
        whatsapp.enviarMensaje(mensaje);
    }

    private String generarMensaje() {
        // Aquí puedes acceder a otras propiedades del informe para generar el mensaje
        return "Informe de algo";
    }
}
