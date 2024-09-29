/*
 * This example contains behavior parameterization using lambda expression
 * Here, we have reduced the boilerplate code by using lambda expression as behavior
 * instead of passing the implementation in the param using anonymous class.
 * Using lambdas also eliminates the requirement of implementing the interface and overriding
 * */

package BehaviourParameterization.UsingLambdas;

import java.util.ArrayList;
import java.util.List;

public class UsingLambdas {

    public static void main(String[] args) {
        List<LanguageInfo> languageInfoList = List.of(
                new LanguageInfo(1, "JAVA", "Coding"),
                new LanguageInfo(2, "JAVA_SCRIPT", "Coding"),
                new LanguageInfo(3, "Python", "Coding"),
                new LanguageInfo(4, "English", "Spoken"),
                new LanguageInfo(5, "Hindi", "Spoken")
        );

        // passing the lambda expression as param
        List<LanguageInfo> spokenLanguage = filterLanguage(
                languageInfoList,
                (LanguageInfo languageInfo) -> "Spoken".equals(languageInfo.getType()));

        // passing the lambda expression as param
        List<LanguageInfo> codingLanguage = filterLanguage(
                languageInfoList,
                (LanguageInfo languageInfo) -> "Coding".equals(languageInfo.getType()));
        System.out.println("Spoken Language: ");
        spokenLanguage.forEach(System.out::print);
        System.out.println("\nCoding Language: ");
        codingLanguage.forEach(System.out::print);
    }

    //filter method call the appropriate implementation based on the input behaviour
    private static List<LanguageInfo> filterLanguage(List<LanguageInfo> languageInfoList, LanguagePredicate languagePredicate) {
        List<LanguageInfo> result = new ArrayList<>();
        for (LanguageInfo languageInfo : languageInfoList) {
            if (languagePredicate.test(languageInfo)) {
                result.add(languageInfo);
            }
        }
        return result;
    }
}

