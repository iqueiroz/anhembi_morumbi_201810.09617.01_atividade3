import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AppGerenciaFuncionarios
{
    public static void main(String[] args)
    {
        GerenciaFuncionarios gerenciaFuncionarios = new GerenciaFuncionarios();
        boolean sair = false;
        do
        {
            mostrarMenu();
            int opcao = obterOpcao();
            switch(opcao)
            {
                case 1:
                    cadastrarFuncionario(gerenciaFuncionarios);
                    break;
                case 2:
                    cadastrarVendedor(gerenciaFuncionarios);
                    break;
                case 3:
                    imprimirTodos(gerenciaFuncionarios);
                    break;
                case 4:
                    sair = true;
                    break;
            }
        } while(!sair);
    }

    public static void mostrarMenu()
    {
        System.out.println("Selecione uma opcao:");
        System.out.println(" 1-Cadastrar Funcionario");
        System.out.println(" 2-Cadastrar Vendedor");
        System.out.println(" 3-Imprimir Todos");
        System.out.println(" 4-Sair");
        System.out.print("> ");
    }

    public static int obterOpcao()
    {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        do
        {
            String entrada = scanner.nextLine();
            try
            {
                opcao = Integer.parseInt(entrada);
                valido = opcao > 1 && opcao <= 4;
            }
            catch (NumberFormatException ex)
            {
                valido = false;
            }
            if(!valido)
            {
                System.out.println("Nao eh uma opcao valida. Digite uma opcao:");
                System.out.print("> ");
            }
        }while(opcao==0);
        return opcao;
    }

    public static void imprimirTodos(GerenciaFuncionarios gerenciaFuncionarios)
    {
        gerenciaFuncionarios.imprimirTodos(System.out);
    }

    public static void cadastrarFuncionario(GerenciaFuncionarios gerenciaFuncionarios)
    {
        Scanner scanner = new Scanner(System.in);
        String registro = obterString(scanner, "Digite o registro");
        String nome = obterString(scanner, "Digite o nome");
        Double salarioBruto = obterDouble(scanner, "Digite o salario bruto");
        Funcionario funcionario = new Funcionario(registro, nome, salarioBruto);
        gerenciaFuncionarios.adicionarFuncionario(funcionario);
    }

    public static void cadastrarVendedor(GerenciaFuncionarios gerenciaFuncionarios)
    {
        Scanner scanner = new Scanner(System.in);
        String registro = obterString(scanner, "Digite o registro");
        String nome = obterString(scanner, "Digite o nome");
        Double salarioBruto = obterDouble(scanner, "Digite o salario bruto");
        Double comissao = obterDouble(scanner, "Digite a comissao");
        Vendedor vendedor = new Vendedor(registro, nome, salarioBruto, comissao);
        gerenciaFuncionarios.adicionarFuncionario(vendedor);
    }

    private static String obterString(Scanner scanner, String rotulo)
    {
        System.out.format("%s: ", rotulo);
        String valor = scanner.nextLine();
        while(valor==null || valor.isEmpty())
        {
            System.out.format("Entrada inválida. %s: ", rotulo);
            valor = scanner.nextLine();
        }
        return valor;
    }

    private static double obterDouble(Scanner scanner, String rotulo)
    {
        System.out.format("%s: ", rotulo);
        double valor = 0;
        while(valor <= 0)
        {
            String entrada = scanner.nextLine();
            try
            {
                valor = Double.parseDouble(entrada);
            }
            catch(NumberFormatException ex)
            {
                valor = 0;
            }
            if(valor <= 0)
            {
                System.out.format("Entrada inválida. %s: ", rotulo);
            }
        }
        return valor;
    }

}