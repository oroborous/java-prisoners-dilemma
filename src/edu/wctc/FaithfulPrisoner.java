package edu.wctc;

public class FaithfulPrisoner extends Prisoner {
    private static double totalSentenceYears;
    private static int totalFaithfulPrisoners;

    public FaithfulPrisoner() {
        totalFaithfulPrisoners++;
    }

    @Override
    public boolean confesses() {
        return false;
    }

    public static double getAverageSentence() {
        return totalFaithfulPrisoners == 0 ? -1 : totalSentenceYears / totalFaithfulPrisoners;
    }

    @Override
    public void serveSentence() {
        totalSentenceYears += getSentenceYears();
    }
}
