/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class Excel implements Informe{
    @Override
    public void visualizarReporte() {
        System.out.println("Visualizando Excel");
    }
    @Override
    public String personalizarInforme() {
        return "Informe Excel básico";
    }
}
