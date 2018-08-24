/*
 los dulces los cuales cuentan con un nombre, un sabor y una categoría 
 */
package lab5_joseperiera;

/**
 *
 * @author j0c3lwiz
 */
public class Dulces {
    private String nombre;
    private String sabor;
    private String categoria;

    public Dulces() {
    }

    public Dulces(String nombre, String sabor, String categoria) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
