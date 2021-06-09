package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label Type;
    @FXML
    private Button Enter;
    @FXML
    private TextField Login;
    @FXML
    private PasswordField Pass;

    @FXML
    public void contr(ActionEvent actionOne){
        String loginText = Login.getText();
        String loginPass = Pass.getText();
        if(loginText.equals("admin") && loginPass.equals("pass")) {
            Type.setText("hello admin!");
        } else
            { Type.setText("Ошибка авторизации!");
        }
    }
}
