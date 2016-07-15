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

	public void finalize() throws Throwable {

	}
}//end Cargo