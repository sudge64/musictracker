package hellofx;

import org.jfugue.player.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

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
    private TextField tfTitle;

    //static String[] signs;
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
        Stage mainWindow = (Stage) tfTitle.getScene().getWindow();

        String title = tfTitle.getText();
        mainWindow.setTitle(title);

        player.play("C D E F G A B C");
    }

    @FXML
    void buttonRecordClicked(ActionEvent event) {

    }

    @FXML
    void buttonStopClicked(ActionEvent event) {

    }

}
