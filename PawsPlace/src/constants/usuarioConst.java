/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

/**
 *
 * @author maula
 */
public class usuarioConst {
    public enum Rol {
        GERENTE(1),
        VENDEDOR(2);

        private final int id;

        Rol(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    public static String cedula;
    public static String nombre;
    public static String apellido;
    public static int idRol;

    public static void iniciarSesion(String cedula, String nombre, String apellido, int idRol) {
        usuarioConst.cedula = cedula;
        usuarioConst.nombre = nombre;
        usuarioConst.apellido = apellido;
        usuarioConst.idRol = idRol;
    }

    public static void cerrarSesion() {
        usuarioConst.cedula = null;
        usuarioConst.nombre = null;
        usuarioConst.apellido = null;
        usuarioConst.idRol = 0;
    }

    public static String obtenerRol() {
        for (Rol rol : Rol.values()) {
            if (rol.getId() == idRol) {
                return rol.name();
            }
        }
        return null;
    }
}
