/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Transacciones;

import a.com.Bean.EstudianteFacadeLocal;
import a.com.Bean.MateriaFacadeLocal;
import a.com.Entity.Estudiante;
import a.com.Entity.Materia;
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
    public void requerido() {
        try {
            Estudiante estudiante = new Estudiante(1070984895, "Laura Gonzalez");
            estudianteFacadeLocal.create(estudiante);

            Materia materia = new Materia(1, "Programacion", 2);
            materiaFacadeLocal.create(materia);

        } catch (Exception e) {
            requiresNew2();
            System.out.println(e);
        }

        

    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void requiresNew2() {

        Estudiante estudiante2 = estudianteFacadeLocal.find(1070984895);
        estudiante2.setNombre("Leonardo Sarmiento");
        estudianteFacadeLocal.edit(estudiante2);

        Materia materia = materiaFacadeLocal.find(1);
        materia.setNombre("Matematicas");
        materiaFacadeLocal.edit(materia);

    }

}
