### Teste de Caixa branca - Etapa 3


## Sobre
Este repositório contém um projeto de teste de caixa branca desenvolvido para avaliar a qualidade do código-fonte de um software específico. O objetivo principal deste projeto é identificar e verificar o comportamento interno do código, avaliando sua estrutura, lógica e cobertura.

## Erros
Erros observados no código na imagem abaixo:

![image](https://github.com/MelPLens/Teste-de-Caixa-branca/assets/99374140/5fb69da6-de5d-4331-9211-dc753f50acc5)

## Documentação
O código não possui documentação adequada. Não há comentários ou descrições que expliquem o propósito das classes ou métodos, nem há informações sobre como usar as classes ou métodos.


## As Variáveis e Constantes possuem uma boa nomenclatura? 
não segue as convenções de nomenclatura comuns em Java. Por exemplo, o nome de classe User deveria começar com letra maiúscula, e o uso de variáveis como e_ e sql não segue boas práticas. Além disso, as variáveis nome e result são públicas, o que não é uma boa prática de encapsulamento.


## Existe Legibilidade e organização no código? 
O código não está bem organizado. Há falta de espaçamento adequado entre as linhas e os blocos de código não estão indentados corretamente. Além disso, há erros de sintaxe, como o uso de chaves {} no lugar de parênteses () em certos lugares, e falta de espaço em branco na concatenação de strings.


##  Os NullPointers foram tratados?
O código não trata exceções de NullPointerException. Por exemplo, se a conexão com o banco de dados não for bem-sucedida, o método conectarBD retornará null, mas não há tratamento para isso, o que pode levar a problemas em tempo de execução.


##  Arquitetura utilizada foi devidamente respeitada?
O código não segue boas práticas de arquitetura. Por exemplo, a conexão com o banco de dados e a execução de consultas SQL estão diretamente no código da classe User, o que não é uma separação apropriada de responsabilidades. Uma melhor abordagem seria separar a lógica de acesso ao banco de dados em uma classe separada.


##  As conexões utilizadas foram fechadas?
Não há fechamento explícito das conexões com o banco de dados após o uso. Isso pode causar vazamentos de recursos. Recomenda-se usar blocos try-with-resources ou fechar as conexões explicitamente em um bloco finally.


## Contribuições
Mel Plens Angelis

