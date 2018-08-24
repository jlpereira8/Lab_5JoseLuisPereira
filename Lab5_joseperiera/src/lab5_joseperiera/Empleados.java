/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_joseperiera;

//; Nombre completo, Fecha de nacimiento, nombre de usuario (único), contraseña, correo electrónico y puesto 

import java.util.Date;

public class Empleados {
    private String nombre;
    private Date fecha;
    private String User;
    private String contra;
    private String correo;
    private String puesto;

    public Empleados() {
    }

    public Empleados(String nombre, Date fecha, String User, String contra, String correo, String puesto) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.User = User;
        this.contra = contra;
        this.correo = correo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return nombre+puesto;
    }
    
    
    
    
}
