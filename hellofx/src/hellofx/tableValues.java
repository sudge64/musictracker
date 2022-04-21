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

    public void setNotesTable(String notesTable){
        this.notesTable = notesTable;
    }

    public String getOneTable(){
        return oneTable;
    }

    public void setOneTable(String oneTable){
        this.oneTable = oneTable;
    }

    public String getTwoTable(){
        return twoTable;
    }

    public void setTwoTable(String twoTable){
        this.twoTable = twoTable;
    }

    public String getThreeTable(){
        return threeTable;
    }

    public void setThreeTable(String threeTable){
        this.threeTable = threeTable;
    }

    public String getFourTable(){
        return fourTable;
    }

    public void setFourTable(String fourTable){
        this.fourTable = fourTable;
    }

    public String getFiveTable(){
        return fiveTable;
    }

    public void setFiveTable(String fiveTable){
        this.fiveTable = fiveTable;
    }

    public String getSixTable(){
        return sixTable;
    }

    public void setSixTable(String sixTable){
        this.sixTable = sixTable;
    }

    public String getSevenTable(){
        return sevenTable;
    }

    public void setSevenTable(String sevenTable){
        this.sevenTable = sevenTable;
    }

    public String getEightTable(){
        return eightTable;
    }
    
    public void setEightTable(String eightTable){
        this.eightTable = eightTable;
    }

    public static void setItems(ObservableList<tableValues> list) {
    }
}
