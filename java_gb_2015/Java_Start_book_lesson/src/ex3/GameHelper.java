package ex3;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLenght = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) throws IOException {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IIOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLenght;
        }

        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            System.out.println("пробуем" + location);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        success = false;
                    }
                    if (x > 0 && (location % gridLenght == 0)) {
                        success = false;
                    }
                } else {
                    System.out.println("используеться" + location);
                    success = false;
                }
            }
        } // конец while

        int x = 0;
        int row = 0;
        int column = 0;
        System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLenght);
            column = coords[x] % gridLenght;
            temp = String.valueOf(alphabet.charAt(row));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(" coord" + x + " = " + alphaCells.get(x-1));
        }
        System.out.println("\n");

        return alphaCells;
    }
}
