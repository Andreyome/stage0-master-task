package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;


    public Animal( String color,int numberOfPaws,boolean hasFur){
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }
    public String getDescription(){
        String result="";
        result+="This animal is mostly " +color+ ". It has ";
        if (numberOfPaws!=1){
            result+=numberOfPaws + " paws and ";
        }
        else{
            result+=numberOfPaws + " paw and ";
        }
        if (hasFur==true){
            result+= "a fur.";
        }
        else{
            result+="no fur.";
        }
        return result;
    }
}