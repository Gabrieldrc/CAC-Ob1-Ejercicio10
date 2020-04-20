package paq;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado("Gabriel","25252525",29,true,120000.0);
		empleado1.mostrarDatosEmpleado();
		System.out.println("Te aumentaremos un 30 porciento el salario");
		empleado1.aumentarPorcentualmenteElSalario(30);
		empleado1.mostrarDatosEmpleado();
		
	}

}
