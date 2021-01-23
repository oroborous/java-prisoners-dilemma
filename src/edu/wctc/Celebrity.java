package edu.wctc;

public class Celebrity extends BetrayingPrisoner implements Pardonable {
    public static int celebrityCount;

    public Celebrity() {
        celebrityCount++;
    }

    public static int getCelebrityCount() {
        return celebrityCount;
    }

    @Override
    public void pardon() {
        setSentenceYears(0);
    }
}
