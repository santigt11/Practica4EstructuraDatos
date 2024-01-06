/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.lista.util;

import controlador.casaControl.VendedorArchivos;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO
 */
public class UtilVista {

    public static void cargarcomboRolesL(JComboBox cbx) throws Exception {
        VendedorArchivos rc = new VendedorArchivos();
        cbx.removeAllItems();
        for (int i = 0; i < rc.getVendedores().getLength(); i++) {
            cbx.addItem(rc.getVendedores().getInfo(i).getApellido());
        }
    }

    public static String obtenerRolControl(JComboBox cbx) {
        return (String) cbx.getSelectedItem();
    }
}
