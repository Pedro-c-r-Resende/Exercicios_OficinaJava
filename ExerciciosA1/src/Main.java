// Todos os exercicios da lista se encontram nesse mesmo arquivo
// (criar 1 pra cada no intellij da trabalho)

import java.util.Locale;
import java.util.Scanner;


//Ex1:
/*
public class Main {
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "Desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';
        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.23456700;

        System.out.printf("Product: %s  price: %f\n",product1,price1);
        System.out.printf("Product: %s  price: %f\n",product2,price2);
        System.out.printf("Register: %d years old, code: %d , gender %c\n",age,code,gender);
        System.out.printf("Medida (8 casas): %f\n",measure);
        System.out.printf("Medida (3 casas): %f\n",measure);

        // meu sistema esta em ingles, fiz essa parte do codigo apenas por ter sido pedido
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f",measure);

    }
}
*/


/*
//ex 2
public class Main {

    //func q faz o calculo, no exercicio n dizia que n podia usar :D
    public static double trapezio(double b,double B,double h) {
        return (b+B)*h/2;
    }





    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double b;
        double B;
        double h;
        System.out.println("Digite a base menor:");
        b = sc.nextDouble();
        System.out.println("Digite a base maior:");
        B = sc.nextDouble();
        System.out.println("Digite a altura do trapezio:");
        h = sc.nextDouble();
        System.out.println("area do trapezio:"+trapezio(b,B,h));



    }
}

 */


/*

//ex 3
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int funcionarios;
        float valPH;
        float horas;

        System.out.println("Digite o numero de funcionarios: ");
        funcionarios = sc.nextInt();
        System.out.println("Digite as horas de trabalho");
        horas = sc.nextFloat();
        System.out.println("Digite o valor recebido por hora: ");
        valPH = sc.nextFloat();

        System.out.printf("Numero de funcionarios: %d\n", funcionarios);
        System.out.printf("Salario (valor R$) %.2f\n", valPH*horas);





    }
}

 */


/*
//ex4
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        float b;
        float c;

        System.out.println("Digite o valor de A: ");
        a = scanner.nextFloat();
        System.out.println("Digite o valor de B: ");
        b = scanner.nextFloat();
        System.out.println("Digite o valor de C: ");
        c = scanner.nextFloat();
        double triang = a*c;
        double circ = c*3.14159;
        double trapz = (a+b)*c/2;
        double quadr = b*b;
        double retang = a*b;
        System.out.printf("a)%.2f\n b)%.2f\n c)%.2f\nd)%.2f\ne)%.2f",triang,circ,trapz,quadr,retang);





    }
}
*/
//ex 5
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("digite o valor de A");
        a = sc.nextInt();
        System.out.println("digite o valor de B");
        b = sc.nextInt();
        System.out.println("digite o valor de C");
        c = sc.nextInt();
        System.out.println("digite o valor de D");
        d = sc.nextInt();
        int result =(a*b)-(c*d);
        System.out.printf("Diference: %d", result);



    }
}


