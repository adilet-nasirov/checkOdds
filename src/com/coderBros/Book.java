package com.coderBros;

public class Book {
    String title;
    String author;
    int yearOfPublish;
    String type;
    String language;
    public Book(String title, String author, int yearOfPublish, String type, String language){
        this.yearOfPublish= yearOfPublish;
        this.title= title;
        this.type= type;
        this.language= language;
        this.author= author;
    }
    public  String getInfo(){
        return (title+' '+ author+' '+ language);
    }
//    double rating;
}
