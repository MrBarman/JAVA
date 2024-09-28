package BehaviourParameterization.TraditionalWay;

public class SpokenLanguage implements LanguagePredicate {
    @Override
    public boolean test(LanguageInfo languageInfo) {
        return "Spoken".equals(languageInfo.getType());
    }
}
