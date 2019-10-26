/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Controller;

import a.com.Bean.EstudianteFacadeLocal;
import a.com.Bean.MateriaFacadeLocal;
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
            estudianteFacadeLocal.crearRequerido();
            //estudianteFacadeLocal.crearRequerido2();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciarRequeridoNewSin() {

        try {
            estudianteFacadeLocal.crearRequeridoNew();
            //estudianteFacadeLocal.crearRequeridoNew2();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciarSupportSin() {

        try {
            estudianteFacadeLocal.crearSupports();
            //estudianteFacadeLocal.crearSupports2();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciarNotSupportSin() {

        try {
            estudianteFacadeLocal.crearNoSupports();
            //estudianteFacadeLocal.crearNoSupports2();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciarMandatorySin() {

        try {
            estudianteFacadeLocal.crearMandatory();
            //estudianteFacadeLocal.crearMandatory2();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciarNeverSin() {

        try {
            estudianteFacadeLocal.crearNever();
            //estudianteFacadeLocal.crearNever2();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciarRequeridoCon() {

        try {

            estudianteTransaccionLocal.requeridoCon();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void iniciarRequeridoNewCon() {

        try {

            estudianteTransaccionLocal.requiresNew2Con();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    public void iniciarSupportCon() {
        try {

            estudianteTransaccionLocal.supportedCon();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    public void iniciarNotSupportCon() {

        try {

            estudianteTransaccionLocal.notSupportedCon();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    public void iniciarMandatoryCon() {

        try {

            estudianteTransaccionLocal.mandatoryCon();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    public void iniciarNeverCon() {

        try {

            estudianteTransaccionLocal.neverCon();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
