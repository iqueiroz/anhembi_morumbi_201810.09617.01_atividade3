import java.util.ArrayList;
import java.io.PrintStream;

public class GerenciaFuncionarios
{
    private ArrayList<Funcionario> listaFuncionarios;

    public GerenciaFuncionarios()
    {
        listaFuncionarios = new ArrayList();
    }

    private ArrayList<Funcionario> getListaFuncionarios()
    {
        return this.listaFuncionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario)
    {
        this.listaFuncionarios.add(funcionario);
    }

    public void imprimirTodos(PrintStream stream)
    {
        ArrayList<Funcionario> lista = getListaFuncionarios();

        if(lista.isEmpty())
        {
            stream.println("Nenhum funcionário cadastrado");
            return;
        }
        String lineSeparator = "===========================================================";    
        stream.println("Funcionários cadastrados:");
        stream.println(lineSeparator);
        stream.format("|%-38s|%18s|%n", "Nome", "Salario liquido");
        stream.println(lineSeparator);

        for (Funcionario funcionario : lista)
        {
            stream.format("|%-38s|%18.2f|%n",  funcionario.getNome(), funcionario.calcularSalarioLiquido());
        }
        stream.println(lineSeparator);

    }
}