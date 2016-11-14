package sample;

import javafx.application.Application;
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

    public void setHandler(Controller controller) {

    }


    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));


        Scene scene = new Scene(pane);

        Label display = new Label();
        pane.add(display, 0, 0, 4, 2);

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
                button.setPrefSize(50, 50);
                pane.add(button, j, i);
                buttons[i][j] = button;
            }

        }


        primaryStage.setTitle("Basic Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
