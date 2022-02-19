package HomeWork1;

public class team {

    private String teamName;
    private String playerName;
    private int playerNumber;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;

    public team(String teamName, String playerName, int playerNumber, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.teamName = teamName;
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }


    public String getAllInformation() {
        return this.teamName + ",name: " +
                this.playerName + ",number: " +
                this.playerNumber + ". Max Run Distance: " +
                this.maxRunDistance + "m. Max Jump Height: " +
                this.maxJumpHeight + "m. Max Swim Distance: " +
                this.maxSwimDistance + "m. ";
    }


    public void moveSwim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(playerName + " is swimming " + distance + "m. Max distance:" + maxSwimDistance);
        }
    }

    public void moveJump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(playerName + " is jumping " + height + "m. Max jump height:" + maxJumpHeight);
        }
    }

    public void moveRun(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(playerName + " is running " + distance + "m. Max distance:" + maxRunDistance);
        }
    }

}


