/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Controller;

import a.com.Transacciones.EstudianteTransaccionLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Yesid
 */
@Named(value = "controllerIndex")
@RequestScoped

public class ControllerIndex implements Serializable {

    @EJB
    EstudianteTransaccionLocal estudianteTransaccionLocal;

    public ControllerIndex() {
    }

    public void iniciarRequerido() {

        System.out.println("Entre a IniciarRequerido");

        estudianteTransaccionLocal.requerido();
        

    }

}
