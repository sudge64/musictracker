package hellofx;

import java.net.URL;
import java.util.ResourceBundle;

import org.jfugue.player.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Controller implements Initializable{

    Player player = new Player();

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button buttonBack;

    @FXML
    private Button buttonForward;

    @FXML
    private Button buttonMenu;

    @FXML
    private Button buttonPause;

    @FXML
    private Button buttonPlay;

    @FXML
    private Button buttonRecord;

    @FXML
    private Button buttonStop;

    @FXML
    private TableView<tableValues> table;

    @FXML
    private TableColumn<tableValues, String> eightTable;

    @FXML
    private TableColumn<tableValues, String> fiveTable;

    @FXML
    private TableColumn<tableValues, String> fourTable;

    @FXML
    private TableColumn<tableValues, String> notesTable;

    @FXML
    private TableColumn<tableValues, String> oneTable;

    @FXML
    private TableColumn<tableValues, String> sevenTable;

    @FXML
    private TableColumn<tableValues, String> sixTable;

    @FXML
    private TableColumn<tableValues, String> threeTable;

    @FXML
    private TableColumn<tableValues, String> twoTable;

    static int i = 0;
    static int count = 0;
    static final int SIZE = 4;

    String fillSigns(int i){
        String sign = "Null";

        if(i == 0){
            sign = "ⓧ";
        }
        else if(i == 1){
            sign =  "∿";
        }
        else if(i == 2){
            sign = "⊓";
        }
        else if(i == 3){
            sign = "^";
        }

        return sign;
    }


    String buttonLabeller(){
        String buttonString = fillSigns(count);

        count++;
        if(count >= SIZE){
            count = 0;
        }

        return buttonString;
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        
        button1.setText(buttonLabeller());
        
        //player.play("C D E F G A B Cmaj");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        
        button2.setText(buttonLabeller());
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        
        button3.setText(buttonLabeller());
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        
        button4.setText(buttonLabeller());
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        
        button5.setText(buttonLabeller());
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        
        button6.setText(buttonLabeller());
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        
        button7.setText(buttonLabeller());
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        
        button8.setText(buttonLabeller());
    }

    @FXML
    void buttonBackClicked(ActionEvent event) {

    }

    @FXML
    void buttonForwardClicked(ActionEvent event) {

    }

    @FXML
    void buttonMenuClicked(ActionEvent event) {

    }

    @FXML
    void buttonPauseClicked(ActionEvent event) {

    }

    @FXML
    void buttonPlayClicked(ActionEvent event) {

        player.play("C D E F G A B C");
    }

    @FXML
    void buttonRecordClicked(ActionEvent event) {

    }

    @FXML
    void buttonStopClicked(ActionEvent event) {

    }

    ObservableList<tableValues> list = FXCollections.observableArrayList(
        new tableValues("1", "C", "D", "E", "F", "G", "A", "B", "C"),
        new tableValues("2", "D", "E", "F", "G", "A", "B", "C", "D"),
        new tableValues("3", "E", "F", "G", "A", "B", "C", "D", "E"),
        new tableValues("4", "F", "G", "A", "B", "C", "D", "E", "F"),
        new tableValues("5", "G", "A", "B", "C", "D", "E", "F", "G"),
        new tableValues("6", "A", "B", "C", "D", "E", "F", "G", "A"),
        new tableValues("7", "B", "C", "D", "E", "F", "G", "A", "B"),
        new tableValues("8", "C", "D", "E", "F", "G", "A", "B", "C")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        notesTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("notesTable"));
        oneTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("oneTable"));
        twoTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("twoTable"));
        threeTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("threeTable"));
        fourTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("fourTable"));
        fiveTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("fiveTable"));
        sixTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("sixTable"));
        sevenTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("sevenTable"));
        eightTable.setCellValueFactory(new PropertyValueFactory<tableValues, String>("eightTable"));

        table.setItems(list);
        
    }

}

