import java.util.ArrayList;

public class vetores_e_loop {
    public static void main(String[] args) {
        int[] colecaoInteiros = {1, 2, 3, 4, 5};
        //colecaoInteiros[5] = 6; -> da erro pois na declaraçãofoi definido que o vetor tem 5 elementos, não da para adicionar

        int[] meuArray = new int[6]; //define o array mas não fala o tamanho e deixa os elementos nulo
        System.out.println((colecaoInteiros.length));

        String[] nomesArr = new String[10];
        nomesArr[0] = "Matheus";
        nomesArr[1] = "Mario";

        //arraylist é uma classe do java que cria uma lista dinâminca, ou seja eu posso adicionar ou remover quantos elementos eu quiser, e ele sempre terá o tamanho equivalente à quantidade de elementos
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Fernanda");
        nomes.add("Leo");
        nomes.add("João");
        nomes.add("Maria");

        //para acessar elementos é preciso usar o get
        System.out.println(nomes.get(0));
        nomes.remove(0);//remove o elemento no indíce 0
        System.out.println(nomes.get(0));

        for (int i = 0; i < nomes.size(); i++) { //variável de interacão; condição; atribuição à variável
            System.out.println(nomes.get(i));
        }
        for (int i = 0; i < nomesArr.length; i++) {
            System.out.println(nomesArr[i]);
        }

        for (String nome: nomesArr) { // vai printar todos os elementos dentro do array | tipo_variável; nome_variável_acesso; nome_vetor
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10) {
            System.out.println("Estou no while");
            contador++;
        }
        //em java também tem dowhile
    }
}