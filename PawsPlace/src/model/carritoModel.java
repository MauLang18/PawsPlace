/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mlang
 */
public class carritoModel extends baseModel{
    private int PK_TBL_PMK_CARRITO;
    private int ID_VENTA;
    private int ID_PRODUCTO;
    private int CANTIDAD;
    private Double SUBTOTAL;

    public int getPK_TBL_PMK_CARRITO() {
        return PK_TBL_PMK_CARRITO;
    }

    public void setPK_TBL_PMK_CARRITO(int PK_TBL_PMK_CARRITO) {
        this.PK_TBL_PMK_CARRITO = PK_TBL_PMK_CARRITO;
    }

    public int getID_VENTA() {
        return ID_VENTA;
    }

    public void setID_VENTA(int ID_VENTA) {
        this.ID_VENTA = ID_VENTA;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public Double getSUBTOTAL() {
        return SUBTOTAL;
    }

    public void setSUBTOTAL(Double SUBTOTAL) {
        this.SUBTOTAL = SUBTOTAL;
    }
}
