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
    static final int SIZE = 4;

    void fillSigns(){
        String[] signs = {"ⓧ", "∿", "⊓", "^"};
        /*signs[0] = "∿";
        signs[1] = "⊓";
        signs[2] = "^";
        signs[3] = "ⓧ";*/
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        Stage mainWindow = (Stage) button1.getScene().getWindow();

       int count = 0;

        fillSigns();

        //String buttonString = signs[count];*/
        String buttonString = "What";
        button1.setText(buttonString);
        count++;
        if(count > SIZE){
            count = 0;
        }

        player.play("C D E F G A B Cmaj");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        fillSigns();
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        
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
