/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.Transacciones;

import javax.ejb.Local;

/**
 *
 * @author Yesid
 */
@Local
public interface EstudianteTransaccionLocal {

    public void requeridoCon();

    public void requiresNewCon();

    public void supportedCon();

    public void notSupportedCon();

    public void mandatoryCon();

    public void neverCon();

}
