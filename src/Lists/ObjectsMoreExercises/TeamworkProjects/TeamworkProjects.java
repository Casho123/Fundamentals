package Lists.ObjectsMoreExercises.TeamworkProjects;

import java.util.*;

public class TeamworkProjects {

    public static class Team {

        private String name;
        private String creator;
        private List<String> members;

        public Team(String name, String creator) {
            this.name = name;
            this.creator = creator;
            this.members = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public String getCreator() {
            return creator;
        }

        public List<String> getMembers() {
            return members;
        }

        public void addMember(String name) {
            this.members.add(name);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Team> teams = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("-");
            String user = elements[0];
            String teamName = elements[1];

            Team team = new Team(teamName, user);

            if (teamExists(teams, teamName)) {
                System.out.printf("Team %s was already created!\n", teamName);
            } else if(creatorAlreadyMadeATeam(teams, user)) {
                System.out.printf("%s cannot create another team!\n", user);
            } else {
                teams.add(team);
                System.out.printf("Team %s has been created by %s!\n", teamName, user);
            }
        }

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end of assignment")) {
                break;
            }
            String[] elements = input.split("->");
            String user = elements[0];
            String teamName = elements[1];
            if (!teamExists(teams,teamName)) {
                System.out.printf("Team %s does not exist!\n", teamName);
            } else if(memberExists(teams, user)) {
                System.out.printf("Member %s cannot join team %s!\n", user, teamName);
            } else {
                for (Team team : teams) {
                    if (team.getName().equals(teamName)) {
                        team.addMember(user);
                    }
                }

            }
        }
        teams.sort(Comparator.comparing(Team::getName));
        for (Team team : teams) {
            if (team.getMembers().size() > 0) {
                System.out.println(team.getName());
                System.out.printf("- %s\n", team.getCreator());
                for (String member : team.getMembers()) {
                    System.out.println("-- " + member);
                }

            }
        }
        System.out.println("Teams to disband:");
        for (Team team : teams) {
            if (team.getMembers().size() == 0) {
                System.out.println(team.getName());

            }

        }

    }

    public static boolean teamExists(List<Team> teams, String name) {
        for (Team team1 : teams) {
            if (team1.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public static boolean creatorAlreadyMadeATeam(List<Team> teams, String creator) {
        for (Team team : teams) {
            if (team.getCreator().equals(creator)) {
                return true;
            }
        }
        return false;
    }

    public static boolean memberExists(List<Team> teams, String name) {
        for (Team team : teams) {
            if (team.getCreator().equals(name)) {
                return true;
            }
            for (String member : team.getMembers()) {
                if (member.equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }
}
