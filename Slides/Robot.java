
public class Robot {

    public String teamName;
    public int teamNumber;

    private int climbLevel;
    private int ballsScored;

    Robot(int numberOfTeam, String nameOfTeam) {

        teamNumber = numberOfTeam;
        teamName = nameOfTeam;

    }

    public void scoreBalls(int numScored) {

        ballsScored += numScored;

    }

    public void climbLevelReached(int climbReached){

        climbLevel = climbReached;

    }

    public int pointsScored(){

        int points = 0;

        points += ballsScored * 2;

        switch (climbLevel) {
        case 1:
            points += 4;
            break;
        case 2:
            points += 6;
            break;
        case 3:
            points += 10;
            break;
        case 4:
            points += 15;
            break;
        default:
            System.out.println("Value not between 1 and 4");
        }

        return points;

    }

}
