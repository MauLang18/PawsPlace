/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maula
 */
public class parametroModel extends baseModel{
    private int PK_TBL_PMK_PARAMETRO;
    private String CEDULA_JURIDICA;
    private String EMPRESA;
    private String TELEFONO;
    private String CORREO;
    private String WEB;
    private String DIRECCION;
    private String DESCRIPCION;
    private String TIPO_TIENDA;
    private byte[] LOGO;

    public int getPK_TBL_PMK_PARAMETRO() {
        return PK_TBL_PMK_PARAMETRO;
    }

    public void setPK_TBL_PMK_PARAMETRO(int PK_TBL_PMK_PARAMETRO) {
        this.PK_TBL_PMK_PARAMETRO = PK_TBL_PMK_PARAMETRO;
    }

    public String getCEDULA_JURIDICA() {
        return CEDULA_JURIDICA;
    }

    public void setCEDULA_JURIDICA(String CEDULA_JURIDICA) {
        this.CEDULA_JURIDICA = CEDULA_JURIDICA;
    }

    public String getEMPRESA() {
        return EMPRESA;
    }

    public void setEMPRESA(String EMPRESA) {
        this.EMPRESA = EMPRESA;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getWEB() {
        return WEB;
    }

    public void setWEB(String WEB) {
        this.WEB = WEB;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getTIPO_TIENDA() {
        return TIPO_TIENDA;
    }

    public void setTIPO_TIENDA(String TIPO_TIENDA) {
        this.TIPO_TIENDA = TIPO_TIENDA;
    }

    public byte[] getLOGO() {
        return LOGO;
    }

    public void setLOGO(byte[] LOGO) {
        this.LOGO = LOGO;
    }
}
