package br.com.projuris;

/** 
 * Dado uma String, retornar a primeira letra não duplicada na palavra.
 * Mostrar a primeira letra não repetida
 * 
 * @author ADRIANA 
 */

public class MyFindChar implements FindCharachter{
	

	public char findChar(String word)
	{		
		for(int i = 0; i < word.length(); i++) {
			boolean letraRepetida = false;
			for(int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j) && i != j) {
					letraRepetida = true;
				}
			}
			if(!letraRepetida)
				return word.charAt(i);
		}
		return ' ';
	}
}
