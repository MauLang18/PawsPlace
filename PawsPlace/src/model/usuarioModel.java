/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mlang
 */
public class usuarioModel extends baseModel{
    private int PK_TBL_PMK_CONTROL_USUARIO;
    private String CEDULA;
    private String NOMBRE;
    private String APELLIDO1;
    private String APELLIDO2;
    private String CONTRASENA;
    private int ID_ROLL;

    public int getPK_TBL_PMK_CONTROL_USUARIO() {
        return PK_TBL_PMK_CONTROL_USUARIO;
    }

    public void setPK_TBL_PMK_CONTROL_USUARIO(int PK_TBL_PMK_CONTROL_USUARIO) {
        this.PK_TBL_PMK_CONTROL_USUARIO = PK_TBL_PMK_CONTROL_USUARIO;
    }

    public String getCEDULA() {
        return CEDULA;
    }

    public void setCEDULA(String CEDULA) {
        this.CEDULA = CEDULA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO1() {
        return APELLIDO1;
    }

    public void setAPELLIDO1(String APELLIDO1) {
        this.APELLIDO1 = APELLIDO1;
    }

    public String getAPELLIDO2() {
        return APELLIDO2;
    }

    public void setAPELLIDO2(String APELLIDO2) {
        this.APELLIDO2 = APELLIDO2;
    }

    public String getCONTRASENA() {
        return CONTRASENA;
    }

    public void setCONTRASENA(String CONTRASENA) {
        this.CONTRASENA = CONTRASENA;
    }

    public int getID_ROLL() {
        return ID_ROLL;
    }

    public void setID_ROLL(int ID_ROLL) {
        this.ID_ROLL = ID_ROLL;
    }
}
