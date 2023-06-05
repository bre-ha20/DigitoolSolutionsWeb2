package application;

import javafx.application.Application;
import java.io.FileInputStream;
import javafx.geometry.*;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.web.*;
import javafx.scene.image.*;

public class webHome extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static GridPane grid = new GridPane();
	
	@SuppressWarnings("unused")
	public void start(Stage primaryStage) throws Exception{
		
		//Create WebView
		WebView webView = new WebView();
		WebEngine webEngine = webView.getEngine();
		
		
		//Create BorderPane/Grid/Scroll
		BorderPane pane = new BorderPane();
		VBox cent = new VBox();
		
		cent.setAlignment(Pos.TOP_CENTER);
		ScrollPane scroll = new ScrollPane();
		
		grid.setTranslateX(0);
		scroll.setContent(grid);
		scroll.setFitToWidth(true);
		scroll.setFitToHeight(true);
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		double maxheight = screenBounds.getHeight();
		double maxwidth = screenBounds.getWidth();
		
		//Grid visuals
		grid.setGridLinesVisible(false);;
		grid.setHgap(0);;
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(10));
		
		//Column Restraints
		ColumnConstraints col1 = new ColumnConstraints();
		ColumnConstraints col2 = new ColumnConstraints();
		ColumnConstraints col3 = new ColumnConstraints();
		ColumnConstraints col4 = new ColumnConstraints();
		ColumnConstraints col5 = new ColumnConstraints();
		
		
		//creating buttons for navigation bar
		Button logo = new Button();
		Image log = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\Logo.jpeg"));
		ImageView seelog = new ImageView(log);
		seelog.setFitHeight(20);
		seelog.setFitWidth(20);
		logo.setGraphic(seelog);
		
		Button search = new Button();
		Image icon = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\search-icon.png"));
		ImageView seeicon = new ImageView(icon);
		seeicon.setFitHeight(20);
		seeicon.setFitWidth(20);
		search.setGraphic(seeicon);
		
		Button comp = new Button("Our Company");
		Button prod = new Button("Our Products");
		Button sup = new Button("Support");
		
		//Label of top
		Label top = new Label("Digitool Solutions: Over 30 Years of Expertise in the Torue Industry");
		Label sub = new Label("We provide a full line of digitally controlled torque systems with tooling, specifications, and units to fit your needs");
		
		HBox h1 = new HBox(top);
		h1.setStyle("-fx-font-size: 35px;" + "-fx-font-family: Century;");
		h1.setAlignment(Pos.CENTER);
		HBox h2 = new HBox(sub);
		h2.setStyle("-fx-font-size: 20px;" +"-fx-font-family: Century;");
		h2.setAlignment(Pos.CENTER);
		HBox mytop = new HBox(h1, h2);
				
		//Adding new grid to place menu items
		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setPadding(new Insets(10));
		grid2.setGridLinesVisible(false);
		grid2.getStyleClass().add("my-hbox");
		grid2.add(logo, 0, 0);
		grid2.add(comp, 1, 0);
		grid2.add(prod, 2, 0);
		grid2.add(sup, 3, 0);
		grid2.add(search, 4, 0);
		
		grid2.setHgap(50);
		grid2.setVgap(10);
		grid2.setPadding(new Insets(10, 10, 10, 10));

		
		GridPane.setHalignment(logo, HPos.CENTER);
		GridPane.setHalignment(comp, HPos.CENTER);
		GridPane.setHalignment(prod, HPos.CENTER);
		GridPane.setHalignment(sup, HPos.CENTER);
		GridPane.setHalignment(search, HPos.CENTER);
		GridPane.setHalignment(top, HPos.CENTER);
		
		double prefWidth = Screen.getPrimary().getVisualBounds().getWidth();
		scroll.widthProperty().addListener((observable, oldValue, newValue) -> {
            ScrollBar vertBar = (ScrollBar) scroll.lookup(".scroll-bar:vertical");
            if (vertBar != null) {
                double vertBarWidth = vertBar.getWidth();
                col1.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col2.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col3.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col4.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col5.setPrefWidth((prefWidth / 6) - vertBarWidth);
            }
        });
		
		//GRIDS 
		cent.getChildren().addAll(grid2, h1, h2, scroll);
		cent.setAlignment(Pos.TOP_CENTER);
		cent.setFillWidth(true);
		pane.setCenter(cent);
		
		//adding first horizontal panel into grid
		
		
		
		
		//setting scenes/primaryStage
		Scene scene = new Scene(pane, 1000, 1000);
		pane.requestFocus();
		scene.getStylesheets().addAll("webDetails.css");
		primaryStage.setTitle("Digitool Solutions");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
