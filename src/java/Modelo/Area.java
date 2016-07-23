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
public class Area {
    
    private int Id_Area;
    private String Nom_Area;


        public Area(int Id_Area, String Nom_Area) {
            this.Id_Area = Id_Area;
            this.Nom_Area = Nom_Area;
        }

        
        public int getId_Area() {
            return Id_Area;
        }

        public void setId_Area(int Id_Area) {
            this.Id_Area = Id_Area;
        }

        public String getNom_Area() {
            return Nom_Area;
        }

        public void setNom_Area(String Nom_Area) {
            this.Nom_Area = Nom_Area;
        }

}
    