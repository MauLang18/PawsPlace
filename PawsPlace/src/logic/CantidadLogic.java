/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author mlang
 */
public class CantidadLogic {
    private int enStock;
    private int compra;

    public CantidadLogic(int enStock, int compra) {
        this.enStock = enStock;
        this.compra = compra;
    }
    
    public boolean sePuedeComprar(){
        if(compra > enStock){
            return false;
        }
        else{
            return true;
        }
    }
    
    public int cantidadSobrante(){
        int resultado = 0;
        
        resultado = enStock - compra;
        
        return resultado;
    }
    
    public int cantidadNueva(){
        int resultado = 0;
        
        resultado = enStock + compra;
        
        return resultado;
    }
}
