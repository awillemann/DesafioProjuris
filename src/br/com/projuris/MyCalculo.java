package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 3) Cada funcionário tem um departamento. String
 * Cada funcionário tem um salário. BigDecimal
 * Cada funcionário tem um cargo. String
 * Dado uma lista de funcionários, seu salário e departamento e cargo, calcule:
 * Custo total por departamento
 * Custo total por cargo
 * 
 * @author ADRIANA
 *
 */
public class MyCalculo implements Calculo {
	
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		List<String> cargos = new ArrayList<>();
		List<CustoCargo> custoPorCargo = new ArrayList<>();
		for(Funcionario f : funcionarios) {
			if(!cargos.contains(f.getCargo()))
				cargos.add(f.getCargo());
		}
		for(String cargo : cargos) {
			CustoCargo custoCargo = new CustoCargo();
			custoCargo.setCusto(new BigDecimal(0));
			custoCargo.setCargo(cargo);
			for(Funcionario f : funcionarios) {
				if(cargo.equals(f.getCargo()))
					custoCargo.setCusto(custoCargo.getCusto().add(f.getSalario()));
			}
			custoPorCargo.add(custoCargo);
		}
		return custoPorCargo;
	}

	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		List<String> departamentos = new ArrayList<>();
		List<CustoDepartamento> custoPorDepartamento = new ArrayList<>();
		for(Funcionario funcionario : funcionarios) {
			if(!departamentos.contains(funcionario.getDepartamento()))
				departamentos.add(funcionario.getDepartamento());
		}
		for(String departamento : departamentos) {
			CustoDepartamento custoDepartamento = new CustoDepartamento();
			custoDepartamento.setCusto(new BigDecimal(0));
			custoDepartamento.setDepartamento(departamento);
			for(Funcionario funcionario : funcionarios) {
				if(departamento.equals(funcionario.getDepartamento()))
					custoDepartamento.setCusto(custoDepartamento.getCusto().add(funcionario.getSalario()));
			}
			custoPorDepartamento.add(custoDepartamento);
		}
		return custoPorDepartamento;
	}

}
