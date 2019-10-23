/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Bean;

import a.com.Entity.Estudiante;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
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

    public EstudianteFacade() {
        super(Estudiante.class);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearRequerido() {
        Estudiante estudiante = new Estudiante(1, "Pepe");
        em.persist(estudiante);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearRequeridoNew() {
        Estudiante estudiante = new Estudiante(2, "Pepe");
        em.persist(estudiante);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void crearSupports() {
        Estudiante estudiante = new Estudiante(3, "Pepe");
        em.persist(estudiante);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void crearNoSupports() {
        Estudiante estudiante = new Estudiante(4, "Pepe");
        em.persist(estudiante);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void crearMandatory() {
        Estudiante estudiante = new Estudiante(5, "Pepe");
        em.persist(estudiante);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void  crearNever() {
        Estudiante estudiante = new Estudiante(6, "Pepe");
        em.persist(estudiante);

    }

}
