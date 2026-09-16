# Teste Técnico - Iniflex

Implementação de teste técnico em Java para gerenciamento e manipulação de uma lista de funcionários.

## 📋 Sobre o projeto

O projeto foi desenvolvido em Java utilizando conceitos de Programação Orientada a Objetos e Collections.

O sistema realiza operações como:

- Cadastro de funcionários;
- Remoção de funcionário;
- Aumento salarial;
- Agrupamento de funcionários por função;
- Filtro de funcionários por mês de nascimento;
- Identificação do funcionário com maior idade;
- Ordenação alfabética dos funcionários;
- Cálculo do total dos salários;
- Cálculo da quantidade de salários mínimos por funcionário.

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Collections (`List`, `Map`)
- `BigDecimal`
- `LocalDate`
- `DateTimeFormatter`
- `NumberFormat`

## 📁 Estrutura do projeto

```text
iniflex-teste/
├── src/
│   ├── Pessoa.java
│   ├── Funcionario.java
│   └── Principal.java
├── lib/
├── bin/
├── .vscode/
└── README.md
▶️ Como executar

É necessário ter o Java JDK instalado.

Compilar

No terminal, a partir da pasta raiz do projeto:

javac -d bin src/*.java
Executar
java -cp bin Principal
📌 Funcionalidades implementadas

O desenvolvimento segue os requisitos apresentados no teste técnico:

3.1 - Inserção dos funcionários na lista.
3.2 - Remoção do funcionário João.
3.3 - Impressão dos funcionários com os dados formatados.
3.4 - Aplicação de aumento de 10% nos salários.
3.5 - Agrupamento dos funcionários por função utilizando Map.
3.6 - Impressão dos funcionários agrupados por função.
3.8 - Impressão dos funcionários que fazem aniversário nos meses 10 e 12.
3.9 - Identificação do funcionário com maior idade.
3.10 - Impressão dos funcionários em ordem alfabética.
3.11 - Cálculo e impressão do total dos salários.
3.12 - Cálculo da quantidade de salários mínimos recebidos por cada funcionário, considerando o salário mínimo de R$ 1.212,00.
💰 Exemplo

Após o aumento de 10%, o total dos salários dos funcionários é:

R$ 50.906,82

Considerando o salário mínimo de R$ 1.212,00, o sistema também apresenta quantos salários mínimos cada funcionário recebe.

👨‍💻 Autor

Luciano Silva Ferreira