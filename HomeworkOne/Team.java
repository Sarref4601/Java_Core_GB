package HomeworkOne;


public class Team {
    private Player[] players;
    private String teamName;

    public Team(String teamName, Player... players) {
        this.players = players;
        this.teamName = teamName;
    }

    public void showResults() {
        System.out.println("Полосу препятствий преодолевала команда: " + teamName);
        for (Player player : players) {
            if (player.getStatus() == Status.isFailed) {
                showResultIsFailed(player);
            } else {
                showResultIsPassed(player);
            }
        }
    }

    private void showResultIsFailed(Player player) {
        System.out.println(player.getPlayerName() + " Не прошел полосу препятствий");
    }

    private void showResultIsPassed(Player player) {
        System.out.println(player.getPlayerName() + " Успешно прошел полосу препятствий");
    }

    public Player[] getPlayers() {
        return players;
    }
}
