package edu.wctc;

public class BetrayingPrisoner extends Prisoner{
    private static double totalSentenceYears;
    private static int totalBetrayingPrisoners;

    public BetrayingPrisoner() {
        totalBetrayingPrisoners++;
    }

    @Override
    public boolean confesses() {
        return true;
    }

    public static double getAverageSentence() {
        return totalBetrayingPrisoners == 0 ? -1 : totalSentenceYears / totalBetrayingPrisoners;
    }

    @Override
    public void serveSentence() {
        totalSentenceYears += getSentenceYears();
    }
}
