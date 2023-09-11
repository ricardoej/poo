# Tarefa: Calculadora de Custo de Envio de Produtos

## Contexto

Imagine que você está desenvolvendo um sistema para calcular o custo de envio de produtos de uma loja online. Inicialmente, o sistema calcula o custo de envio com base em três critérios: peso do produto, dimensões do produto e preço do produto.

1. **Peso do Produto:** O custo de envio é calculado multiplicando o peso do produto por 2.

2. **Dimensões do Produto:** O custo de envio é calculado multiplicando a altura pela largura do produto.

3. **Preço do Produto:** Se o preço do produto for maior que R$500,00, o frete é grátis. Caso contrário, o custo de envio é fixado em R$20,00.

Sua tarefa é criar uma calculadora de frete que recebe a forma de cálculo (com base no peso, dimensões ou preço) e calcula o custo de envio de acordo com o critério escolhido.

## Requisitos

1. Crie uma classe `CalculadoraFrete` que tenha métodos para calcular o custo de envio com base no peso, dimensões ou preço do produto.

2. A classe `CalculadoraFrete` deve ter um método público chamado `calcularCustoEnvio` que aceita o tipo de cálculo escolhido (peso, dimensões ou preço) e o valor correspondente (por exemplo, o peso em quilogramas, as dimensões em centímetros ou o preço em reais) como parâmetros e retorna o custo de envio.

3. Crie uma classe `Main` que teste o módulo de cálculo de frete criado. Nela, você deve criar instâncias da classe `CalculadoraFrete` e usar seus métodos para calcular o custo de envio com base em diferentes critérios.

## Desenvolvimento do Programa de Exemplo

Crie um programa de exemplo em Java que demonstre o uso da classe `CalculadoraFrete` e seus métodos. O programa deve:

1. Criar instâncias da classe `CalculadoraFrete`.

2. Usar os métodos da classe `CalculadoraFrete` para calcular o custo de envio com base no peso, dimensões e preço de produtos fictícios.

3. Exibir os resultados no console.

## Critérios de Avaliação

Você será avaliado com base nos seguintes critérios:

- Implementação correta e completa da classe `CalculadoraFrete`, com métodos para calcular o custo de envio com base no peso, dimensões e preço.
- Funcionamento correto do programa de exemplo, que demonstra o uso da classe `CalculadoraFrete`.
- Capacidade de criar instâncias da classe `CalculadoraFrete` e usar seus métodos corretamente.
- Qualidade do código, incluindo boas práticas de nomenclatura e formatação.
- Respeito aos princípios estudados.
