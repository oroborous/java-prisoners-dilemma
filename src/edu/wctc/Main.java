package edu.wctc;

public class Main {

    /*
    https://plato.stanford.edu/entries/prisoner-dilemma/
     */
    public static void main(String[] args) {

        for (int i = 0; i < 500; i++) {
            Prisoner prisonerA = PrisonerFactory.getPrisoner();
            Prisoner prisonerB = PrisonerFactory.getPrisoner();

            Warden.offerDeal(prisonerA, prisonerB);

            if (prisonerA instanceof Celebrity)
                ((Celebrity)prisonerA).pardon();
            if (prisonerB instanceof Celebrity)
                ((Celebrity)prisonerB).pardon();

            prisonerA.serveSentence();
            prisonerB.serveSentence();
        }

        System.out.printf("Not confessing results in average sentence of %.2f years.%n", FaithfulPrisoner.getAverageSentence());
        System.out.printf("Confessing results in average sentence of %.2f years.%n", BetrayingPrisoner.getAverageSentence());
        System.out.printf("%d celebrities evaded justice!", Celebrity.getCelebrityCount());
    }
}
