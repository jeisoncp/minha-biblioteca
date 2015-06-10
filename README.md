# Minha Biblioteca

Este é um protótipo de um sistema de gerenciamento de bibliotecas pessoais. O
projeto tem fins acadêmicos e escrito em Java sobre Framework Play.

## Executando o projeto

Você pode executar facilmente o projeto através de conteiners Docker. Aqui iremos
dividir as resposabilidades em dois conteiners, um para o banco e outro para o Play,
mas seguramente você pode criar um Dockerfile ou utilizar uma imagem que contenha
ambos.

1. Execute em terminal o senguite comando, para criar o container de dados:

<sudo docker run --name data-mariadb -e MYSQL_ROOT_PASSWORD=root -d -p 3306:3306 mariadb>

TODO
