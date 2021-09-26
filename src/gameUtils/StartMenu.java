package gameUtils;

import dominion.Controller;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class StartMenu extends GridPane {
    Controller controller;
    private Button newGameButton;
    private Button exitButton;

    public StartMenu(Controller controller) {
        this.controller = controller;

        //Instantiate scene elements
        newGameButton = new Button("New Game");
        exitButton = new Button("Exit");

        //Add event listeners
        newGameButton.setOnAction(event -> {

        });

        exitButton.setOnAction(event -> {

        });

        //Add elements to containers
        this.add(newGameButton, 0, 0);
        this.add(exitButton, 0, 1);

        //Style elements
        this.setVgap(40);
        this.setPrefSize(800, 700);
        this.setAlignment(Pos.CENTER);
        newGameButton.setPrefSize(150, 75);
        newGameButton.setAlignment(Pos.CENTER);
        exitButton.setPrefSize(150, 75);
        exitButton.setAlignment(Pos.CENTER);
    }//constructor
}//StartMenu
