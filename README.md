# cashbackRESTServer
Projeto do servidor REST

Infelizmente, o servidor não pôde ser instanciado com sucesso, devido ao trabalho de testes que eu estava desenvolvendo na camada de persistência. :-)

A estratégia de desenvolvimento deste componente seria:

1 - Utilizar o Spark como framework, para simplificar o processo de receber as chamadas.

2 - Criar um controller que:

2.1 - Utilizasse as bibliotecas cashbackDomain, mongolitico e spotifier para concluir o trabalho, da seguinte forma:
a) Criar uma chamada para popular e outra para destruir o banco com as infos do spotify.
b) Implementar as chamadas pedidas pelo desafio

3 - Uma vez que o servidor estivesse pronto, bastaria colocar várias instâncias dele no ar e um load ballance pra torná-lo tolerante a falhas. Mas não consegui fazer a tempo, porque estava ocupado com a deliciosa parte de criar os componentes e as chamadas pro MongoDB (risos)
