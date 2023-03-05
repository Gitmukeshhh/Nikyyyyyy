package com.example.authorandbookmangement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;

@Service
public class ABService {

    @Autowired
    ABRepo abRepo;

    public  String addbook(Book book){
        return abRepo.addbook(book);
    }

    public String addAuthor(Author author){
        return  abRepo.addAuthor(author);
    }

    public String getbookHNOP(){
       return abRepo.getbookHNOP();

    }
    public  String uppdatepages(String bookname,int extrapage){
        return abRepo.uppdatepages(bookname,extrapage);
    }

    public  String authormaxpages (){
        return   abRepo.authormaxpages();
    }

}
