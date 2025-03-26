public class TiposVariaveis {
    /*
   Inicio...
   Classe publica  Nome da classe
   Em seguida o código
    */
    public static void main(String[] args) {
    /*  
    Ponto de entrada onde a execução do programa começa
    */


        //***TIPOS PRIMITIVOS (armazenam valores simples)

        /// Inteiros

        //Tipo Var  Nome Var = Atribuição (Opcional)
        byte varIdade = 50;    //Quando precisa economizar memória
        short varAno = 2025;   //Para números um pouco maiores, mas ainda economizando memória
        int varCEP = 4581121;  //O mais usado para números inteiros
        long varCPF = 30832595211L;  //Para números enormes
        char varSexo = 'M';      //Armazena um único caractere (aspas simples)
        boolean varAutorizado = true; //Para representar verdadeiro (true) ou falso (false)
        
        /// Ponto flutuante (números decimais)
        
        float varPi = 3.14f;   //Quando precisa de menos precisão (até 7 casas decimais) e quer eco memória.
        double varSalario = 2598.15; //Para cálculos mais precisos (até 15 casas decimais)

        //***TIPO NÃO PRIMITIVO (referência)

        //Representa uma sequência de caracteres (ex: String Nome = "Java";)
        String varMensagem = "Olá, Java!"; //Armazena texto (aspas duplas) e valores que precisam preservar zero à esq.

        /// Exibindo os valores
        System.out.println("Tipo Byte, ex: Idade: " + varIdade);
        System.out.println("Tipo Short, ex: Ano: " + varAno);
        System.out.println("Tipo Int, ex: CEP: " + varCEP);
        System.out.println("Tipo Long, ex: CPF: " + varCPF);
        System.out.println("Tipo Float, ex: Pi: " + varPi);
        System.out.println("Tipo Double, ex: Salario: " + varSalario);
        System.out.println("Tipo Char, ex: Sexo: " + varSexo);
        System.out.println("Tipo Boolean, ex: Autorizado: " + varAutorizado);
        System.out.println("Tipo String, ex: Mensagem: " + varMensagem);
    }
}
