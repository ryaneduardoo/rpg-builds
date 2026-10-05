# 🛡️ RPG Builds API

API Backend desenvolvida em **Java** com **Spring Boot** para gerenciar composições e builds de personagens de RPG (inspirada no universo de *Task Bar Heroes*). O projeto implementa um CRUD completo com persistência em banco de dados relacional e documentação interativa integrada.

---

## 🚀 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot (3.3.0)**
* **Spring Data JPA / Hibernate**
* **Spring Web (RESTful APIs)**
* **Bean Validation**
* **PostgreSQL**
* **SpringDoc OpenAPI (Swagger UI)**
* **Lombok**
* **Maven**

---

## 📌 Funcionalidades da API (Endpoints)

O sistema gerencia o cadastro e otimização de composições de equipes/builds de heróis através dos seguintes endpoints:

* `POST /api/composicoes` - Cadastra uma nova composição de build.
* `GET /api/composicoes` - Lista todas as composições cadastradas.
* `GET /api/composicoes/{id}` - Busca uma composição específica pelo ID.
* `PUT /api/composicoes/{id}` - Atualiza os dados de uma composição existente.
* `DELETE /api/composicoes/{id}` - Remove uma composição do sistema.

---

## 📖 Documentação Interativa (Swagger UI)

Com a aplicação rodando localmente, você pode testar todos os endpoints diretamente pelo navegador através da interface gráfica do Swagger:

👉 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
* Ter o **Java 21** instalado na máquina.
* Ter uma instância do **PostgreSQL** rodando (na porta `5433` ou conforme configurado no projeto).
* Maven (você pode utilizar o Maven Wrapper `mvnw` que já vem incluído no projeto).

### Passos para rodar:

1. Clonar o repositório:
   ```Bash
   git clone [https://github.com/ryaneduardoo/rpg-builds.git](https://github.com/ryaneduardoo/rpg-builds.git)

2. Acessar a pasta do projeto:
   ```Bash
   cd rpg-builds

3. Configurar as credenciais do banco de dados no arquivo src/main/resources/application.properties:
   ```Properties
   spring.datasource.url=jdbc:postgresql://localhost:5433/rpg_db
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update

4. Executar a aplicação:
   Pela sua IDE (ex: IntelliJ IDEA): Execute a classe principal RpgBuildsApplication.
   Pelo terminal:
   ```Bash
   ./mvnw spring-boot:run

🔮 Próximos Passos (Melhorias Futuras)
* [ ] Implementar paginação e ordenação (Pageable) nos endpoints de listagem.

* [ ] Adicionar testes automatizados (unitários e de integração) com JUnit e Mockito.

* [ ] Configurar o Flyway para gerenciar as migrações do banco de dados de forma versionada.

✒️ Autor

    Desenvolvido por Ryan Eduardo.