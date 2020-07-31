package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;



public class Main extends Application {

    @Override  // Predefinisanje metoda start u klasi Application
    public void start(Stage primaryStage) throws Exception{

        // Kreiranje okna treba da sasrzi teks
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));

        Text text1 = new Text(20,20, "Programing in JavaFX is Fun");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,15));
        pane.getChildren().add(text1);

        Text text2 = new Text(60,60,"Programing is Fun\n Dispaly text");
        pane.getChildren().add(text2);

        Text text3 = new Text(10,100,"JavaFX is FUN\n Dispaly Text");
        text3.setFill(Color.RED);
        text3.setUnderline(true);
        text3.setStrikethrough(true);
        pane.getChildren().add(text3);

        // kreiranje scene i njeno postavljanje na pozornicu
        Scene scene = new Scene(pane, 500,500);

        primaryStage.setTitle("SHOW Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
