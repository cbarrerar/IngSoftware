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
public class Area {
	private int Id_Area;
	private char Nom_Area;
	public Departamento m_Departamento;

        public Area(int Id_Area, char Nom_Area, Departamento m_Departamento) {
            this.Id_Area = Id_Area;
            this.Nom_Area = Nom_Area;
            this.m_Departamento = m_Departamento;
        }

        
        public int getId_Area() {
            return Id_Area;
        }

        public void setId_Area(int Id_Area) {
            this.Id_Area = Id_Area;
        }

        public char getNom_Area() {
            return Nom_Area;
        }

        public void setNom_Area(char Nom_Area) {
            this.Nom_Area = Nom_Area;
        }

        public Departamento getM_Departamento() {
            return m_Departamento;
        }

        public void setM_Departamento(Departamento m_Departamento) {
            this.m_Departamento = m_Departamento;
        }

    
}
