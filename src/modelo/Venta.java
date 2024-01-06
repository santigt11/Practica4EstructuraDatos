/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo;

/**
 *
 * @author Santiago
 */
public class Venta {

    private Integer Id;
    private Vendedor vendedor;
    private Auto auto;

    public Venta() {
    }

    public Venta(Integer Id, Vendedor vendedor, Auto auto) {
        this.Id = Id;
        this.vendedor = vendedor;
        this.auto = auto;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

}
