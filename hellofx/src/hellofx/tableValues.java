package hellofx;

import javafx.collections.ObservableList;

public class tableValues {
    private String notesTable;
    private String oneTable;
    private String twoTable;
    private String threeTable;
    private String fourTable;
    private String fiveTable;
    private String sixTable;
    private String sevenTable;
    private String eightTable;

    public tableValues(String notesTable, String oneTable, String twoTable, String threeTable, String fourTable, String fiveTable, String sixTable, String sevenTable, String eightTable){
        this.notesTable = notesTable;
        this.oneTable = oneTable;
        this.twoTable = twoTable;
        this.threeTable = threeTable;
        this.fourTable = fourTable;
        this.fiveTable = fiveTable;
        this.sixTable = sixTable;
        this.sevenTable = sevenTable;
        this.eightTable = eightTable;
    }

    public String getNotesTable(){
        return notesTable;
    }

    public String getOneTable(){
        return oneTable;
    }

    public String getTwoTable(){
        return twoTable;
    }

    public String getThreeTable(){
        return threeTable;
    }

    public String getFourTable(){
        return fourTable;
    }

    public String getFiveTable(){
        return fiveTable;
    }

    public String getSixTable(){
        return sixTable;
    }

    public String getSevenTable(){
        return sevenTable;
    }

    public String getEightTable(){
        return eightTable;
    }

    public static void setItems(ObservableList<tableValues> list) {
    }
}
