import java.util.Scanner;

public class Cadastro_dev {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        cabecalho();
//        imprime_menu();
//        cadastro_nome();
//        cadastro_sobrenome();
        cadastro_idade();
    }

    static void cabecalho() {
        System.out.println("=============================CADASTRO DEV CAP===================================");
        System.out.println("------------Bem vindo ao cadastro de desenvolvedores da Capgemini----------------");
    }

    static void imprime_menu() {
        System.out.println("Menu");
        System.out.println(" \n 1-Cadastrar Dev \n 2-Cadastro de linguagem \n 3-Sair");
    }

    static String cadastro_nome(){
        boolean validacao = true ;
        String nome;
        do{
            System.out.print("Informe o nome Desenvolvedor:");
            nome = sc.next();
            if(nome.length() < 3){
                System.out.println("O nome cadastrado deve ter no mínimo três caracteres");
                System.out.println("Digite novamente\n");
            }else{
                validacao = false;
            }
        }while(validacao);
        return nome;
    }

    static String cadastro_sobrenome(){
        String sobrenome = "";
        boolean validacao = true;
;
        do{
            System.out.print("Informe o sobrenome do Desenvolvedor:");
            sobrenome = sc.next();
            if(sobrenome.length() < 3){
                System.out.println("O sobrenome cadastrado deve ter no mínimo três caracteres");
                System.out.println("Digite novamente \n");
            }else{
                validacao = false;
            }
        }while(validacao);

        return sobrenome;
    }
    static int cadastro_idade(){
        int idade;
        boolean validacao = true;

        do{
            System.out.print("Informe a idade do Desenvolvedor:");
            idade = sc.nextInt();
            if(idade <= 0){
                System.out.println("A idade cadastrada deve ser superior a zero");
                System.out.println("Digite novamente \n");
            }else{
                validacao = false;
            }
        }while(validacao);
        return idade;
    }

    static int senioridade(){
        System.out.println("Informe o nível de senioridade");


    }


}