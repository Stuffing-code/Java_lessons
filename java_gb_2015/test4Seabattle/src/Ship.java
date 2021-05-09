import java.util.Random;

public class Ship {
    int positionStart;
    int positionEnd;
    int size;

//    public Ship(int position) {
//        this.position = position;
//    }
    void initWithRandomPositionAdnSize() {
        Random random = new Random();
        size = random.nextInt(3) + 1; // 1 - 3
        positionStart = random.nextInt(Field.SIZE - size + 1);
        positionEnd = positionStart + size;
    }

    boolean isIntersectWithAnotherShip(Ship ship) {
        // 0123456789
        // 0123    89
        //      56
        if (positionStart > ship.positionEnd + 1) {
            return false;
        }
        if (positionEnd + 1 < ship.positionStart) {
            return false;
        }
        return true;
    }
}
