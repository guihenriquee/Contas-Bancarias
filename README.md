# Contas Bancárias - Projeto Java

Este projeto em Java tem como objetivo simular um sistema simples de consulta de tipos de contas bancárias e suas respectivas taxas de juros.

## Descrição

O programa recebe o tipo de conta bancária (como "CONTA_POUPANCA", "CONTA_CORRENTE" ou "CONTA_INVESTIMENTO") e exibe a taxa de juros correspondente a cada tipo de conta. Caso o tipo de conta fornecido não esteja na lista, o programa retorna "CONTA INEXISTENTE".

### Exemplo de execução:

Se o usuário digitar `CONTA_POUPANCA`, o programa irá exibir: `0.05%`.


### Estrutura do Código

- O programa solicita ao usuário que insira o tipo da conta bancária (ex: "CONTA_POUPANCA").

- Utiliza a estrutura switch para verificar o tipo da conta e imprimir a taxa de juros correspondente.

- Se o tipo da conta não estiver entre as opções definidas, a mensagem "CONTA INEXISTENTE" será exibida.
