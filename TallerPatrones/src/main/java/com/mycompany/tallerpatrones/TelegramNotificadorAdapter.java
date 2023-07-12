/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class TelegramNotificadorAdapter implements Notificador{
     private Telegram telegram;
    private Informe informe;

    public TelegramNotificadorAdapter(Telegram telegram, Informe informe) {
        this.telegram = telegram;
        this.informe = informe;
    }

    @Override
    public void notificar() {
        String mensaje = generarMensaje();
        telegram.enviarMensaje(mensaje);
    }

    private String generarMensaje() {
        // Aquí puedes acceder a otras propiedades del informe para generar el mensaje
        return "Informe de algo";
    }
}
