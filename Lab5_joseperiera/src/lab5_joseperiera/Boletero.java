/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_joseperiera;

import java.util.Date;

/**
 *
 * @author j0c3lwiz
 */
public class Boletero extends Empleados{

    public Boletero() {
        super();
    }

    public Boletero(String nombre, Date fecha, String User, String contra, String correo, String puesto) {
        super(nombre, fecha, User, contra, correo, puesto);
    }
    
}
