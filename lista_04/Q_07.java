package lista_04;

import java.util.Random;

public class Q_07 {

    public static void main(String[] args) {
        
        Random random = new Random();
        int linha,coluna,maior, M[][] = new int[4][4];
        linha = coluna = maior = 0;
        
        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                M[i][j] = random.nextInt(10);
            }
        }
        
        System.out.print("M = "); //escolhi essa forma de exibição para ser semelhante à representação de uma matriz
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print(M[i][j]+" "); //exibir elementos
            }
            System.out.print("\n    ");//separar linhas
        }
        
        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                if(M[i][j]>maior){
                    maior = M[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        
        System.out.println("\nMaior valor da matriz: "+maior+"\nPosição: linha "+(linha+1)+" e coluna "+(coluna+1));
    }
    
}
