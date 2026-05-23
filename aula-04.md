# Testando Código em Isolamento

- o teste nao deve invocar outra dependencia alem do metodo em teste ou undertest.

### Em uma classe pode existir dois metodos. 
- no teste é preciso isolar para que o teste seja feito apenas para aquele metodo, não dependendo de outros metodos e assim não dando erro por conta deles. 
- pode injetar obj mockados para isolar o teste

