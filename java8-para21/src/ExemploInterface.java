// Declarando como interface
public interface ExemploInterface {
    // Método default pode ter implementação em interface
    default void metodoDefault() {
        System.out.println("Método default");
        auxiliarPrivado(); // chama o método privado
    }

    // Método privado só pode ser chamado dentro da interface
    private void auxiliarPrivado() {
        System.out.println("Método privado");
    }
}

// Classe que implementa a interface
class TesteInterface implements ExemploInterface {
    public static void main(String[] args) {
        var obj = new TesteInterface();
        obj.metodoDefault(); // chama o método default da interface
    }
}
