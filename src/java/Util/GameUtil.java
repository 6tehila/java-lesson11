/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author User
 */
public class GameUtil {
   
    static List<String> sentences=new ArrayList<>();
    public static String sentence;
     //static String sentence;

    public static StringBuilder sentenceToShow;
    public static int numOfTryings;
    
    
      public static void chooseSentence(){
          Random rand = new Random();
        int index=rand.nextInt(sentences.size());
          sentence=sentences.get(index);
          initializeSentenceToShow();
          numOfTryings=0;
      }
      public static void initializeSentenceToShow() {
        sentenceToShow = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) 
                sentenceToShow.append('_');
            else 
                sentenceToShow.append(c);          
        }      
      }
     public static void updateSentenceToShow(char letter){
          sentenceToShow = new StringBuilder();
         for(char c:sentence.toCharArray()){
             if(c==letter)
                 sentenceToShow.append(letter);
             else
                 sentenceToShow.append('_');
         }
      }
   
     public static void increaseNumOfTryings(){
         numOfTryings++;
     }
     
     public  boolean checkWinning(){
        return !sentenceToShow.toString().contains("_");     
     }
     
     static {
        sentences.add("hello tehila");
        sentences.add("good day");

        chooseSentence();
        initializeSentenceToShow();
        
    }
        
}
