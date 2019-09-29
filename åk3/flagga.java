import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class flagga extends Application implements EventHandler<ActionEvent>{
	static Button irak = new Button("irak!");
	static Button france = new Button("france!");
	static Button italien = new Button("italien!");
	static Button irland1 = new Button("irland!");
	static Stage stage;
	public static void main(String[] args) {
	
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
			
			stage = primaryStage;
			
			irak.setOnAction(this);
			france.setOnAction(this);
			italien.setOnAction(this);
			irland1.setOnAction(this);
			Group box = new Group(irak,france,italien,irland1);
			france.setTranslateX(200);
			irak.setTranslateX(100);
			italien.setTranslateX(300);
			irland1.setTranslateX(400);	
			Scene scene = new Scene(box, 600, 500);
			
			stage.setScene(scene);
			
			stage.show();
		
	}
	public static void france() {
		 
			Rectangle blue = new Rectangle();

			  blue.setTranslateX(0);
			  blue.setTranslateY(50);
		      blue.setWidth(200);
		      blue.setHeight(500);
		      blue.setFill(Color.BLUE);
		      
		  	Rectangle red = new Rectangle();


			  red.setTranslateX(400);
			  red.setTranslateY(50);
		      red.setWidth(200);
		      red.setHeight(500);
		      red.setFill(Color.RED);
		  
		     
		      
		  
		      Group flaggan = new Group(red, blue,irak,france,italien,irland1);

		     
		      Scene france = new Scene(flaggan, 600, 500);
		 
		      stage.setTitle("france"); 
		      
		      stage.setScene(france);
		      
		      stage.show();
	}

		public void irak() {
		
			Rectangle red = new Rectangle();

	  
		  red.setTranslateX(0);
		  red.setTranslateY(50);
	      red.setWidth(200);
	      red.setHeight(500);
	      red.setFill(Color.RED);
	      
	  		Rectangle black = new Rectangle();

		  black.setTranslateX(400);
		  black.setTranslateY(50);
	      black.setWidth(200);
	      black.setHeight(500);
	      black.setFill(Color.BLACK);
	  
	      	Group iraks = new Group(red, black,irak,france,italien,irland1);

		     
	      	Scene irak = new Scene(iraks, 600, 500);
	 
	      	stage.setTitle("irak"); 
	      
	      	stage.setScene(irak);
	      
	      	stage.show();
		
	}
		public static void italien() {
			Rectangle green = new Rectangle();

			  green.setTranslateX(0);
			  green.setTranslateY(50);
		      green.setWidth(200);
		      green.setHeight(500);
		      green.setFill(Color.GREEN);
		      
		  	Rectangle red = new Rectangle();


			  red.setTranslateX(400);
			  red.setTranslateY(50);
		      red.setWidth(200);
		      red.setHeight(500);
		      red.setFill(Color.RED);	  
		      Group italiens = new Group(red, green,irak,france,italien,irland1);

		     
	      	Scene italien = new Scene(italiens, 600, 500);
	 
	      	stage.setTitle("italien"); 
	      
	      	stage.setScene(italien);
	      
	      	stage.show();
		
	}public static void irland() {
		
		
		Rectangle green = new Rectangle();

		  green.setTranslateX(0);
		  green.setTranslateY(50);
	      green.setWidth(200);
	      green.setHeight(500);
	      green.setFill(Color.GREEN);
	      
	  	Rectangle orange = new Rectangle();


		  orange.setTranslateX(400);
		  orange.setTranslateY(50);
	      orange.setWidth(200);
	      orange.setHeight(500);
	      orange.setFill(Color.ORANGE);	  
	      Group irlands = new Group(green, orange,irak,france,italien,irland1);

	     
    	Scene irland = new Scene(irlands, 600, 500);

    	stage.setTitle("irland"); 
    
    	stage.setScene(irland);
    
    	stage.show();
	
}
		public void irakknapp(Stage knapp) {
			
			irak.setMinHeight(30);
			irak.setMinWidth(30);
			irak.setOnAction(this);
			
			Group root = new Group();
			
			root.setTranslateX(100);
			
			root.getChildren().add(irak);
			
		
			Scene scene = new Scene(root, 600, 500);
			
			
			knapp.setScene(scene);
			
			knapp.show();
		}
	public void franceknapp(Stage knapp) {
			
		france.setMinHeight(30);
		france.setMinWidth(30);
		france.setOnAction(this);
			
			Group root = new Group();
			
			root.setTranslateX(200);
			
			root.getChildren().add(france);
			
		
			Scene scene = new Scene(root, 600, 500);
			
			
			knapp.setScene(scene);
			
			knapp.show();
		}
	public void italienknapp(Stage knapp) {
		
		italien.setMinHeight(30);
		italien.setMinWidth(30);
		italien.setOnAction(this);
		
		Group root = new Group();
		
		root.setTranslateX(300);
		
		root.getChildren().add(italien);
		
	
		Scene scene = new Scene(root, 600, 500);
		
		
		knapp.setScene(scene);
		
		knapp.show();
	}
	public void irlandknapp(Stage knapp) {
		
		irland1.setMinHeight(30);
		irland1.setMinWidth(30);
		irland1.setOnAction(this);
		
		Group root = new Group();
		
		root.setTranslateX(400);
		
		root.getChildren().add(irland1);
		
	
		Scene scene = new Scene(root, 600, 500);
		
		
		knapp.setScene(scene);
		
		knapp.show();
	}
		@Override
		public void handle(ActionEvent event) {
			
			if (event.getSource() == irak)
			{
				irak();
			}
			else if(event.getSource() == france) {
				france();
			}
			else if(event.getSource() == italien) {
				italien();			
						}
			else if(event.getSource() == irland1) {
				irland();
			}
		} 
		

}
