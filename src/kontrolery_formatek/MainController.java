package kontrolery_formatek;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane idMain;
    @FXML
    public void initialize(){
        FXMLLoader fxmLloader=new FXMLLoader(this.getClass().getResource("/wygladFormatek_w_fxml/przetwarzanieDanych.fxml"));
        Pane pane = null;
        try {
            pane = fxmLloader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        idMain.getChildren().add(pane);
    }
}
