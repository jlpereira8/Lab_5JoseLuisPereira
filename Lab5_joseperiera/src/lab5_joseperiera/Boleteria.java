/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_joseperiera;

/**
 *
 las películas las cuales cuentan con un nombre, duración, clasificación y categoría 
 */
public class Boleteria {
    private String nombre;
    private String duracion;
    private String Clasificacion;
    private String Categoria;

    public Boleteria() {
    }

    public Boleteria(String nombre, String duracion, String Clasificacion, String Categoria) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.Clasificacion = Clasificacion;
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
