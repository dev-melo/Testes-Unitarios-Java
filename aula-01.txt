O que são testes unitários

um teste unitario é um pequeno metodo que voce escreve para testar alguma parte do seu codigo.

--junit tests

testes com parametros validos, e tbm invalidos

o test precisa reproduzir o resultado esperado.

- O QUE O TESTE FAZ É CHAMAR O METODO E TESTA-LO E VALIDAR O RESULTADO -

Apenas uma funcionalidade especifica. 

\\ JUnit 5
aplicação pode ter muitas classes e cada classe varios testes para ter uma maior cobertura
mais de um teste por metodo

verde = PASSOU 
vermelho = NÃO PASSOU 

SimpleMath, tem o metodo sum que recebe 2 var Double, soma e retorna o resultado. 


\\ Given ou Arrange é nessa seção que cria a instancia da classe. 
	SimpleMath math = new SimpleMath();

\\ When ou Act é onde invocamos o metodo para testar
	Double actual = math.sum(6.2D, 2D);
\\ Then ou Assert é onde uso metodo do junit para verificar se o resultado esta correto, ex assertEquals.

assertEquals('resultado esperado', 'resultado atual do metodo', 'opcionaol=mensagem de erro caso o teste falhe () -> '

	assertEquals(8.2D, actual, () - > "6.2 + 2 did not produce 8.2");

Os metodos podem precisar de objetos para realizar os tests, esses obj podem ser mockados dando o retorno necessario para avançar no teste.




