/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Transacciones;

import a.com.Bean.EstudianteFacadeLocal;
import a.com.Bean.MateriaFacadeLocal;
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
    public void todos() {

        estudianteFacadeLocal.crearRequerido();
        estudianteFacadeLocal.crearRequeridoNew();
        estudianteFacadeLocal.crearSupports();
        estudianteFacadeLocal.crearNoSupports();
        estudianteFacadeLocal.crearMandatory();
        estudianteFacadeLocal.crearNever();

        /*
         Estudiante estudiante = new Estudiante(2, "Laura Gonzalez");
         estudianteFacadeLocal.create(estudiante);
        
         requiresNew2();
        
         Materia materia = new Materia(2, "Programacion", 2);
         materiaFacadeLocal.create(materia);
         */
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void requeridoCon() {

        estudianteFacadeLocal.crearRequerido();
        estudianteFacadeLocal.crearRequeridoNew();

        /*
         Estudiante estudiante = new Estudiante(2, "Laura Gonzalez");
         estudianteFacadeLocal.create(estudiante);
        
         requiresNew2();
        
         Materia materia = new Materia(2, "Programacion", 2);
         materiaFacadeLocal.create(materia);
         */
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void requiresNew2Con() {

        estudianteFacadeLocal.crearRequeridoNew();

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void supportedCon() {

        estudianteFacadeLocal.crearSupports();

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void notSupportedCon() {

        estudianteFacadeLocal.crearNoSupports();

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void mandatoryCon() {

        estudianteFacadeLocal.crearMandatory();

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void neverCon() {

        estudianteFacadeLocal.crearNever();

    }

}
