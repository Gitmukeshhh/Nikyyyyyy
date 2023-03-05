package com.example.authorandbookmangement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ABRepo {
    static HashMap<String,Book> bookHashMap=new HashMap<>();
    static HashMap<String,Author> AuthHashmap=new HashMap<>();


     // addbookname by key=bookname
    public String addbook(Book book){
        String bookname= book.getBookName();
        if(bookHashMap.containsKey(bookname)){
            return "data is avalibal";
        }
        bookHashMap.put(bookname,book);
        return "added";
    }

    // addAuthor key=Authorname
    public String addAuthor(Author author){

        String AuthorName=author.getAuthorName();
        if(AuthHashmap.containsKey(AuthorName)){

            return "data is avalibal";
        }
           AuthHashmap.put(AuthorName,author);
           return "add";
    }


    //getbookofmaxnumberofpages
    public String getbookHNOP(){
        String name="";
        int max=0;
        for(Book book:bookHashMap.values()){
            int pages= book.getPages();
            if(pages>max){
                max=pages;
                name=book.getBookName();
            }
        }
              return name;
    }


      // uppdate pages;
    public  String uppdatepages(String bookname,int extrapage){

            if(!bookHashMap.containsKey(bookname)){
                return "NOT possibal to add pages";
            }
            Book book=bookHashMap.get(bookname);
            int oldpages=book.getPages();
            int newpages=oldpages+extrapage;
            book.setPages(newpages);
            return "add";

    }


       // AUTHOR NAME WHO HAVE MAX NUMBER OF PAGES
    public String authormaxpages(){
        String Authorname="";
        int max=0;
        for(Author author:AuthHashmap.values()){

            int pages= author.getAuthpage();
            if(pages>max){
                max=pages;
                Authorname=author.getAuthorName();
            }
        }
               return Authorname;
    }


}
