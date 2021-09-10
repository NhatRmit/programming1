import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Team a = new Team("A");
        Team b = new Team("B");
        Team c = new Team("C");
        Team d = new Team("D");

        b.win(a);
        b.win(c);
        b.lose(d);
        a.win(c);
        c.win(d);
        a.win(d);

        LeaderBoard leader = new LeaderBoard();

        leader.add(c);
        leader.add(a);
        leader.add(b);
        leader.add(d);

        for (Team t : leader.realRank()) {
            System.out.println(t);
        }
    }
}

class Team {
    String name;
    ArrayList<String> status = new ArrayList<>();
    int point;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public String toString() {
        return "Team: " + this.name + " - " + "Point: " + this.point;
    }

    public void win(Team team) {
        if (this == team) {
            return;
        }
        if (this != team) {
            this.status.add("win");
            team.status.add("lose");
        }
        team.point = countPoint();
        this.point = countPoint();
    }

    public void lose(Team team) {
        if (this == team) {
            return;
        }
        if (this != team) {
            this.status.add("lose");
            team.status.add("win");
        }
        team.point = countPoint();
        this.point = countPoint();
    }

    public void draw(Team team) {
        if (this == team) {
            return;
        }
        if (this != team) {
            this.status.add("draw");
            team.status.add("draw");
        }
        team.point = countPoint();
        this.point = countPoint();
    }

    public int countPoint() {
        int point = 0;
        for (String str : status) {
            if (str == "win") {
                point += 3;
            } else if (str == "draw") {
                point += 1;
            } else {
                point += 0;
            }
        }
        return point;
    }
}

class SortTeamByPoint implements Comparator<Team> {
    public int compare(Team t1, Team t2) {
        if (t1.point > t2.point) {
            return -1;
        }
        if (t1.point < t2.point) {
            return 1;
        }
        return 0;
    }
}

class LeaderBoard {
    ArrayList<Team> listTeam = new ArrayList<>();

    public void add(Team team) {
        this.listTeam.add(team);
    }
    
    public Team[] rank() {
        this.listTeam.sort(new SortTeamByPoint());
        Team[] arrayTeam = this.listTeam.toArray(new Team[0]);
        return arrayTeam;
    }

    public Team[] realRank() {
        this.listTeam.sort(new SortTeamByPoint());
        
        for(int i = 0; i < this.listTeam.size(); i++){
            if(i != this.listTeam.size()-1) {
                if(this.listTeam.get(i).point == this.listTeam.get(i+1).point) {
                    if(true) {
                        Collections.swap(this.listTeam, i, i+1);
                    }
                }
            }
        }

        Team[] arrayTeam = listTeam.toArray(new Team[0]);
        return arrayTeam;
    }
}