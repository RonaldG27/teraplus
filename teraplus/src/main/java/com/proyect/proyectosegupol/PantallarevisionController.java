package com.proyect.proyectosegupol;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PantallarevisionController extends Application {
    @FXML
    private Button iniciobutton;
    private PantallainicialController controllerinicial;
    private Stage stage;
    public static void main(String[] args) {
        launch(args);
    }
    @FXML
    void showinicial(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pantallainicial.fxml"));
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Pantallainicial.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) iniciobutton.getScene().getWindow();
        stage.setScene(scene);
        controllerinicial.show();
        stage.close();
    }
    @Override
    public void start(Stage primaryStage) {

    }
    public void init(Stage newstage, PantallainicialController inicialcontrol){
        this.controllerinicial=inicialcontrol;
        this.stage=newstage;
    }
}
