package AutomationPractice.TranslatorTest;

/**
 * Created by Sergey on 11/17/2016.
 */
public class Translator {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        //String word1="товарищ",word2="привет",word3="пока",transl1="comrade",transl2="hi",transl3="as long as";
        Words words=new Words();
        ComparisonWords.Comp(words.word1,words.transl1);
        ComparisonWords.Comp(words.word2,words.transl2);
        ComparisonWords.Comp(words.word3,words.transl3);
    }
}
