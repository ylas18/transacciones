/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Controller;

import a.com.Bean.EstudianteFacadeLocal;
import a.com.Bean.MateriaFacadeLocal;
import a.com.Entity.Estudiante;
import a.com.Entity.Materia;
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

    @EJB
    EstudianteFacadeLocal estudianteFacadeLocal;

    @EJB
    MateriaFacadeLocal materiaFacadeLocal;

    public ControllerIndex() {
    }

    public void iniciarRequeridoSin() {

        try {
            System.out.println("Entre a IniciarRequeridoSin");

            Estudiante estudiante = new Estudiante(1, "Jose");
            estudianteFacadeLocal.create(estudiante);

            Materia materia = new Materia(1, "Matematicas", 3);
            materiaFacadeLocal.create(materia);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void iniciarRequeridoCon() {

        try {
            System.out.println("Entre a IniciarRequerido");

            estudianteTransaccionLocal.requerido();

        } catch (Exception e) {

            System.out.println("Entre a RequiresNew");

            estudianteTransaccionLocal.requiresNew2();
        }

    }

    public void iniciarRequiresNew() {

        System.out.println("Entre a iniciarRequiresNew");

        //estudianteTransaccionLocal.requiresNew();
    }

}
