/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Santiago
 */
public class Vendedor {

    private Integer id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String numero;

    public Vendedor(String nombre, String apellido, String cedula, String numero, Integer id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numero = numero;
        this.id = id;
    }

    public Vendedor() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int compareCampo(String campo, String valorBuscado) {
        switch (campo.toLowerCase()) {
            case "id":
                // Implementa la comparación por el campo "id"
                return this.id.compareTo(Integer.parseInt(valorBuscado));
            case "nombre":
                // Implementa la comparación por el campo "nombre"
                return this.nombre.compareToIgnoreCase(valorBuscado);
            case "apellido":
                // Implementa la comparación por el campo "apellido"
                return this.apellido.compareToIgnoreCase(valorBuscado);
            case "cedula":
                // Implementa la comparación por el campo "cedula"
                return this.cedula.compareToIgnoreCase(valorBuscado);
            case "numero":
                // Implementa la comparación por el campo "numero"
                return this.numero.compareToIgnoreCase(valorBuscado);
            default:
                // En caso de que el campo no sea reconocido
                throw new IllegalArgumentException("Campo no válido para comparación: " + campo);
        }
    }
}
