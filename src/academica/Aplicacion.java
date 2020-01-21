package academica;

import calcularnota.Metodos;
import persoal.Persoal;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persoal persoal = new Persoal();
        Academica academica = new Academica();
        Metodos metodos = new Metodos();

        System.out.print("Introduce o nome: ");
        academica.setNome(sc.next());
        System.out.print("Introduce o telefono: ");
        persoal.setTelefono(sc.next());
        System.out.print("Introduce o correo electrónico: ");
        persoal.setCorreo(sc.next());
        System.out.print("Introduce a nota do primeiro exame teórico: ");
        float teorico1 = sc.nextFloat();
        System.out.print("Introduce a nota do segundo exame teórico: ");
        float teorico2 = sc.nextFloat();
        System.out.print("Introduce a nota do exame práctico: ");
        float practico = sc.nextFloat();
        System.out.print("Introduce a porcentaxe de boletines entegados: ");
        float porcentEntrega = sc.nextFloat();
        float notaTeorico = metodos.calcularTeorico(teorico1, teorico2);
        float notaPractico = metodos.tantoPorCento(practico, 40.0F);
        float notaBoletins = metodos.calcularBoletins(porcentEntrega);
        academica.setNota(notaTeorico + notaPractico + notaBoletins);

        System.out.println("\n"+academica.toString()+"\n"+persoal.toString());
    }
}
