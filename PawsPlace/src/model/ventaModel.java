/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mlang
 */
public class ventaModel extends baseModel{
    private int PK_TBL_PMK_VENTA;
    private int ID_CLIENTE;
    private String FECHA;
    private Double TOTAL;

    public int getPK_TBL_PMK_VENTA() {
        return PK_TBL_PMK_VENTA;
    }

    public void setPK_TBL_PMK_VENTA(int PK_TBL_PMK_VENTA) {
        this.PK_TBL_PMK_VENTA = PK_TBL_PMK_VENTA;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public Double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(Double TOTAL) {
        this.TOTAL = TOTAL;
    }
}
