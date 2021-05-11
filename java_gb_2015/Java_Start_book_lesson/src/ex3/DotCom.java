package ex3;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
//    int[] locationCells;
//    int numOfHits = 0;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }


}
