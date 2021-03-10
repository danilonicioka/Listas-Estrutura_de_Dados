package lista_07;

import java.util.Stack;

public class Q3 {

    public static void main(String[] args) {
        
        Stack<Livro> pilhalivros = new Stack<>();
        
        pilhalivros.push(new Livro("Livro1","Autor1",1,2001));
        pilhalivros.push(new Livro("Livro2","Autor2",2,2002));
        pilhalivros.push(new Livro("Livro3","Autor3",3,2003));
        pilhalivros.push(new Livro("Livro4","Autor4",4,2004));
        pilhalivros.push(new Livro("Livro5","Autor5",5,2005));
        pilhalivros.push(new Livro("Livro6","Autor6",6,2006));
        
        //empilhando o Livro7 do Autor7 do isbn = 7 e de 2007
        pilhalivros.push(new Livro("Livro7","Autor7",7,2007));
        
        //procurando um Livro7 do Autor7 do isbn = 7 e de 2007 na pilha
        pilhalivros.search(new Livro("Livro3","Autor3",3,2003));
        
        //verificando qual livro está no topo da pilha
        pilhalivros.peek();
        //removendo o livro do topo da pilha
        pilhalivros.pop();
        
        //verificando se a pilha está vazia
        pilhalivros.empty();
    }
    
}
