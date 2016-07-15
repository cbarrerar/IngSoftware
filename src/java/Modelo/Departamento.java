/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author PERSONAL
 */
public class Departamento {
	private int Id_Dept;
	private char Nom_Dept;
	public Cargo m_Cargo;

    public Departamento(int Id_Dept, char Nom_Dept, Cargo m_Cargo) {
        this.Id_Dept = Id_Dept;
        this.Nom_Dept = Nom_Dept;
        this.m_Cargo = m_Cargo;
    }

        
        
        public int getId_Dept() {
            return Id_Dept;
        }

        public void setId_Dept(int Id_Dept) {
            this.Id_Dept = Id_Dept;
        }

        public char getNom_Dept() {
            return Nom_Dept;
        }

        public void setNom_Dept(char Nom_Dept) {
            this.Nom_Dept = Nom_Dept;
        }

        public Cargo getM_Cargo() {
            return m_Cargo;
        }

        public void setM_Cargo(Cargo m_Cargo) {
            this.m_Cargo = m_Cargo;
        }

    
}
