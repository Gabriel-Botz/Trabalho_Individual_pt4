# 🚗 Sistema de Veículos em Java

## 📌 Descrição

Este projeto consiste no desenvolvimento de um sistema de gerenciamento de veículos utilizando **Programação Orientada a Objetos (POO)** em Java.

O sistema foi projetado para aplicar múltiplos conceitos importantes da linguagem, incluindo herança, interfaces, classes abstratas, regras de negócio e tratamento de exceções.

---

## 🧠 Conceitos Aplicados

- Interfaces
- Classes abstratas (`abstract`)
- Classes seladas (`sealed`)
- Herança
- Polimorfismo
- Encapsulamento
- Tratamento de exceções

---

## 🏗️ Estrutura do Projeto

### 🔹 Interface `Fretavel`

Responsável pelo comportamento de locação de veículos.

```java
double alugarVeiculo(double pesoCarga, int dias);
```

---

### 🔹 Interface `Tributavel`

Responsável pelo cálculo de impostos.

```java
double calcularIpva();
```

---

### 🔹 Classe Abstrata `Veiculo`

Classe base do sistema, responsável por representar um veículo genérico.

**Atributos:**
- `placa` (final)
- `marca` (final)
- `valorLocacaoDiaria`
- `anoFabricacao` (final)
- `precoFipe`

**Características:**
- Classe `abstract sealed`
- Implementa `Fretavel` e `Tributavel`

---

### 🔹 Classe `Caminhao`

Classe que herda de `Veiculo`.

**Atributos:**
- `capacidadeCargaToneladas` (final)

---

### 🔹 Classe `CarroPasseio`

Classe que herda de `Veiculo`.

---

## ⚙️ Funcionalidades

- Calcular valor de locação de veículos  
- Calcular imposto (IPVA)  
- Aplicar regras específicas para caminhões e carros  
- Validação de dados com exceções  

---

## 🚨 Regras de Negócio

### 🚚 Regra de Sobrecarga (Caminhão)

Ao calcular o valor da locação através do método:

```java
alugarVeiculo(double pesoCarga, int dias)
```

- Caso o `pesoCarga` seja maior que a capacidade máxima do caminhão:
  ```txt
  Aplicar acréscimo de 10% no valor total da locação
  ```

---

### 🏛️ Regra de IPVA

- Veículos com mais de **20 anos de fabricação**:
  ```txt
  IPVA = 0.0 (isento)
  ```

- Caso contrário:
  - **CarroPasseio**:
    ```txt
    4% do valor da tabela (precoFipe)
    ```
  - **Caminhao**:
    ```txt
    1.5% do valor da tabela (precoFipe)
    ```

---

### ⚠️ Tratamento de Exceções

- Deve ser realizado nos **construtores**
- Deve ser realizado nos **métodos**
- Qualquer parâmetro inválido deve:
  ```txt
  Lançar exceção e ser tratado no método main
  ```

---

## 💻 Exemplo de Uso

```java
try {
    Caminhao caminhao = new Caminhao("ABC1234", "Volvo", 500.0, 2015, 200000.0, 10.0);

    double valor = caminhao.alugarVeiculo(12.0, 5);
    double ipva = caminhao.calcularIpva();

    System.out.println("Valor da locação: " + valor);
    System.out.println("IPVA: " + ipva);
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
```

---

## 🎯 Objetivo Acadêmico

Este exercício tem como objetivo reforçar:

- Uso de múltiplos conceitos de POO em conjunto  
- Criação de sistemas mais robustos  
- Aplicação de regras de negócio complexas  
- Tratamento de exceções em Java  

---

## 📚 Tecnologias Utilizadas

- Java  

---

## 👨‍💻 Autor

**Gabriel Carneiro Botelho**  
Estudante de Análise e Desenvolvimento de Sistemas  
