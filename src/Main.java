import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Champion firstChampion, secondChampion;
        String name;
        int life, attack, armor;

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Vida inicial: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();

        firstChampion = new Champion(name, life, attack, armor);

        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Vida inicial: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        secondChampion = new Champion(name, life, attack, armor);

        System.out.print("Quantos turnos você deseja executar? ");
        int initTurn = sc.nextInt();
        int turn = 0;

        while (turn < initTurn && firstChampion.getLife() != 0 && secondChampion.getLife() != 0) {
            turn++;
            firstChampion.takeDamage(secondChampion);
            secondChampion.takeDamage(firstChampion);
            System.out.println("\nResultado do turno " + turn + ":");
            System.out.println(firstChampion.status());
            System.out.println(secondChampion.status());
        }
        System.out.println("\nFIM DO COMBATE");

        sc.close();
    }
}
