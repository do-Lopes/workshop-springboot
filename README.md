# Workshop-springboot
Projeto de back-end desenvolvido durante o curso de **Java COMPLETO Programação Orientada a Objetos**, feito na plataforma [Udemy](https://www.udemy.com/).
O programa consiste em um sistema de loja onde produtos e usuários podem ser cadastrados sistema e, depois, podem ser acessados por meio do banco de dados que suas informações estão guaradadas.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Implantação em produção
- Banco de dados: H2

## Pré-requisitos do back-end
Java 17

```bash
# clonar repositório
git clone https://github.com/do-Lopes/workshop-springboot

# entrar na no arquivo main e executar
src/main/java/com/shopservice/course/ShopProjectApplication.java
```
## Como acessar o banco de dados
Após o sistema ja estiver sendo executado acesse o endereço **http://localhost:8080/h2-console**.

![DB incialização](https://github.com/do-Lopes/assets/blob/main/Springboot-workshop-assets/image-inicializacao-db.png)

```bash
# Altere o valor do campo JDBC URL
jdbc:h2:mem:testdb

# Insira o valor no campo User Name
sa
```
