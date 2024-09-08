package Implementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import Entidad.Empleado;
import Interface.IEmpleado;

public class EmpleadoImpl implements IEmpleado {
	  private List<Empleado> empleados = new ArrayList<>();
	    private AtomicLong counter = new AtomicLong();

	@Override
	public Empleado crearEmpleado(Empleado empleado) {
		empleado.setId(counter.incrementAndGet());
        empleados.add(empleado);
        return empleado;
	}

	@Override
	public List<Empleado> listarEmpleados() {
		return empleados;
	}

	@Override
	public Empleado obtenerEmpleadoPorId(Long id) {
		return empleados.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
	}

	@Override
	public Empleado actualizarEmpleado(Long id, Empleado empleadoActualizado) {
		 Empleado empleado = obtenerEmpleadoPorId(id);
	        if (empleado != null) {
	            empleado.setNombre(empleadoActualizado.getNombre());
	            empleado.setPuesto(empleadoActualizado.getPuesto());
	            empleado.setSalario(empleadoActualizado.getSalario());
	}
			return empleado;
	}

	@Override
	public void eliminarEmpleado(Long id) {
		   empleados.removeIf(e -> e.getId().equals(id));
		
	}

}
