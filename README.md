# Quarkus - CRUD Imóveis

### Sobre
O projeto visa apresentar um CRUD expondo o funcionamento do framework de Java Quarkus.
Para criar uma primeira aplicação utilizando Quarkus e testar se está configurado corretamente, podemos seguir o guia [CREATING YOUR FIRST APPLICATION](https://quarkus.io/guides/getting-started), da documentação do framework.

Vídeo de demonstração seguindo os passos: [Quarkus CRUD Imóveis](https://www.youtube.com/watch?v=MkFNx0xyIg4&ab_channel=Filipe)

### Pré-requisitos
* IDE, como o Visual Studio Code
* [JDK](https://www.oracle.com/java/technologies/downloads/) 11+ com o JAVA_HOME configurado
* [Apache Maven](https://maven.apache.org/download.cgi) instalado corretamente
* [Quarkus CLI](https://quarkus.io/guides/cli-tooling)
* [Docker](https://www.docker.com/products/docker-desktop/)

Passos:
* Crie uma nova instância do PostgreSQL:
```
docker run --name postgres-imoveis -e "POSTGRES_PASSWORD=postgres" -p 5433:5432 -v ~/developer/PostgreSQL:/var/lib/postgresql/data -d postgres
```
* Utilizando uma ferramenta de sua preferência, crie uma base de dados chamada `imoveis`.

* Clone o projeto e vá para a pasta do projeto:
```
git clone https://github.com/filipeakafilipe/quarkus-crud.git
cd ./quarkus-crud/imoveis
```
* Inicie a aplicação:
```
quarkus dev
```
* Em `imoveis/src/main/resources/application.properties`, está configurado nossa conexão com a base de dados, por padrão utilizaremos a opção de geração `drop-and-create`, para criarmos inicialmente nossas tabelas. Caso esteja rodando a aplicação de novo, podemos trocar para `update`, assim nossas tabelas não serão recriadas e nossos dados não serão perdidos caso iniciemos novamente a aplicação.
* Após a aplicação iniciar, podemos acessá-la em `http://localhost:8080/`. Ao clicarmos em `VISIT THE DEV UI`, somos redirecionados para uma interface simplificada, `http://localhost:8080/q/dev/`, da aplicação, que reúne diferentes ferramentas, como o Swagger. Podemos clicar em `Swagger UI`, em `SmallRye OpenAPI`, para sermos direcionados para a interface do Swagger, `http://localhost:8080/q/swagger-ui/`, e vermos os endpoints da API REST.
