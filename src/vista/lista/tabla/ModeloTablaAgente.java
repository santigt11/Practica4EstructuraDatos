/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.Lista.tabla;

import controlador.listas.DynamicList;
import javax.swing.table.AbstractTableModel;
import modelo.Vendedor;

/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaAgente  extends AbstractTableModel {
    private DynamicList<Vendedor> vendedores;

    public DynamicList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(DynamicList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    
     public ModeloTablaAgente() {
        this.vendedores=new DynamicList<>();
    }
    @Override
    public int getRowCount(){
        return vendedores.getLength();
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 4;
    }
    @Override
    public String getValueAt(int i,int i1){
        // i=fila 1=columna
        try {
            Vendedor p = vendedores.getInfo(i);
        switch(i1){
            case 0: return (p !=null) ? p.getNombre():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getApellido():" ";
            case 2: return (p !=null) ? p.getCedula():" ";
            case 3: return (p !=null) ? p.getNumero():" ";
            default:
                return null;
        }
         } catch (Exception e) {
        }
        return null;
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Apellido";
            case 2:
                return "Cedula";
            case 3:
                return "Numero"; 
            default:
                return null;

        }
    }
}
