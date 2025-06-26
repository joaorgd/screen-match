# Screen Match (Versão Java Puro)

## 🎬 Sobre o Projeto

O Screen Match é uma aplicação de console desenvolvida em Java puro. O objetivo principal do projeto é permitir a busca de informações sobre filmes e séries diretamente da API do [OMDB (The Open Movie Database)](https://www.omdbapi.com/), funcionando como um catálogo interativo via linha de comando.

Esta aplicação foi construída como um exercício prático para aprofundar conhecimentos em Java, incluindo o consumo de APIs REST com o `HttpClient` nativo, manipulação de dados JSON com a biblioteca Gson, e a estruturação de um projeto orientado a objetos.

## ✨ Funcionalidades

- **Busca Interativa:** O usuário pode buscar por títulos de filmes de forma sequencial diretamente no console.
- **Consumo de API:** Realiza requisições HTTP para a API do OMDB para obter dados detalhados dos filmes.
- **Manipulação de JSON:** Utiliza a biblioteca Gson para converter (deserializar) as respostas em JSON da API para objetos Java customizados (`records` e classes).
- **Persistência em Arquivo:** Ao final da execução, salva uma lista com os detalhes de todos os filmes buscados em um arquivo `filmes.json`.

## 🛠️ Tecnologias Utilizadas

- **Java (JDK 11 ou superior):** Utiliza o `HttpClient` nativo para requisições HTTP.
- **Gson:** Biblioteca do Google para conversão de objetos Java em sua representação JSON e vice-versa.

## ⚙️ Como Executar

Para rodar este projeto localmente, você precisará do Java (JDK 11 ou superior) instalado. Como este projeto não utiliza um gerenciador de dependências como Maven ou Gradle, a biblioteca Gson precisa ser baixada manualmente.

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
    cd seu-repositorio
    ```

2.  **Baixe a biblioteca Gson:**
    -   Faça o download do arquivo `.jar` da biblioteca Gson. Você pode encontrá-lo no [Repositório Maven Central](https://search.maven.org/artifact/com.google.code.gson/gson). (Ex: `gson-2.10.1.jar`).
    -   Crie uma pasta chamada `libs` na raiz do seu projeto e coloque o arquivo `.jar` do Gson dentro dela.

3.  **Adicione sua Chave da API:**
    -   Obtenha uma chave de API gratuita no site [OMDB API](https://www.omdbapi.com/apikey.aspx).
    -   No arquivo `src/br/com/joaoroberto/principal/PrincipalComBusca.java`, substitua `"SUA_CHAVE_AQUI"` pela chave que você gerou.
        ```java
        // Dentro do arquivo PrincipalComBusca.java
        String endereco = "[https://www.omdbapi.com/?t=](https://www.omdbapi.com/?t=)" + busca.replace(" ", "+") + "&apikey=SUA_CHAVE_AQUI";
        ```

4.  **Compile o projeto (via terminal):**
    -   Navegue até a pasta `src` do projeto.
    -   Use o seguinte comando para compilar todos os arquivos `.java` e colocá-los em uma pasta de saída (ex: `bin`). O `-cp` (classpath) aponta para a localização da biblioteca Gson.
        ```bash
        # Estando na pasta raiz do projeto
        mkdir bin
        javac -d bin -cp "libs/*" src/br/com/joaoroberto/principal/*.java src/br/com/joaoroberto/modelos/*.java src/br/com/joaoroberto/exception/*.java src/br/com/joaoroberto/calculo/*.java
        ```

5.  **Execute a aplicação (via terminal):**
    -   Use o comando abaixo para executar a classe principal, novamente especificando o classpath para incluir a pasta `bin` (com seu código compilado) e a pasta `libs` (com a dependência).
        ```bash
        # Estando na pasta raiz do projeto
        java -cp "bin;libs/*" br.com.joaoroberto.principal.PrincipalComBusca
        ```
    *Nota: Em sistemas Linux ou macOS, use `:` em vez de `;` no classpath: `java -cp "bin:libs/*" ...`*

6.  **Use a aplicação:**
    -   O console irá solicitar que você digite o nome de um filme.
    -   Para finalizar, digite `sair`. Um arquivo `filmes.json` será gerado na raiz do projeto.
