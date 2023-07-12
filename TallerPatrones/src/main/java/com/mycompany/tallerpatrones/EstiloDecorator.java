/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class EstiloDecorator extends InformeDecorator{
    public EstiloDecorator(Informe informeDecorado) {
        super(informeDecorado);
    }

    @Override
    public String personalizarInforme() {
        return informeDecorado.personalizarInforme() + " con estilo";
    }
}
