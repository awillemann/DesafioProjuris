package br.com.projuris;

/** 
 * 1) Dados dois arrays, implementar um método que encontre 
 * a primeira ocorrência no segundo array.
 * 
 * @author ADRIANA 
 */

public class MyFindArray implements FindArray {	
	public int findArray(int[] array, int[] subArray) 
	{
		int ocorrencia = -1;
		int primeiraOcorrencia = 0;
		boolean testado = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == subArray[0]) {
				primeiraOcorrencia = i;
				if (subArray.length == 1) {
					testado = true;
				} else {
					for (int j = 1; j < subArray.length;) {
						if (array[i] == subArray[j]) {
							if(i+1 == array.length) 
							{
								testado = false;								
							}
							else
								testado = true;							
							j++;
						} else {
							testado = true;
							j = subArray.length;
						}
					}
				}
			}
		}
		if (testado)
			ocorrencia = primeiraOcorrencia;
		System.out.println(ocorrencia);
		return ocorrencia;
	}	

}
