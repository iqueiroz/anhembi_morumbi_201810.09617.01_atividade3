public class Vendedor extends Funcionario
{
    private double _comissao;

    public Vendedor(String registro, String nome, double salarioBruto, double comissao)
    {
        super(registro, nome, salarioBruto);
        this.setComissao(comissao);
    }

    public double getComissao()
    {
        return this._comissao;
    }

    private void setComissao(double comissao)
    {
        this._comissao = comissao;
    }

    private static final double PERCENTUAL_DESCONTO = 0.1; //10%

    public double calcularSalarioLiquido()
    {
        double salarioBruto = this.getSalarioBruto();
        double comissao = this.getComissao();
        return (salarioBruto - (salarioBruto * PERCENTUAL_DESCONTO)) + comissao;
    }

    
}