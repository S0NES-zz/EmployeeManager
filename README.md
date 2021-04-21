# Spring Boot challenge

Essa é uma aplicação feita usando spring boot no padrão MVC (model view control)

## Índice
- ⚙️ [Tecnologias](#-tecnologias)
- 💻 [Instruções back end](#-Instruções-para-o-back-end)
- 🎨 [Instruções front end](#-Instruções-para-o-back-end)
## ⚙️ Tecnologias 

- **Back end**
    - [Spring Boot](https://spring.io/projects/spring-boot)
    - [MySQL](https://www.mysql.com/)
    - [Maven](https://maven.apache.org/)
    - [Java](https://www.java.com/pt-BR/)
    
- **Front end**
    - [Angular](https://angular.io/)
    - [Typescript](https://www.typescriptlang.org/)
    - [Yarn](https://yarnpkg.com/)
    
    
## 💻 Instruções para o back end

Começaremos criando as instâncias dos nossos bancos de dados. Para esse projeto, é necessario ter um MySQL server instalado na sua maquina. com ele instalado vai na no aplication propeties o caminho está em 
`employeerm-api\src\main\resources\application.properties`
com isso vc muda a porta na qual está utilizando, e a senha/username se precisar.

```
    spring.datasource.url= jdbc:mysql://localhost:3307/employeemanager
    spring.datasource.username= root
    spring.datasource.password= 123456
```
assim que mudar esse arquivo, crie um banco de dados chamado employeemanager com 
```
    create database employeemanager
```
depois disso rode o projeto no cmd com o comando
```
  mvn spring-boot:run #para o comando funcionar é importante navegar para dentro da pasta onde foi inserido o arquivo
```
logo depois é so rodar em um Insomnia ou Postman os HTTP requests para o caminho 
```localhost:8080/```.
=======
Para rodar o sistema é necessario possuir o JAVA na versão 11, Maven e MySQL server instalado na maquina.

### Buildar o projeto
   
```
mvn package 
```

### Banco de dados

Foi usado o MySQL como o nosso banco de dados então para rodar o projeto é necessario rodar o comando
```
create database employeemanager
```
depois disso coloque suas configurações do my sql no application.propperties

### Rodar a aplicação
para rodar a apliação é so dar o comando abaixo a porta definida é ```localhost:8080/```.
```
mvn spring-boot:run
```
use os métodos abaixo para testar a api

| METHOD | URI | RETURN | DESCRIPTION | 
| ------ | ------ | ------| ----- |
| GET | [employee/all] | List<Employee> | Return all employee
| GET | [employee/find/{id}] | Employee| Return the Id Employee.
| POST | [employee/add] | return 201 .CREATED| to adda a new Employee.
| PUT | [employee/update] | return 200 .OK| to update a Employee
| DELETE | [employee/delete/{id}] | return 200 .OK | To delete a Employee.

## 🎨 Instruções front end

Após executar o back e garantir que o mesmo esteja funcionando. rode os seguintes comandos:


  ```bash
    # Baixar as dependências
    yarn

    # Inicializar a aplicação
    yarn start
  ```
### Servidor de desenvolvimento
 ```ng serve```
### Buildar o projeto
 ```ng build```