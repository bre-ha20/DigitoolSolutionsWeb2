package application;

import javafx.application.Application;
import java.io.FileInputStream;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.image.*;

public class productPage extends Application{
		
	public static void main(String[] args) {
		launch(args);
	}
	
	public static GridPane gridd = new GridPane();
	
	@SuppressWarnings("unused")
	public void start(Stage primaryStage) throws Exception{
		
		//creating scene2
		BorderPane pane = new BorderPane();
		VBox cent2 = new VBox();
		cent2.setStyle("-fx-background-color: white;");
		cent2.setAlignment(Pos.CENTER);
		
		ScrollPane scroll2 = new ScrollPane();
		
		gridd.setTranslateX(0);
		scroll2.setContent(gridd);
		scroll2.setFitToWidth(true);
		scroll2.setFitToHeight(true);
		Rectangle2D screenBounds2 = Screen.getPrimary().getVisualBounds();
		double maxheight = screenBounds2.getHeight();
		double maxwidth = screenBounds2.getWidth();
		
		//Grid Visuals
		gridd.setGridLinesVisible(false);
		gridd.setHgap(0);
		gridd.setAlignment(Pos.CENTER);
		gridd.setPadding(new Insets(10));
		gridd.setStyle("-fx-background-color: white;");
		
		//Grids
		cent2.getChildren().add(scroll2);
		cent2.setAlignment(Pos.TOP_CENTER);
		cent2.setFillWidth(true);
		
		pane.setCenter(cent2);
		
		/*Making Top Label*/
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(10));
		grid.setGridLinesVisible(false);
		
		Label top = new Label("Our Full Line of Torque Products\n");
		top.setWrapText(true);
		top.setStyle("-fx-font-size: 30px;" + "-fx-font-family: Courier New;");
		Label under = new Label("Our torque products offer complete turnkey capabilities, innovative, reliable, and high caliber designs.\n");
		under.setWrapText(true);
		under.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		Label under2 = new Label("We also provide a complete line of precision calibration systems, torque measureing devices, custom ergonomic tooling, fixtures, & adapters.");
		under2.setWrapText(true);
		under2.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		
		HBox h1 = new HBox(top);
		h1.setAlignment(Pos.CENTER);
		HBox h2 = new HBox(under);
		h2.setAlignment(Pos.CENTER);
		HBox h3 = new HBox(under2);
		h3.setAlignment(Pos.CENTER);
		VBox mytop = new VBox(h1, h2, h3);
		
		grid.add(mytop, 0, 0);
		gridd.add(grid, 0, 0);
		
		/* GRID1 FOR ELECTRONIC TORQUE & ANGLE WRENCHES */
		GridPane grid1 = new GridPane();
		grid1.setAlignment(Pos.CENTER);
		grid1.setPadding(new Insets(15));
		grid1.setGridLinesVisible(false);
		grid1.getStyleClass().add("explore-more");
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHgrow(Priority.ALWAYS);
		grid1.getColumnConstraints().add(col1);
		
		Label elec = new Label("Electronic Torque and Angle Wrenches");
		elec.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 20px;" + "-fx-font-weight: bold;");
		elec.setAlignment(Pos.CENTER);
		HBox elecbox = new HBox(elec);
		elecbox.setAlignment(Pos.TOP_CENTER);

				
		//DWA
		Image dwa = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\ElecT&A.png"));
		ImageView seedwa = new ImageView(dwa);
		seedwa.setPreserveRatio(true);
		seedwa.setScaleX(.45);
		seedwa.setScaleY(.45);
		seedwa.setFitWidth(500);
		seedwa.setFitHeight(300);
		VBox dwabox = new VBox(seedwa);
		dwabox.setAlignment(Pos.CENTER);
		
		Label dwal = new Label("DWA Series");
		dwal.setAlignment(Pos.CENTER);
		dwal.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		Label dwal1 = new Label("Electronic Torque and Angle Wrench");
		dwal1.setAlignment(Pos.CENTER);
		dwal1.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		VBox dwalbox = new VBox(dwal);
		dwalbox.setAlignment(Pos.CENTER);
		VBox dwal1box = new VBox(dwal1);
		dwal1box.setAlignment(Pos.CENTER);
		Button ex = new Button("Explore >");
		ex.setAlignment(Pos.CENTER);
		HBox exbox = new HBox(ex);
		exbox.setAlignment(Pos.CENTER);
		VBox dwall = new VBox(dwabox, dwalbox, dwal1box, exbox);
		
