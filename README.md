### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

# Requisitos do desafio


# Desafio: API de Restaurantes

Você está participando da construção de um app de entrega de comida. 🍕🍔 Como pessoa integrante do time de backend, terá a responsabilidade de construir a API que vai gerenciar os restaurantes. Essa API será um CRUD e deverá se conectar em um banco de dados H2.

Abaixo você confere os passos passados pela sua liderança (alinhados às solicitações da empresa cliente):

1. Execute o seguinte comando no terminal para criar seu projeto Quarkus:

```java
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create \
    -DprojectGroupId=com.betrybe \
    -DprojectArtifactId=restaurante-app \
    -DclassName="com.betrybe.RestauranteController" \
    -Dpath="/restaurante" \
    -Dextensions="resteasy-jackson, quarkus-resteasy-jsonb, quarkus-hibernate-orm-panache, quarkus-jdbc-h2"
```

2. Abra o projeto na IDE de sua preferência. No arquivo pom.xml, adicione a seguinte dependência:

```
<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-hibernate-validator</artifactId>
</dependency>
```

3. Com o projeto aberto, crie a entidade `RestauranteEntity` dentro do pacote `com.betrybe.entity`. Ela deverá conter a anotação `@Entity` e terá os seguintes atributos:

   - id, com a anotação `@Id` e `@GeneratedValue`, com a estratégia `Identity`
   - nome, um campo do tipo `String` que deve conter a anotação `@Column`
   - descricao, um campo do tipo `String`, que deve conter a anotação `@Column`

4. Crie uma classe dto `RestauranteDTO` dentro do pacote `com.betrybe.dto`. Ela deverá conter dois atributos:

   - nome, um campo do tipo `String`. Ela deverá usar a notação `@NotBlank`
   - descrição, um campo do tipo `String`. Ela deverá usar as anotações `@NotBlank` e `@Size(3)`

5. Hora de fazer a camada de repositório. Crie a classe `RestauranteRepository` dentro do pacote `com.betrybe.repository`. Ela deverá apenas implementar a interface `PanacheRepositoryBase`. Certifique-se de passar para a interface os parâmetros corretos e de usar a anotação `@ApplicationScoped`.

6. Agora é hora de criar a classe `RestauranteService` dentro do package `com.betrybe.service`. Ela deverá estar anotada com `@ApplicationScoped` e deverá usar a classe `RestauranteRepository` via injeção de dependência. Essa classe deverá ter os seguintes métodos:

   - salvar(): deverá receber um `RestauranteDTO` como argumento e terá a anotação `@Transactional`
   - listar(): deverá retornar uma lista de `RestauranteEntity`
   - buscarPorId(): deverá receber um `Long` como argumento e fazer uma busca no banco com esse valor
   - atualizar(): deverá receber um `Long` e um `RestauranteDTO` como argumento. Ele deverá fazer uma busca no banco usando o id e atualizar os valores vindos no DTO. Terá a anotação `@Transactional`
   - deletar(): receberá um valor `Long` e deverá usá-lo para deletar um registro do banco. Terá a anotação `@Transactional` 

7. O comando que executamos no terminal criou o controller `RestauranteController`. Ele deverá usar a classe `RestauranteService` via injeção de dependências. Apague o método que foi criado pelo comando e crie cinco novos métodos:

    - listar(): método anotado com `@GET` e deverá retornar uma lista de restaurantes criados.
    - buscarPorId(): método anotado com `@GET` que obterá o id pela url e retornará o restaurante com esse id.
    - salvar(): método anotado com `@POST`. Deverá receceber como argumento um `RestauranteDTO` que deverá ser validado com `@Valid`.
    - atualizar(): método anotado com `@PATCH` que deverá obter o id da url e um `RestauranteDTO` como argumento, que deve ser validado com `@Valid`.
    - deletar(): método anotado com `@DELETE` que deverá obter o id da url e apagar o registro.

8. Hora de criar um filtro! Você deverá criar um filtro que interceptará o response para retornar o header:

```
X-Powered-By: Trybe
```

Após realizar o desafio, você saberá como criar APIs Rest completas utilizando Quarkus! Esse vai dar fome! 😋 #VQV

---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---
