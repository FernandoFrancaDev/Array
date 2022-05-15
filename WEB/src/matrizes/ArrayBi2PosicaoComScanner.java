package matrizes;
import java.util.Scanner;
public class ArrayBi2PosicaoComScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int madmax[][] = new int [2][2];
		
		System.out.println("Preenchendo a matriz com o Scanner");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 2; c++) {
				madmax[l][c] = entrada.nextInt();								
				
			}
		}
		System.out.println("Exibindo os valores de do conteudo da matriz");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 2; c++) {
				System.out.printf("%2d | ", madmax[l][c]);
			}
			System.out.println();
		}
	}

}
