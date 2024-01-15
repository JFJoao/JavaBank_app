# ByteBank - Aplicação Bancária Java x JDBC

A aplicação **ByteBank** é um sistema bancário simples desenvolvido em **Java** que utiliza **JDBC** para interação com um banco de dados **MySQL**. A aplicação oferece funcionalidades básicas, como abertura de contas, depósitos, saques, transferências, listagem de contas e exclusão de contas. Utilizamos o padrão Factory para conexão com banco de dados e o padrão DAO, classe responsável pela comunicação com o banco de dados.

## Configuração do Ambiente

Antes de executar a aplicação, certifique-se de ter as seguintes dependências instaladas:

- **Java Development Kit (JDK)**
- **MySQL Database**
- **MySQL Connector/J**

## Configuração do Banco de Dados

1. Crie um banco de dados chamado **boc_app**.
2. Execute o script SQL contido em `src/main/resources/sql/comandosSQL.txt` para criar a tabela necessária.

## Executando a Aplicação

1. Clone este repositório: `git clone https://github.com/JFJoao/bytebank-java.git`
2. Abra o projeto em sua IDE favorita (trabalhamos com IntelliJ).
3. As informações de conexão estao na classe ConnectionFactory, configure seu acesso ao banco criado.
4. Execute a classe `Main` para iniciar a aplicação.

## Funcionalidades

- **Abertura de Conta:** Permite abrir uma nova conta, fornecendo informações do cliente.
- **Depósito e Saque:** Realize depósitos e saques em uma conta existente.
- **Transferência entre Contas:** Efetue transferências de valores entre duas contas.
- **Listagem de Contas:** Exiba a lista de todas as contas cadastradas no banco de dados.
- **Exclusão de Conta:** Remova uma conta existente no sistema.

## Estrutura do Projeto

- `src/main/java/br/com/alura/bytebank/`: Contém os códigos-fonte da aplicação.
- `src/main/resources/sql/comandosSQL.txt`: Script SQL para criação da tabela no banco de dados.

## Observações

- Certifique-se de fornecer as configurações corretas do banco de dados no arquivo `BytebankApplication.java`.
- Este projeto é fornecido apenas como um exemplo educacional e pode não atender a todos os requisitos de segurança necessários para uma aplicação real. Sugestões são sempre bem vindas.

## Conclusão

O **ByteBank** é uma aplicação bancária simples em Java que demonstra conceitos básicos de interação com banco de dados usando JDBC. Sinta-se à vontade para explorar, modificar e expandir o projeto conforme necessário.
