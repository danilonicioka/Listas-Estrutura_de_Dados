package lista_04;

import java.util.Random;

public class Q_08 {

    public static void main(String[] args) {
        
        Random random = new Random();
        int ma_li5, me_li5,ma_co7,me_co7,M[][] = new int[10][10];
        ma_li5 = ma_co7 = 0;
        me_li5 = me_co7 = 9;
        
        for(int i = 0;i<10;i++){
            for(int j=0;j<10;j++){
                M[i][j] = random.nextInt(10);
            }
        }
        
        System.out.print("M = ");
        for(int i =0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.print(M[i][j]+" "); //exibir elementos
            }
            System.out.print("\n    ");//separar linhas
        }
        
        for(int j=0;j<10;j++){
                if(M[4][j]>ma_li5)
                    ma_li5 = M[4][j];
                if(M[4][j]<me_li5)
                    me_li5 = M[4][j];
                }
        
        for(int i=0;i<10;i++){
                if(M[i][6]>ma_co7)
                    ma_co7 = M[i][6];
                if(M[i][6]<me_co7)
                    me_co7 = M[i][6];
                }
        
        
        System.out.println("\nMaior valor da linha 5: "+ma_li5+"\nMenor valor da linha 5: "+me_li5+"\n\nMaior valor de coluna 7: "+ma_co7+"\nMenor valor da coluna 7: "+me_co7);
    }
    
}
