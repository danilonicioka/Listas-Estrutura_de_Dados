package lista_03;

public class Q_03 {

    public static void main(String[] args) {
        
        System.out.println("A:\nPopulação: 80000\nTaxa de Crescimento Anual: 3%\n\nB:População: 200000\nTaxa de Crescimento Anual: 1.5%\n");
        double A,B;
        int t=0;
        
        do{
            t++;
            A=80000*Math.pow(1.03,t); //juros compostos C(1+taxa)^t
            B=200000*Math.pow(1.015,t);
        }
        while(A<B);
        System.out.println("São necessários "+t+" anos para a população de A se igualar ou ultrapassar a população de B");
    }
    
}
