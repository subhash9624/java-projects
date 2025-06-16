package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class hellofx extends Application {

    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("Name:");
        TextField namefield = new TextField();

        Label phoneLabel = new Label("Phone:");
        TextField phonefield = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailfield = new TextField();

        Button submitbutton = new Button("Submit");
        Label messagelabel = new Label();

        // Action on button click
        submitbutton.setOnAction(e -> {
            String name = namefield.getText();
            String phone = phonefield.getText();
            String email = emailfield.getText();

            messagelabel.setText("Submitted: " + name + ", " + phone + ", " + email);
        });

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(nameLabel, 0, 0);
        grid.add(namefield, 1, 0);

        grid.add(phoneLabel, 0, 1);
        grid.add(phonefield, 1, 1);

        grid.add(emailLabel, 0, 2);
        grid.add(emailfield, 1, 2);

        grid.add(submitbutton, 1, 3);
        grid.add(messagelabel, 1, 4);

        Scene scene = new Scene(grid, 400, 250);
        stage.setScene(scene);
        stage.setTitle("User Form - JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
