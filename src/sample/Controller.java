package sample;

import javafx.fxml.FXML;


public class Controller {





    @FXML
    public void competitionClicked(){
        Main.changeToScene("ActiveCompetition.fxml");

    }

    @FXML
    public void changedClicked(){
        Main.changeToScene("ActiveCompetitionChangeSteps.fxml");
    }

    @FXML
    public void comfirmStepsClicked(){
        Main.changeToScene("ActiveCompetition.fxml");
    }
    @FXML
    public void compareClicked(){
        Main.changeToScene("Compare.fxml");
    }

    @FXML
    public void leaveClicked(){

    }

    @FXML
    public void competitionsClicked(){
        Main.changeToScene("AvailableCompetitions.fxml");

    }

    @FXML
    public void healthDataClicked(){
        Main.changeToScene("healthData.fxml");
    }

    @FXML
    public void usersClicked(){
        Main.changeToScene("otherUsers.fxml");

    }



    @FXML
    public void indexClicked(){
        if(Main.hasCompetition){
            Main.changeToScene("menu.fxml");
        }else{
            Main.changeToScene("menu-no-active.fxml");
        }
    }

    @FXML
    public void dashboardClicked(){
        if(Main.hasCompetition){
            Main.changeToScene("Dashboard.fxml");
        }else{
            Main.changeToScene("dashboard-noActive.fxml");
        }
    }

    @FXML
    public void userClicked(){
        Main.changeToScene("UserView.fxml");
    }
}
