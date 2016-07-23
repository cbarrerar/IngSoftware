/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Departamento;
import java.sql.PreparedStatement;

/**
 *
 * @author anacleto
 */
public class DeptosDB extends Conexion {
    
    PreparedStatement pst=null;
    
    public boolean crearDepartamento(Departamento dep){
        try{
            String consulta = "INSERT INTO departamentos (idArea, nomArea) VALUES (?,?);";
            pst.getConnection().prepareStatement(consulta);
            pst.setInt(1, dep.getId_Dept());
            pst.setString(2, dep.getNom_Dept());
            
            if(pst.executeUpdate() == 1){
                return true;
            }
            
        }catch(Exception ex){
            System.err.println("Error"+ex);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
            }catch(Exception e){
                System.err.println("Error"+e);
            }
        }
           
        return false;
    }
    
}
