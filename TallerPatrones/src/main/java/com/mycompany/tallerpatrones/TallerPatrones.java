/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class TallerPatrones {

    public static void main(String[] args) {
        SistemaInformes sistemaInformes = SistemaInformes.getInstance();

        InformeCreator I1creator = new PDFcreator();
        sistemaInformes.generarYVisualizarInforme(I1creator);

        InformeCreator I2creator = new ExcelCreator();
        sistemaInformes.generarYVisualizarInforme(I2creator);
    }
}
