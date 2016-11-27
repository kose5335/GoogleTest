package WebTesting;

/**
 * Created by Sergey on 11/17/2016.
 */
public class ComparisonWords {
    public static void Comp(String word1, String word2) {
        if (EnterWords.word(word1).equals(word2)) System.out.println("По переводу слова \""+word1+"\" тест успешен");
        else System.out.println("По переводу слова \""+word1+"\" тест  завалился");
        //System.out.println(word1+" "+word2);
    }
}
