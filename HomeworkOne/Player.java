package HomeworkOne;


public class Player {
    private Status status = Status.isFailed;
    private String playerName;
    private int power;

    public Player(String playerName, int power) {
        this.playerName = playerName;
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void fight(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.isPassed," победил в бою");
        }
        else{
            changeStatus(Status.isFailed," проиграл в бою");
        }
    }
    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.isPassed," пробежал кросс");
        }
        else{
            changeStatus(Status.isFailed,"  не пробежал кросс");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(playerName + message);
    }

}
