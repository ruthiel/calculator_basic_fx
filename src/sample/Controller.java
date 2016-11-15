package sample;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Controller implements EventHandler{

    private CalculatorBrain brain;
    private CalculatorUI ui;

    public void setBrain(CalculatorBrain brain) {

    }

    public void setUi(CalculatorUI ui) {

    }

    @Override
    public void handle(Event event) {

        String id = ((Button) event.getSource()).getId();
        ui.addNumber(id);

        switch (id) {
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            case "AC":
                break;
            case "=":
                break;
        }


    }
}
