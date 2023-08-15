/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mlang
 */
public class inventarioModel extends baseModel{
    private int PK_TBL_PMK_INVENTARIO;
    private String CODIGO;
    private String NOMBRE;
    private String TIPO_ANIMAL;
    private Double PRECIO;
    private int CANTIDAD;
    private int ID_CATEGORIA;

    public int getPK_TBL_PMK_INVENTARIO() {
        return PK_TBL_PMK_INVENTARIO;
    }

    public void setPK_TBL_PMK_INVENTARIO(int PK_TBL_PMK_INVENTARIO) {
        this.PK_TBL_PMK_INVENTARIO = PK_TBL_PMK_INVENTARIO;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getTIPO_ANIMAL() {
        return TIPO_ANIMAL;
    }

    public void setTIPO_ANIMAL(String TIPO_ANIMAL) {
        this.TIPO_ANIMAL = TIPO_ANIMAL;
    }

    public Double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(Double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public int getID_CATEGORIA() {
        return ID_CATEGORIA;
    }

    public void setID_CATEGORIA(int ID_CATEGORIA) {
        this.ID_CATEGORIA = ID_CATEGORIA;
    }
}
