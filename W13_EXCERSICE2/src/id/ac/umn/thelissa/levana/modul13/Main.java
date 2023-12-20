package id.ac.umn.thelissa.levana.modul13;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Knight", 200, 15, 30));
        players.add(new Player("Archer", 50, 18, 40));
        players.add(new Player("Barbarian", 300, 23, 50));
        players.add(new Player("Ninja", 400, 17, 40));

        BigBoss boss = new BigBoss();
        BattleLog report = new BattleLog();
        boss.registerBattleLog(report);

        while(true){
            System.out.println("Welcome to RPG Game");
            System.out.println("1. Add Player");
            System.out.println("2. Attack Boss");
            System.out.println("3. Exit");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama     : ");
                    String nama = input.nextLine();
                    System.out.print("Hitpoint : ");
                    int hitpoint = input.nextInt();
                    input.nextLine();
                    System.out.print("Damage   : ");
                    int damage = input.nextInt();
                    input.nextLine();
                    System.out.print("Energy   : ");
                    int energy = input.nextInt();
                    input.nextLine();
                    players.add(new Player(nama, hitpoint, damage, energy));
                    break;
                case 2:
                    System.out.println("Choose your Character :");
                    for (int i = 0; i < players.size(); i++) {
                        System.out.println((i + 1) + ". " + players.get(i).getName());
                        System.out.println("Hitpoint : " + players.get(i).getHitPoint());
                        System.out.println("Damage   : " + players.get(i).getDamage());
                        System.out.println("Energy   : " + players.get(i).getEnergy());
                        System.out.println("------------------------------------");
                    }
        
                    System.out.print("Pilih nomor Character : ");
                    int playerNumber = input.nextInt();
        
                    if (playerNumber >= 1 && playerNumber <= players.size()) {
                        Player attackingPlayer = players.get(playerNumber - 1);
                        boss.onDamageApplied(attackingPlayer);
                    } else {
                    System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for playing");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}