		//DW
		Image dw = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\ElecTorque.png"));
		ImageView seedw = new ImageView(dw);
		seedw.setPreserveRatio(true);
		seedw.setScaleX(.45);
		seedw.setScaleY(.45);
		seedw.setFitWidth(500);
		seedw.setFitHeight(300);
		VBox dwbox = new VBox(seedw);
		dwbox.setAlignment(Pos.CENTER);
		
		Label dwl = new Label("DW Series");
		dwl.setAlignment(Pos.CENTER);
		dwl.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		Label dwl1 = new Label("Electronic Torque Wrench");
		dwl1.setAlignment(Pos.CENTER);
		dwl1.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		VBox dwlbox = new VBox(dwl);
		dwlbox.setAlignment(Pos.CENTER);
		VBox dwl1box = new VBox(dwl1);
		dwl1box.setAlignment(Pos.CENTER);
		Button ex2 = new Button("Explore >");
		ex2.setAlignment(Pos.CENTER);
		HBox exbox2 = new HBox(ex2);
		exbox2.setAlignment(Pos.CENTER);
		VBox dall = new VBox(dwbox, dwlbox, dwl1box, exbox2);
		
		HBox b1 = new HBox(10, dwall, dall);
		b1.setAlignment(Pos.CENTER);
		VBox r1 = new VBox(elecbox, b1);
		r1.setPadding(new Insets(15));
		
		grid1.add(r1, 0, 0);
		gridd.add(grid1, 0, 1);
		/* END OF GRID1 */
		
		/* MAKING GRID2 FOR MECHANICAL WRENCHES */
		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setPadding(new Insets(10));
		grid2.setGridLinesVisible(false);
		grid2.getStyleClass().add("explore-more");
		
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setHgrow(Priority.ALWAYS);
		grid2.getColumnConstraints().add(col2);
		
		Label mech = new Label("Mechanical Torque Wrenches");
		mech.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 20px;" + "-fx-font-weight: bold;");
		mech.setAlignment(Pos.CENTER);
		HBox mechbox = new HBox(mech);
		mechbox.setAlignment(Pos.TOP_CENTER);
		
		// 5PC-Series
		Image pc = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\5PC.png"));
		ImageView seepc = new ImageView(pc);
		seepc.setPreserveRatio(true);
		seepc.setScaleX(.45);
		seepc.setScaleY(.45);
		seepc.setFitWidth(500);
		seepc.setFitHeight(300);
		VBox pcbox = new VBox(seepc);
		pcbox.setAlignment(Pos.CENTER);
				
		Label pcl = new Label("5PC Series");
		pcl.setAlignment(Pos.CENTER);
		pcl.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		Label pcl1 = new Label("Preset Click-Type Torque Wrench");
		pcl1.setAlignment(Pos.CENTER);
		pcl1.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		VBox pclbox = new VBox(pcl);
		pclbox.setAlignment(Pos.CENTER);
		VBox pcl1box = new VBox(pcl1);
		pcl1box.setAlignment(Pos.CENTER);
		Button ex3 = new Button("Explore >");
		ex3.setAlignment(Pos.CENTER);
		HBox exbox3 = new HBox(ex3);
		exbox3.setAlignment(Pos.CENTER);
		VBox pcall = new VBox(pcbox, pclbox, pcl1box, exbox3);
		
		//Micrometer
		Image mm = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\micrometer.png"));
		ImageView seemm = new ImageView(mm);
		seemm.setPreserveRatio(true);
		seemm.setScaleX(.45);
		seemm.setScaleY(.45);
		seemm.setFitWidth(500);
		seemm.setFitHeight(300);
		VBox mmbox = new VBox(seemm);
		mmbox.setAlignment(Pos.CENTER);
				
		Label mml = new Label("C Series");
		mml.setAlignment(Pos.CENTER);
		mml.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		Label mml1 = new Label("Micrometer Adjustable Click-Type Torque Wrench");
		mml1.setAlignment(Pos.CENTER);
		mml1.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		VBox mmlbox = new VBox(mml);
		mmlbox.setAlignment(Pos.CENTER);
		VBox mml1box = new VBox(mml1);
		mml1box.setAlignment(Pos.CENTER);
		Button ex4 = new Button("Explore >");
		ex4.setAlignment(Pos.CENTER);
		HBox exbox4 = new HBox(ex4);
		exbox4.setAlignment(Pos.CENTER);
		VBox mmall = new VBox(mmbox, mmlbox, mml1box, exbox4);
		
