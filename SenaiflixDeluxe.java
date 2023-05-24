import java.util.Scanner;

public class SenaiflixDeluxe {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean continuar = true;

            do {
                System.out.println("====================INSTRUÇÕES=====================\n");
                System.out.println("Bem Vindo ao SENAIFLix\n");
                System.out.println(

                        "Um Serviço de streaming por assinatura que permite assistir a séries e filmes em um aparelho "
                                +
                                "conectado à internet. \nDependendo do seu plano, você também pode baixar seus títulos "
                                + "favoritos em aparelhos iOS, Android ou Windows 10 para assistir quando não tiver internet.\n");

                                System.out.println("============================================");

                System.out.println("Digite 1 Para Suspense");
                System.out.println("Digite 2 Para Terror");
                System.out.println("Digite 3 Para Ficção Científica");
                System.out.println("Digite 4 Para Series");
                System.out.println("Digite 5 Para Encerrar o Programa");
                int op = sc.nextInt();

                if (op == 5) {
                    continuar = false;
                    System.out.println("Programa encerrado");

                } else if (op == 1) {
                    System.out.println("Você Escolheu Suspense!!\nAqui os filmes cadastrados no site:\n");
                    System.out.println(
                            "Se quiser escolher um desses filmes, escreva o número dele. Senão, digite 5 e reinicie o programa.\n");
                    System.out.println("1- Efeito borboleta");
                    System.out.println("2- Pearl");
                    System.out.println("3- A queda");
                    System.out.println("4- Cadastrar novo filme");
                    System.out.println("5- Volta pro Menu hahahaha ");


                    int escolhaFilme = sc.nextInt();
                    String filmeEscolhido = "";

                    if (escolhaFilme == 1) {
                        filmeEscolhido = "Efeito borboleta";
                    } else if (escolhaFilme == 2) {
                        filmeEscolhido = "Pearl";
                    } else if (escolhaFilme == 3) {
                        filmeEscolhido = "A queda";
                    } else if (escolhaFilme == 4) {

                    System.out.print("Digite o nome do novo filme: ");
                    sc.nextLine(); // Consumir a quebra de linha pendente
                    filmeEscolhido = sc.nextLine();
                    System.out.println("Deseja adicionar um novo filme? Digite 1 para sim ou 2 para não");
                    int cad = sc.nextInt();
                    if (cad == 1) {
                    System.out.print("Digite o nome do novo filme: ");
                    sc.nextLine(); // Consumir a quebra de linha pendente
                    filmeEscolhido = sc.nextLine();
                    System.out.println("NUMERO DE FILMES EXCEDIDOS!!!\n");
                        }

                    } else if (escolhaFilme == 5) {
                    // Reiniciar o programa
                    continue;
                    } else {
                    System.out.println("Opção inválida");
                    continuar = true;
                    }

                    System.out.println("\nFilme escolhido: " + filmeEscolhido);

                    // Planos
                    String[] planos = { "Plano Basic", "Plano Duo", "Plano Silver", "Plano Premium" };
                    double[] valoresPlanos = { 12.0, 20.0, 26.0, 43.0 };

                    /*
                     * Exibe os planos disponíveis
                     * (i + 1) é o número do plano, começando em 1 em vez de 0, para que seja mais
                     * intuitivo para o usuário.
                     * planos[i] é o nome do plano no índice i.
                     * " - R$ " é apenas uma string que separa o nome do plano do valor do plano.
                     * valoresPlanos[i] é o valor do plano no índice i.
                     */

                    System.out.println("Planos disponíveis:");
                    for (int i = 0; i < planos.length; i++) {
                        System.out.println((i + 1) + ". " + planos[i] + " - R$ " + valoresPlanos[i]);
                    }

                    // Solicita a escolha do plano
                    System.out.print("Escolha um plano (digite o número correspondente): \n");
                    int escolhaPlano = sc.nextInt();

                    /*
                     * Verifica se a escolha é válida
                     * escolhaPlano < 1 verifica se a escolha do plano é menor do que 1.
                     * Isso significa que o usuário digitou um número menor
                     * que 1, o que não é uma escolha válida.
                     * escolhaPlano > planos.length verifica se a escolha do plano é maior do que o
                     * comprimento do array planos. Se o usuário digitar um número maior do que a
                     * quantidade de planos disponíveis, também é uma escolha inválida.
                     */

                    if (escolhaPlano < 1 || escolhaPlano > planos.length) {
                        System.out.println("Escolha inválida");
                        return;
                    }

                    /*
                     * escolhaPlano é o número escolhido pelo usuário correspondente ao plano
                     * desejado.
                     * Subtraindo 1 de escolhaPlano, obtemos o índice correto no array (já que os
                     * arrays têm índices começando em 0).
                     * planos[escolhaPlano - 1] retorna o nome do plano no índice correto.
                     * valoresPlanos[escolhaPlano - 1] retorna o valor do plano no índice correto.
                     * Arrays: podem ser listas simples e sequenciais, e também, coleções compostas,
                     * isso significa que um array pode ter uma ou várias dimensões.
                     */

                    String planoEscolhido = planos[escolhaPlano - 1];
                    double valorPlano = valoresPlanos[escolhaPlano - 1];

                    // Exibe as opções de pagamento
                    System.out.println("Opções de pagamento:");
                    System.out.println("1. PIX");
                    System.out.println("2. Transferência Bancária");
                    System.out.println("3. Cartão de Crédito");
                    System.out.println("4. Cartão de Débito\n");

                    // Solicita a escolha da forma de pagamento
                    System.out.print("Escolha uma forma de pagamento (digite o número correspondente): \n");
                    int escolhaPagamento = sc.nextInt();

                    // Calcula o valor a ser pago
                    double valorFinal = valorPlano;

                    if (escolhaPagamento == 1 || escolhaPagamento == 4) {
                        // PIX ou cartão de débito (desconto de 10%)
                        valorFinal -= valorFinal * 0.1;
                    } else if (escolhaPagamento == 3) {
                        // Cartão de crédito (acréscimo de 5%)
                        valorFinal += valorFinal * 0.05;
                    }

                    // Exibe o resultado final
                    System.out.println("\nPlano escolhido: " + planoEscolhido);
                    System.out.println("Valor a ser pago: R$ " + valorFinal);
                    System.out.println("Forma de Pagamento: " + escolhaPagamento + "º");
                    continuar = false;
                    break;
                }

                if (op == 2) {
                    if (op == 2) {
                        System.out.println("Você Escolheu Terror!!\n Aqui os filmes Cadastrados no Site\n");
                        System.out.println(
                                "Se quiser escolher um desses filmes, escreva o número dele. Senão, digite 5 e reinicie o programa.\n");
                        System.out.println("1- O exorcista do papa");
                        System.out.println("2- A ascensão");
                        System.out.println("3- A freira 2");
                        System.out.println("4- Cadastrar novo filme");
                        System.out.println("5- Voltar pro Menu");

                        int escolhaFilme = sc.nextInt();
                        String filmeEscolhido = "";

                        if (escolhaFilme == 1) {
                            filmeEscolhido = "O exorcista do papa";
                        } else if (escolhaFilme == 2) {
                            filmeEscolhido = "A ascensão";
                        } else if (escolhaFilme == 3) {
                            filmeEscolhido = " A freira 2a";
                        } else if (escolhaFilme == 4) {

                            System.out.print("Digite o nome do novo filme: ");
                            sc.nextLine(); // Consumir a quebra de linha pendente
                            filmeEscolhido = sc.nextLine();
                            System.out.println("Deseja adicionar um novo filme? Digite 1 para sim ou 2 para não");
                            int cad = sc.nextInt();
                            if (cad == 1) {
                                System.out.print("Digite o nome do novo filme: ");
                                sc.nextLine(); // Consumir a quebra de linha pendente
                                filmeEscolhido = sc.nextLine();
                                System.out.println("NUMERO DE FILMES EXCEDIDOS!!!\n");
                            }

                        } else if (escolhaFilme == 5) {
                            // Reiniciar o programa
                            continue;
                        } else {
                            System.out.println("Opção inválida");
                            continuar = true;
                        }

                        System.out.println("\nFilme escolhido: " + filmeEscolhido);

                        // Planos
                        String[] planos = { "Plano Basic", "Plano Duo", "Plano Silver", "Plano Premium" };
                        double[] valoresPlanos = { 12.0, 20.0, 26.0, 43.0 };

                        System.out.println("Planos disponíveis:");
                        for (int i = 0; i < planos.length; i++) {
                            System.out.println((i + 1) + ". " + planos[i] + " - R$ " + valoresPlanos[i]);
                        }

                        System.out.print("Escolha um plano (digite o número correspondente): \n");
                        int escolhaPlano = sc.nextInt();

                        if (escolhaPlano < 1 || escolhaPlano > planos.length) {
                            System.out.println("Escolha inválida");
                            return;
                        }

                        String planoEscolhido = planos[escolhaPlano - 1];
                        double valorPlano = valoresPlanos[escolhaPlano - 1];

                        System.out.println("Opções de pagamento:");
                        System.out.println("1. PIX");
                        System.out.println("2. Transferência Bancária");
                        System.out.println("3. Cartão de Crédito");
                        System.out.println("4. Cartão de Débito\n");

                        System.out.print("Escolha uma forma de pagamento (digite o número correspondente): \n");
                        int escolhaPagamento = sc.nextInt();

                        double valorFinal = valorPlano;

                        if (escolhaPagamento == 1 || escolhaPagamento == 4) {

                            valorFinal -= valorFinal * 0.1;
                        } else if (escolhaPagamento == 3) {

                            valorFinal += valorFinal * 0.05;
                        }

                        System.out.println("\nPlano escolhido: " + planoEscolhido);
                        System.out.println("Valor a ser pago: R$ " + valorFinal);
                        System.out.println("Forma de Pagamento: " + escolhaPagamento + "º");
                        continuar = false;
                        break;
                        } 
                        }

                    if (op == 3) {
                    if (op == 3) {
                        continuar = true;

                        System.out.println("Você Escolheu FIccção Cientifíca!!\n Aqui os filmes Cadastrados no Site\n");
                        System.out.println(
                        "Se quiser escolher um desses filmes, escreva o número dele. Senão, digite 5 e reinicie o programa.\n");
                        System.out.println("1- Spaceman");
                        System.out.println("2- Vingadores: Ultimato");
                        System.out.println("3- O Exterminador do Futuro");
                        System.out.println("4- Rua Cloverfield 10");
                        System.out.println("5- Cadastrar novo filme");
                        System.out.println("6- Volta pro Menu hahahaha ");

                        int escolhaFilme = sc.nextInt();
                        String filmeEscolhido = "";

                        if (escolhaFilme == 1) {
                            filmeEscolhido = "Spaceman";
                        } else if (escolhaFilme == 2) {
                            filmeEscolhido = "Vingadores: Ultimato";
                        } else if (escolhaFilme == 3) {
                            filmeEscolhido = "O Exterminador do Futuro";
                        } else if (escolhaFilme == 4) {
                            filmeEscolhido = "Rua Cloverfield 10";
                        } else if (escolhaFilme == 5) {

                        System.out.print("Digite o nome do novo filme: ");
                        sc.nextLine(); // Consumir a quebra de linha pendente
                        filmeEscolhido = sc.nextLine();
                        System.out.println("Deseja adicionar um novo filme? Digite 1 pra sim 2 pra não");
                        int cad = sc.nextInt();
                        if (cad == 1) {
                        System.out.print("Digite o nome do novo filme: ");
                        sc.nextLine(); // Consumir a quebra de linha pendente
                        filmeEscolhido = sc.nextLine();
                        System.out.println("Deseja adicionar um novo filme? Digite 1 pra sim 2 pra não\n");
                        int erro = sc.nextInt();
                        if (erro == 1) {
                        System.out.println("NUMERO DE FILMES EXCEDIDOS!!!\n");}}

                        } else if (escolhaFilme == 6) {
                            // Reiniciar o programa
                            continue;
                        } else {
                            System.out.println("Opção inválida");
                            continuar = true;
                        }

                        System.out.println("\nFilme escolhido: " + filmeEscolhido);

                        String[] planos = { "Plano Basic", "Plano Duo", "Plano Silver", "Plano Premium" };
                        double[] valoresPlanos = { 12.0, 20.0, 26.0, 43.0 };

                        System.out.println("Planos disponíveis:");
                        for (int i = 0; i < planos.length; i++) {
                            System.out.println((i + 1) + ". " + planos[i] + " - R$ " + valoresPlanos[i]);
                        }

                        System.out.print("Escolha um plano (digite o número correspondente): \n");
                        int escolhaPlano = sc.nextInt();

                        if (escolhaPlano < 1 || escolhaPlano > planos.length) {
                            System.out.println("Escolha inválida");
                            return;
                        }

                        String planoEscolhido = planos[escolhaPlano - 1];
                        double valorPlano = valoresPlanos[escolhaPlano - 1];

                        System.out.println("Opções de pagamento:");
                        System.out.println("1. PIX");
                        System.out.println("2. Transferência Bancária");
                        System.out.println("3. Cartão de Crédito");
                        System.out.println("4. Cartão de Débito\n");

                        System.out.print("Escolha uma forma de pagamento (digite o número correspondente): \n");
                        int escolhaPagamento = sc.nextInt();

                        double valorFinal = valorPlano;

                        if (escolhaPagamento == 1 || escolhaPagamento == 4) {

                            valorFinal -= valorFinal * 0.1;
                        } else if (escolhaPagamento == 3) {

                            valorFinal += valorFinal * 0.05;
                        }

                        System.out.println("\nPlano escolhido: " + planoEscolhido);
                        System.out.println("Valor a ser pago: R$ " + valorFinal);
                        System.out.println("Forma de Pagamento: " + escolhaPagamento + "º");
                        continuar = false;
                        break;

                    } 

                }

            if (op == 4) {
                    if (op == 4) {
                    System.out.println("Você escolheu Séries!!\nAqui estão as séries cadastradas no site:\n");
                    System.out.println("1. THE WALKING DEAD");
                    System.out.println("2. BOJACK HORSEMAN");
                    System.out.println("3. YOU (VOCÊ)");
                    System.out.println("4. AMERICAN HORROR STORY");
                    System.out.println("5. Cadastrar nova série");
                    System.out.println("6. Voltar para o menu\n");

                    int escolhaSerie = sc.nextInt();
                    String serieEscolhida = "";

                    System.out.println("=========================================");

                    if (escolhaSerie == 1) {
                        serieEscolhida = "THE WALKING DEAD";
                    } else if (escolhaSerie == 2) {
                        serieEscolhida = "BOJACK HORSEMAN";
                    } else if (escolhaSerie == 3) {
                        serieEscolhida = "YOU (VOCÊ)";
                    } else if (escolhaSerie == 4) {
                        serieEscolhida = "AMERICAN HORROR STORY";
                    } else if (escolhaSerie == 5) {
                    
                    } else if (escolhaSerie == 6) {
                        // Voltar para o menu
                        continue;
                    } else {
                        System.out.println("Opção inválida");
                        continuar = true;
                    }

                    System.out.println("\nSérie escolhida: " + serieEscolhida);
                    String[] planos = { "Plano Basic", "Plano Duo", "Plano Silver", "Plano Premium" };
                    double[] valoresPlanos = { 12.0, 20.0, 26.0, 43.0 };

                    System.out.println("Planos disponíveis:");
                    for (int i = 0; i < planos.length; i++) {
                        System.out.println((i + 1) + ". " + planos[i] + " - R$ " + valoresPlanos[i]);
                    }

                    System.out.print("Escolha um plano (digite o número correspondente): \n");
                    int escolhaPlano = sc.nextInt();

                    if (escolhaPlano < 1 || escolhaPlano > planos.length) {
                        System.out.println("Escolha inválida");
                        return;
                    }

                    String planoEscolhido = planos[escolhaPlano - 1];
                    double valorPlano = valoresPlanos[escolhaPlano - 1];

                    System.out.println("Opções de pagamento:");
                    System.out.println("1. PIX");
                    System.out.println("2. Transferência Bancária");
                    System.out.println("3. Cartão de Crédito");
                    System.out.println("4. Cartão de Débito");

                    System.out.print("Escolha uma forma de pagamento (digite o número correspondente):\n ");
                    int escolhaPagamento = sc.nextInt();

                    double valorFinal = valorPlano;

                    if (escolhaPagamento == 1 || escolhaPagamento == 4) {
                        valorFinal -= valorFinal * 0.1;
                    } else if (escolhaPagamento == 3) {
                        valorFinal += valorFinal * 0.05;
                    }

                    System.out.println("\nPlano escolhido: " + planoEscolhido);
                    System.out.println("Valor a ser pago: R$ " + valorFinal);
                    System.out.println("Forma de Pagamento: " + escolhaPagamento + "º");
                    continuar = false;
                    break;
                            }
                    }
            }while(continuar);
        }
    }
}