package HomeworkOne;

public class Fight extends Let {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(Player player) {
        player.fight(super.getDifficultyLet());
    }
}
