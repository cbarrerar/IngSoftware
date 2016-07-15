package Modelo;




/**
 * @author PERSONAL
 * @version 1.0
 * @created 14-jul-2016 07:58:58 p.m.
 */
public class Actividades {

	private char descripcion;
	private String fecha;
	private int id;
	public Empleado m_Empleado;

	public Actividades(){

	}

        public char getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(char descripcion) {
            this.descripcion = descripcion;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Empleado getM_Empleado() {
            return m_Empleado;
        }

        public void setM_Empleado(Empleado m_Empleado) {
            this.m_Empleado = m_Empleado;
        }

        public void finalize() throws Throwable {

            }
    }//end Actividades