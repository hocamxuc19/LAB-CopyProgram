/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Book {
private String BookID;
private String BookTitle;
private String Author;
private String YearPublished;

    public Book() {
    }

    public Book(String BookID, String BookTitle, String Author, String YearPublished) {
        this.BookID = BookID;
        this.BookTitle = BookTitle;
        this.Author = Author;
        this.YearPublished = YearPublished;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(String YearPublished) {
        this.YearPublished = YearPublished;
    }

    @Override
    public String toString() {
        return "Book{" + "BookID=" + BookID + ", BookTitle=" + BookTitle + ", Author=" + Author + ", YearPublished=" + YearPublished + '}';
    }

    
    


        
    
}
