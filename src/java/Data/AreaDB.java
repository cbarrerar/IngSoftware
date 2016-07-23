/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Area;
import java.sql.PreparedStatement;

/**
 *
 * @author anacleto
 */
public class AreaDB extends Conexion {
    
        PreparedStatement pst=null;    
    
    public boolean crearArea(Area ar){
        

        
        try{
            String consulta = "INSERT INTO areas (idArea, nomArea) VALUES (?,?);";
            pst.getConnection().prepareStatement(consulta);
            pst.setInt(1, ar.getId_Area());
            pst.setString(2, ar.getNom_Area());
            
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
    /*
    public static void main(String[] args){
        AreaDB adb = new AreaDB();
        System.out.println(adb.crearArea(1, "Computo"));
    }
    
    public static void main(String[] args){
        Consultas co = new Consultas();
        System.out.println(co.autenticacion(1018427111, "admin123"));
    }*/
}
