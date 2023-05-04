package entities;

public class Pessoa  extends CubeStock{
    private String name;
    private String cpf;
    private int number;

    public Pessoa (String name, String cpf, int number){
        this.name = name;
        this.cpf = cpf;
        this.number = number;
    }
}
