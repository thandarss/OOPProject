package Controller;

import Controller.Draft;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main {

//    public static Draft dr;
//    public static SceneManager sceneManager;
//    public static Pane mainBodyPane;
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/MainStage.fxml"));
//        sceneManager = new SceneManager();
//
//        Parent root = fxmlLoader.load();
//
//        primaryStage.setTitle("Hello World");
//        Scene mainScene = new Scene(root, 1368, 700);
//
//        mainBodyPane = (Pane) mainScene.lookup("#mainBody");
////        mb.getChildren().add(new Button("haha"));
//
//
//        mainBodyPane.getChildren().add(sceneManager.getDashboardNode());
//
//        primaryStage.setScene(mainScene);
//        primaryStage.setMaximized(true);
//        primaryStage.show();
//
//
//
//
//    }

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                Application.launch(App.class);
            }
        }.start();
    }

}
