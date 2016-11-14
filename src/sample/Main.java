package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Controller controller = new Controller();
        CalculatorBrain brain = new CalculatorBrain();
        CalculatorUI ui = new CalculatorUI();

        controller.setBrain(brain);
        controller.setUi(ui);
        ui.setHandler(controller);

        ui.start(primaryStage);

    }
}


