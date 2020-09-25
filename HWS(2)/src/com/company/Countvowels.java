package com.company;

public class Countvowels {
    public int count=0;
    public void countVowels(String string){
        for(int i=0 ;i< string.length() ;i++){
            if (('e' == string.charAt(i)) || ('a' == string.charAt(i)) || ('i' == string.charAt(i)) || ('u' == string.charAt(i)) || ('o' == string.charAt(i))) {
                count++;
            }
        }
        System.out.println(count+"vowel sounds");

    }
}
