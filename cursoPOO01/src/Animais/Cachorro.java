//modelagem orientada a objetos

package Animais;

public class Cachorro extends Animal {

    // Atributos
    static int numeroDeCachorro;
    private int tamanhoDoRabo;

    // Construtor definido pelo usuário
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorro++;
    }

    // Métodos estáticos
    public static int getNumeroDeCachorro() {
        return numeroDeCachorro;
    }

    public static void setNumeroDeCachorro(int numeroDeCachorro) {
        Cachorro.numeroDeCachorro = numeroDeCachorro;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    // Outros métodos

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar() {
        System.out.println("AU AU!!");
    }
}
