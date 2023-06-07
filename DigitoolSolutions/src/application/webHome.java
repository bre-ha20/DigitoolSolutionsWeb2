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
		
		/* MAKING GRID3 FOR IMAGE AND ACCURACY */
		
		GridPane grid3 = new GridPane();
		grid3.setAlignment(Pos.CENTER);
		grid3.setPadding(new Insets(10));
		grid3.setGridLinesVisible(false);
		
		Image sketch = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\outlineTool.png"));
		ImageView seesketch = new ImageView(sketch);
		seesketch.setScaleX(0.75);
		seesketch.setScaleY(0.75);
		
		Label why = new Label("Why Digitool Solultions?");
		why.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 15px;" + "-fx-font-family: Century;");
		why.setAlignment(Pos.CENTER_LEFT);
		why.setWrapText(true);
		
		Label reason = new Label("With over 30 years of experience in the Torque Industry, our team of engineers and designers have come together to"
				+ " present the Digitool Solutions Professional Torque Product Line. We provide a fulll-line of digitally controlled torque systems"
				+ " with tooling, specifications, and units to fit your needs. Our torque products include Click-type Torrque Wrench, Digital Torque"
				+ " Checker, Digital Torque Meter, and more.");
		reason.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		reason.setAlignment(Pos.CENTER_LEFT);
		reason.setWrapText(true);
		
		Label reason2 = new Label("\nOur torque range covers anywhere from 12.5 in-lbs to 2000 ft-lbs. Our digital products feature measurement data "
				+ "in ft-lbs, in-lbs, and N-m; as well as possess software interfacing capabilities. "
				+ "All products are ASME standard and are traceable to NIST.");
		reason2.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		reason2.setAlignment(Pos.CENTER_LEFT);
		reason2.setWrapText(true);
		
		Label accura = new Label("Saftey through Accuracy");
		accura.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 15px;" + "-fx-font-family: Century;");
		accura.setAlignment(Pos.CENTER_LEFT);
		accura.setWrapText(true);
		
		Label accuraEx1 = new Label("± 1% for professional digital torque meters and torque wrenches");
		accuraEx1.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		accuraEx1.setAlignment(Pos.CENTER_LEFT);
		accuraEx1.setWrapText(true);
		
		Label accuraEx2 = new Label("\n ± 0.5% for torque testers");
		accuraEx2.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		accuraEx2.setAlignment(Pos.CENTER_LEFT);
		accuraEx2.setWrapText(true);
		
		Label accuraEx3 = new Label("\n ± 0.25% for torque analyzers");
		accuraEx3.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		accuraEx3.setAlignment(Pos.CENTER_LEFT);
		accuraEx3.setWrapText(true);
		
		VBox v1 = new VBox(why);
		v1.setPadding(new Insets(20));
		VBox v2 = new VBox(reason, reason2);
		v2.setPadding(new Insets(10));
		VBox v3 = new VBox(accura);
		v3.setPadding(new Insets(20));
		VBox v4 = new VBox(accuraEx1, accuraEx2, accuraEx3);
		v4.setPadding(new Insets(10));
		VBox info = new VBox(v1, v2, v3, v4);
		
		
		grid3.add(seesketch, 0, 0);
		grid3.add(info, 1, 0);
		grid.add(grid3, 0, 0);
		/* END OF GRID3 */
		
		
		/* MAKING GRID5 FOR MECHANICAL TORQUE WRENCHES */
		
		GridPane grid4 = new GridPane();
		grid4.setAlignment(Pos.CENTER);
		grid4.setPadding(new Insets(10));
		grid4.setGridLinesVisible(true);
		
		Label ewrench = new Label("Electronic Torque and Angle Wrenches");
		ewrench.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Century;");
		ewrench.setAlignment(Pos.CENTER);
		ewrench.setWrapText(true);
		
		Label ewrenchinfo = new Label("\nPatented built in angle measurement without the need for a reference arm.");
		ewrenchinfo.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		ewrenchinfo.setAlignment(Pos.CENTER);
		ewrenchinfo.setWrapText(true);
		
		Button ewrenchlearn = new Button("Learn More");
		ewrenchlearn.setAlignment(Pos.CENTER);
		
		//NEED TO ADD IMAGE
		//Image epic = new Image(new FileInputStream(""));
		//ImageView seepic = new ImageView(epic);
		//seepic.setPreserveRatio(true);
		//seepic.setScaleX(0.75);
		//seepic.setScaleY(0.75);
		//seepic.setFitWidth(1000);
		//seepic.serFitHeight(300);
		
		//HBox epicbox = new HBox(seepic);
		//epicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		VBox ew1 = new VBox(ewrench, ewrenchinfo, ewrenchlearn);
		ew1.setPadding(new Insets(10));
		ew1.setAlignment(Pos.TOP_CENTER);
		ew1.setPrefWidth(1000);
		ew1.setPrefHeight(400);
		
		grid4.add(ew1, 0, 0);
		//grid4.add(epicbox, 0, 0);
		grid.add(grid4, 0, 1);
		/* END OF GRID4 */
		
		
		/* MAKING GRID5 FOR MECHANICAL TORQUE WRENCHES */
		
		GridPane grid5 = new GridPane();
		grid5.setAlignment(Pos.CENTER);
		grid5.setPadding(new Insets(10));
		grid5.setGridLinesVisible(true);
		
		Label twrench = new Label("Mechanical Torque Wrenches");
		twrench.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Century;");
		twrench.setAlignment(Pos.CENTER);
		twrench.setWrapText(true);
		
		Label twrenchinfo = new Label("\nElectronic DW-Series & Heavy Duty C-Series easy to use, No Training needed.");
		twrenchinfo.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		twrenchinfo.setAlignment(Pos.CENTER);
		twrenchinfo.setWrapText(true);
		
		Button twrenchlearn = new Button("Learn More");
		twrenchlearn.setAlignment(Pos.CENTER);

		
		//change picture!
		Image tpic = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\TorqueWrench.png"));
		ImageView seetpic = new ImageView(tpic);
		seetpic.setPreserveRatio(true);
		seetpic.setScaleX(0.75);
		seetpic.setScaleY(0.75);
		seetpic.setFitWidth(1000);
		seetpic.setFitHeight(300);
		
		HBox tpicbox = new HBox(seetpic);
		tpicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		VBox tw1 = new VBox(twrench, twrenchinfo, twrenchlearn);
		tw1.setPadding(new Insets(10));
		tw1.setAlignment(Pos.TOP_CENTER);
		tw1.setPrefWidth(1000);
		tw1.setPrefHeight(400);
		
		grid5.add(tw1, 0, 0);
		//grid5.add(tpicbox, 0, 0);
		grid.add(grid5, 0, 2);
		/* END OF GRID5 */
		
		/* MAKING GRID6 FOR TORQUE TESTERS */
		
		GridPane grid6 = new GridPane();
		grid6.setAlignment(Pos.CENTER);
		grid6.setPadding(new Insets(10));
		grid6.setGridLinesVisible(true);
		
		Label ttester = new Label("Torque Testers");
		ttester.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Century;");
		ttester.setAlignment(Pos.CENTER);
		ttester.setWrapText(true);
		
		Label ttesterinfo = new Label("Reduce down time in shops by allowing in-house checks of torque wrench calibration.");
		ttesterinfo.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		ttesterinfo.setAlignment(Pos.CENTER);
		ttesterinfo.setWrapText(true);
		
		Button ttesterlearn = new Button("Learn More");
		twrenchlearn.setAlignment(Pos.CENTER);
		
		//NEED TO ADD IMAGE
			//Image ttpic = new Image(new FileInputStream(""));
			//ImageView seettpic = new ImageView(ttpic);
			//seettpic.setPreserveRatio(true);
			//seettpic.setScaleX(0.75);
			//seettpic.setScaleY(0.75);
			//seettpic.setFitWidth(1000);
			//seettpic.serFitHeight(300);
				
			//HBox ttpicbox = new HBox(seettpic);
			//ttpicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		VBox tt1 = new VBox(ttester, ttesterinfo, ttesterlearn);
		tt1.setPadding(new Insets(10));
		tt1.setAlignment(Pos.TOP_CENTER);
		tt1.setPrefWidth(1000);
		tt1.setPrefHeight(400);
		
		grid6.add(tt1, 0, 0);
		//grid6.add(ttpicbox, 0, 0);
		grid.add(grid6, 0, 3);
		/* END OF GRID6 */
		
		/* MAKING GRID7 FOR TORQUE METERS */
		
		GridPane grid7 = new GridPane();
		grid7.setAlignment(Pos.CENTER);
		grid7.setPadding(new Insets(10));
		grid7.setGridLinesVisible(true);
		
		Label tm = new Label("Torque Meters");
		tm.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Century;");
		tm.setAlignment(Pos.CENTER);
		tm.setWrapText(true);
		
		Label tminfo = new Label("This Torque Meter can make any Square Drive hand tool into a Torque wrench. Simple to operate.");
		tminfo.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		tminfo.setAlignment(Pos.CENTER);
		tminfo.setWrapText(true);
		
		Button tmlearn = new Button("Learn More");
		tmlearn.setAlignment(Pos.CENTER);
		
		//NEED TO ADD IMAGE
		//Image tmpic = new Image(new FileInputStream(""));
		//ImageView seetmpic = new ImageView(tmpic);
		//seetmpic.setPreserveRatio(true);
		//seetmpic.setScaleX(0.75);
		//seetmpic.setScaleY(0.75);
		//seetmpic.setFitWidth(1000);
		//seetmpic.serFitHeight(300);
			
		//HBox tmpicbox = new HBox(seetmpic);
		//ttpicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		VBox tm1 = new VBox(tm, tminfo, tmlearn);
		tm1.setPadding(new Insets(10));
		tm1.setAlignment(Pos.TOP_CENTER);
		tm1.setPrefWidth(1000);
		tm1.setPrefHeight(400);
		
		grid7.add(tm1, 0, 0);
		//grid7.add(tmpicbox, 0, 0);
		grid.add(grid7, 0, 4);
		/* ENF OF GRID7 */
		
		/* MAKING GRID8 FOR TORQUE AND ANGLE METERS */
		GridPane grid8 = new GridPane();
		grid8.setAlignment(Pos.CENTER);
		grid8.setPadding(new Insets(10));
		grid8.setGridLinesVisible(true);
		
		Label tam = new Label("Torque and Anlge Meters");
		tam.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Century;");
		tam.setAlignment(Pos.CENTER);
		tam.setWrapText(true);
		
		Label taminfo = new Label("Transform any wrench or non-impact driver into a high-precision torque and angle instrument.");
		taminfo.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		taminfo.setAlignment(Pos.CENTER);
		taminfo.setWrapText(true);
		
		Button tamlearn = new Button("Learn More");
		tamlearn.setAlignment(Pos.CENTER);
		
		//NEED TO ADD IMAGE
		//Image tampic = new Image(new FileInputStream("");
		//ImageView seetampic = new ImageView(tampic);
		//seetampic.setPreserveRatio(true);
		//seetampic.setScaleX(0.75);
		//seetampic.setScaleY(0.75);
		//seetampic.setFitWidth(1000);
		//seetampic.setFitHeight(400);
		
		//HBox tampicbox = new HBox(seetampic);
		//tampicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		VBox tam1 = new VBox(tam, taminfo, tamlearn);
		tam1.setPadding(new Insets(10));
		tam1.setAlignment(Pos.TOP_CENTER);
		tam1.setPrefWidth(1000);
		tam1.setPrefHeight(500);
		
		grid8.add(tam1, 0, 0);
		//grid8.add(tampicbox, 0, 0);
		grid.add(grid8, 0, 5);
		/* END OF GRID8 */
		
		/* MAKING GRID9 FOR MULTIPLIERS*/
		
		GridPane grid9 = new GridPane();
		grid9.setAlignment(Pos.CENTER);
		grid9.setPadding(new Insets(10));
		grid9.setGridLinesVisible(true);
		
		Label m = new Label("Multipliers");
		m.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Century;");
		m.setAlignment(Pos.CENTER);
		m.setWrapText(true);
		
		Label minfo = new Label("An innovative ratchet locking mechanism will accumulate torque output without the danger of input kick-back.");
		minfo.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Century;");
		minfo.setAlignment(Pos.CENTER);
		minfo.setWrapText(true);
		
		Button mlearn = new Button("Learn More");
		mlearn.setAlignment(Pos.CENTER);
		
		//NEED TO ADD IMAGE
				//Image mpic = new Image(new FileInputStream("");
				//ImageView seempic = new ImageView(mpic);
				//seempic.setPreserveRatio(true);
				//seempic.setScaleX(0.75);
				//seempic.setScaleY(0.75);
				//seempic.setFitWidth(1000);
				//seempic.setFitHeight(400);
				
				//HBox mpicbox = new HBox(seempic);
				//mpicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		VBox m1 = new VBox(m, minfo, mlearn);
		m1.setPadding(new Insets(10));
		m1.setAlignment(Pos.TOP_CENTER);
		m1.setPrefWidth(1000);
		m1.setPrefHeight(500);
		
		grid9.add(m1, 0, 0);
		//grid9.add(mpicbox, 0, 0);
		grid.add(grid9, 0, 6);
		/* END OF GRID9 */
		
		
		
		/* SETTING STAGE AND SCENE */
		Scene scene = new Scene(pane, 1000, 1000);
		pane.requestFocus();
		scene.getStylesheets().addAll("webDetails.css");
		primaryStage.setTitle("Digitool Solutions");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
