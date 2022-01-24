package HomeworkOne;

public class Course {
    private Let[] lets;

    public Course(Let... lets) {
        this.lets = lets;
    }
    public void doIt(Team players) {
        for (Player player: players.getPlayers()) {
            for (Let let :lets) {
                let.goChallenge(player);
            }
        }
    }
}
