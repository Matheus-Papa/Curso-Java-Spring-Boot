import java.util.ArrayList;

public class vetores {
    public static void main(String[] args) {
        int[] colecaoInteiros = {1, 2, 3, 4, 5};
        //colecaoInteiros[5] = 6; -> da erro pois na declaraçãofoi definido que o vetor tem 5 elementos, não da para adicionar

        int[] meuArray = new int[6]; //define o array mas não fala o tamanho e deixa os elementos nulo

        System.out.println((colecaoInteiros.length));

        //arraylist é uma classe do java que cria uma lista dinâminca, ou seja eu posso adicionar ou remover quantos elementos eu quiser, e ele sempre terá o tamanho equivalente à quantidade de elementos
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Fernanda");
        nomes.add("Leo");
        nomes.add("João");
        nomes.add("Maria");

        //para acessar elementos é preciso usar o get
        System.out.println(nome.get(0));
        nomes.remove(0);//remove o indíce 0
        System.out.println(nome.get(0));
    }
}