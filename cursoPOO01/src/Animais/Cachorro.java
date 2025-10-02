//modelagem orientada a objetos

package Animais;

public class Cachorro {

    // Atributos
    static int numeroDeCachorro;

    private String nome;
    private String cor;
    private String estadoDeEspirito;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    // Construtor definido pelo usuário
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
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
    public void comer() {
    }

    public void soar() {
        System.out.println("AU AU");
    }

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
}
