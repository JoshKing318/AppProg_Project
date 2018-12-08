package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class Page1 {
	
	public static void display(String title) {
	
	Stage window = new Stage();
	window.initModality(Modality.APPLICATION_MODAL);
	window.setTitle("Log In");
	window.setMinWidth(900);
	Scene scene1, signUpPage;
	

		//Create the Grid
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(8);
		
		GridPane grid2 = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(8);
		
		signUpPage = new Scene (grid2, 300, 200);
		
		scene1 = new Scene(grid, 300, 200);
		
		//Welcome Message
		Label welcomeMessage = new Label ("Welcome to Flight Reserve!");
		GridPane.setConstraints(welcomeMessage, 0, 0);
		
		//Create Login Option
		Label usernameLogin = new Label("Username: ");
		GridPane.setConstraints(usernameLogin, 0, 2);
		
		TextField usernameInput = new TextField("");
		usernameInput.setPromptText("Username");
		GridPane.setConstraints(usernameInput, 1, 2);
		
		Label passLogin = new Label("Password: ");
		GridPane.setConstraints(passLogin, 0, 3);
		
		TextField passInput = new TextField("");
		GridPane.setConstraints(passInput, 1, 3);
		passInput.setPromptText("Password");
		
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 4);
		loginButton.setOnAction(e -> window.close());
		
		//Create Sign up Option		
		Label signUp = new Label("New User? Sign up here: ");
		GridPane.setConstraints(signUp, 0, 5);
		
		Button signUpButton = new Button("Sign Up");
		GridPane.setConstraints(signUpButton, 1, 5);
		signUpButton.setOnAction(e -> window.setScene(signUpPage));
		
		//Allow user to sign up
		//Create grid
		/*GridPane grid2 = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(8);*/
		
		//User input sign up information
		Label firstName = new Label("First Name: ");
		GridPane.setConstraints(firstName, 0, 0);
		
		TextField firstNameInput = new TextField("");
		GridPane.setConstraints(firstNameInput, 0, 1);
		
		Label lastName = new Label("Last Name: ");
		GridPane.setConstraints(lastName, 1, 0);
		
		TextField lastNameInput = new TextField("");
		GridPane.setConstraints(lastNameInput, 1, 1);
		
		Label address = new Label("Street Address: ");
		GridPane.setConstraints(address, 0, 2);
		
		TextField addressInput = new TextField("");
		GridPane.setConstraints(addressInput, 0, 3);
		
		Label zipCode = new Label("Zip: ");
		GridPane.setConstraints(zipCode, 1, 2);
		
		TextField zipCodeInput = new TextField("");
		GridPane.setConstraints(zipCodeInput, 1, 3);
		
		TextField state = new TextField("");
		GridPane.setConstraints(state, 2, 3);
		
		Label stateInput = new Label("State: ");
		GridPane.setConstraints(stateInput, 2, 2);
		
		Label newUserName = new Label("Enter a Username: ");
		GridPane.setConstraints(newUserName, 0, 4);
		
		TextField newUserNameInput = new TextField("");
		GridPane.setConstraints(newUserNameInput, 0, 5);
		
		Label newPassword = new Label("Enter a Password: ");
		GridPane.setConstraints(newPassword, 0, 6);
		
		TextField newPasswordInput = new TextField("");
		GridPane.setConstraints(newPasswordInput, 0, 7);
		
		Button allDone = new Button("All Done!");
		GridPane.setConstraints(allDone, 1, 8);
		allDone.setOnAction(e -> window.setScene(scene1));
		
		grid2.getChildren().addAll(firstName, firstNameInput, lastName, lastNameInput, address, addressInput, zipCode, zipCodeInput, state, stateInput, newUserName, newUserNameInput,
				newPassword, newPasswordInput, allDone);
		//signUpPage = new Scene (grid2, 300, 200);
		
		grid.getChildren().addAll(welcomeMessage, usernameLogin, usernameInput, passLogin, passInput, loginButton, signUp, signUpButton);
		
		window.setScene(scene1);
		window.show();

	}
	
}
