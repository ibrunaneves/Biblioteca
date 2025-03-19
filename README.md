# Sistema de Gerenciamento de Biblioteca 📚

Este é um sistema simples de gerenciamento de biblioteca desenvolvido em Java, utilizando arrays para armazenar os livros.
Ele permite realizar operações básicas de CRUD, como adicionar, pesquisar, excluir e listar livros.

# Funcionalidades

✅ **Adicionar um novo livro** com título e autor.  
🔍 **Pesquisar um livro** pelo título.  
❌ **Excluir um livro** pelo título.  
📋 **Listar todos os livros** cadastrados.  
🚪 **Sair do sistema.**

# Tecnologias utilizadas

- **Java** (versão mínima recomendada: 8+)
- **Scanner** (java.util.Scanner) para entrada de dados no console.

# Estrutura do código

- **Livro.java:** Classe que representa um livro com título e autor.
- **Projeto.java:** Classe principal contendo a lógica do CRUD e o menu interativo.

# Como executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. Compile o projeto:
    ```bash
    javac Projeto.java
    ```

3. Execute o programa:
    ```bash
    java Projeto
    ```

4. Interaja com o menu e utilize as opções disponíveis.

# Observações

- O sistema tem um limite de **50 livros cadastrados** (definido no array `Livro[] livros = new Livro[50];`).
- Caso o limite seja atingido, não será possível adicionar mais livros.
- O programa verifica se há livros cadastrados antes de permitir pesquisas e exclusões.

# Melhorias futuras

No momento, essas melhorias não foram implementadas porque o projeto faz parte de uma atividade da faculdade e o escopo exige
apenas as funcionalidades básicas. No futuro, seria interessante adicionar:

1. **Persistência de dados (Banco de Dados ou Arquivos)**  
   Objetivo: Armazenar os livros de forma permanente, mesmo após o programa ser fechado.  
   Como: Utilizar arquivos de texto (como .txt ou .csv) ou um banco de dados simples (como SQLite) para salvar e carregar os dados dos livros.

2. **Atualizar informações do livro**  
   Objetivo: Permitir que o usuário edite as informações de um livro já cadastrado, como título ou autor.  
   Como: Adicionar uma funcionalidade no menu para que o usuário possa atualizar o título ou autor de um livro pelo nome.

3. **Ordenação dos livros**  
   Objetivo: Permitir que os livros sejam listados em ordem alfabética pelo título ou pelo autor.  
   Como: Implementar métodos de ordenação (como o `Arrays.sort()` ou `Collections.sort()`) para ordenar os livros antes de exibi-los.

4. **Busca mais eficiente**  
   Objetivo: Melhorar a busca dos livros, tornando-a mais flexível (por exemplo, permitindo busca por autor, título ou parte do título).  
   Como: Implementar uma pesquisa mais sofisticada, talvez usando expressões regulares ou métodos de string como `contains()`.

5. **Interface gráfica (GUI)**  
   Objetivo: Criar uma interface gráfica amigável (usando JavaFX ou Swing) para tornar o sistema mais acessível e intuitivo.  
   Como: Substituir o menu interativo no console por botões e caixas de texto, permitindo ao usuário interagir de forma mais visual.

6. **Validação de entrada**  
   Objetivo: Garantir que os dados inseridos sejam válidos (por exemplo, não permitir títulos ou autores vazios).  
   Como: Adicionar validações de entrada no momento em que o usuário insere informações, garantindo que os dados estejam no formato correto antes de serem processados.

7. **Contagem de livros por autor**  
   Objetivo: Mostrar quantos livros de cada autor estão registrados no sistema.  
   Como: Criar uma funcionalidade que percorre a lista de livros e conta quantos livros pertencem a cada autor, exibindo essa informação quando solicitado.

8. **Excluir livro por índice**  
   Objetivo: Permitir que o livro seja excluído não apenas pelo título, mas também pelo índice no array.  
   Como: Adicionar a opção de excluir livros pelo índice (por exemplo, 1, 2, 3...), facilitando a remoção de livros sem depender do nome exato.

9. **Limitar tamanho do título e autor**  
   Objetivo: Impedir que o título ou autor de um livro tenha mais caracteres do que o permitido, para melhorar a consistência do sistema.  
   Como: Definir limites para o comprimento do título e autor e validar antes de adicionar ao sistema.

10. **Tela de ajuda/documentação no console**  
    Objetivo: Fornecer uma tela de ajuda ou instruções diretamente no console, caso o usuário precise de mais informações sobre como usar o sistema.  
    Como: Criar uma opção no menu para que o usuário veja as instruções detalhadas sobre o funcionamento do sistema.

# Contribuição

Sinta-se à vontade para abrir issues e enviar pull requests com melhorias e novas funcionalidades. Qualquer contribuição é bem-vinda! 😊

# Licença

Este projeto é de código aberto e está disponível sob a licença MIT.

**Desenvolvido por Bruna Neves.**
