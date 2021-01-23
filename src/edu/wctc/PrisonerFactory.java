package edu.wctc;

public class PrisonerFactory {
    public static final double COOPERATION_PROBABILITY = 0.95;

    public static Prisoner getPrisoner() {
        double chance = Math.random();
        if (chance < COOPERATION_PROBABILITY)
            return new FaithfulPrisoner();
        else if (chance > 0.99)
            return new Celebrity();
        else
            return new BetrayingPrisoner();
    }
}
