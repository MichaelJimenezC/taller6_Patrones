/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author CltControl
 */
public class ExcelCreator extends InformeCreator {

    @Override
    public Informe createInforme() {
        return new Excel();
    }
}
