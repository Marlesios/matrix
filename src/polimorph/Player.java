package polimorph;

import java.util.Scanner;

public class Player {

    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Makarov(),
                new ShotGun(),
                new Kalash(),
                new Arbalet()
        };


    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot >= weaponSlots.length) {
            System.out.println("Вы ввели неправильные слоты для оружия");

        } else {


            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        while (true) {
            int slot = scanner.nextInt();

            if (slot == -1) {
                break;
            } else {
                player.shotWithWeapon(slot - 1);
            }
        }


        System.out.println("Game over!");
    }
}
