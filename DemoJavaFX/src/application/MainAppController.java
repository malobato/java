package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class MainAppController implements Initializable {

	@FXML
	private Button btnTest;

	@FXML
	private Label lblMessage;


	@Override
	public void initialize( URL location, ResourceBundle resources ) {

		setInititalLabelColor();
	}


	private void setInititalLabelColor() {

		lblMessage.setStyle( "-fx-background-color: #" + Color.DARKGREY.toString().substring( 2 ) );
	}


	@FXML
	private void handleBtnTestClicked( ActionEvent event ) {

		lblMessage.setText( "I've just thought a new number " + Math.random() );
	}
}
