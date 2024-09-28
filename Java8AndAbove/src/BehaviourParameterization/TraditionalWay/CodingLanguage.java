package BehaviourParameterization.TraditionalWay;

public class CodingLanguage implements LanguagePredicate {
    @Override
    public boolean test(LanguageInfo languageInfo) {
        return "Coding".equals(languageInfo.getType());
    }
}
