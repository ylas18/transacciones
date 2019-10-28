/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Bean;

import a.com.Entity.Estudiante;
import a.com.Entity.Materia;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * http://cursojavaee.blogspot.com/2013/06/diapositivas-clase-11-transacciones-en.html
 *
 * @author Yesid
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class EstudianteFacade extends AbstractFacade<Estudiante> implements EstudianteFacadeLocal {

    @PersistenceContext(unitName = "a.com_transacciones-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    MateriaFacadeLocal materiaFacadeLocal;
    EstudianteFacadeLocal estudianteFacadeLocal;

    public EstudianteFacade() {
        super(Estudiante.class);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearRequerido() {

        System.out.println("Entre al Required");

        Estudiante estudiante = new Estudiante(1, "Pepe");
        em.persist(estudiante);

        Materia materia = new Materia(1, "Matematicas", 5);
        em.persist(materia);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearRequeridoNew() {

        System.out.println("Entre al Requires_New");

        Estudiante estudiante = new Estudiante(2, "Pepe");
        em.persist(estudiante);

        Materia materia = new Materia(2, "Programacion", 4);
        em.persist(materia);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void crearSupports() {

        System.out.println("Entre al Support");
        
        Estudiante estudiante = new Estudiante(3, "Pepe");
        em.persist(estudiante);

        Materia materia = new Materia(3, "Alebra", 1);
        em.persist(materia);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void crearNoSupports() {

        System.out.println("Entre al No_Support");

        Estudiante estudiante = new Estudiante(4, "Pepe");
        em.persist(estudiante);

        Materia materia = new Materia(4, "Auditoria", 4);
        em.persist(materia);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void crearMandatory() {

        System.out.println("Entre al Mandatory");

        Estudiante estudiante = new Estudiante(5, "Pepe");
        em.persist(estudiante);

        Materia materia = new Materia(5, "Inteligencia", 3);
        em.persist(materia);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void crearNever() {

        System.out.println("Entre al Never");

        Estudiante estudiante = new Estudiante(6, "Pepe");
        em.persist(estudiante);

        Materia materia = new Materia(6, "Robotica", 6);
        em.persist(materia);

    }



}
