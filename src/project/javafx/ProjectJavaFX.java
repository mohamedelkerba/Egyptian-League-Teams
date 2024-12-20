package project.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ProjectJavaFX extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Egyptian League Teams 2023-2024");
        Team[]  teams = getTeams();
        FlowPane myPane = new FlowPane(); 
        
        myPane.setVgap(10);
        myPane.setHgap(10); 
        myPane.setStyle("-fx-padding: 10;");
        
        for (Team team : teams) {
            myPane.getChildren().add(new TeamCard(team));
        }

        ScrollPane scrollPane = new ScrollPane(myPane);
        scrollPane.setFitToWidth(true);

        Scene scene = new Scene(scrollPane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
  

    private Team[] getTeams() {
    try {
        Team[] teams = new Team[18]; 
        teams[0]  = new Team("Al Ahly", 1, 85, 34, "/images/ahli.png");
        teams[1]  = new Team("Pyramids", 2, 79, 34, "/images/pyramids.jpg");
        teams[2]  = new Team("Zamalek", 3, 56, 34, "/images/zamalek.png");
        teams[3]  = new Team("El-Masri", 4, 55, 34, "/images/masri.png");
        teams[4]  = new Team("Modern", 5, 54, 34, "/images/modern.jpg");
        teams[5]  = new Team("Smouha", 6, 54, 34, "/images/smouha.png");
        teams[6]  = new Team("Ceramica Cleoptra", 7, 51, 34, "/images/ciramica.jpg");
        teams[7]  = new Team("Enppi", 8, 46, 34, "/images/enbi.jpg");
        teams[8]  = new Team("Talae Elgaeish", 9, 45, 34, "/images/TalaeaElgaish.jpg");
        teams[9]  = new Team("Al-Ethad Alex", 10, 42, 34, "/images/el_ethad.png");
        teams[10] = new Team("Pharco", 11, 41, 34, "/images/pharco.jpg");
        teams[11] = new Team("Harras-El-hodoud", 12, 39, 34, "/images/harras-el-hodoud.jpg");
        teams[12] = new Team("Ismaili", 13, 36, 34, "/images/ismaealy.png");
        teams[13] = new Team("Masr-Elamakasa", 14, 33, 34, "/images/masr_elamakasa.jpg");
        teams[14] = new Team("Zed", 15, 28, 34, "/images/zed.jpg");
        teams[15] = new Team("El-Dakhleya", 16, 26, 34, "/images/Eldakhleya.jpg");
        teams[16] = new Team("Petrojet", 17, 20, 34, "/images/Petrojet.jpg");
        teams[17] = new Team("Baladya-Elmahala", 18, 20, 34, "/images/baladya.jpg");

        return teams;

    } catch (Exception e) {
        System.out.println("Error loading teams: " + e.getMessage());
        return null; 
    }
}
 
    public static void main(String[] args) {
        launch(args);
    }
}


  
//    private List<Team> getTeams() {
//        List<Team> teams = new ArrayList<>();
//        try {
//            teams.add(new Team("Al Ahly", 1, 85, 34, "/images/ahli.png"));
//            teams.add(new Team("Pyramids", 2, 79, 34, "/images/pyramids.jpg"));
//            teams.add(new Team("Zamalek", 3, 56, 34, "/images/zamalek.png"));
//            teams.add(new Team("El-Masri", 4, 55, 34, "/images/masri.png"));
//            teams.add(new Team("Modern", 5, 54, 34, "/images/modern.jpg"));
//            teams.add(new Team("Smouha", 6, 54, 34, "/images/smouha.png"));
//            teams.add(new Team("Ceramica Cleoptra", 7, 51, 34, "/images/ciramica.jpg"));
//            teams.add(new Team("Enppi", 8, 46, 34, "/images/enbi.jpg"));
//            teams.add(new Team("Talae Elgaeish", 9, 45, 34, "/images/TalaeaElgaish.jpg"));
//            teams.add(new Team("Al-Ethad Alex", 10, 42, 34, "/images/el_ethad.png"));
//            teams.add(new Team("Pharco", 11, 41, 34, "/images/pharco.jpg"));
//            teams.add(new Team("Harras-El-hodoud", 12, 39, 34, "/images/harras-el-hodoud.jpg"));
//            teams.add(new Team("Ismaili", 13, 36, 34, "/images/ismaealy.png"));
//            teams.add(new Team("Masr-Elamakasa", 14, 33, 34, "/images/masr_elamakasa.jpg"));
//            teams.add(new Team("Zed", 15, 28, 34, "/images/zed.jpg"));
//            teams.add(new Team("El-Dakhleya", 16, 26, 34, "/images/Eldakhleya.jpg"));
//            teams.add(new Team("Petrojet", 17, 20, 34, "/images/Petrojet.jpg"));
//            teams.add(new Team("Baladya-Elmahala", 18, 20, 34, "/images/baladya.jpg"));
//
//        } catch (Exception e) {
//            System.out.println("Error loading teams: " + e.getMessage());
//        }
//        return teams;
//    } 