package project.javafx;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class TeamCard extends VBox {
    public TeamCard(Team team) {

        ImageView imageView = new ImageView(new Image(team.getImagePath()));
        imageView.setFitWidth(100); 
        imageView.setFitHeight(100); 

        Label rankLabel = new Label("Rank: " + team.getRank());
        rankLabel.setStyle("-fx-font-weight: bold;-fx-text-fill: red; ");

        Label pointsLabel = new Label("Points: " + team.getPoints());

        Label matchesLabel = new Label("Matches: " + team.getMatchesPlayed());

        Label nameLabel = new Label(team.getName());
        nameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");

        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(imageView, nameLabel, rankLabel, pointsLabel, matchesLabel);
        this.setStyle("-fx-padding: 10; -fx-border-color: gray; -fx-border-width: 1; -fx-background-color: #f0f0f0;");
    }
}
