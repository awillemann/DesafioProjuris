package br.com.projuris;
import java.util.List;
/**
 * @author ADRIANA
 *
 */
public interface Calculo {
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);

	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios);

}
