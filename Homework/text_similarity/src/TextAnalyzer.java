package ru.kpfu.itis;

public interface TextAnalyzer {
    /**
     * Counts the similarity between texts, provided by TextProviders
     *
     * @return coefficient of similarity
     */
    double analyze(TextProvider te1, TextProvider te2);
}
