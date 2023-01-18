package com.proyect.proyectosegupol;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PantallainicialController implements Initializable {
    private Stage stage;
    @FXML
    private Button urbabutton;
    @FXML
    private Button permibutton;
    @FXML
    private Button revibutton;
    @FXML
    private Button reporbutton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    public void pantallaurb(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pantallaurbanizacion.fxml"));
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Pantallaurbanizacion.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) urbabutton.getScene().getWindow();
        stage.setScene(scene);
        PantallaurbanizacionController controller= loader.getController();
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }
    @FXML
    public void pantallapermi(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pantallapermisos.fxml"));
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Pantallapermisos.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) permibutton.getScene().getWindow();
        stage.setScene(scene);
        PantallapermisosController controller= loader.getController();
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }
    @FXML
    public void pantallarevi(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pantallarevision.fxml"));
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Pantallarevision.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) revibutton.getScene().getWindow();
        stage.setScene(scene);
        PantallapermisosController controller= loader.getController();
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }
    @FXML
    public void pantallarepor(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pantallareporte.fxml"));
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Pantallareporte.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) revibutton.getScene().getWindow();
        stage.setScene(scene);
        PantallapermisosController controller= loader.getController();
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }
    public void setStage(Stage primaryStage){
        stage = primaryStage;
    }
    public void show(){
        stage.show();
    }
   /* @Override
    public void initialize(URL location, ResourceBundle resources) {
        urbanizacionButton.setOnAction(event -> {
            try {
                pantallaurb(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }*/
}






