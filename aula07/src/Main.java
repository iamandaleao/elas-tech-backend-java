public class Main {
    public static void main(String[] args) {
        /*
        Características importante das Strings em Java: Imutabilidade

        Funcionalidades:
        * Concatenação de strings: Usando o operador '+' ou o `concat()`
        * Obtenção do comprimento: `length()`
        * Divisão em substrings: `split()`
        * Busca por substrings: `indexof()` e `lastIndexOf()`
        * Extração de caracteres individuais: `chatAt()`
        * Conversão entre maiúsculas e minúsculas: `toUpperCase()` e `toLowerCase()`
        * Comparação de strings: `equals()` ou `equalsIgnoreCase()`

         */
        String nomeDigitado = "Amanda Leão";
        String nomeCadastrado = "amanda leão";

        // Comparação dos nomes
        boolean nomesIguais = nomeDigitado.equals(nomeCadastrado);
        System.out.println("Os nomes são exatamentes iguais? " + nomesIguais);

        // Comparação ignorando maiusculas e minusculas
        boolean nomesIguaisIgnorandoMaiusculas = nomeDigitado.equalsIgnoreCase(nomeCadastrado);
        System.out.println("Os nomes são iguais ignorando maiúsculas? " + nomesIguaisIgnorandoMaiusculas);

        //Converter para letras maiusculas
        String nomeMaiusculo = nomeDigitado.toUpperCase();
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);


        //Converter para letra minúsculas
        String nomeMinusculo = nomeDigitado.toLowerCase();
        System.out.println("Nome em minúsculas: " + nomeMinusculo);

        //Obter o tamanho da string
        int tamanhoNome = nomeDigitado.length();
        System.out.println("O nome contém " + tamanhoNome + " caracteres");

        //Saudação Personalizada
        String saudacao = "Bem Vindo, ".concat(nomeMaiusculo).concat("!");
        System.out.println(saudacao);

        //Obter a primeira letra do nome
        char primeiraLetra = nomeDigitado.charAt(0);
        System.out.println("A primeira letra do nome é " + primeiraLetra);

        //Encontrar a posição do sobrenome Leão usando indexof
        int posicaoSobrenome = nomeDigitado.indexOf("Leão");
        if (posicaoSobrenome != -1) {
            System.out.println("O sobrenome Leão começa na posição " + posicaoSobrenome);
        }
        else {
            System.out.println("Sobrenome Leão não foi encontrado!");
        }
    }
}