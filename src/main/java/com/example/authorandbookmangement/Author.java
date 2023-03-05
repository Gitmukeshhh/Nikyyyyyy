package com.example.authorandbookmangement;

public class Author {
    private String AuthorName;
    private int age;

    private  int authpage;

    public Author(String authorName, int age,int authpage) {
        AuthorName = authorName;
        this.age = age;
        this.authpage=authpage;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAuthpage() {
        return authpage;
    }

    public void setAuthpage(int authpage) {
        this.authpage = authpage;
    }
}
