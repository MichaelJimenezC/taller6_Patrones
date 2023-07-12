/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public abstract class InformeDecorator implements Informe {
     protected Informe informeDecorado;

    public InformeDecorator(Informe informeDecorado) {
        this.informeDecorado = informeDecorado;
    }

    @Override
    public void visualizarReporte() {
        informeDecorado.visualizarReporte();
    }

    @Override
    public String personalizarInforme() {
        return informeDecorado.personalizarInforme();
    }
}
