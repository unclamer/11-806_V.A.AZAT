package ru.kpfu.itis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer a = new JaccardTextAnalyzer();
        String s1 = "Жизнь тяжела";
        List<TextProvider> newList = new ArrayList<>();
        newList.add(new SimpleTextProvider("Жизнь сложная"));
        newList.add(new SimpleTextProvider("Жизнь не такая уж и сложная"));
        newList.add(new SimpleTextProvider("Смерть близка"));
        newList.add(new SimpleTextProvider("Не смерть ценна, а жизнь"));
        newList.add(new SimpleTextProvider("Тупа рандомный текст, ох, хай, марк"));
        SearchEngine search = new SearchEngineImpl(new JaccardTextAnalyzer());
        search.getSortedByRelevanceList(new SimpleTextProvider(s1), newList);
        for(TextProvider b: newList){
            System.out.print(b.toString());
        }
    }
}
