package edu.wctc;

public abstract class Prisoner {
    private double sentenceYears;

    public double getSentenceYears() {
        return sentenceYears;
    }

    public void setSentenceYears(double sentenceYears) {
        this.sentenceYears = sentenceYears;
    }

    public abstract boolean confesses();

    public abstract void serveSentence();

}
