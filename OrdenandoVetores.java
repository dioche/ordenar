
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

public class OrdenandoVetores {

    public static void main(String args[]) {
        //Criando a lista encadeada 
        List<Integer> numeros = new ArrayList<Integer>();

        //Adicionando numeros para a lista
        for (int i = 0; i < 10000; i++) {
            numeros.add(i);
        }

        //Embaralhando a Lista utilizando método da API java Collections  
        Collections.shuffle(numeros);

//        System.out.println(" --------------------");
//        System.out.println("|Numeros Desordenados|");
//        System.out.println(" --------------------");

        //Imprimindo a lista utilizando o método forEach que contempla a classe List 
//        numeros.forEach(System.out::println);

        //transformando a lista em um arr11ay para simplificar o sort
        int[] arrayNumeros = new int[numeros.size()];
        int i = 0;
        for (Integer e : numeros) {
            arrayNumeros[i++] = e;
        }
        int opcao;
//        do{
//        System.out.println(" \nEscolha o método: \n\n 1-Selection sort \n 2-Bubble Sort \n 0-Para sair do sistema");;;
       

       

//        Scanner entrada = new Scanner(System.in);
//        opcao = entrada.nextInt();
        opcao = 2;

        
           switch (opcao) {
                case 1:
                    //Metodo da API java que arrayNumerosorna o tempo gasto para executar o trecho de código em millisegundos
                    long inicialSelection = System.currentTimeMillis();
                    //Selection Sort
                    for (int fixo = 0; fixo < 9998; fixo++) {
                        int menor = fixo;
                        
                        for (int s = menor + 1; s < 9999; s++) {
                            if (arrayNumeros[s] < arrayNumeros[menor]) {
                                menor = s;
                            }
                        }
                        if (menor != fixo) {
                            int t = arrayNumeros[fixo];
                            arrayNumeros[fixo] = arrayNumeros[menor];
                            arrayNumeros[menor] = t;
                        }
                    }   //Contagem ao finalizar o método
                    long decorridoSelection = System.currentTimeMillis() - inicialSelection;
                    //imprimindo o vetor
                    System.out.println(" ----------------------------------");
                    System.out.println("|Numeros ordenados por Selection Sort |");
                    System.out.println(" ----------------------------------");
                    int s;
                    for (s = 0; s < 9999; s++) {
                        System.out.println(arrayNumeros[s]);
                    }   System.out.println(" -------------------------------------------------------------");
                    System.out.println("|Tempo de execução do método Selection Sort:" + " " + decorridoSelection + " " + "Milisegundos   |");
                    System.out.println(" -------------------------------------------------------------");
                    break;
                case 2:
                    //Metodo da API java que arrayNumerosorna o tempo gasto para executar o trecho de código em millisegundos
                    long inicialBubble = System.currentTimeMillis();
                    //Bubble Sort
                    int aux;
                    int u;
                    for (u = 0; u < 9999; u++) {
                        for (int K = 0; K < 9998; K++) {
                            if (arrayNumeros[K] > arrayNumeros[K + 1]) {
                                aux = arrayNumeros[K];
                                arrayNumeros[K] = arrayNumeros[K + 1];
                                arrayNumeros[K + 1] = aux;
                            }
                        }
                    }
                    //Fim Bubble Sort
                    //Contagem ao finalizar o método
                    long decorridoBubble = System.currentTimeMillis() - inicialBubble;
                    //imprimindo o vetor
                    System.out.println(" ----------------------------------");
                    System.out.println("|Numeros ordenados por Bubble Sort |");
                    System.out.println(" ----------------------------------");
                    for (u = 0; u < 9999; u++) {
                        System.out.println(arrayNumeros[u]);
                    }   System.out.println(" -------------------------------------------------------------");
                    System.out.println("|Tempo de execução do método Bubble Sort:" + " " + decorridoBubble + " " + "Milisegundos   |");
                    System.out.println(" -------------------------------------------------------------");
                    break;
                
                default: System.err.println("ERRO-666; Dígito inválido. Não foi possível Sortear essa bagaça!");
                    break;
            }
//        }while(opcao != 0);
        
        System.exit(0);
    }

}

