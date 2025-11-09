
## Teste Mock

- Diferentemente dos testes unitários, o teste Mock simula o comportamento de uma classe existente no projeto, criando objetos 'falsos'. Muito utilizado em casos de dependências externas como banco de dados.
- Pode-se extrair medidas - sistema se comporta de forma diferente considerando a construção do Mock
- Acesso a recursos externos(banco de dados ou web service)
- O sistema pode ser complexo para ser configurado, o que pode ser facilitado pelo mock
- Injeção de Dependências(desacoplamento) - poder fazer alterações externas(necessário para poder fazer um teste mock):
	- Composição com construtor
	- Setter
	- Objeto como parâmetro do método - mudança na assinatura do método

@Before - executar antes de rodar qualquer teste(como uma function de contexto para os testes)

### Frameworks


- Facilitam a criação de mocks quando há casos com inúmeras dependências.
- Não é necessário a criação de uma classe para mock, reduzindo complexidade.
- Facilita a legibilidade

#### Mockito

- Dependência inserida no Maven
- @Mock - todo serviço que deve ser mockado
- @RunWith - Necessário pra funcionar junto com o JUnit
- Mockito.when(método).thenReturn(o que for desejado)

#### Definições

- Teste Baseado em Estado - verifica apenas mudanças de estado, valor
- Teste Baseado em Interação - verifica se uma classe conseguiu chamar um método
- Nunca mockar POJOs(classes que mantém estado), códigos de terceiros e apenas o necessário

## TDD (Test Driven Development)

- Escrever uma classe de teste para uma classe de produção antes que esta seja implementada;
- Solução é fazer o teste passar;
- Refatorar (deixar o código mais limpo).
- Objetivos:
	- Força a escrita de teste de unidade;
	- Favorece a escrita de classes com alta testabilidade(melhores);
	- Aprimora a API e o design do código de produção.
-  Padrões de implementação:
	- Definição da API - teste do zero, sem classes criadas - método com retorno trivial com classe funcionando normalmente;
	- Teste Diferencial - testes criados são diferentes e forçam que haja mudança na classe de produção, com testes não muito complexos - exemplo da pilha(teste de pilha vazia(AssertTrue) e depois inserindo um outro teste com um elemento adicionado(AssertFalse));
	- Exceptional Limit - semelhante ao teste diferencial, mas com foco no tratamento de erros(camada de proteção) e não criação de novas funcionalidades;
	- Everything Working Together - verificação de integridade, ver se as funcionalidades estão corretas juntas, fazendo testes pra vários métodos diferentes rodando juntos.

