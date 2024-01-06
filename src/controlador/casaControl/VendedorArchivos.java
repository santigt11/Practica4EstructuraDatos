/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.casaControl;

import controlador.dao.DaoImplement;
import controlador.excepciones.EmptyException;
import controlador.listas.DynamicList;
import modelo.Vendedor;

/**
 *
 * @author Santiago
 */
public class VendedorArchivos extends DaoImplement<Vendedor> {

    private DynamicList<Vendedor> vendedores;
    private Vendedor vendedor;

    Integer contador = 0;

    public VendedorArchivos() {
        super(Vendedor.class);
    }

    public DynamicList<Vendedor> getVendedores() {
        vendedores = all();
        return vendedores;
    }
    
    public DynamicList<Vendedor> getVendedoresClase() {
        return vendedores;
    }

    public void setVendedores(DynamicList<Vendedor> vendedor) {
        this.vendedores = vendedor;
    }

    public Vendedor getVendedor() {
        if (vendedor == null) {
            vendedor = new Vendedor();
        }
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor1) {
        this.vendedor = vendedor1;
    }

    public Boolean persist() {
        vendedor.setId(all().getLength() + 1);
        return persist(vendedor);
    }

    public Vendedor buscarLineal(String campo, String valorBuscado) throws EmptyException {
        DynamicList<Vendedor> lista = all();
        for (int i = 0; i < lista.getLength(); i++) {
            contador++;
            Vendedor vendedorActual = lista.getInfo(i);
            if (vendedorActual.compareCampo(campo, valorBuscado) == 0) {
                return vendedorActual;
            }
        }
        return null;
    }

    public Vendedor buscarBinaria(String campo, String valorBuscado) throws EmptyException {
        int inicio = 0;
        DynamicList<Vendedor> lista = all();
        int fin = lista.getLength() - 1;

        while (inicio <= fin) {
            contador++;
            int medio = (inicio + fin) / 2;
            Vendedor vendedorMedio = lista.getInfo(medio);
            int comparacion = vendedorMedio.compareCampo(campo, valorBuscado);
            if (comparacion == 0) {
                return vendedorMedio;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }

    public Vendedor buscar(Integer tipo, String campo, String valorBuscado) throws EmptyException {
        if (tipo == 0) {
            return buscarLineal(campo, valorBuscado);
        } else {
            return buscarBinaria(campo, valorBuscado);
        }
    }
}
