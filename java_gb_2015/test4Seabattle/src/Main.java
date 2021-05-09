public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship();

        field.init();
        field.setShips();

        System.out.println("Начало игры!");
        do {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        } while(field.isNotGameOver());
    }
    }
