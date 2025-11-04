public class ExemploPatternMatching {
    public static void main(String[] args) {
        Object obj = "Texto de exemplo";

        // -------------------------------
        // VERSÃO ANTIGA (antes do Java 16)
        // Era necessário fazer o cast manual após o instanceof
        // -------------------------------
        if (obj instanceof String) {
            String str = (String) obj; // cast explícito
            System.out.println(str);
        }

        // -------------------------------
        // VERSÃO MODERNA (Java 16+)
        // Usa Pattern Matching no instanceof (sem cast manual)
        // -------------------------------
        if (obj instanceof String str) {
            System.out.println(str); // 'str' é reconhecida automaticamente
        }
    }
}
