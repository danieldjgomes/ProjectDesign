# Review Service

Projeto criado para desenvolvimento de um projeto de review de viagens, representa uma parcial do modelo estipulado do Review Manager presente no desenho técnico abaixo:

![Design drawio](https://github.com/danieldjgomes/ProjectDesign/blob/main/Design.drawio.png?raw=true)


## Autor

- [@danieldjgomes](https://www.github.com/danieldjgomes)


## Instalação

Para execução o projeto é necessário a execução do container Docker do ElasticSearch

```bash
docker run -p 9200:9200  -p 9300:9300 -e "discovery.type=single-node" elasticsearch:7.0.0
```

## Variáveis de Ambiente

As Variáveis para a execução do módulo já estão presentes no `application.properties`

## Rodando localmente

Com o Docker do ElasticSearch rodando localmente:

Clone o projeto

```bash
  git clone https://github.com/danieldjgomes/ReviewService
```

Entre no diretório do projeto

```bash
  cd .\ReviewService\TravelReview\
```

Instale as dependências

```bash
  mvn clean package
```


Inicie o servidor

```bash
    cd target
    java -jar Travel-Review-0.0.1-SNAPSHOT.jar
```


## Sugestoes de request para teste
curl GET http://localhost:8080/review/1?text=problemas

curl GET http://localhost:8080/review/1?text=bom
