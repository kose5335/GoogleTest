package MailTest;

import java.util.Random;

/**
 * Created by Sergey on 11/21/2016.
 */
public class GetRandUserName {
    public static String userName = (getRandWord (5)+getRandNum (3));

    public static String getRandWord(int wordLength) {
        String word = "";
        for (int i=0;i<wordLength;i++){
            word = word + (char)(Math.random ()*25+97);
        }
        return word;
    }

    public static String getRandNum(int numLength) {
        Random rand = new Random ();
        String num="";
        for (int i=0;i<numLength;i++){
            num = num + rand.nextInt (10);
        }
        return num;
    }
}
