# Multirepos x Monorepos

## Monorepos
- Diversos projetos dentro de um único repositório.

## Multirepos
- Um repositório por projeto (como os de cada disciplina).

---

# GIT — Comandos e Explicações

## `git init`
Inicializa um repositório vazio. Após isso, normalmente é necessário usar  
`git remote add <apelido> <URL>` para conectar ao repositório remoto.

## `git remote add <apelido> <URL>`
Conecta o repositório local a um repositório remoto.

## `git clone <URL>`
Clona um repositório remoto para o local. Não é necessário usar `git remote add`.  
Se já existir uma pasta com o mesmo nome, dará erro.

## `git add <arquivo>`
Move o arquivo do diretório de trabalho para a área de *stage*, preparando para o commit.

## `git commit -m "Mensagem"`
Cria um commit com uma mensagem curta.

## `git commit`
Abre um editor para escrever uma mensagem mais detalhada.  
**Dica:** evite commits muito grandes — prefira vários commits pequenos.

## `git push`
Envia os commits do repositório local para o remoto.

## `git pull`
Atualiza o repositório local com alterações do remoto ou mescla branchs.

## `git merge <branch>`
Mescla os commits de uma branch em outra.

## `git status`
Mostra quais arquivos foram modificados e o estado da área de *stage*.

## `git diff <arquivo>`
Mostra as mudanças realizadas no arquivo.

## `git checkout -b <nome-da-branch>`
Cria e muda para uma nova branch.  
Se quiser apenas mudar para uma branch existente, use `git checkout <nome>`.

## `git branch`
Lista todas as branchs e indica a atual.

## Branchs
São ramificações do repositório, usadas para novas funcionalidades ou correções.  
Evitam problemas de *merge* no desenvolvimento colaborativo.

## Fork
Cópia de um repositório (geralmente open source) na sua conta.  
Permite fazer alterações e enviar *pull requests* para sugerir melhorias.

## `.gitignore`
Arquivo que lista itens que o Git deve ignorar, como arquivos específicos de IDE.
