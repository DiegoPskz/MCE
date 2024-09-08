package Interface;

import java.util.List;

import Entidad.Empleado;

public interface IEmpleado {
	
	 Empleado crearEmpleado(Empleado empleado);
	    List<Empleado> listarEmpleados();
	    Empleado obtenerEmpleadoPorId(Long id);
	    Empleado actualizarEmpleado(Long id, Empleado empleado);
	    void eliminarEmpleado(Long id);
}
