package step2;

import java.util.Scanner;

public class SportsEvents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sports = scanner.next();
        String team = scanner.next();
        MyFavourateTeam myFavourateTeam = new MyFavourateTeam();
        myFavourateTeam.setSports(sports);
        myFavourateTeam.setTeam(team);
        myFavourateTeam.introduction();
    }
}

interface Sports {
    void setSports(String sports);
}

interface Team {
    void setTeam(String team);
}

interface ChooseTeam extends Sports, Team {
    void introduction();
}

/********** Begin *********/

class MyFavourateTeam implements ChooseTeam {
    private String sports;
    private String team;

    public String getSports() {
        return sports;
    }

    public String getTeam() {
        return team;
    }

    public MyFavourateTeam() {

    }

    @Override
    public void setSports(String sports) {
        this.sports = sports;
    }

    @Override
    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void introduction() {
        System.out.println("我最喜欢的体育运动是"+this.sports+"，我最喜欢的球队是"+team);
    }
}

/********** End *********/
