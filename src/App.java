public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Projetos e projetos");

        final String br = "Brasil";
        int ano = 1992;

        String resultado =  br + Integer.toString(ano);

        System.out.println(resultado);
        System.out.println(nomeCompleto("Alexandre", "Nazareth"));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){

        primeiroNome = primeiroNome.toUpperCase();
        segundoNome = segundoNome.toUpperCase();

        String nome = primeiroNome + " " + segundoNome; 

        return nome;
    }
}
