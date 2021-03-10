package lista_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6_e_Q7 {
    
    public static void main(String[] args) {
        
        Lista<Contato> vetor = new Lista<>(20);
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i<=30; i++){
            vetor.adiciona(new Contato("João","9876-5432","joao123@gmail.com"));
        }
        
        ArrayList<Contato> lista = new ArrayList<>();
        for(int i=0;i<vetor.getTamanho();i++){
            lista.add(vetor.obtem(i));
        }
    }
    
}
