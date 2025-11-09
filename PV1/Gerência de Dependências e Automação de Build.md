
## Maven

- Automatiza build e gerencia dependências
- Funciona a partir de XML
- Toda configuração do Maven é feita a partir de um arquivo específico chamado pom.xml (Project Object )
- Características: 
- groupID : identificação da empresa ou grupo de projetos;
- artifactID: identificação do projeto;
- version: versão do projeto
- groupID + artifactID - identificação geral do projeto;

![[Pasted image 20250805220921.png]]
Automaticamente o gson é baixado pelo Maven e deixa desnecessária o download manual da dependência.

## Build

- Empacotamento(garantia de funcionalidade) das dependências e do software
- Resultado final do empacotamento de um software - arquivos das linguagens, ex.: jar (java archive - pacote com as depêndencias utilizadas pelo usuário)
- *Automatização* - Ferramentas (Java - *Maven*, JavaScript - *nodeJS e NPM*, Kotlin - *Gradle*)
- Utilizando o *mvn package* ou *mvn clean install (empacota e baixa as dependências)*, o empacotamento é feito.


