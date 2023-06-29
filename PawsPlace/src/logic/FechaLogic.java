/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mlang
 */
public class FechaLogic {
    public static String obtenerFechaActual() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Crear el formateador de fecha para SQL Server (formato "yyyy-MM-dd")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Formatear la fecha en el formato deseado
        String fechaFormateada = fechaActual.format(formatter);

        // Retornar la fecha formateada
        return fechaFormateada;
    }
}
