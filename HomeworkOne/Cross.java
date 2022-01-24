package HomeworkOne;

public class Cross extends Let {
    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(Player player) {
        player.run(super.getDifficultyLet());
    }
}
