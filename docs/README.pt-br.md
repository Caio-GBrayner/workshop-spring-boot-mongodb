<div align="center">

<h1 align="center">Sistema de Gerenciamento de Usuários e Produtos</h1>

<p align="center">
    <strong>Este software é um backend para gerenciamento de usuários e produtos</strong>
</p>

[![pt-BR](https://img.shields.io/badge/lang-pt--BR-green.svg)](./docs/README.pt-br.md)
[![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)

</div>

## Índice

- [Índice](#índice)
- [Sobre](#sobre)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuindo](#contribuindo)
  - [Conecte-se comigo no LinkedIn](#conecte-se-comigo-no-linkedin)
  - [Faça um fork e clone o repositório](#faça-um-fork-e-clone-o-repositório)
  - [Estrutura do Projeto](#estrutura-do-projeto)
- [Compilando a partir do Código Fonte](#compilando-a-partir-do-código-fonte)
  - [Pré-requisitos](#pré-requisitos)
  - [Instale o Spring Tool Suite](#instale-o-spring-tool-suite)
  - [Instale o MongoDB](#instale-o-mongodb)
  - [Instale o Java 21 LTS](#instale-o-java-21-lts)
  - [Instale as Dependências do Maven](#instale-as-dependências-do-maven)
- [Executando o Projeto](#executando-o-projeto)
- [Exemplos de Uso da API](#exemplos-de-uso-da-api)
- [Licença](#license)

## Sobre
Este projeto é uma pequena aplicação de rede social construída usando Java e **MongoDB**. Ele inclui funcionalidades de criação de usuários, posts e comentários. A aplicação utiliza **Spring Boot** para integração perfeita e consultas personalizadas com **@query** para recuperação eficiente de dados. Este projeto demonstra o uso de um banco de dados **não relacional** e escalável em um ambiente **Java**.

## Funcionalidades

- Operações CRUD
- Integração com banco de dados
- API RESTful
- Busca por ID
- Consultas simples com @Query

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- MongoDB
- Maven
- Apache Tomcat
- Java 21 LTS

## Contribuindo

### Conecte-se comigo no LinkedIn

Conecte-se comigo no [LinkedIn](https://www.linkedin.com/in/caiogomesbrayner).

### Faça um fork e clone o repositório

1. Faça um fork do repositório [(clique aqui para fazer o fork agora)](https://github.com/Caio-GBrayner/springboot-jpa)
2. Clone o seu fork `https://github.com/Caio-GBrayner/springboot-jpa.git`
3. Crie uma nova branch
4. Envie seus commits
5. Envie um novo Pull Request

### Estrutura do Projeto

- src/main/config: Testes de configuração
- src/main/domain: Contém as entidades do sistema.
- src/main/repository: Contém interfaces que estendem `MongoRepository` para acesso ao banco de dados.
- src/main/dto/: Contém Objetos de Transferência de Dados (DTOs) usados para transferir dados entre camadas.
- src/main/resources/: Contém arquivos de recursos, como propriedades de configuração e mensagens.
- src/main/resources/util: Classes utilitárias ou funções auxiliares.
- src/main/resources/exceptions: Contém classes de exceção personalizadas.
- src/main/services/: Contém classes de serviço que implementam a lógica de negócios.
- src/main/service/exceptions: Contém exceções específicas da camada de serviço.

## Compilando a partir do Código Fonte

### Pré-requisitos

- Java 21 LTS instalado.
- Maven instalado.
- MongoDB instalado.

### Instale o Spring Tool Suite

1. Baixe o Spring Tool Suite [aqui](https://spring.io/tools).
2. Siga as instruções de instalação para o seu sistema operacional.

## Instale o MongoDB

1. Checklist para Windows:

- Acesse https://www.mongodb.com → Download → Community Server
- Baixe e instale com a opção "Complete"
- Siga o tutorial em https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/ para configurar o ambiente MongoDB
  - Crie o diretório \data\db
  - Adicione ao PATH: C:\Program Files\MongoDB\Server\3.6\bin (ajuste para a sua versão)
- Teste no terminal: 
```bash
mongod
```

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for more details.