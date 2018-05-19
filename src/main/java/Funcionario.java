public class Funcionario
{
    private String _registro;
    private String _nome;
    private double _salarioBruto;
    
    public Funcionario(String registro, String nome, double salarioBruto)
    {
        this.setRegistro(registro);
        this.setNome(nome);
        this.setSalarioBruto(salarioBruto);
    }

    public String getRegistro()
    {
        return this._registro;
    }

    private void setRegistro(String registro)
    {
        this._registro = registro;
    }

    public String getNome()
    {
        return this._nome;
    }

    private void setNome(String nome)
    {
        this._nome = nome;
    }

    public double  getSalarioBruto()
    {
        return this._salarioBruto;
    }

    private void setSalarioBruto(double salarioBruto)
    {
        this._salarioBruto = salarioBruto;
    }

    public double calcularSalarioLiquido()
    {
        return this._salarioBruto;
    }
}