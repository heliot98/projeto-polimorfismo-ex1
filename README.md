-----

# Gerenciamento de Funcionários

Este projeto Java demonstra os conceitos de **Herança** e **Polimorfismo** através de um sistema simples de gerenciamento de salários de funcionários, incluindo funcionários terceirizados.

-----

## 🚀 Funcionalidades

O programa permite:

  * **Cadastrar funcionários:** Você pode informar o nome, horas trabalhadas e valor por hora de funcionários.
  * **Identificar terceirizados:** O sistema permite indicar se um funcionário é terceirizado, solicitando um valor de cobrança adicional.
  * **Calcular pagamentos:** Calcula o salário de cada funcionário. Funcionários terceirizados têm um cálculo de pagamento diferenciado, incorporando uma cobrança adicional.
  * **Listar pagamentos:** Exibe o nome e o valor total do pagamento para todos os funcionários cadastrados.

-----

## 💻 Tecnologias Utilizadas

  * **Java**

-----

## 📁 Estrutura do Projeto

O projeto é composto por três classes principais:

  * `Programa.java`: Contém o método `main` e a lógica principal para interação com o usuário, cadastro de funcionários e exibição dos pagamentos.
  * `Funcionario.java`: Classe base que representa um funcionário comum, com atributos como nome, horas e valor por hora, além do método `pagamento()`.
  * `FuncionarioTerceirizado.java`: Estende a classe `Funcionario` e adiciona o atributo `cobrancaAdicional`. Sobrescreve o método `pagamento()` para incluir o cálculo da cobrança adicional.

-----

## 💡 Conceitos Demonstrados

Este projeto é um excelente exemplo para entender:

  * **Herança:** A classe `FuncionarioTerceirizado` **herda** características e comportamentos da classe `Funcionario`, reutilizando código e estabelecendo uma relação "é um" (`FuncionarioTerceirizado` é um `Funcionario`).
  * **Polimorfismo:** A lista `List<Funcionario>` armazena tanto objetos `Funcionario` quanto `FuncionarioTerceirizado`. O método `pagamento()` é chamado para cada funcionário na lista, e o Java determina qual implementação de `pagamento()` (da classe `Funcionario` ou `FuncionarioTerceirizado`) deve ser executada em tempo de execução, baseando-se no tipo real do objeto. Isso permite tratar objetos de diferentes classes de forma uniforme.

-----

## ▶️ Como Executar

1.  **Clone o repositório** (ou copie os arquivos para sua máquina).
2.  **Compile as classes Java:**
    ```bash
    javac aplicacao/Programa.java entidades/Funcionario.java entidades/FuncionarioTerceirizado.java
    ```
3.  **Execute o programa:**
    ```bash
    java aplicacao.Programa
    ```

O programa irá solicitar a quantidade de funcionários e, em seguida, os dados de cada um. Ao final, apresentará a lista de pagamentos.

-----

## 🤝 Contribuição

Sinta-se à vontade para explorar o código, fazer melhorias ou utilizar como base para seus estudos sobre Herança e Polimorfismo em Java\!

-----
