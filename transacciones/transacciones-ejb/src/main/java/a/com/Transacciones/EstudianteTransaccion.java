/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Transacciones;

import a.com.Bean.EstudianteFacadeLocal;
import a.com.Bean.MateriaFacadeLocal;
import a.com.Entity.Estudiante;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author Yesid
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class EstudianteTransaccion implements EstudianteTransaccionLocal {

    @EJB
    EstudianteFacadeLocal estudianteFacadeLocal;

    @EJB
    MateriaFacadeLocal materiaFacadeLocal;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void requeridoCon() {

        Estudiante estudiante = new Estudiante(7, "Pedro");

        estudianteFacadeLocal.create(estudiante);
        estudianteFacadeLocal.crearRequerido();
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void requiresNewCon() {

        Estudiante estudiante = new Estudiante(8, "Pedro");

        estudianteFacadeLocal.create(estudiante);
        try {

            estudianteFacadeLocal.crearRequeridoNew();

        } catch (Exception e) {
        }

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void supportedCon() {

        Estudiante estudiante = new Estudiante(9, "Pedro");

        estudianteFacadeLocal.create(estudiante);
        estudianteFacadeLocal.crearSupports();
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void notSupportedCon() {

        Estudiante estudiante = new Estudiante(10, "Pedro");

        estudianteFacadeLocal.create(estudiante);

        try {
            estudianteFacadeLocal.crearNoSupports();

        } catch (Exception e) {
            
            System.out.println("Ocurrio un error");
        }

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void mandatoryCon() {

        Estudiante estudiante = new Estudiante(11, "Pedro");

        estudianteFacadeLocal.create(estudiante);
        estudianteFacadeLocal.crearMandatory();
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void neverCon() {

        Estudiante estudiante = new Estudiante(12, "Pedro");

        estudianteFacadeLocal.create(estudiante);
        estudianteFacadeLocal.crearNever();
    }

}
