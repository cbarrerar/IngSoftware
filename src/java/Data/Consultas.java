/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anacleto
 */
public class Consultas extends Conexion {
    
    public boolean autenticacion(int cedula, String contraseña){
        PreparedStatement pst=null;
        ResultSet rs=null;
        
        try{
            String consulta = "select *from usuarios where cedula = ? and contrasena = ?";
            pst = getConexion().prepareStatement(consulta, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setInt(1, cedula);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1))
                return true;
            
        }catch(Exception e){
            System.err.println("ERROR"+e);
        }finally{
            try {
                if(getConexion() != null)
                    getConexion().close();
                if(pst != null)
                    pst.close();
                if(rs != null)
                    rs.close();
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
            
        }
        
        return false;
    }
    /*
    public static void main(String[] args){
        Consultas co = new Consultas();
        System.out.println(co.autenticacion(1018427111, "admin123"));
    }*/
    
}