		//Heavy Duty
		Image hd = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\hd.png"));
		ImageView seehd = new ImageView(hd);
		seehd.setPreserveRatio(true);
		seehd.setScaleX(.45);
		seehd.setScaleY(.45);
		seehd.setFitWidth(500);
		seehd.setFitHeight(300);
		VBox hdbox = new VBox(seehd);
		hdbox.setAlignment(Pos.CENTER);
				
		Label hdl = new Label("C Series");
		hdl.setAlignment(Pos.CENTER);
		hdl.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		Label hdl1 = new Label("Heavy Duty Click-Type Torque Wrench");
		hdl1.setAlignment(Pos.CENTER);
		hdl1.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		VBox hdlbox = new VBox(hdl);
		hdlbox.setAlignment(Pos.CENTER);
		VBox hdl1box = new VBox(hdl1);
		hdl1box.setAlignment(Pos.CENTER);
		Button ex5 = new Button("Explore >");
		ex5.setAlignment(Pos.CENTER);
		HBox exbox5 = new HBox(ex5);
		exbox5.setAlignment(Pos.CENTER);
		VBox hdall = new VBox(hdbox, hdlbox, hdl1box, exbox5);
		
		HBox b2 = new HBox(10, pcall, mmall, hdall);
		VBox r2 = new VBox(mechbox, b2);
		r2.setPadding(new Insets(15));
		
		grid2.add(r2, 0, 0);
		gridd.add(grid2, 0, 2);
		/* END OF GRID2 */
		
		/* MAKING GRID3 FOR TORQUE TESTERS */
		GridPane grid3 = new GridPane();
		grid3.setAlignment(Pos.CENTER);
		grid3.setPadding(new Insets(10));
		grid3.setGridLinesVisible(false);
		grid3.getStyleClass().add("explore-more");
		
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setHgrow(Priority.ALWAYS);
		grid3.getColumnConstraints().add(col3);
		
		Label tt = new Label("Torque Testers");
		tt.setAlignment(Pos.CENTER);
		tt.setStyle("-fx-font-family: Courier new;" + "-fx-font-weight: bold;" + "-fx-font-size: 20px;");
		HBox ttbox = new HBox(tt);
		ttbox.setAlignment(Pos.TOP_CENTER);
		
		//Torque Tester Pro
		Image ttp = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\TorqueTester.png"));
		ImageView seettp = new ImageView(ttp);
		seettp.setPreserveRatio(true);
		seettp.setScaleX(.45);
		seettp.setScaleY(.45);
		seettp.setFitWidth(500);
		seettp.setFitHeight(500);
		VBox ttpbox = new VBox(seettp);
		ttpbox.setAlignment(Pos.CENTER);
		
		Label ttpl = new Label("SPT Series");
		ttpl.setAlignment(Pos.CENTER);
		ttpl.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		Label ttpl1 = new Label("Torque Tester Pro");
		ttpl1.setAlignment(Pos.CENTER);
		ttpl1.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		VBox ttplbox = new VBox(ttpl);
		ttplbox.setAlignment(Pos.CENTER);
		VBox ttpl1box = new VBox(ttpl1);
		ttpl1box.setAlignment(Pos.CENTER);
		Button ex6 = new Button("Explore >");
		ex6.setAlignment(Pos.CENTER);
		HBox exbox6 = new HBox(ex6);
		exbox6.setAlignment(Pos.CENTER);
		VBox ttpall = new VBox(ttpbox, ttplbox, ttpl1box, exbox6);
		
		//Torque Checker
		Image tc = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\torquechecker.png"));
		ImageView seetc = new ImageView(tc);
		seetc.setPreserveRatio(true);
		seetc.setScaleX(.45);
		seetc.setScaleY(.45);
		seetc.setFitWidth(500);
		seetc.setFitHeight(500);
		VBox tcbox = new VBox(seetc);
		tcbox.setAlignment(Pos.CENTER);
		
