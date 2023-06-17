# Utilização de Gerência e Controle de Configuração no programa SoS-Tool

## Docker para backend
Para rodar o backend com docker é necessário utilizar o comando:

docker build -t sostool .
docker run -p 8081:8081 sostool

## Docker para frontend
Para rodar o frontend no docker é necessário utilizar

docker build -t sostool-frontend .
docker run -p 4200:4200 sostool-frontend