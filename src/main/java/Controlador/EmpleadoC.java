package Controlador;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import Entidad.Empleado;

@RestController
@RequestMapping("/empleados")
public class EmpleadoC {

	 private final EmpleadoC empleadoService;

	    public EmpleadoC(EmpleadoC empleadoService) {
	        this.empleadoService = empleadoService;
	    }

	    @PostMapping
	    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
	        return empleadoService.crearEmpleado(empleado);
	    }

	    @GetMapping
	    public List<Empleado> listarEmpleados() {
	        return empleadoService.listarEmpleados();
	    }

	    @GetMapping("/{id}")
	    public Empleado obtenerEmpleado(@PathVariable Long id) {
	        return empleadoService.obtenerEmpleado(id);
	    }

	    @PutMapping("/{id}")
	    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
	        return empleadoService.actualizarEmpleado(id, empleado);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminarEmpleado(@PathVariable Long id) {
	        empleadoService.eliminarEmpleado(id);
	    }
}
