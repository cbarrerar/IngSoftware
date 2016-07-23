/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author anacleto
 */
public class Departamento {
    private int Id_Dept;
    private String Nom_Dept;
	

    public Departamento(int Id_Dept, String Nom_Dept) {
        this.Id_Dept = Id_Dept;
        this.Nom_Dept = Nom_Dept;
        
    }

        public int getId_Dept() {
            return Id_Dept;
        }

        public void setId_Dept(int Id_Dept) {
            this.Id_Dept = Id_Dept;
        }

        public String getNom_Dept() {
            return Nom_Dept;
        }

        public void setNom_Dept(String Nom_Dept) {
            this.Nom_Dept = Nom_Dept;
        }

            
}
