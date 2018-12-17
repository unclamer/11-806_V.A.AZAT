package ru.kpfu.itis;

import java.util.ArrayList;
import java.util.List;

public class CosTextAnalyzer implements TextAnalyzer {
    private List<String> allWords = new ArrayList<>();

    @Override
    public double analyze(TextProvider words1, TextProvider words2) {
        String[] str1 = words1.getText().replace(",","").toLowerCase().split(" ");
        String[] str2 = words2.getText().replace(",","").toLowerCase().split(" ");

        return (str1.length < str2.length)? cosSimilarity(str2, str1) : cosSimilarity(str1, str2);
    }
    private double cosSimilarity(String[] s1, String[] s2) {
        for(int i = 0; i < s1.length; i++){
            if(!allWords.contains(s1[i])){
                allWords.add(s1[i]);
            }
        }
        for(int i = 0; i < s2.length; i++){
            if(!allWords.contains(s2[i])){
                allWords.add(s2[i]);
            }
        }
        double[] vec1 = devVecByKoef(sToVec(s1));
        double[] vec2 = devVecByKoef(sToVec(s2));

        double ans = 0;
        for(int i = 0 ; i < vec1.length; i++){
            ans += vec1[i]*vec2[i];
        }
        return ans;
    }
    private double[] devVecByKoef(double[] vec){
        double koef = 0;
        for(int i = 0; i < vec.length; i++){
            koef += vec[i];

        }
        koef = Math.sqrt(koef);
        for(int i = 0; i < vec.length; i++){
            vec[i]/=koef;
        }
        return vec;
    }
    private double[] sToVec (String[] s){
        double[] vec = new double[allWords.size()];
        for (int i = 0; i < vec.length; i++) {
            for (String a : s) {
                if (a.equals(allWords.get(i))) {
                    vec[i] += 1;
                }
            }
        }
        return vec;
    }

}
