# Resolução de Sistemas Lineares com o Método de Gauss-Jacobi

## Descrição
Este projeto implementa o **método de Gauss-Jacobi** em Java para resolver sistemas lineares da forma **Ax = b**, onde:
- `A` é a matriz dos coeficientes do sistema.
- `x` é o vetor incógnita (solução).
- `b` é o vetor dos termos independentes.

O método de Gauss-Jacobi é um método iterativo que recalcula os valores de `x` a cada iteração até atingir a convergência ou o número máximo de iterações.

---

## Como funciona
O programa executa os seguintes passos:
1. Define uma matriz `A` e um vetor `b`.
2. Inicializa um vetor `x` com um chute inicial.
3. Aplica o método de Gauss-Jacobi até que a solução seja encontrada dentro de uma tolerância definida ou o número máximo de iterações seja atingido.
4. Exibe a solução encontrada.

A fórmula do método de Gauss-Jacobi para cada variável `x[i]` é:

\[
x_i^{(k+1)} = \frac{b_i - \sum_{j \neq i} A_{ij} x_j^{(k)}}{A_{ii}}
\]

---

## Requisitos
- Java 8 ou superior

---

## Como executar
1. **Clone o repositório** ou copie o arquivo `Main.java`.
2. **Compile o programa** com o comando:
   ```sh
   javac Main.java
   ```
3. **Execute o programa**:
   ```sh
   java Main
   ```

---

## Exemplo de Entrada
O código já contém um exemplo de sistema linear:
```java
// Matriz de coeficientes
 double[][] A = {
     {5, 2, 2},
     {1, 3, 1},
     {0, 6, 8}
 };

// Vetor de termos independentes
 double[] b = {3, -2, -6};

// Chute inicial
 double[] x = {0.6, -0.7, -0.75};
```

---

## Exemplo de Saída
Ao executar, o programa pode exibir algo como:
```
Solução encontrada após 3 iterações.
Solução:
x[0] = 1.0862222222222222
x[1] = -0.8985185185185186
x[2] = 0.3837037037037036

```

---

## Melhorias Futuras
- Verificar se a matriz `A` é diagonalmente dominante (para garantir convergência).
- Permitir entrada de dados pelo usuário.
- Adicionar suporte para diferentes critérios de parada.

---

