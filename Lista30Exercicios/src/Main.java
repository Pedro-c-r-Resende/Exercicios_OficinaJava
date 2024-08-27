//Lista fácil de 30 exercícios


import java.util.Scanner;

//Sequenciais

/*
//ex1: Faça um algoritmo que leia três números inteiros e mostre a soma entre eles.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Digite o valor de A:");
        a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        c = sc.nextInt();
        System.out.println("Soma de A,B e C: "+(a+b+c));


    }
}

 */


/*
//ex2: Faça um algoritmo que leia um número inteiro e mostre o seu dobro, triplo e
//        quadruplo.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = scanner.nextInt();
        System.out.printf("Numero: %d \nDobro: %d \nTriplo: %d \nQuadruplo: %d\n",n,n*2,n*3,n*4);
    }
}
*/


/*
//ex3: Faça um algoritmo que leia um número inteiro e mostre se ele é par ou ímpar.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int n = scanner.nextInt();
        if (n%2== 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

    }
}

 */


/*
//Ex4:Faça um algoritmo que leia o peso e a altura de uma pessoa e calcule o seu
//IMC (Índice de Massa Corporal). && Ex14:Faça um algoritmo que leia a altura e o sexo de uma pessoa e mostre se ela
//está abaixo, dentro ou acima do peso
public class Main {

    public static double imcCalc(double h,double p){
        double imc = (h*h)/p;
        return imc;
    }

    public static String type(double imc){
        if(imc < 18.5){
            return "abaixo do peso";
        } else if (imc < 24.9) {
            return "peso ideal";
        }else {
           return "acima do peso";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h,p;
        char sexo;
        System.out.println("Informe seu sexo:");
        sexo = sc.next().charAt(0);
        System.out.println("Digite seu peso: ");
        p = sc.nextDouble();
        System.out.println("Digite sua altura");
        h = sc.nextDouble();
        System.out.println(sexo+type(imcCalc(h,p)));
        sc.close();



    }
}
*/

/*
//ex5:Faça um algoritmo que leia a idade de uma pessoa em anos e mostre a idade
//em dias.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age;
    System.out.println("Digite sua idade: ");
    age = scanner.nextInt();
    System.out.println("sua idade em dias é: " + age*365);

    }
}
*/

/*
//ex6:Faça um algoritmo que leia o salário de um funcionário e calcule o seu novo
//salário com um aumento de 15%.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário");
        double salario = scanner.nextDouble();
        double  newsalario = salario*1.15;
        System.out.printf("Salário informado: R$ %.2f\nSalário novo: R$ %.2f",salario,newsalario);
    }
}
*/

/*
//ex 7: Faça um algoritmo que leia um número inteiro e mostre o seu sucessor e
//antecessor.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        System.out.printf("Numero: %d \nAntecessor: %d \nSucessor: %d",n,n-1,n+1);
        scanner.close();
    }
}
 */

/*
//ex 8:Faça um algoritmo que leia o número de dias trabalhados por um funcionário e
//o valor da sua diária e calcule o seu salário.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da diária: ");
        double diaria = scanner.nextDouble();
        System.out.println("Digite o número de dias trabalhados: ");
        double dias  = scanner.nextDouble();
        System.out.println("Salário: "+dias*diaria);
        scanner.close();

    }
}

 */

/*
//Ex 9: Faça um algoritmo que leia o preço de um produto e mostre o seu valor com
//desconto de 10%.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();
        System.out.printf("preço com desconto: %.2f ",preco-preco*0.10);

    }
}

 */

/*
//ex 10: Faça um algoritmo que leia o peso de uma pessoa em quilos e converta para
//libras.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.printf("peso em libras: %.2f ",peso*2,2046);

    }
}

 */

//Seleção


/*
//ex 11:Faça um algoritmo que leia dois números inteiros e mostre o maior deles.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        if(n1>n2){
            System.out.println("O primeiro número é maior");
        } else if (n1==n2) {
            System.out.println("ambos são iguais");
        }else {
            System.out.println("O segundo número é maior");
        }


    }
}

 */

/*
//ex 12:Faça um algoritmo que leia três números inteiros e mostre o menor deles.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        int menor = numeros[0];
        for (int i = 0; i < 3; i++) {
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("O menor número é: "+menor);
        scanner.close();
    }
}

 */


