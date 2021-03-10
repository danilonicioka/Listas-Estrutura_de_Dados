package lista_08_Q2;

public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda(int capacidade) {
        this.contatos = new Contato[capacidade];
        this.tamanho = 0;
    }

    public Agenda() {
        this(10);
    }

    public boolean adiciona(Contato contatos) {
        this.aumentaCapacidade();
        if (this.tamanho < this.contatos.length) {
            this.contatos[this.tamanho] = contatos;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //private pois será usado só na classe vetor
    private void aumentaCapacidade() {
        if (this.getTamanho() == this.contatos.length) { //sempre que o tamanho do vetor chegar na capacidade limite
            Contato[] elementosNovos = new Contato[this.contatos.length * 2]; //cria um novo vetor com o dobro da capacidade
            for (int i = 0; i < this.contatos.length; i++) {
                elementosNovos[i] = this.contatos[i]; //repassa os elementos do vetor antigo para o novo
            }
            this.contatos = elementosNovos; //atribui o novo vetor ao vetor que estava trabalhando 
        }
    }

    public Contato busca(String nome) {
        if (this.getTamanho() > 0) {
            for (int i = 0; i < this.getTamanho(); i++) {
                if (nome.equals(this.contatos[i].getNome())) {
                    return this.contatos[i];
                }
            }
        }
        return null;
    }

    public void excluir(String nome) {
        if (this.getTamanho() > 0) {
            int posicao = -1;
            for (int i = 0; i < this.getTamanho(); i++) {
                if (nome.equals(this.contatos[i].getNome())) {
                    posicao = i;
                }
            }
            if (posicao != -1) {
                for (int i = posicao; i < this.getTamanho() - 1; i++) {
                    contatos[i] = contatos[i + 1];
                }
                tamanho--;
            } else {
                System.out.println("O Contato de nome " + nome + " não foi encontrado");
            }
        } else {
            System.out.println("Não há contatos registrados na agenda");
        }
    }
    
    public void imprimir(){
        if(this.getTamanho()>0){
            System.out.println("=====Contatos na Agenda=====\n");
            for(int i = 0; i<this.getTamanho();i++){
                System.out.println(this.contatos[i]);
            }
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

}
