/*
* This example contains behavior parameterization using anonymous class
* Here, instead of implementing the interface in separate classes, we are passing
* the implementation in the param using anonymous class and overriding the method
* in the param itself
* */

package BehaviourParameterization.UsingAnonymousClass;

import java.util.ArrayList;
import java.util.List;

public class UsingAnonymousClass {
    public static void main(String[] args) {
        List<LanguageInfo> languageInfoList = List.of(
                new LanguageInfo(1,"JAVA","Coding"),
                new LanguageInfo(2,"JAVA_SCRIPT","Coding"),
                new LanguageInfo(3,"Python","Coding"),
                new LanguageInfo(4,"English","Spoken"),
                new LanguageInfo(5,"Hindi","Spoken")
        );

        // passing the function implementation as param
        List<LanguageInfo> spokenLanguage = filterLanguage(languageInfoList, new LanguagePredicate(){
            @Override
            public boolean test(LanguageInfo languageInfo) {
                return "Spoken".equals(languageInfo.getType());
            }
        });

        // passing the function implementation as param
        List<LanguageInfo> codingLanguage = filterLanguage(languageInfoList, new LanguagePredicate(){
            @Override
            public boolean test(LanguageInfo languageInfo) {
                return "Coding".equals(languageInfo.getType());
            }
        });
        System.out.println("Spoken Language: ");
        spokenLanguage.forEach(System.out::print);
        System.out.println("\nCoding Language: ");
        codingLanguage.forEach(System.out::print);
    }

    //filter method call the appropriate implementation based on the input behaviour
    public static List<LanguageInfo> filterLanguage(List<LanguageInfo> languageInfoList, LanguagePredicate languagePredicate){
        List<LanguageInfo> result = new ArrayList<>();
        for(LanguageInfo languageInfo: languageInfoList){
            if(languagePredicate.test(languageInfo)){
                result.add(languageInfo);
            }
        }
        return result;
    }
}

