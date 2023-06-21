# Tpc03
Calculadora com pilha

## Relatório da Calculadora Simples

Este relatório descreve a implementação de uma Calculadora Simples em Java. A calculadora utiliza uma pilha para realizar operações básicas como soma, subtração, multiplicação e divisão.

## Descrição do código

O código é composto por três classes: `Calculadora`, `Pilha` e `No`.

### Classe `Calculadora`

A classe `Calculadora` contém o método `main`, que é o ponto de entrada do programa. O método `main` apresenta um menu de opções para o usuário e executa as operações selecionadas. A calculadora mantém uma instância da classe `Pilha` para armazenar os valores utilizados nas operações.

### Classe `Pilha`

A classe `Pilha` representa a estrutura de dados pilha e fornece os métodos necessários para manipulá-la. A pilha é implementada utilizando uma lista encadeada de nós da classe `No`. Os principais métodos da classe são:

- `empilhar(int valor)`: Adiciona um novo elemento à pilha.
- `desempilhar()`: Remove e retorna o elemento do topo da pilha.
- `verTopo()`: Retorna o valor do elemento no topo da pilha.
- `estaVazia()`: Verifica se a pilha está vazia.

### Classe `No`

A classe `No` representa um nó da pilha e contém um valor inteiro e uma referência para o próximo nó.

## Funcionamento da calculadora

A calculadora inicia exibindo um menu para o usuário com as seguintes opções:

1. Inserir número na pilha
2. Somar
3. Subtrair
4. Multiplicar
5. Dividir
6. Encerrar

O usuário pode escolher uma das opções digitando o número correspondente. Dependendo da opção selecionada, a calculadora realiza a operação correspondente utilizando os valores da pilha. Se a pilha estiver vazia e a operação requerer dois valores, a calculadora exibe uma mensagem de erro.

A calculadora continua executando até que a opção "Encerrar" seja escolhida.

## Conclusão

A calculadora implementada em Java utilizando pilha fornece uma funcionalidade básica para realizar operações matemáticas simples. A estrutura de pilha permite que os valores sejam armazenados e manipulados de forma adequada. É possível expandir a calculadora adicionando novas operações ou melhorando a interface do usuário.
