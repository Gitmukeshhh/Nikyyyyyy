package com.example.authorandbookmangement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ABControoler {

    @Autowired
    ABService abService;


    @PostMapping("add_book")
    public ResponseEntity addbook(@RequestBody Book book){
        String str=abService.addbook(book);
         return  new ResponseEntity(str, HttpStatus.OK);
    }

    @PostMapping("add_Author")
    public ResponseEntity addAuthor(@RequestBody Author author){
        String str=abService.addAuthor(author);
        return  new ResponseEntity(str, HttpStatus.OK);
    }

    @GetMapping("get_hight-no-of-pages")
    public ResponseEntity getbookHNOP(){

        String bookname=abService.getbookHNOP();
        return  new ResponseEntity<>( bookname,HttpStatus.CREATED);
    }


    @PutMapping("uppdate_page/{bookname}/{Extrapages}")

    public ResponseEntity uppdatepages(String bookname,int extrapage){

        String str=abService.uppdatepages(bookname,extrapage);
        return new ResponseEntity<>(str,HttpStatus.CREATED);

    }

    @GetMapping("author_max_pages")

    public ResponseEntity authormaxpages(){

        String authorName=abService.authormaxpages();
        return  new ResponseEntity<>(authorName,HttpStatus.CREATED);
    }




}
