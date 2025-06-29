# CRUD com Spring Boot

## Alunos
- Evelyn Victoria da Silva Santos (2920482411042)
- Gabriel Pereira Silva (2920482511034)
- Richard Felix de Souza (2920482411020)

## Utilização
### Requisitos
- [Java 17](https://www.oracle.com/java/technologies/downloads/) ou mais recente;
- [Maven](https://maven.apache.org/download.cgi);
ou
- [Visual Studio Code](https://code.visualstudio.com/download) com a extensão [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).

### Execução
- Clone o repositório:
```
git clone https://github.com/feliquisds/springboot-crud
```

- Para executar com o Maven, utilize o prompt de comando:
```
cd local/do/repositorio/springboot-crud
mvn spring-boot:run
```

- Para executar com o Visual Studio Code, abra o arquivo CrudApplication.java;
- Aguarde as dependências serem obtidas;
- Clique na opção de executar em cima da classe `main`.

## Documentação
Com o projeto em execução, é possível acessar o Swagger UI através da URL:
```
localhost:8080/swagger-ui.html
```

## Testes

<details>
<summary>Testes da entidade aluno</summary>

<br>
<details style="margin-left: 50px">
<summary>Método save() com POST</summary>

<h3>URL:</h3>

    localhost:8080/aluno/save

<h3>Body:</h3>
        
    {
        "nome": "felixxxx",
        "cpf": "2",
        "matricula": 2,
        "sobrenome": "felix",
        "dataNascimento": "2025-06-26",
        "endereco": "ruaaaaa",
        "tipoSanguineo": "b",
        "contatoResponsavel": "12345",
        "emailResponsavel": "email@email.com"
    }
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 20:48:11 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "id": 2,
        "nome": "felixxxx",
        "cpf": "2",
        "idturma": null,
        "contatoResponsavel": "12345",
        "emailResponsavel": "email@email.com",
        "tipoSanguineo": "b",
        "dataNascimento": "2025-06-25",
        "sobrenome": "felix",
        "endereco": "ruaaaaa",
        "matricula": 2
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método update() com POST</summary>

<h3>URL:</h3>

    localhost:8080/aluno/update/2

<h3>Body:</h3>
    
    {
        "nome": "ajdhfdjkas",
        "cpf": "5",
        "matricula": 3,
        "sobrenome": "askdljs",
        "dataNascimento": "2025-06-26",
        "endereco": "outra rua",
        "tipoSanguineo": "c",
        "contatoResponsavel": "67891",
        "emailResponsavel": "email2@email2.com"
    }
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:07:02 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "id": 2,
        "nome": "ajdhfdjkas",
        "cpf": "5",
        "idturma": null,
        "contatoResponsavel": "67891",
        "emailResponsavel": "email2@email2.com",
        "tipoSanguineo": "c",
        "dataNascimento": "2025-06-25",
        "sobrenome": "askdljs",
        "endereco": "outra rua",
        "matricula": 3
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método findAll() com GET</summary>

<h3>URL:</h3>

    localhost:8080/aluno/findAll
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:07:45 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    [{
        "id": 1,
        "nome": "felix",
        "cpf": "1",
        "idturma": null,
        "contatoResponsavel": "12345",
        "emailResponsavel": "email@email.com",
        "tipoSanguineo": "a",
        "dataNascimento": "2025-06-26",
        "sobrenome": "felix",
        "endereco": "rua",
        "matricula": 1
    }, {
        "id": 2,
        "nome": "ajdhfdjkas",
        "cpf": "5",
        "idturma": null,
        "contatoResponsavel": "67891",
        "emailResponsavel": "email2@email2.com",
        "tipoSanguineo": "c",
        "dataNascimento": "2025-06-25",
        "sobrenome": "askdljs",
        "endereco": "outra rua",
        "matricula": 3
    }]

</details>

<br>
<details style="margin-left: 50px">
<summary>Método find() com GET</summary>

<h3>URL:</h3>

    localhost:8080/aluno/find/1
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:09:36 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "id": 1,
        "nome": "felix",
        "cpf": "1",
        "idturma": null,
        "contatoResponsavel": "12345",
        "emailResponsavel": "email@email.com",
        "tipoSanguineo": "a",
        "dataNascimento": "2025-06-26",
        "sobrenome": "felix",
        "endereco": "rua",
        "matricula": 1
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método delete() com DELETE</summary>

<h3>URL:</h3>

    localhost:8080/aluno/delete/1
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-length: 0
    date: Sun, 29 Jun 2025 21:10:14 GMT
    keep-alive: timeout=60

</details>

</details>



<br>



<details>
<summary>Testes da entidade professor</summary>

<br>
<details style="margin-left: 50px">
<summary>Método save() com POST</summary>

<h3>URL:</h3>

    localhost:8080/professores/save

<h3>Body:</h3>
        
    {
        "email": "email@email.com",
        "nome": "rafa",
        "cpf": "2",
        "dataNascimento": "2025-06-29",
        "sobrenome": "amor",
        "disciplina": "biologia",
        "telefone": "456"
    }
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:20:31 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "id": 2,
        "email": "email@email.com",
        "nome": "rafa",
        "cpf": "2",
        "dataNascimento": "2025-06-28",
        "sobrenome": "amor",
        "disciplina": "biologia",
        "telefone": "456"
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método update() com POST</summary>

<h3>URL:</h3>

    localhost:8080/professores/update/2

<h3>Body:</h3>
    
    {
        "email": "email3@email3.com",
        "nome": "rafinha",
        "cpf": "2",
        "dataNascimento": "2025-06-29",
        "sobrenome": "amooooor",
        "disciplina": "portugues",
        "telefone": "789"
    }
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:27:31 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "id": 2,
        "email": "email3@email3.com",
        "nome": "rafinha",
        "cpf": "2",
        "dataNascimento": "2025-06-28",
        "sobrenome": "amooooor",
        "disciplina": "portugues",
        "telefone": "789"
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método findAll() com GET</summary>

<h3>URL:</h3>

    localhost:8080/professores/findAll
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:28:08 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    [{
        "id": 1,
        "email": "email@email.com",
        "nome": "chico",
        "cpf": "1",
        "dataNascimento": "2025-06-29",
        "sobrenome": "chico",
        "disciplina": "matematica",
        "telefone": "123"
    }, {
        "id": 2,
        "email": "email3@email3.com",
        "nome": "rafinha",
        "cpf": "2",
        "dataNascimento": "2025-06-28",
        "sobrenome": "amooooor",
        "disciplina": "portugues",
        "telefone": "789"
    }]

</details>

<br>
<details style="margin-left: 50px">
<summary>Método find() com GET</summary>

<h3>URL:</h3>

    localhost:8080/professores/find/1
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:28:56 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "id": 1,
        "email": "email@email.com",
        "nome": "chico",
        "cpf": "1",
        "dataNascimento": "2025-06-29",
        "sobrenome": "chico",
        "disciplina": "matematica",
        "telefone": "123"
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método delete() com DELETE</summary>

<h3>URL:</h3>

    localhost:8080/professores/delete/1
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-length: 0
    date: Sun, 29 Jun 2025 21:29:43 GMT
    keep-alive: timeout=60

</details>

</details>



<br>



<details>
<summary>Testes da entidade turma</summary>

<br>
<details style="margin-left: 50px">
<summary>Método save() com POST</summary>

<h3>URL:</h3>

    localhost:8080/turma/save

<h3>Body:</h3>
        
    {
        "nome": "2B",
        "periodo": "manha"
    }
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:33:56 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "nome": "2B",
        "periodo": "manha",
        "id": 2
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método update() com POST</summary>

<h3>URL:</h3>

    localhost:8080/turma/update/2

<h3>Body:</h3>
    
    {
        "nome": "3B",
        "periodo": "noite"
    }
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:35:18 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "nome": "3B",
        "periodo": "noite",
        "id": 2
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método findAll() com GET</summary>

<h3>URL:</h3>

    localhost:8080/turma/findAll
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:36:04 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    [{
        "nome": "1A",
        "periodo": "tarde",
        "id": 1
    }, {
        "nome": "3B",
        "periodo": "noite",
        "id": 2
    }]

</details>

<br>
<details style="margin-left: 50px">
<summary>Método find() com GET</summary>

<h3>URL:</h3>

    localhost:8080/turma/find/1
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-type: application/json
    date: Sun, 29 Jun 2025 21:36:34 GMT
    keep-alive: timeout=60
    transfer-encoding: chunked

    {
        "nome": "1A",
        "periodo": "tarde",
        "id": 1
    }

</details>

<br>
<details style="margin-left: 50px">
<summary>Método delete() com DELETE</summary>

<h3>URL:</h3>

    localhost:8080/turma/delete/1
    
<h3>Retorno:</h3>

    HTTP/1.1 200 
    connection: keep-alive
    content-length: 0
    date: Sun, 29 Jun 2025 21:37:41 GMT
    keep-alive: timeout=60

</details>

</details>