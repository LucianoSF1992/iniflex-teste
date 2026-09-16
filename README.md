# Teste Técnico - Iniflex

Implementação do teste técnico em **Java**, desenvolvido para gerenciamento e manipulação de uma lista de funcionários, conforme os requisitos propostos no desafio.

## 📋 Sobre o projeto

O projeto foi desenvolvido utilizando **Java**, **Programação Orientada a Objetos (POO)** e **Collections**, com foco na aplicação dos conceitos fundamentais da linguagem.

O sistema realiza operações como:

- Cadastro de funcionários;
- Remoção de funcionário;
- Aplicação de aumento salarial;
- Agrupamento de funcionários por função;
- Filtro de funcionários por mês de nascimento;
- Identificação do funcionário com maior idade;
- Ordenação alfabética dos funcionários;
- Cálculo do total dos salários;
- Cálculo da quantidade de salários mínimos recebidos por cada funcionário.

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Collections (`List`, `Map`)
- `BigDecimal`
- `LocalDate`
- `Period`
- `DateTimeFormatter`
- `NumberFormat`

## 📁 Estrutura do projeto

```text
iniflex-teste/
├── src/
│   ├── Pessoa.java
│   ├── Funcionario.java
│   └── Principal.java
├── .gitignore
└── README.md
```

## ▶️ Como executar

É necessário ter o **Java JDK** instalado na máquina.

### Compilar

No terminal, a partir da pasta raiz do projeto:

```bash
javac -d bin src/*.java
```

### Executar

```bash
java -cp bin Principal
```

## 📌 Funcionalidades implementadas

O desenvolvimento segue os requisitos apresentados no teste técnico:

### 3.1 - Inserção dos funcionários

Cadastro dos funcionários na lista, mantendo a ordem apresentada no teste.

### 3.2 - Remoção do funcionário João

Remoção do funcionário **João** da lista utilizando `removeIf()`.

### 3.3 - Impressão dos funcionários

Impressão dos dados dos funcionários de forma organizada, incluindo:

- Nome;
- Data de nascimento;
- Salário;
- Função.

### 3.4 - Aumento salarial

Aplicação de **10% de aumento** no salário de todos os funcionários.

### 3.5 - Agrupamento por função

Agrupamento dos funcionários utilizando um `Map`, onde:

- **Chave:** função;
- **Valor:** lista de funcionários daquela função.

### 3.6 - Impressão agrupada por função

Exibição dos funcionários agrupados de acordo com suas respectivas funções.

### 3.8 - Funcionários que fazem aniversário

Identificação e impressão dos funcionários que fazem aniversário nos meses **10 (outubro)** e **12 (dezembro)**.

### 3.9 - Funcionário com maior idade

Identificação do funcionário com a data de nascimento mais antiga e cálculo de sua idade utilizando `Period`.

### 3.10 - Ordenação alfabética

Ordenação dos funcionários em ordem alfabética pelo nome utilizando `Comparator`.

### 3.11 - Total dos salários

Cálculo e impressão do total dos salários de todos os funcionários após o aumento de 10%.

**Total: R$ 50.906,82**

### 3.12 - Quantidade de salários mínimos

Cálculo de quantos salários mínimos cada funcionário recebe, considerando o salário mínimo de:

**R$ 1.212,00**

## 💰 Exemplo de resultado

Após a aplicação do aumento de 10%, o sistema apresenta:

```text
TOTAL DOS SALÁRIOS DOS FUNCIONÁRIOS:
Total: R$ 50.906,82
```

Também são apresentados os salários mínimos correspondentes a cada funcionário.

Exemplo:

```text
Nome: Maria | Salário: R$ 2.210,38 | Salários mínimos: 1.82
Nome: Caio | Salário: R$ 10.819,75 | Salários mínimos: 8.93
Nome: Miguel | Salário: R$ 21.031,87 | Salários mínimos: 17.35
```

## 🎯 Objetivo

O objetivo do projeto é demonstrar a aplicação prática de conceitos de Java, incluindo:

- Classes e herança;
- Encapsulamento;
- Collections;
- Manipulação de datas;
- Operações com valores monetários utilizando `BigDecimal`;
- Ordenação e filtragem de listas;
- Estruturas `Map`;
- Expressões lambda.

## 👨‍💻 Autor

**Luciano Silva Ferreira**

GitHub: [LucianoSF1992](https://github.com/LucianoSF1992)