		Label tcl = new Label("TC Series");
		tcl.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		tcl.setAlignment(Pos.CENTER);
		Label tcl1 = new Label("Torque Checker");
		tcl1.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		tcl1.setAlignment(Pos.CENTER);
		VBox tclbox = new VBox(tcl);
		tclbox.setAlignment(Pos.CENTER);
		VBox tcl1box = new VBox(tcl1);
		tcl1box.setAlignment(Pos.CENTER);
		Button ex7 = new Button("Explore >");
		HBox exbox7 = new HBox(ex7);
		exbox7.setAlignment(Pos.CENTER);
		VBox tcall = new VBox(tcbox, tclbox, tcl1box, exbox7);
		
		HBox b3 = new HBox(10, ttpall, tcall);
		b3.setAlignment(Pos.CENTER);
		VBox r3 = new VBox(ttbox, b3);
		r3.setPadding(new Insets(15));
		
		grid3.add(r3, 0, 0);
		gridd.add(grid3, 0, 3);
		/* END OF GRID3 */
		
		/* MAKING GID4 FOR TORQUE METERS */
		GridPane grid4 = new GridPane();
		grid4.setAlignment(Pos.CENTER);
		grid4.setPadding(new Insets(10));
		grid4.setGridLinesVisible(false);
		grid4.getStyleClass().add("explore-more");
		
		ColumnConstraints col4 = new ColumnConstraints();
		col4.setHgrow(Priority.ALWAYS);
		grid4.getColumnConstraints().add(col4);
		
		Label tm = new Label("Torque Meters");
		tm.setAlignment(Pos.CENTER);
		tm.setStyle("-fx-font-family: Courier new;" + "-fx-font-weight: bold;" + "-fx-font-size: 20px;");
		HBox tmbox = new HBox(tm);
		tmbox.setAlignment(Pos.TOP_CENTER);
		
		//Torque Meter Pro
		Image tmp = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\spm.png"));
		ImageView seetmp = new ImageView(tmp);
		seetmp.setPreserveRatio(true);
		seetmp.setScaleX(.45);
		seetmp.setScaleY(.45);
		seetmp.setFitWidth(500);
		seetmp.setFitHeight(500);
		VBox tmpbox = new VBox(seetmp);
		tmpbox.setAlignment(Pos.CENTER);
				
		Label tmpl = new Label("SPM Series");
		tmpl.setAlignment(Pos.CENTER);
		tmpl.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		Label tmpl1 = new Label("Torque Meter Pro");
		tmpl1.setAlignment(Pos.CENTER);
		tmpl1.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		VBox tmplbox = new VBox(tmpl);
		tmplbox.setAlignment(Pos.CENTER);
		VBox tmpl1box = new VBox(tmpl1);
		tmpl1box.setAlignment(Pos.CENTER);
		Button ex8 = new Button("Explore >");
		ex8.setAlignment(Pos.CENTER);
		HBox exbox8 = new HBox(ex8);
		exbox8.setAlignment(Pos.CENTER);
		VBox tmpall = new VBox(tmpbox, tmplbox, tmpl1box, exbox8);
		
		//Torque Meter
		Image tmm = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\tm.png"));
		ImageView seetmm = new ImageView(tmm);
		seetmm.setPreserveRatio(true);
		seetmm.setScaleX(.45);
		seetmm.setScaleY(.45);
		seetmm.setFitWidth(500);
		seetmm.setFitHeight(500);
		VBox tmmbox = new VBox(seetmm);
		tmmbox.setAlignment(Pos.CENTER);
						
		Label tmml = new Label("TM Series");
		tmml.setAlignment(Pos.CENTER);
		tmml.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		Label tmml1 = new Label("Torque Meter");
		tmml1.setAlignment(Pos.CENTER);
		tmml1.setStyle("-fx-font-size: 15px;" + "-fx-font-family: Courier New;");
		VBox tmmlbox = new VBox(tmml);
		tmmlbox.setAlignment(Pos.CENTER);
		VBox tmml1box = new VBox(tmml1);
		tmml1box.setAlignment(Pos.CENTER);
		Button ex9 = new Button("Explore >");
		ex9.setAlignment(Pos.CENTER);
		HBox exbox9 = new HBox(ex9);
		exbox9.setAlignment(Pos.CENTER);
		VBox tmmall = new VBox(tmmbox, tmmlbox, tmml1box, exbox9);

		HBox b4 = new HBox(10, tmpall, tmmall);
		b4.setAlignment(Pos.CENTER);
		VBox r4 = new VBox(tmbox, b4);
		r4.setPadding(new Insets(15));
		
