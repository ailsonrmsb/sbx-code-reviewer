# CalculatorController.java

## 1. Pacote
`net.sbx.code_reviewer.controller`

## 2. Imports Relevantes
- `lombok.RequiredArgsConstructor`
- `net.sbx.code_reviewer.service.CalculatorService`
- `org.springframework.http.ResponseEntity`
- `org.springframework.web.bind.annotation.GetMapping`
- `org.springframework.web.bind.annotation.RequestParam`
- `org.springframework.web.bind.annotation.RestController`

## 3. Visão Geral da Classe
- **Propósito principal:** Expor um endpoint REST para somar dois números inteiros.
- **Contexto de negócio:** Interface HTTP para operações matemáticas simples.

## 4. Injeções e Dependências
- `CalculatorService`: Serviço responsável pela lógica de soma. Injetado via `@RequiredArgsConstructor`.
  - **Por que é necessário:** Centraliza a lógica de negócio, mesmo que simples, e permite fácil expansão.
- Anotações do Spring para REST.

## 5. Transacionalidade e Anotações
- `@RestController`: Define a classe como controller REST.
- `@RequiredArgsConstructor`: Gera construtor para injeção de dependências.
- `@GetMapping`: Mapeia o endpoint HTTP GET.
- `@RequestParam`: Mapeia parâmetros da query string.

## 6. Principais Métodos Públicos
- `public ResponseEntity<Integer> sum(@RequestParam int a, @RequestParam int b)`
  - Recebe dois inteiros via query string.
  - Chama `CalculatorService.sum(a, b)`.
  - Retorna o resultado em um `ResponseEntity`.
  - Não lança exceções explicitamente.
  - Retorno: soma dos dois números.

## 7. Métodos Privados e Auxiliares
- Não possui.

## 8. Tratamento de Erros e Logs
- Não há tratamento explícito de erros ou logs.

## 9. Fluxos de Negócio Críticos
- Recebe requisição HTTP GET → extrai parâmetros → delega ao serviço → retorna resultado.

## 10. Pontos de Atenção / TODOs
- Não há validação de parâmetros (ex: limites, tipos).
- Não há tratamento de erros para casos de overflow.

## 11. Exemplo de Uso
```http
GET /sum?a=2&b=3
// Resposta: 5
``` 