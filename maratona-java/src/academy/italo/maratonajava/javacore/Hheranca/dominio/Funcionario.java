package academy.italo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco estático de funcionario");
    }

    {
        System.out.println("Bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu" + this.nome + "recebi o salário de "+ this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