		grid4.add(r4, 0, 0);
		gridd.add(grid4, 0, 4);
		/* END OF GRID4 */
		
		/* MAKING GRID5 FOR TORQUE AND ANGLE METERS */
		GridPane grid5 = new GridPane();
		grid5.setAlignment(Pos.CENTER);
		grid5.setPadding(new Insets(10));
		grid5.getStyleClass().add("explore-more");
		grid5.setGridLinesVisible(false);
		
		ColumnConstraints col5 = new ColumnConstraints();
		col5.setHgrow(Priority.ALWAYS);
		grid5.getColumnConstraints().add(col5);
		
		Label tam = new Label ("Torque and Angle Meters");
		tam.setAlignment(Pos.CENTER);
		tam.setStyle("-fx-font-size: 20px;" + "-fx-font-family: Courier New;" + "-fx-font-weight: bold;");
		HBox tambox = new HBox(tam);
		tambox.setAlignment(Pos.CENTER);
		
		//Torque and Angle Meter Pro
		Image tamp = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\spa.png"));
		ImageView seetamp = new ImageView(tamp);
		seetamp.setPreserveRatio(true);
		seetamp.setScaleX(.45);
		seetamp.setScaleY(.45);
		seetamp.setFitWidth(500);
		seetamp.setFitHeight(500);
		VBox tampbox = new VBox(seetamp);
		tampbox.setAlignment(Pos.CENTER);
		
		Label tampl = new Label("SPA Series");
		tampl.setAlignment(Pos.CENTER);
		tampl.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		Label tampl1 = new Label("Torque and Angle Meter Pro");
		tampl1.setAlignment(Pos.CENTER);
		tampl1.setStyle("-fx-font-family: Courier new;" + "-fx-font-size: 15px;");
		VBox tamplbox = new VBox(tampl);
		tamplbox.setAlignment(Pos.CENTER);
		VBox tampl1box = new VBox(tampl1);
		tampl1box.setAlignment(Pos.CENTER);
		Button ex10 = new Button("Explore >");
		HBox exbox10 = new HBox(ex10);
		exbox10.setAlignment(Pos.CENTER);
		VBox tampall = new VBox(tampbox, tamplbox, tampl1box, exbox10);
		
		//Torque and Angle Meter
		Image tamr = new Image(new FileInputStream("C:\\Users\\DTSOp\\Pictures\\Saved Pictures\\web images\\torque&angle.png"));
		ImageView seetamr = new ImageView(tamr);
		seetamr.setPreserveRatio(true);
		seetamr.setScaleY(.45);
		seetamr.setScaleX(.45);
		seetamr.setFitWidth(500);
		seetamr.setFitHeight(500);
		VBox tamrbox = new VBox(seetamr);
		
		Label tamrl = new Label("TA Series");
		tamrl.setAlignment(Pos.CENTER);
		tamrl.setStyle("-fx-font-family: Courier New;" + "-fx-font-size: 15px;");
		Label tamrl1 = new Label("Torque and Angle Meter");
		tamrl1.setAlignment(Pos.CENTER);
		tamrl1.setStyle("-fx-font-family: Courier new;" + "-fx-font-size: 15px;");
		VBox tamrlbox = new VBox(tamrl);
		tamrlbox.setAlignment(Pos.CENTER);
		VBox tamrl1box = new VBox(tamrl1);
		tamrl1box.setAlignment(Pos.CENTER);
		Button ex11 = new Button("Explore >");
		HBox exbox11 = new HBox(ex11);
		exbox11.setAlignment(Pos.CENTER);
		VBox tamrall = new VBox(tamrbox, tamrlbox, tamrl1box, exbox11);
		
		HBox b5 = new HBox(10, tampall, tamrall);
		b5.setAlignment(Pos.CENTER);
		VBox r5= new VBox(tambox, b5);
		r5.setPadding(new Insets(15));
		
		grid5.add(r5, 0, 0);
		gridd.add(grid5, 0, 5);
		/* END OF GRID5 */
		
		/* SETTING STAGE AND SCENE */
		Scene scene = new Scene(pane, 1600, 1000);
		pane.requestFocus();
		scene.getStylesheets().addAll("webDetails.css");
		primaryStage.setTitle("Digitool Solutions: Torque Products");
		primaryStage.setMinHeight(1000);
		primaryStage.setMinWidth(1600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
