package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by codecadet on 14/11/16.
 */
public class CalculatorUI {

    private final int BUTTON_SIZE = 50;
    private EventHandler<ActionEvent> handler;

    public void setHandler(Controller controller) {

    }


    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));



        Scene scene = new Scene(pane, 600, 600);


        Label display = new Label();
        display.setId("display");
        display.setText("0");
        display.setAlignment(Pos.CENTER);
        display.setPrefSize(BUTTON_SIZE * 4, BUTTON_SIZE * 2);
        pane.add(display, 0, 0, 4, 1);

        String[][] matrix = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"AC", "0", "DEL", "+"}
        };

        Button[][] buttons = new Button[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                Button button = new Button();
                button.setText(matrix[i][j]);
                button.setOnAction(handler);
                button.setPrefSize(BUTTON_SIZE, BUTTON_SIZE);

                pane.add(button, j, i + 1);

                button.setId(matrix[i][j]);

                buttons[i][j] = button;

            }

        }


        primaryStage.setTitle("Basic Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public void addNumber(String id) {
        
    }
}
