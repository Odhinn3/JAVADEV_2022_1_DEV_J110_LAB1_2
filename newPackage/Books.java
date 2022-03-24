
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Books extends Publishers {
    
    //поля класса
    private String title;
    private int year;
    private String authors[];
    private int autnum;
    
    
    //конструкторы
    public Books() {
    }
    
    public Books (String title, String city, int year, String name) {
       
        setTitle(title);
        super.setCity(city);
        setYear(year);
        super.setName(name);
       
        
    }

    public Books (String title, String[] authors, String city, int year, String name) {
        
        setTitle(title);
        setAuthors(authors);
        super.setCity(city);
        setYear(year);
        autnumDef();
        super.setName(name);
    }
    
    //геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.isEmpty())
            throw new IllegalArgumentException("Заголовок книги не может быть пустым!");
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0 || year == 0)
            throw new IllegalArgumentException("Год должен быть больше нуля!");
        this.year = year;
    }


    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        
        this.authors = authors;
    }
    
     public int getAutnum() {
        return autnum;
    }

    public void setAutnum(int autnum) {
        this.autnum = autnum;
    }
    
    //метод, задающий количество авторов, равное нулю при отсутствии авторов в массиве
    private void autnumDef(){
        if (authors == null)
            autnum = 0;
        autnum = authors.length;
    }
    
    
    //вывод на печать экземпляра класса
    @Override
    public void print(){
        switch (autnum){
            case 1:
                System.out.println("Название: " + getTitle() + ". Автор: " + Arrays.toString(getAuthors()) + ". " + getCity() + ": " + getName() + ", " + getYear());
                break;
            case 2:
                System.out.println("Название: " + getTitle() + ". Авторы: " + Arrays.toString(getAuthors())  + ". " + getCity() + ": " +  getName() + ", " + getYear());
                break;
            default:
                System.out.println("Название: " + getTitle() + ", " + getCity() + ": " +  getName() + ". " + getYear());
        }
        
    }
    
    //вывод на печать информации в массиве
    public static void printAll(Books[] booksArr){
        booksArr[0].print();
        booksArr[1].print();
        booksArr[2].print();
        booksArr[3].print();
        booksArr[4].print();
        }
       
}
