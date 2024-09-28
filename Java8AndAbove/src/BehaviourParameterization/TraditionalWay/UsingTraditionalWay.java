/***
 This example contains behavior parameterization with basic implementation
 Here, we are creating an interface and implementing that interface in separate classes based on
 required behaviour, we are creating instance of those implementation and passing those
 object in the param based on which implementation will be decided at runtime
 */

package BehaviourParameterization.TraditionalWay;
import java.util.ArrayList;
import java.util.List;

public class UsingTraditionalWay {
    public static void main(String[] args) {
        List<LanguageInfo> languageInfoList = List.of(
                new LanguageInfo(1, "JAVA", "Coding"),
                new LanguageInfo(2, "JAVA_SCRIPT", "Coding"),
                new LanguageInfo(3, "Python", "Coding"),
                new LanguageInfo(4, "English", "Spoken"),
                new LanguageInfo(5, "Hindi", "Spoken")
        );

        // passing the subclass implementation object as param for spoken language
        List<LanguageInfo> spokenLanguage = filterLanguage(languageInfoList, new SpokenLanguage());

        // passing the subclass implementation object as param for spoken language
        List<LanguageInfo> codingLanguage = filterLanguage(languageInfoList, new CodingLanguage());

        System.out.println("Spoken Language: ");
        spokenLanguage.forEach(System.out::print);
        System.out.println("\nCoding Language: ");
        codingLanguage.forEach(System.out::print);
    }

    //filter method call the appropriate implementation based on the input object
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
