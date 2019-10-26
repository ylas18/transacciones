/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Bean;

import a.com.Entity.Estudiante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Yesid
 */
@Local
public interface EstudianteFacadeLocal {

    void create(Estudiante estudiante);

    void edit(Estudiante estudiante);

    void remove(Estudiante estudiante);

    Estudiante find(Object id);

    List<Estudiante> findAll();

    List<Estudiante> findRange(int[] range);

    int count();

    void crearRequerido();

    void crearRequerido2();

    void crearRequeridoNew();

    void crearRequeridoNew2();

    void crearSupports();

    void crearSupports2();

    void crearNoSupports();

    void crearNoSupports2();

    void crearMandatory();

    void crearMandatory2();

    void crearNever();

    void crearNever2();

}
