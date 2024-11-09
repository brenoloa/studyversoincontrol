# Projeto CRUD - Back-end com Spring Boot e PostgreSQL

Este arquivo contém uma lista detalhada de tarefas para a implementação do back-end do projeto CRUD com Spring Boot e PostgreSQL.

---

## Tarefas do Back-end

### 1. Setup Inicial do Projeto

- [X]  **1-setup-backend**: Configurar o projeto Spring Boot e conectar ao PostgreSQL
  - [X]  1.1: Criar projeto Spring Boot com `Spring Web`, `Spring Data JPA` e `PostgreSQL`
  - [X]  1.2: Configurar `application.properties` para conectar ao banco de dados PostgreSQL
  - [X]  1.3: Testar conexão com o banco de dados

### 2. Modelagem do Banco de Dados e Criação de Entidades

- [X]  **2-model-backend**: Definir as entidades e configurar o banco de dados
  - [X]  2.1: Criar a entidade `Produto` com atributos `id`, `nome`, `descricao`, `preco`, `quantidade`
  - [X]  2.2: Mapear relações entre entidades se necessário
  - [X]  2.3: Testar persistência das entidades com dados de exemplo

### 3. Repositórios e Serviços

- [X]  **3-repositories-services**: Criar repositórios e serviços para manipulação de dados
  - [X]  3.1: Criar repositório JPA para a entidade `Produto`
  - [X]  3.2: Implementar serviço `ProdutoService` com operações CRUD
  - [X]  3.3: Testar serviço com dados simulados

### 4. Endpoints REST para CRUD

- [X]  **4-endpoints-backend**: Implementar controladores REST para expor as operações CRUD
  - [X]  4.1: Criar controlador REST com endpoints `POST`, `GET`, `PUT`, `DELETE` para `Produto`
  - [X]  4.2: Validar dados de entrada com `@Valid`
  - [X]  4.3: Testar endpoints usando Postman ou Insomnia

### 5. Testes Unitários e de Integração

- [ ]  **5-tests-backend**: Implementar testes para garantir a qualidade do código
  - [ ]  5.1: Criar testes unitários para `ProdutoService`
  - [ ]  5.2: Criar testes de integração para `ProdutoController`
  - [ ]  5.3: Verificar persistência e validação de dados

### 6. Documentação do Back-end

- [ ]  **6-docs-backend**: Documentar a API para facilitar o uso
  - [ ]  6.1: Configurar Swagger para gerar documentação da API
  - [ ]  6.2: Criar um guia básico de uso no `README.md`
  - [ ]  6.3: Descrever como configurar e rodar o back-end localmente

---
