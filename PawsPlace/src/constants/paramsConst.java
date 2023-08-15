/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

import java.awt.Image;

/**
 *
 * @author maula
 */
public class paramsConst {
    public static String cedula_juridica;
    public static String empresa;
    public static String telefono;
    public static String correo;
    public static String web;
    public static String direccion;
    public static String descripcion;
    public static String tipo_tienda;
    public static Image imagen;
    
    public static void guardarParametros(String cedula_juridica, String empresa, String telefono, String correo, String web, String direccion, String descripcion, String tipo_tienda,Image imagen) {
        paramsConst.cedula_juridica = cedula_juridica;
        paramsConst.empresa = empresa;
        paramsConst.telefono = telefono;
        paramsConst.correo = correo;
        paramsConst.web = web;
        paramsConst.direccion = direccion;
        paramsConst.descripcion = descripcion;
        paramsConst.tipo_tienda = tipo_tienda;
        paramsConst.imagen = imagen;
    }

    public static void eliminarParametros(){
        paramsConst.cedula_juridica = null;
        paramsConst.empresa = null;
        paramsConst.telefono = null;
        paramsConst.correo = null;
        paramsConst.web = null;
        paramsConst.direccion = null;
        paramsConst.descripcion = null;
        paramsConst.tipo_tienda = null;
        paramsConst.imagen = null;
    }
}
