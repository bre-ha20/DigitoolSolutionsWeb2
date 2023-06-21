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
		
		
		//Create BorderPane/Grid/Scroll/Separator
		BorderPane pane = new BorderPane();
		VBox cent = new VBox();
		cent.setStyle("-fx-background-color: white;");
		cent.setAlignment(Pos.TOP_CENTER);
		
		Separator div = new Separator();
		div.setMaxWidth(Region.USE_COMPUTED_SIZE);
		
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
		grid.setStyle("-fx-background-color: white;");
		
		
		//creating buttons for navigation bar
		VBox nav = new VBox();
		nav.setAlignment(Pos.TOP_CENTER);
		nav.setStyle("-fx-background-color: white;");
		
		Button logo = new Button();
		Image log = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\LogoIcon.png"));
		ImageView seelog = new ImageView(log);
		seelog.setFitHeight(25);
		seelog.setFitWidth(25);
		logo.setGraphic(seelog);
		
		Button comp = new Button("Our Company");
		Button prod = new Button("Our Products");
		Button sup = new Button("Support");
		
		Button search = new Button();
		Image icon = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\search.png"));
		ImageView seeicon = new ImageView(icon);
		seeicon.setFitHeight(15);
		seeicon.setFitWidth(15);
		search.setGraphic(seeicon);
				
		//Adding new grid to place menu items
		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setPadding(new Insets(15));
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
		
		double prefWidth = Screen.getPrimary().getVisualBounds().getWidth();
		/*scroll.widthProperty().addListener((observable, oldValue, newValue) -> {
            ScrollBar vertBar = (ScrollBar) scroll.lookup(".scroll-bar:vertical");
             if (vertBar != null) {
                double vertBarWidth = vertBar.getWidth();
                col1.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col2.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col3.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col4.setPrefWidth((prefWidth / 6) - vertBarWidth);
        		col5.setPrefWidth((prefWidth / 6) - vertBarWidth);
            }
        }); */
		
		//GRIDS 
		nav.getChildren().addAll(grid2);
		cent.getChildren().addAll(scroll);
		cent.setAlignment(Pos.TOP_CENTER);
		cent.setFillWidth(true);
		
		pane.setTop(nav);
		pane.setCenter(cent);
		
		/* MAKING TOP LABEL */
		
		GridPane grid0 = new GridPane();
		grid0.setAlignment(Pos.CENTER);
		grid0.setPadding(new Insets(10));
		grid0.setGridLinesVisible(false);
		
		Label top = new Label("Digitool Solutions: Over 30 Years of Expertise in the Torque Industry");
		top.setWrapText(true);
		Label sub = new Label("We provide a full line of digitally controlled torque systems with tooling, specifications, and units to fit your needs");
		sub.setWrapText(true);
				
		HBox h1 = new HBox(top);
		h1.setStyle("-fx-font-size: 30px;" + "-fx-font-family: Courier New;");
		h1.setAlignment(Pos.CENTER);
		HBox h2 = new HBox(sub);
		h2.setStyle("-fx-font-size: 20px;" +"-fx-font-family: Courier New;");
		h2.setAlignment(Pos.CENTER);
		VBox mytop = new VBox(h1, h2);
		
		grid0.add(mytop, 0, 0);
		grid.add(grid0, 0, 0);
		
		
		
		/* MAKING GRID3 FOR IMAGE AND ACCURACY */
		
		GridPane grid3 = new GridPane();
		grid3.setAlignment(Pos.CENTER);
		grid3.setPadding(new Insets(15));
		grid3.setGridLinesVisible(false);
		
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setHgrow(Priority.ALWAYS);
		grid3.getColumnConstraints().add(col3);
		
		
		Image sketch = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\outlineTool.png"));	
		ImageView seesketch = new ImageView(sketch);
		seesketch.setScaleX(0.75);
		seesketch.setScaleY(0.75);
		
		Label why = new Label("Why Digitool Solultions?");
		why.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		why.setAlignment(Pos.CENTER_LEFT);
		why.setWrapText(true);
		
		Label reason = new Label("With over 30 years of experience in the Torque Industry, our team of engineers and designers have come together to"
				+ " present the Digitool Solutions Professional Torque Product Line. We provide a fulll-line of digitally controlled torque systems"
				+ " with tooling, specifications, and units to fit your needs. Our torque products include Click-type Torrque Wrench, Digital Torque"
				+ " Checker, Digital Torque Meter, and more.");
		reason.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Courier New;");
		reason.setAlignment(Pos.CENTER_LEFT);
		reason.setWrapText(true);
		
		Label reason2 = new Label("\nOur torque range covers anywhere from 12.5 in-lbs to 2000 ft-lbs. Our digital products feature measurement data "
				+ "in ft-lbs, in-lbs, and N-m; as well as possess software interfacing capabilities. "
				+ "All products are ASME standard and are traceable to NIST.");
		reason2.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Courier New;");
		reason2.setAlignment(Pos.CENTER_LEFT);
		reason2.setWrapText(true);
		
		Label accura = new Label("Saftey through Accuracy");
		accura.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		accura.setAlignment(Pos.CENTER_LEFT);
		accura.setWrapText(true);
		
		Label accuraEx1 = new Label("± 1% for professional digital torque meters and torque wrenches");
		accuraEx1.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Courier New;");
		accuraEx1.setAlignment(Pos.CENTER_LEFT);
		accuraEx1.setWrapText(true);
		
		Label accuraEx2 = new Label("\n ± 0.5% for torque testers");
		accuraEx2.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Courier New;");
		accuraEx2.setAlignment(Pos.CENTER_LEFT);
		accuraEx2.setWrapText(true);
		
		Label accuraEx3 = new Label("\n ± 0.25% for torque analyzers");
		accuraEx3.setStyle("-fx-font-size: 12px;" + "-fx-font-family: Courier New;");
		accuraEx3.setAlignment(Pos.CENTER_LEFT);
		accuraEx3.setWrapText(true);
		
		VBox vs = new VBox(seesketch);
		vs.setPadding(new Insets(20));
		
		VBox v1 = new VBox(why);
		v1.setPadding(new Insets(20));
		VBox v2 = new VBox(reason, reason2);
		v2.setPadding(new Insets(10));
		VBox v3 = new VBox(accura);
		v3.setPadding(new Insets(20));
		VBox v4 = new VBox(accuraEx1, accuraEx2, accuraEx3);
		v4.setPadding(new Insets(10));
		VBox info = new VBox(v1, v2, v3, v4);
		
		HBox v5 = new HBox(10, vs, info);
		
		
		grid3.add(v5, 0, 0);
		grid.add(grid3, 0, 1);
		/* END OF GRID3 */
		
		
		/* MAKING GRID4 FOR Electronic TORQUE&ANGLE WRENCHES */
		GridPane grid4 = new GridPane();
		grid4.setAlignment(Pos.CENTER);
		grid4.setPadding(new Insets(15));
		grid4.setGridLinesVisible(false);
		grid4.getStyleClass().add("learn-more");
		
		ColumnConstraints col4 = new ColumnConstraints();
		col4.setHgrow(Priority.ALWAYS);
		grid4.getColumnConstraints().add(col4);
		
		Label ewrench = new Label("Electronic Torque and Angle Wrenches\n");
		ewrench.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Courier New;");
		ewrench.setAlignment(Pos.CENTER);
		ewrench.setWrapText(true);
		
		Label ewrenchinfo = new Label("Patented built in angle measurement without the need for a reference arm.");
		ewrenchinfo.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		ewrenchinfo.setAlignment(Pos.CENTER);
		ewrenchinfo.setWrapText(true);
		
		Button ewrenchlearn = new Button("Learn More");
		ewrenchlearn.setAlignment(Pos.CENTER);
		
		Image epic = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\TorqueWrench.png"));
		ImageView seepic = new ImageView(epic);
		seepic.setPreserveRatio(true);
		seepic.setScaleX(0.75);
		seepic.setScaleY(0.75);
		seepic.setFitWidth(1000);
		seepic.setFitHeight(300);
		
		HBox epicbox = new HBox(seepic);
		epicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		HBox color = new HBox();
		color.setStyle("-fx-background-color: GhostWhite;");
		
		HBox bt1 = new HBox(ewrenchlearn);
		bt1.setPadding(new Insets(20));
		bt1.setAlignment(Pos.CENTER);
		VBox ew1 = new VBox(ewrench, ewrenchinfo, bt1);
		ew1.setPadding(new Insets(15));
		ew1.setAlignment(Pos.TOP_CENTER);
		ew1.setMinWidth(1000);
		ew1.setMinHeight(400);
		
		grid4.add(color, 0, 0);
		grid4.add(ew1, 0, 0);
		grid4.add(epicbox, 0, 0);
		grid.add(grid4, 0, 2);
		/* END OF GRID4 */
		
		
		/* MAKING GRID5 FOR MECHANICAL TORQUE WRENCHES */
		
		GridPane grid5 = new GridPane();
		grid5.setAlignment(Pos.CENTER);
		grid5.setPadding(new Insets(10));
		grid5.setGridLinesVisible(false);
		grid5.getStyleClass().add("learn-more");
		
		ColumnConstraints col5 = new ColumnConstraints();
		col5.setHgrow(Priority.ALWAYS);
		grid5.getColumnConstraints().add(col5);
		
		Label twrench = new Label("Mechanical Torque Wrenches\n");
		twrench.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Courier New;");
		twrench.setAlignment(Pos.CENTER);
		twrench.setWrapText(true);
		
		Label twrenchinfo = new Label("Electronic DW-Series & Heavy Duty C-Series easy to use.\n");
		twrenchinfo.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		twrenchinfo.setAlignment(Pos.CENTER);
		twrenchinfo.setWrapText(true);
		Label twrenchinfo1 = new Label("No Training needed.");
		twrenchinfo1.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		twrenchinfo1.setAlignment(Pos.CENTER);
		twrenchinfo1.setWrapText(true);
		
		Button twrenchlearn = new Button("Learn More");
		twrenchlearn.setAlignment(Pos.CENTER);
		
		Image tpic = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\mechanical.png"));
		ImageView seetpic = new ImageView(tpic);
		seetpic.setPreserveRatio(true);
		seetpic.setScaleX(0.75);
		seetpic.setScaleY(0.75);
		seetpic.setFitWidth(1000);
		seetpic.setFitHeight(300);
		
		HBox tpicbox = new HBox(seetpic);
		tpicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		HBox color4 = new HBox();
		color4.setStyle("-fx-background-color: GhostWhite;");
		
		HBox bt2 = new HBox(twrenchlearn);
		bt2.setPadding(new Insets(20));
		bt2.setAlignment(Pos.CENTER);
		VBox tw1 = new VBox(twrench, twrenchinfo, twrenchinfo1, bt2);
		tw1.setPadding(new Insets(15));
		tw1.setAlignment(Pos.TOP_CENTER);
		tw1.setMinWidth(1000);
		tw1.setMinHeight(400);
		
		grid5.add(color4, 0, 0);
		grid5.add(tw1, 0, 0);
		grid5.add(tpicbox, 0, 0);
		grid.add(grid5, 0, 3);
		/* END OF GRID5 */
		
		/* MAKING GRID6 FOR TORQUE TESTERS */
		GridPane grid6 = new GridPane();
		grid6.setAlignment(Pos.CENTER);
		grid6.setPadding(new Insets(15));
		grid6.setGridLinesVisible(false);
		grid6.getStyleClass().add("learn-more");
		
		ColumnConstraints col6 = new ColumnConstraints();
		col6.setHgrow(Priority.ALWAYS);
		grid6.getColumnConstraints().add(col6);
		
		Label ttester = new Label("Torque Testers\n");
		ttester.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Courier New;");
		ttester.setAlignment(Pos.CENTER);
		ttester.setWrapText(true);
		
		Label ttesterinfo = new Label("Reduce down time in shops by allowing in-house\n");
		ttesterinfo.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		ttesterinfo.setAlignment(Pos.CENTER);
		ttesterinfo.setWrapText(true);
		Label ttesterinfo1 = new Label("checks of torque wrench calibration.");
		ttesterinfo1.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		ttesterinfo1.setAlignment(Pos.CENTER);
		ttesterinfo1.setWrapText(true);
		
		Button ttesterlearn = new Button("Learn More");
		ttesterlearn.setAlignment(Pos.CENTER);
		
		Image ttpic = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\TorqueTester.png"));
		ImageView seettpic = new ImageView(ttpic);
		seettpic.setPreserveRatio(true);
		seettpic.setScaleX(0.75);
		seettpic.setScaleY(0.75);
		seettpic.setFitWidth(1000);
		seettpic.setFitHeight(300);
				
		HBox ttpicbox = new HBox(seettpic);
		ttpicbox.setAlignment(Pos.BOTTOM_CENTER);
		ttpicbox.setPadding(new Insets(-20));
		
		HBox color2 = new HBox();
		color2.setStyle("-fx-background-color: GhostWhite;");
		
		HBox bt3 = new HBox(ttesterlearn);
		bt3.setPadding(new Insets(20));
		bt3.setAlignment(Pos.CENTER);
		
		VBox tt1 = new VBox(ttester, ttesterinfo, ttesterinfo1, bt3);
		tt1.setPadding(new Insets(20));
		tt1.setAlignment(Pos.TOP_CENTER);
		tt1.setMinWidth(1000);
		tt1.setMinHeight(400);
		
		grid6.add(color2, 0, 0);
		grid6.add(tt1, 0, 0);
		grid6.add(ttpicbox, 0, 0);
		grid.add(grid6, 0, 4);
		/* END OF GRID6 */
		
		/* MAKING GRID7 FOR TORQUE METERS */
		GridPane grid7 = new GridPane();
		grid7.setAlignment(Pos.CENTER);
		grid7.setPadding(new Insets(15));
		grid7.setGridLinesVisible(false);
		grid7.getStyleClass().add("learn-more");
		
		ColumnConstraints col7 = new ColumnConstraints();
		col7.setHgrow(Priority.ALWAYS);
		grid7.getColumnConstraints().add(col7);
		
		Label tm = new Label("Torque Meters\n");
		tm.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Courier New;");
		tm.setAlignment(Pos.CENTER);
		tm.setWrapText(true);
		
		Label tminfo = new Label("This Torque Meter can make any Square Drive hand\n");
		tminfo.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		tminfo.setAlignment(Pos.CENTER);
		tminfo.setWrapText(true);
		Label tminfo1 = new Label("tool into a Torque wrench. Simple to operate.");
		tminfo1.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		tminfo1.setAlignment(Pos.CENTER);
		tminfo1.setWrapText(true);
		
		Button tmlearn = new Button("Learn More");
		tmlearn.setAlignment(Pos.CENTER);
		
		Image tmpic = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\torqueMeters.png"));
		ImageView seetmpic = new ImageView(tmpic);
		seetmpic.setPreserveRatio(true);
		seetmpic.setScaleX(0.75);
		seetmpic.setScaleY(0.75);
		seetmpic.setFitWidth(1000);
		seetmpic.setFitHeight(300);
			
		HBox tmpicbox = new HBox(seetmpic);
		tmpicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		HBox color5 = new HBox();
		color5.setStyle("-fx-background-color: GhostWhite;");
		
		HBox bt4 = new HBox(tmlearn);
		bt4.setPadding(new Insets(20));
		bt4.setAlignment(Pos.CENTER);
		VBox tm1 = new VBox(tm, tminfo, tminfo1, bt4);
		tm1.setPadding(new Insets(20));
		tm1.setAlignment(Pos.TOP_CENTER);
		tm1.setMinWidth(1000);
		tm1.setMinHeight(400);
		
		grid7.add(color5, 0, 0);
		grid7.add(tm1, 0, 0);
		grid7.add(tmpicbox, 0, 0);
		grid.add(grid7, 0, 5);
		/* ENF OF GRID7 */
		
		/* MAKING GRID8 FOR TORQUE AND ANGLE METERS */
		GridPane grid8 = new GridPane();
		grid8.setAlignment(Pos.CENTER);
		grid8.setPadding(new Insets(15));
		grid8.setGridLinesVisible(false);
		grid8.getStyleClass().add("learn-more");
		
		ColumnConstraints col8 = new ColumnConstraints();
		col8.setHgrow(Priority.ALWAYS);
		grid8.getColumnConstraints().add(col8);
		
		Label tam = new Label("Torque and Anlge Meters\n");
		tam.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 20px;" + "-fx-font-family: Courier New;");
		tam.setAlignment(Pos.CENTER);
		tam.setWrapText(true);
		
		Label taminfo = new Label("Transform any wrench or non-impact driver into a\n");
		taminfo.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		taminfo.setAlignment(Pos.CENTER);
		taminfo.setWrapText(true);
		Label taminfo1 = new Label("high-precision torque and angle instrument.");
		taminfo1.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		taminfo1.setAlignment(Pos.CENTER);
		taminfo1.setWrapText(true);
		
		Button tamlearn = new Button("Learn More");
		tamlearn.setAlignment(Pos.CENTER);
		
		Image tampic = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\torque&angle.png"));
		ImageView seetampic = new ImageView(tampic);
		seetampic.setPreserveRatio(true);
		seetampic.setScaleX(0.50);
		seetampic.setScaleY(0.50);
		seetampic.setFitWidth(1000);
		seetampic.setFitHeight(400);
		
		HBox tampicbox = new HBox(seetampic);
		tampicbox.setAlignment(Pos.BOTTOM_CENTER);
		
		HBox color3 = new HBox();
		color3.setStyle("-fx-background-color: GhostWhite;");
		
		HBox bt5 = new HBox(tamlearn);
		bt5.setPadding(new Insets(20));
		bt5.setAlignment(Pos.CENTER);
		VBox tam1 = new VBox(tam, taminfo, taminfo1, bt5);
		tam1.setPadding(new Insets(20));
		tam1.setAlignment(Pos.TOP_CENTER);
		tam1.setMinWidth(1000);
		tam1.setMinHeight(500);
		
		grid8.add(color3, 0, 0);
		grid8.add(tam1, 0, 0);
		grid8.add(tampicbox, 0, 0);
		grid.add(grid8, 0, 6);
		/* END OF GRID8 */
		
		/* MAKING GRID9 FOR MULTIPLIERS
		
		GridPane grid9 = new GridPane();
		grid9.setAlignment(Pos.CENTER);
		grid9.setPadding(new Insets(10));
		grid9.setGridLinesVisible(false);
		grid9.getStyleClass().add("learn-more");
		
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
		
		HBox bt6 = new HBox(mlearn);
		bt6.setPadding(new Insets(5));
		bt6.setAlignment(Pos.CENTER);
		VBox m2 = new VBox(minfo);
		m2.setPadding(new Insets(15));
		m2.setAlignment(Pos.CENTER);
		VBox m1 = new VBox(m, m2, bt6);
		m1.setPadding(new Insets(20));
		m1.setAlignment(Pos.TOP_CENTER);
		m1.setMinWidth(1000);
		m1.setMinHeight(500);
		
		grid9.add(m1, 0, 0);
		//grid9.add(mpicbox, 0, 0);
		grid.add(grid9, 0, 7);
		END OF GRID9 */
		
		/* MAKING BOTTOM OF WEBSITE WITH INFORMATION AND QUICK LINKS */
		
		GridPane grid10 = new GridPane();
		grid10.setAlignment(Pos.CENTER);
		grid10.setPadding(new Insets(10));
		grid10.setGridLinesVisible(false);
		
		ColumnConstraints col10 = new ColumnConstraints();
		col10.setHgrow(Priority.ALWAYS);
		grid10.getColumnConstraints().add(col10);
		
		Image logopic = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\FullLogo.png"));
		ImageView seelogopic = new ImageView(logopic);
		seelogopic.setPreserveRatio(true);
		seelogopic.setScaleX(0.50);
		seelogopic.setScaleY(0.50);
		//seelogopic.setFitWidth(1000);
		//seelogopic.setFitHeight(400);
		
		Label com = new Label("We offer complete turnkey capabilities and create innovative, reliable, high caliber designs which not only meet, but"
				+ " surpass customers expectations. We also provide a complete line of innovative precision calibration systems and torque measuring devices"
				+ " as well as custom ergonomic tooling, fixtures, and adapters.");
		com.setAlignment(Pos.CENTER);
		com.setWrapText(true);
		VBox combox = new VBox(10, seelogopic, com);
		combox.setAlignment(Pos.CENTER);
		combox.setPrefWidth(100);
		combox.setPadding(new Insets(20));
		
		Label tpb = new Label("Torque Products");
		tpb.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 15px;");
		Button tpb1 = new Button("> Electronic Torque and Angle Wrenches");
		Button tpb2 = new Button("> Mechanical Torque Wrenches");
		Button tpb3 = new Button("> Torque Testers");
		Button tpb4 = new Button("> Torque Meters");
		Button tpb5 = new Button("> Torque and Angle Meters");
		Button tpb6 = new Button("> Multipliers");
		VBox tpbox = new VBox(10, tpb, tpb1, tpb2, tpb3, tpb4, tpb5, tpb6);
		tpbox.setPadding(new Insets(20));
		
		Label ql = new Label("Quick Links");
		ql.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 15px;");
		Button qlb1 = new Button("> Our Company");
		Button qlb2 = new Button("> FAQs");
		Button qlb3 = new Button("> Testimonials");
		VBox qlbox = new VBox(10, ql, qlb1, qlb2, qlb3);
		qlbox.setPadding(new Insets(20));
		
		Label contact = new Label("Get In Touch With Us");
		contact.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 15px;");
		Label addy = new Label("13963 Ramona Ave. Unit #G \nChino, CA 91710 \nUSA");
		Label phone = new Label("Phone: 909-591-9581");
		Label fax = new Label("Fax: 909-233-6491");
		Label email = new Label("Email: sales@digitoolsolutions.com");
		//Label web = new Label("DigitoolSolutions.com");
		VBox cbox = new VBox(10, contact, addy, phone, fax, email);
		cbox.setPadding(new Insets(20));
		
		HBox bbox = new HBox(combox, tpbox, qlbox, cbox);
		bbox.setAlignment(Pos.CENTER);
		HBox color6 = new HBox();
		color6.setStyle("-fx-background-color: WhiteSmoke;");
		
		grid10.add(color6, 0, 0);
		grid10.add(bbox, 0, 0);
		grid.add(grid10, 0, 8);
		
		
		
		/* SETTING STAGE AND SCENE */
		Scene scene = new Scene(pane, 1600, 1000);
		pane.requestFocus();
		scene.getStylesheets().addAll("webDetails.css");
		primaryStage.setTitle("Digitool Solutions");
		primaryStage.setMinHeight(1000);
		primaryStage.setMinWidth(1600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