/*
//ex 13:Faça um algoritmo que leia um número inteiro e mostre se ele é par ou ímpar.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        if (n%2 == 0){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é ímpar");
        }
    }
}

 */

/*
//ex 15:Faça um algoritmo que leia um número inteiro e mostre se ele é múltiplo de 3 e
//de 5 ao mesmo tempo.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        if(n%3 == 0 && n%5 == 0){
            System.out.println("Esse número é multiplo de 3 e de 5");
        }

    }
}

 */

//ex 16: Faça um algoritmo que leia dois números inteiros e mostre o resultado da
//multiplicação entre eles, se ambos forem
//positivos; ou a soma, se pelo menos um deles for negativo.
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número");
        int n2 = scanner.nextInt();
        if (n1 > 0 && n2 >0){
            System.out.println(n1*n2);
        } else if (n1 < 0 && n2 < 0) {
            System.out.println(n1+n2);
        }
    }
}
*/

//ex 17: Faça um algoritmo que leia o salário de um funcionário e calcule o seu novo
//salário com um aumento de 10% se o
//salário for menor que R$ 1000,00; ou de 5% se o salário for maior ou igual a R$
//1000,00.
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu salário");
        double salario = scanner.nextDouble();
        if(salario<1000){
            System.out.println("Novo salário: "+salario*1.1);
        } else if (salario>=1000) {
            System.out.println("Novo salário: "+salario*1.5);
        }

    }
}

 */
//ex18: Faca um algoritmo que leia um número inteiro entre 1 e 7 e mostre o dia da
//semana correspondente (1 = domingo, 2 =
//segunda-feira, etc.).
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("entrada invalida");
                break;
        }

    }
}
*/
//ex 19:Faça um algoritmo que leia três números reais e mostre-os em ordem
//crescente.
/*
    public class Main {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();


        double menor, meio, maior;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }


        System.out.println("Os números em ordem crescente são: ");
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);

    }
}


 */

//Ex20: Faça um algoritmo que leia a idade de uma pessoa e mostre a sua
//classificação, de acordo com a seguinte tabela:
//* até 9 anos: mirim
//* 10 a 13 anos: infantil
//* 14 a 17 anos: juvenil
//* maiores de 18 anos: adulto
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade >= 10 && idade <= 13) {
            System.out.println("Infantil");
        } else if (idade <= 9) {
            System.out.println("Mirim");
        }else {
            System.out.println("Idade inválida");
        }
    }
}
*/


//Repetição

//ex21:
/*
public class Main {
    public static void main(String[] args) {
        int i = 0;
        for(i=1; i<= 10; i++){
            System.out.println(i);
        }
    }
}

 */

//ex22:
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (i=0; i<=20; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}

 */

//ex23:
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (i=0; i<=20; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}

 */

//ex24:
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (i=1; i<=30; i++){
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }
}

 */

//ex25:
/*
public class Main {
    public static void main(String[] args) {
        int i = 0;
        for(i=10; i>= 1; i--){
            System.out.println(i);
        }
    }
}

 */

//ex26:
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int n = scanner.nextInt();
        for(i=1; i<= 10; i++){
            System.out.println(n*i);
        }
    }
}

 */

//ex27
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (i=1; i<=100; i++){
            if(i%3 == 0){
                System.out.println("fizz");
            }else if(i%5 == 0){
                System.out.println("buzz");
            }else if(i%3 == 0 && i%5 == 0){
                System.out.println("fizzbuzz");
            }else {
                System.out.println(i);
            }
        }
    }
}

 */

//ex28:
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int n = scanner.nextInt();
        for(i=1; i<= n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
}

 */
//ex 29:
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int contagem =0;
        int soma = 0;
        do {
            System.out.println("digite um número: ");
            n = scanner.nextInt();
            soma+= n;
            contagem++;
        }while(n !=0);
        System.out.println(soma/(contagem-1));
    }
}

 */

//ex 30:
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int maior;
        System.out.println("digite um número: ");
        n = scanner.nextInt();
        maior = n;
        System.out.println(maior);
        do {
            System.out.println("digite um número: ");
            n = scanner.nextInt();
            if (n > maior) {
                maior = n;
            }
            System.out.println(maior);
        }while(n !=0);
    }
}

 */