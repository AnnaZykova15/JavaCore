package HomeWork1;

public class Course {

    public static void main (String[] args) {

        team[] teamChampions = {
                new team("Champions", "Maxim", 1, 500, 4, 1500),
                new team("Champions", "Darya", 2, 300, 3, 2000),
                new team("Champions", "Anna", 3, 500, 3, 1500),
                new team("Champions", "Artem", 4, 500, 4, 2500),
        };

        showTeamInfo(teamChampions);
        teamChampions[0].moveRun(300);
        teamChampions[1].moveRun(300);
        teamChampions[2].moveRun(300);
        teamChampions[3].moveRun(300);
        teamChampions[0].moveSwim(2000);
        teamChampions[1].moveSwim(2000);
        teamChampions[2].moveSwim(2000);
        teamChampions[3].moveSwim(2000);
        teamChampions[0].moveJump(3);
        teamChampions[1].moveJump(3);
        teamChampions[2].moveJump(3);
        teamChampions[3].moveJump(3);

    }


        public static void showTeamInfo(team[] player ) {
            for (int i = 0; i < player.length; i++) {
                System.out.println(player[i].getAllInformation());
            }
        }







}
