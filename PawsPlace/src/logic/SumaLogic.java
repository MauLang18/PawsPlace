/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author mlang
 */
public class SumaLogic {

    private Double precio;
    private int cantidad;
    private Double total;

    public SumaLogic(Double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public SumaLogic(Double total) {
        this.total = total;
    }

    public Double subtotalObtenido() {
        Double resultado = 0.0;

        resultado = precio * cantidad;

        return resultado;
    }

    public Double totalConIVA() {
        Double resultado = 0.0;
        Double impuesto = 0.0;

        impuesto = total * 0.13;

        resultado = total + impuesto;

        return resultado;
    }
}
