import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float peso, altura, imc;
        String resposta;

        // ENTRADA
        System.out.println("Informe o peso e altura");
        peso = in.nextFloat();
        altura = in.nextFloat();

        // PROCESSAMENTO
        imc = peso / (altura * altura);
        System.out.println("IMC " + imc);

        // QUANDO JUNTAMOS VARIOS IF / ELSE-IF / ELSE
        // ESTAMOS ENCADEANDO TODOS OS TESTES, TORNANDO-OS DEPENTENDES DO TESTE ANTERIOR
        // SE PASSOU NO TESTE ANTERIOR, NAO SERÃO EXECUTADOS OS PROXIMOS
        if (imc < 18.5) {
            resposta = "ABAIXO DO PESO";
        } else if (imc < 25) {
            resposta = "PESO  NORMAL";
        } else if (imc < 30) {
            resposta = "SOBREPESO";
        } else {    // else nesta sequencia representa o caso default/padrao
                    // nao entrou em nenhum outro if, logo o else será executado
            resposta = "OBESIDADE";
        }

        // SAIDA
        System.out.println(resposta);
    }
}
