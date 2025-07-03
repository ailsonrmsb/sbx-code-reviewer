# CalculatorService.java

## 1. Pacote
`net.sbx.code_reviewer.service`

## 2. Imports Relevantes
- `lombok.RequiredArgsConstructor`
- `org.springframework.stereotype.Service`

## 3. Visão Geral da Classe
- **Propósito principal:** Fornecer lógica de soma de dois inteiros.
- **Contexto de negócio:** Serviço de backend para operações matemáticas.

## 4. Injeções e Dependências
- Não possui dependências externas.

## 5. Transacionalidade e Anotações
- `@Service`: Define a classe como um bean de serviço do Spring.
- `@RequiredArgsConstructor`: (Desnecessário aqui, pois não há dependências, mas não prejudica.)

## 6. Principais Métodos Públicos
- `public int sum(int a, int b)`
  - Soma dois inteiros e retorna o resultado.
  - Não lança exceções explicitamente.
  - Retorno: resultado da soma.

## 7. Métodos Privados e Auxiliares
- Não possui.

## 8. Tratamento de Erros e Logs
- Não há tratamento de erros ou logs.

## 9. Fluxos de Negócio Críticos
- Soma simples de dois inteiros.

## 10. Pontos de Atenção / TODOs
- Não há tratamento para overflow de inteiros.

## 11. Exemplo de Uso
```java
int resultado = calculatorService.sum(2, 3); // resultado = 5
``` 