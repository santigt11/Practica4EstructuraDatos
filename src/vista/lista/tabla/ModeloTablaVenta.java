/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.Lista.tabla;

import controlador.listas.DynamicList;
import javax.swing.table.AbstractTableModel;
import modelo.Venta;

/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaVenta extends AbstractTableModel {

    private DynamicList<Venta> ventas;

    public DynamicList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(DynamicList<Venta> ventas) {
        this.ventas = ventas;
    }

    public ModeloTablaVenta() {
        this.ventas = new DynamicList<>();
    }

    @Override
    public int getRowCount() {
        return ventas.getLength();

    }

    @Override
    public int getColumnCount() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 3;
    }

    @Override
    public String getValueAt(int i, int i1) {
        // i=fila 1=columna
        try {
            Venta p = ventas.getInfo(i);

            switch (i1) {
                case 0:
                    return (p != null) ? p.getVendedor().getApellido(): " ";   //modelos ternarios
                case 1:
                    return (p != null) ? p.getAuto().getMarca(): " ";
                case 2:
                    return (p != null) ? p.getAuto().getColor(): " ";
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
                return "Vendedor";
            case 1:
                return "Marca";
            case 2:
                return "Color";
            default:
                return null;
        }
    }

}
