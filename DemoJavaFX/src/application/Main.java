package application;


import java.io.IOException;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

	private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );


	@Override
	public void start( Stage primaryStage ) {

		try {
			
			Parent root = FXMLLoader.load( getClass().getClassLoader().getResource( "resources/screen.fxml" ) );
			
			primaryStage.setTitle( "JavaFX simple example" );
			primaryStage.setResizable( false );
			
			primaryStage.setScene( new Scene( root ) );
			
			primaryStage.show();
		}
		catch ( IOException ioException ) {

			LOGGER.severe( "I cannot load the application form" + ioException );
		}
	}


	public static void main( String[] args ) {

		launch( args );
	}
}
