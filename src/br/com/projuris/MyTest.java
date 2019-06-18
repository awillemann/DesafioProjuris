package br.com.projuris;

/**
 * @author ADRIANA
 *
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class MyTest {

	public static void main(String[] args) 
	{		
		MyFindArray myFindArray = new MyFindArray();
		MyFindChar myFindChar = new MyFindChar();
		MyCalculo myCalculo = new MyCalculo();		
		
		/* Desafio 1 MyFindArray */
		int[] array1a = {4,9,3,7,8};
		int[] array1b = {3,7};
		int[] array2a = {1,3,5};
		int[] array2b = {1};
		int[] array3a = {7,8,9};
		int[] array3b = {8,9,10};
		int[] array4a = {4,9,3,7,8,3,7,1};
		int[] array4b = {3,7};
		System.out.println("Desafio 1 MyFindArray");
		System.out.println("[4,9,3,7,8] e [3,7]");
		myFindArray.findArray(array1a, array1b);
		System.out.println("[1,3,5] e [1]");
		myFindArray.findArray(array2a, array2b);
		System.out.println("[7,8,9] e [8,9,10]");
		myFindArray.findArray(array3a, array3b);
		System.out.println("[4,9,3,7,8,3,7,1] e [3,7]");
		myFindArray.findArray(array4a, array4b);
		 
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		/* Desafio 2 MyFindChar */	 
		System.out.println("Desafio 2 MyFindChar");
		System.out.println("1º Letra não repetida da palavra stress: " + myFindChar.findChar("stress"));
		System.out.println("1º Letra não repetida da palavra reembolsar: " + "reembolsar" + myFindChar.findChar("reembolsar"));			
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		/* Desafio 3 MyCalculo */	
		System.out.println("Desafio 3 MyCalculo");
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);	
		
		List<CustoDepartamento> custoDepartamento = myCalculo.custoPorDepartamento(listaFuncionario);
		List<CustoCargo> custoCargo = myCalculo.custoPorCargo(listaFuncionario);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		System.out.println("** Custo total por departamento **");
		for(CustoDepartamento custoDep : custoDepartamento) {
			System.out.println(custoDep.getDepartamento() + " : R$ " + nf.format(custoDep.getCusto()));
		}
		
		System.out.println("------------------------------");
		System.out.println("** Custo total por cargo **");
		System.out.println("Custo total por departamento");
		for(CustoCargo custoCar : custoCargo) {			
			System.out.println(custoCar.getCargo() + " : R$ " + nf.format(custoCar.getCusto()));
		}
	}
}
