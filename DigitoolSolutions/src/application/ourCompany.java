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
import javafx.scene.image.*;

public class ourCompany extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static GridPane griddd = new GridPane();
	
	@SuppressWarnings("unused")
	public void start(Stage primaryStage) throws Exception{
		
		//creating scene2
		BorderPane pane = new BorderPane();
		VBox cent2 = new VBox();
		cent2.setStyle("-fx-background-color: white;");
		cent2.setAlignment(Pos.CENTER);
				
		ScrollPane scroll3 = new ScrollPane();
				
		griddd.setTranslateX(0);
		scroll3.setContent(griddd);
		scroll3.setFitToWidth(true);
		scroll3.setFitToHeight(true);
		Rectangle2D screenBounds2 = Screen.getPrimary().getVisualBounds();
		double maxheight = screenBounds2.getHeight();
		double maxwidth = screenBounds2.getWidth();
				
		//Grid Visuals
		griddd.setGridLinesVisible(false);
		griddd.setHgap(0);
		griddd.setAlignment(Pos.CENTER);
		griddd.setPadding(new Insets(10));
		griddd.setStyle("-fx-background-color: white;");
				
		//Grids
		cent2.getChildren().add(scroll3);
		cent2.setAlignment(Pos.TOP_CENTER);
		cent2.setFillWidth(true);
				
		pane.setCenter(cent2);
				
		/*Making Top Label*/
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(10));
		grid.setGridLinesVisible(false);
		
		Image logo = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\FullLogo.png"));
		ImageView seelogo = new ImageView(logo);
		seelogo.setPreserveRatio(true);
		seelogo.setScaleX(.50);
		seelogo.setScaleY(.50);
		seelogo.setFitHeight(200);
		seelogo.setFitWidth(maxwidth);
		
		Image tool = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\usingTool.jpg"));
		ImageView seetool = new ImageView(tool);
		seetool.setPreserveRatio(false);
		seetool.setFitHeight(200);
		seetool.setFitWidth(maxwidth);
		
		HBox toolbox = new HBox(seetool);
		toolbox.setAlignment(Pos.CENTER);
		
		HBox logobox = new HBox(seelogo);
		logobox.setAlignment(Pos.CENTER);
		
		grid.add(toolbox, 0, 0);
		grid.add(logobox, 0, 0);
		griddd.add(grid, 0, 0);
		/* END OF TOP LABEL*/
		
		
		/* GRID FOR IMAGES OF COMPANY STUFF */
		
		/* END OF GRID */
		
		/* MAKING GRID FOR INFORMATION */
		GridPane grid3 = new GridPane();
		grid3.setAlignment(Pos.CENTER);
		grid3.setPadding(new Insets(10));
		grid3.setGridLinesVisible(false);
		
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setHgrow(Priority.ALWAYS);
		grid3.getColumnConstraints().add(col3);
		
		//Left side of page
		Label about = new Label("About Digitool Solutions");
		about.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 20px;" + "-fx-font-weight: bold;");
		about.setAlignment(Pos.CENTER_LEFT);
		about.setWrapText(true);
		
		Label aboutpar = new Label("We offer complete turnkey capabilities and create innovative, reliable, high caliber designs which not only meet, but surpass" +
		" customers' expectations. We also provide a complete line of innovative precision calibration systems and torque measuring devices as well as custom"
		 + " ergonomic tooling, fixtures, and adapters.\n\n" + "In addition to our existing product line, we design, develop, and manufacture products that custom fit"
		+ " or retro-fit to our customers' specific needs.\n\n" + "We designed and customized our circuitry to save space on the PCB board as well as cutting down" +
		 " on power consumption using cutting-edge technology.\n\n" + "Our management team brings together diverse strengths in education, expertise, and practical" +
		" experience to design solutions for a number of specialized applications both conventional and unconventional.");
		aboutpar.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		aboutpar.setAlignment(Pos.CENTER_LEFT);
		aboutpar.setMaxWidth(550);
		aboutpar.setMinHeight(300);
		aboutpar.setWrapText(true);
		
		HBox aboutbox = new HBox(about);
		aboutbox.setPadding(new Insets(15));
		HBox aboutparbox = new HBox(aboutpar);
		aboutparbox.setPadding(new Insets(20));
		VBox aboutall = new VBox(aboutbox, aboutparbox);
		
		Label strive = new Label("We Strive for Constant Improvement");
		strive.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 20px;" + "-fx-font-weight: bold;");
		strive.setAlignment(Pos.CENTER_LEFT);
		strive.setWrapText(true);
		
		Label strivepar = new Label("We are constantly imporving for the highest quality standards to meet the customers' needs. We strive to gather valuable feedback" +
		" and intelligence from our customers and go the extra mile to achieve total customer satisfaction and their success. We are aggressively seeking to integrate" +
				" our Torque Systems with client's systems that are currently being used in the United States, Canada, South America, Australia, Europe, and Japan.");
		strivepar.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		strivepar.setAlignment(Pos.CENTER_LEFT);
		strivepar.setMaxWidth(550);
		strivepar.setMinHeight(100);
		strivepar.setWrapText(true);
		
		HBox strivebox = new HBox(strive);
		HBox striveparbox = new HBox(strivepar);
		striveparbox.setPadding(new Insets(20));
		VBox striveall = new VBox(strivebox, striveparbox);
		
		VBox box = new VBox(aboutall, striveall);
		box.setAlignment(Pos.CENTER_LEFT);
		
		//Right side of page
		Image build = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\Digitool-Solutions-Chino-California.jpg"));
		ImageView seebuild = new ImageView(build);
		seebuild.setScaleX(.75);
		seebuild.setScaleY(.75);
		
		VBox buildbox = new VBox(seebuild);
		buildbox.setPadding(new Insets(10));
		buildbox.setAlignment(Pos.TOP_RIGHT);
		
		//Image icon = new Image(new FileInputStream(""));
		
		HBox row1 = new HBox(box, buildbox);
		
		grid3.add(row1, 0, 0);
		griddd.add(grid3, 0, 1);
		
		/* SETTING STAGE AND SCENE */
		Scene scene = new Scene(pane, 1600, 1000);
		pane.requestFocus();
		scene.getStylesheets().addAll("webDetails.css");
		primaryStage.setMinHeight(1000);
		primaryStage.setMinWidth(1600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
