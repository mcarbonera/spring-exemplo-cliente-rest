Exemplo de Cliente Rest usando RestTemplate (Spring Boot)

Apesar de simples, a intenção deste projeto é documentar meus progressos,
além de servir de referência para uma mente esquecida.

na camada controller, há um endpoint em "localhost:8080/endPoint" que aceita
chamadas GET, podendo possuir 3 paramêtros (param1, param2, param3) no
cabeçalho da chamada http. 

No endpoint "localhost:8080/solicitacao", a mesma consulta é disponibilizada. 
Porém, o service responsável por atender esta solicitação atua como cliente
do endpoint "/endPoint". 

As chamadas tem o formato: http://localhost:8080/solicitacao?param1=abc&param2=bcd&param3=cde
e retornam um json da forma: 

	{
		"param1": "abc1",
		"param2": "bcd2",
		"param3": "cde3"
	}
