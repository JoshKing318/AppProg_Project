package mainPage;

import java.awt.Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import jdk.internal.org.objectweb.asm.Handle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);		
	}
    Stage window;
	Scene scene, sfScene;
    BorderPane borderPane;
    Menu mainMenu;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
    	primaryStage.setTitle("Flight Reservation");

        // File Menu
        mainMenu = new Menu("_Main Menu");

        // File Menu Items
        MenuItem searchFlight = new MenuItem("Search Flights");
        searchFlight.setOnAction(e -> {
            System.out.println("Searching For Flights...");
        });
        MenuItem manageFlight = new MenuItem("Manage Flights");
        manageFlight.setOnAction(e -> {
            System.out.println("Add, Update, Delete Flights");
        });
        
        MenuItem flightHistory = new MenuItem("Flight History");
        manageFlight.setOnAction(e -> window.setScene(sfScene)
        //{System.out.println("Here are your previous Flights");}
        );
        
        MenuItem logout = new MenuItem("Log In/Out");
        logout.setOnAction(e -> Page1.display("Log In"));
        /*manageFlight.setOnAction(new EventHandler<ActionEvent>() {
		};
        
    	);*/
        
        mainMenu.getItems().add(searchFlight);
        mainMenu.getItems().add(manageFlight);
        mainMenu.getItems().add(flightHistory);
        mainMenu.getItems().add(new MenuItem("Settings..."));
        mainMenu.getItems().add(new SeparatorMenuItem());
        mainMenu.getItems().add(logout);

        // Help Menu
        Menu helpMenu = new Menu("_Help");

        MenuItem contactUs = new MenuItem("Contact Us");
        manageFlight.setOnAction(e -> {
            System.out.println("Here is our email address");
        });
        helpMenu.getItems().add(contactUs);

        // Menu Bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(mainMenu, helpMenu);
        
        //Scene2 For Searching Flights
        sfScene = new Scene(borderPane, 400, 300);
        borderPane.setTop(menuBar);
        Label sfLabel = new Label("Here are the available flights");
        VBox sfLayout = new VBox(20);
        sfLayout.getChildren().add(sfLabel);
        
        // Layout and Stage
        borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        scene = new Scene(borderPane, 400,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}