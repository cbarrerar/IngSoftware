package Modelo;


/**
 * @version 1.0
 * @created 14-jul-2016 07:58:51 p.m.
 */
public class Cargo {

	private Area area;
	private Departamento departamento;
	private int Id_Cargo;
	private char Jefe_Inmediato;
	private char Nom_Cargo;
	private int Sueldo;
	public Empleado m_Usuario;

	public Cargo(){

	}

        public Area getArea() {
            return area;
        }

        public void setArea(Area area) {
            this.area = area;
        }

        public Departamento getDepartamento() {
            return departamento;
        }

        public void setDepartamento(Departamento departamento) {
            this.departamento = departamento;
        }

        public int getId_Cargo() {
            return Id_Cargo;
        }

        public void setId_Cargo(int Id_Cargo) {
            this.Id_Cargo = Id_Cargo;
        }

        public char getJefe_Inmediato() {
            return Jefe_Inmediato;
        }

        public void setJefe_Inmediato(char Jefe_Inmediato) {
            this.Jefe_Inmediato = Jefe_Inmediato;
        }

        public char getNom_Cargo() {
            return Nom_Cargo;
        }

        public void setNom_Cargo(char Nom_Cargo) {
            this.Nom_Cargo = Nom_Cargo;
        }

        public int getSueldo() {
            return Sueldo;
        }

        public void setSueldo(int Sueldo) {
            this.Sueldo = Sueldo;
        }

        public Empleado getM_Usuario() {
            return m_Usuario;
        }

        public void setM_Usuario(Empleado m_Usuario) {
            this.m_Usuario = m_Usuario;
        }
        
        

	public void finalize() throws Throwable {

	}
}//end Cargo