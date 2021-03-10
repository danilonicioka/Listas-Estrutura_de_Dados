package lista_01;

import java.util.Scanner;

public class Q_13 {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        char s;
        double h,m,m_ideal;

        System.out.println("Digite:\nM para Masculino\nF para Feminino");
        System.out.print("Informe seu sexo: ");
        s = dados.next().charAt(0);
        System.out.print("Informe sua altura em metros: ");
        h = dados.nextFloat();
        System.out.print("Por fim, informe seu \"peso\": ");
        m = dados.nextFloat();

        if (s == 'M') { //calcula o peso ideal dependendo do sexo
            m_ideal = 72.7 * h - 58;
        } else {
            m_ideal = 62.1 * h - 44.7;
        }

        if (m > m_ideal) { //verificar se está acima, abaixo ou no peso ideal
            System.out.println("Você está acima do peso.");
        } else if (m < m_ideal) {
            System.out.println("Você está abaixo do peso.");
        } else {
            System.out.println("Você está no peso ideal");
        }
    }
}
