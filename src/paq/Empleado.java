package paq;

public class Empleado {
	
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	
	public Empleado(
			String nombre, String cedula,
			int edad, boolean casado,
			double salario
			)
	{
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public String calificacionEdad()
	{
		if (this.edad < 21) {
			return "Junior";
		} else if (this.edad >= 21 && this.edad <= 34) {
			return "Intermedio";
		} else {
			return "Senior";
		}
	}
	
	public void mostrarDatosEmpleado()
	{
		System.out.println(
				"Nombre: "+this.nombre+". \n"
				+"Cedula: "+this.cedula+". \n"
				+"Edad: "+this.edad+" ("+this.calificacionEdad()+"). \n"
				+"Casado: "+this.casado+". \n"
				+"Salario: "+this.salario+". \n"
				);
	}
	
	public void aumentarPorcentualmenteElSalario(int porcentaje)
	{
		this.salario = this.salario * (100 + porcentaje) / 100;
	}

}
