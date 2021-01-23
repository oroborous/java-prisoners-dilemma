package edu.wctc;

public class Warden {
    public static final double REWARD = 1; // neither confess
    public static final double PUNISHMENT = 5; // both confess
    public static final double TEMPTATION = 0; // only I confess
    public static final double SUCKER = 20; // only they confess

    public static void offerDeal(Prisoner prisonerA, Prisoner prisonerB) {
        if (prisonerA.confesses() && prisonerB.confesses()) {
            // both confess
            prisonerA.setSentenceYears(PUNISHMENT);
            prisonerB.setSentenceYears(PUNISHMENT);
        } else if (prisonerA.confesses() && !prisonerB.confesses()) {
            // A confesses and B doesn't
            prisonerA.setSentenceYears(TEMPTATION);
            prisonerB.setSentenceYears(SUCKER);
        } else if (!prisonerA.confesses() && prisonerB.confesses()) {
            // B confesses and A doesn't
            prisonerA.setSentenceYears(SUCKER);
            prisonerB.setSentenceYears(TEMPTATION);
        } else {
            // neither confess
            prisonerA.setSentenceYears(REWARD);
            prisonerB.setSentenceYears(REWARD);
        }

    }
}
