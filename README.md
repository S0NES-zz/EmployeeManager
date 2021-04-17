# Spring Boot challenge

Essa é uma aplicação feita usando spring boot no padrão MVC (model view control)

## 💻 Instruções para o back end

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
