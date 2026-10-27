# Unidade 2 · Aula 1 — Modularidade, SOLID, Refatoração e Reuso

Projeto didático da **Unidade 2 · Aula 1 — Prof. Nataniel Paiva**, com exemplos em Java 21 e Spring Boot 3. O material mostra conceitos, sintomas práticos e alternativas antes/depois; os testes automatizados verificam os comportamentos importantes.

## Como executar

Requisitos: JDK 21 ou superior e Maven 3.9 ou superior.

```bash
mvn test
mvn spring-boot:run
```

Os exemplos são independentes entre si; a aplicação não precisa de banco de dados nem de serviços externos. As integrações externas são representadas por adaptadores didáticos.

## Roteiro

| Tema | Material |
|---|---|
| Modularidade e ocultamento de informação | [01-modularidade](docs/01-modularidade.md) |
| Acoplamento, coesão e checklist | [02-acoplamento-e-coesao](docs/02-acoplamento-e-coesao.md) |
| SRP, OCP, LSP, ISP e DIP | [03-solid](docs/03-solid.md) |
| Refatoração segura e code smells | [04-refatoracao-e-smells](docs/04-refatoracao-e-smells.md) |
| Reuso responsável e adaptadores | [05-reuso](docs/05-reuso.md) |
| Termos da aula | [Glossário](glossario.md) |
| Prática guiada | [Exercícios](exercicios/README.md) |

Cada explicação também tem um diagrama Mermaid em `diagramas/`. Os exemplos Java e seus testes ficam em `src/main/java` e `src/test/java`, organizados por assunto. Pacotes `ruim` demonstram problemas intencionais; pacotes `bom` apresentam alternativas.

## Estrutura

```text
src/main/java/br/edu/arquitetura/u2a1/
├── srp/ ocp/ lsp/ isp/ dip/ refatoracao/ reuso/
└── ArquiteturaU2A1Application.java
src/test/java/br/edu/arquitetura/u2a1/
docs/  diagramas/  exercicios/
```

> **Exemplos adicionais:** o uso de Spring, os nomes das classes e a correção de LSP usando `Forma` são escolhas didáticas complementares. Os conceitos centrais e o cenário de retângulo/quadrado vêm dos slides.
