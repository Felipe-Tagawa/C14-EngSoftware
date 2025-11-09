
## Conceito

- Melhorias, otimizações para aumentar legibilidade do código.

## Tipos

### Extração de Métodos

- Reutilização de código e melhorar entendimento;
- Deixar funcionalidades em métodos diferentes que evita duplicação; 
- Método -> Sub-métodos.
### Inline de Métodos

- Trazer (mesclar) método para dentro de outro;
- Garantir legibilidade;
- Inline Variable - converte uma variável em um retorno direto.
### Movimentação de Método

- Método faz mais sentido estar dentro de uma classe nova do que duma anterior.
- Pull-up method - levar um método de uma classe filha para uma superclasse.
- Push-Down Method - levar um método de uma superclasse para uma filha.
- Melhora coesão, diminui acoplamento e melhora modularização - quebras.

### Extração de Classe

- Subdividir uma classe em outras classes menores.

### Renomeação

- Nomes devem ser o mais fiel possível para entendimento(legibilidade).
- Problema: atualizar todos os locais em que o método/variável/classe/etc. é chamado.
- @deprecated
	- anotação para denotar que uma implementação antiga está sendo usada no código.

### Modos de Refactoring

- Deve ser feito mediante testes, principalmente de unidade - evitar regressão.
- IDEs tem refactoring automático.

#### Refactoring Oportunista

- Realizados no meio de uma tarefa de desenvolvimento.

#### Refactoring Planejado

- Mudanças profundas no sistema(não é ideal que aconteça sempre)

![[Pasted image 20251020200838.png]]

### Débito Técnico

Soluções ruins de desing de código que dificultam manutenção e evolução.
Nesse caso, o refactoring deve ser feito sempre, para evitar esses tipos de problemas.