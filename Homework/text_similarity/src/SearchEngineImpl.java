package ru.kpfu.itis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SearchEngineImpl implements SearchEngine {
    TextAnalyzer analyzer;
    List<TextProviderWithHisSim> toSortCollection = new ArrayList<>();
    SearchEngineImpl(TextAnalyzer analyzer){
        this.analyzer = analyzer;
    }
    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider source, List<TextProvider> sourceList){
        for(TextProvider a: sourceList){
            toSortCollection.add(new TextProviderWithHisSim(a, analyzer.analyze(source, a)));
        }
        toSortCollection.sort(Comparator.comparingDouble(t -> 1.0 - t.sim));
        List<TextProvider> l = new ArrayList<>();
        for(TextProviderWithHisSim a: toSortCollection){
            l.add(a.t);
        }
        return l;
    }
}
