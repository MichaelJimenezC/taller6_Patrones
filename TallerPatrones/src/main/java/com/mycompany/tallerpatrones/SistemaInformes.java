/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class SistemaInformes {

    private static SistemaInformes instancia;

    private SistemaInformes() {
    }

    public static SistemaInformes getInstance() {
        if (instancia == null) {
            instancia = new SistemaInformes();
        }
        return instancia;
    }

    public void generarYVisualizarInforme(InformeCreator creator) {
        Informe informe = creator.createInforme();
        informe.visualizarReporte();
    }
}
