import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playersInTeam;
    private int maxTeamSize;


    public Team(String name) {
        this.name = name;
        this.maxTeamSize = 16;
        this.playersInTeam = new ArrayList<Player>();
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player newPlayer) {
        if (size() < this.maxTeamSize) {
            playersInTeam.add(newPlayer);
        }
    }

    public void printPlayers() {
        for (Player player : playersInTeam) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxTeamSize = maxSize;

    }

    public int size() {
        return playersInTeam.size();
    }

    public int goals() {
        int sum = 0;
        for (Player player : playersInTeam) {
            sum += player.goals();
        }

        return sum;
    }

}
