package Modelo;


/**
 * @author PERSONAL
 * @version 1.0
 * @created 14-jul-2016 07:58:57 p.m.
 */
public class Empleado {

	private char area;
	private Cargo cargo;
	private int cedula;
	private char contrasena;
	private Departamento departamento;
	private char nombre;
	private double sueldo;
	private int usuario;
	public Cargo m_Cargo;

	public Empleado(){

	}

        public char getArea() {
            return area;
        }

        public void setArea(char area) {
            this.area = area;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public void setCargo(Cargo cargo) {
            this.cargo = cargo;
        }

        public int getCedula() {
            return cedula;
        }

        public void setCedula(int cedula) {
            this.cedula = cedula;
        }

        public char getContrasena() {
            return contrasena;
        }

        public void setContrasena(char contrasena) {
            this.contrasena = contrasena;
        }

        public Departamento getDepartamento() {
            return departamento;
        }

        public void setDepartamento(Departamento departamento) {
            this.departamento = departamento;
        }

        public char getNombre() {
            return nombre;
        }

        public void setNombre(char nombre) {
            this.nombre = nombre;
        }

        public double getSueldo() {
            return sueldo;
        }

        public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
        }

        public int getUsuario() {
            return usuario;
        }

        public void setUsuario(int usuario) {
            this.usuario = usuario;
        }

        public Cargo getM_Cargo() {
            return m_Cargo;
        }

        public void setM_Cargo(Cargo m_Cargo) {
            this.m_Cargo = m_Cargo;
        }
        
        

	public void finalize() throws Throwable {

	}
}//end Empleado