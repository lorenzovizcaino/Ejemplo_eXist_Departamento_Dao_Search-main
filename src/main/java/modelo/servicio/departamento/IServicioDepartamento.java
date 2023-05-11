package modelo.servicio.departamento;


import modelo.Departamento;
import modelo.exceptions.InstanceNotFoundException;

public interface IServicioDepartamento {


	public Departamento read(long deptno) throws InstanceNotFoundException;
	
}


