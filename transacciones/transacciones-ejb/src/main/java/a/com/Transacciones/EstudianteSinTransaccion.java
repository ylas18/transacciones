/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Transacciones;

import a.com.Bean.MateriaFacadeLocal;
import a.com.Entity.Materia;
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
public class EstudianteSinTransaccion implements EstudianteSinTransaccionLocal {
    
    MateriaFacadeLocal materiaFacadeLocal;

    @Override
    @TransactionAttribute(TransactionAttributeType. SUPPORTS)
    public void crearSupportsConCreate() {

        System.out.println("Entre al Support con Create____________");

        Materia materia = new Materia(3, "Alebra", 1);
        materiaFacadeLocal.create(materia);

    }
}
