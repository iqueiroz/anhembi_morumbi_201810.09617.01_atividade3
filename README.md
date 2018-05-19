# Atividade
A loja PrecoBom deseja gerenciar a folha de pagamento de seus funcionarios. Sobre o Funcionario será necessário armazenar: registro, nome e salarioBruto. Sabe-se que na loja há um tipo de Funcionario denominado Vendedor que é identificado pelos mesmos dados do Funcionario acrescido da comissão que o mesmo recebe em relação às vendas realizadas. Com base na descrição apresentada responda apenas o que é solicitado nos itens a seguir.

a) Que tipo de relacionamento deve ser usado para implementar as classes Funcionario e Vendedor? Qual palavra reservada é utilizada para implementar este relacionamento?

b) Escreva o código do construtor da classe Vendedor. Este construtor deve receber um parâmetro para cada atributo da classe Vendedor.

c) Escreva o código do método calcularSalarioLiquido() da classe Vendedor. Para este cálculo deve ser considerado um desconto de 10% do salarioBruto e uma comissão que corresponde a um valor em reais. Este método deve retornar o valor do salário líquido.

d) Para responder os itens d.1 e d.2, considere a existência de uma classe para gerenciar os funcionários da Loja, denominada GerenciaFuncionarios. Esta classe tem o seguinte atributo: ArrayList <Funcionario> listaFuncionarios = new ArrayList().

d.1) Escreva o código do método adicionarFuncionario() responsável por adicionar um objeto Funcionario na lista. No objeto listaFuncionarios é possível inserir objetos Funcionario e Vendedor? Justifique sua resposta.

d.2) Escreva o código para o método imprimirTodos(). Este método deve exibir o nome e o salário líquido de todos os funcionários cadastrados no ArrayList, em um comando de impressão. A validação para nenhum Funcionário cadastrado também deve ser contemplada.

e) Para responder os itens e.1 e e.2, considere a existência da classe AppGerenciaFuncionarios que contenha o método main e seja implementado um menu com 4 opções (1-Cadastrar Funcionario, 2-Cadastrar Vendedor, 3-ImprimirTodos, 4- Sair).

e.1) Escreva o código correspondente à opção 2 do menu.

e.2) Escreva o código correspondente à opção 3 do menu.



# Compilando e executando
A atividade foi desenvolvida utilizando o Java SE Development Kit 8. O SDK precisa estar instalado e o caminho do SDK precisa estar configurado no PATH das variáveis de ambiente.

## Command line
A partir do diretório `src/main/java`, compile o projeto:
```
$ javac *.java
```

Execute:
```
$ java MAppGerenciaFuncionarios
```