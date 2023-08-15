/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mlang
 */
public class categoriaModel extends baseModel{
    private int PK_TBL_PMK_CATEGORIA;
    private String CATEGORIA;

    public int getPK_TBL_PMK_CATEGORIA() {
        return PK_TBL_PMK_CATEGORIA;
    }

    public void setPK_TBL_PMK_CATEGORIA(int PK_TBL_PMK_CATEGORIA) {
        this.PK_TBL_PMK_CATEGORIA = PK_TBL_PMK_CATEGORIA;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }
}
