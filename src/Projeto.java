import java.util.Scanner;

class Livro {

    String titulo;
    String autor;

    public Livro(String t, String a) {
        titulo = t;
        autor = a;
    }
}

public class Projeto {
    static Livro[] livros = new Livro[50];
    static int contador = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== BIBLIOTECA ===");
            System.out.println("1 - Adicionar novo livro");
            System.out.println("2 - Pesquisar livro pelo título");
            System.out.println("3 - Excluir livro pelo título");
            System.out.println("4 - Listar todos os livros");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    pesquisarLivro();
                    break;
                case 3:
                    excluirLivro();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 5:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 5);
    }

    public static void adicionarLivro() {
        if (contador >= livros.length) {
            System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
            return;
        }

        System.out.print("Digite o nome do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        if (titulo.isEmpty() || autor.isEmpty()) {
            System.out.println("Por favor, preencha todos os campos.");
        } else {
            livros[contador] = new Livro(titulo, autor);
            contador++;
            System.out.println("Livro cadastrado com sucesso.");
        }
    }

    public static void pesquisarLivro() {
        if (contador == 0) {
            System.out.println("Não há livros cadastrados para pesquisar.");
            return;
        }

        System.out.print("Digite o título do livro que deseja pesquisar: ");
        String tituloPesquisa = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (livros[i].titulo.equalsIgnoreCase(tituloPesquisa)) {
                System.out.println("\nLivro encontrado:");
                System.out.println("Título: " + livros[i].titulo);
                System.out.println("Autor: " + livros[i].autor);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }

    public static void excluirLivro() {
        if (contador == 0) {
            System.out.println("Não há livros cadastrados para excluir.");
            return;
        }

        System.out.print("Digite o título do livro que deseja excluir: ");
        String tituloExcluir = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (livros[i].titulo.equalsIgnoreCase(tituloExcluir)) {
                for (int j = i; j < contador - 1; j++) {
                    livros[j] = livros[j + 1];
                }
                livros[contador - 1] = null;
                contador--;
                System.out.println("Livro excluído com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }

    public static void listarLivros() {
        if (contador == 0) {
            System.out.println("Não há livros cadastrados ainda.");
        } else {
            System.out.println("\nLivros cadastrados:");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". Título: " + livros[i].titulo + " - Autor: " + livros[i].autor);
            }
        }
    }
}
