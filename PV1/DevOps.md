
- Transformar o código devidamente testado em um produto, com uso de automatização de todos os passos necessários(testes automatizados).

## Conceitos Básicos

### Release

- Gerar uma nova versão que pode ser distribuída e utilizada pelo cliente;
### Deploy

- A nova versão é instalada no servidor de produção e fica disponível para os clientes;

### Delivery

## CI (Continuous Integration)

- Solução pra conflitos de integração, conflitos de merge e merge hell que ocorrem quando os desenvolvedores fazem o desenvolvimento em commits de branches diferentes.
- TBD (Trunk Based Development) - desenvolvimento diretamente na branch principal, com camadas de segurança, que minimiza esforços de integração, torna o desenvolvimento mais rápido e evitando merge hell.
- Essencial para comunicação - sabe-se que o projeto está buildado corretamente.

## CD (Continuous Deployment)

- Todo commit pode (possibilidade) entrar em produção;
- Vantagens:
	- Reduzir o tempo de entrega de novas funcionalidades - *entregas menores*;
	- Cria-se mais releases com menos funcionalidades;
	- Feedback mais rápido do cliente.
- Desvantagem:
	- Pior em casos de projetos muito complexos, como apps móveis, jogos, apps desktop e atualizações de drivers;
	- Depende dos recursos disponíveis do usuário.

## CD (Continuous Delivery)

- Utilizada em sistemas mais complexos, como já listados;
- Todo commit pode entrar em produção imediatamente, mas há um componente manual(pode ser o próprio cliente que pode escolher se irá atualizar ou não) que irá autorizar ou não entrar em produção.
- O software não precisa necessariamente estar pronto, mas a parte pronta deve ser separada da versão incompleta(esta deve estar desabilitada).

### Feature Flags

- Conjunto de variáveis booleanas que habilita/desabilita funcionalidades;
- #### Release Canário
	- Release solta(beta version) para um grupo pequeno de usuários.
	- Prejuízos minimizados.
- #### Testes A/B
	- Liberar duas versões ao mesmo tempo com o objetivo de verificar qual delas foi melhor.