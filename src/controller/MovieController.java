package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class MovieController {

    @FXML
    private CheckBox allBox = new CheckBox();
    @FXML
    private CheckBox GBox = new CheckBox();
    @FXML
    private CheckBox PGBox = new CheckBox();
    @FXML
    private CheckBox PG13Box = new CheckBox();
    @FXML
    private CheckBox RBox = new CheckBox();
    @FXML
    private CheckBox NC17Box = new CheckBox();



    @FXML
    private void handleAllBox(ActionEvent a) {

        if (allBox.isSelected())
            GBox.setSelected(true);
            PGBox.setSelected(true);
            PG13Box.setSelected(true);
            RBox.setSelected(true);
            NC17Box.setSelected(true);
    }
}
