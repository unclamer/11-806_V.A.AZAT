package ru.kpfu.itis;

import java.util.Comparator;
import java.util.List;

public interface SearchEngine {
    public List<TextProvider> getSortedByRelevanceList(TextProvider source, List<TextProvider> sourceList);
}
