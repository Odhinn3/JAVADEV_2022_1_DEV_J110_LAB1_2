package MainPackage;

import java.util.Arrays;

public class Books {
    
    //поля класса
    private String title;//название книги
    private Publishers pub;//издательство (ссылка на экземпляр)
    private int year;//год издания
    private String authors[];//массив авторов
    
    //конструкторы
    public Books() {
    }
    
    //конструктор экземпляра книги без авторов
    public Books(String title, Publishers pub, int year) {
        setTitle(title);
        setPub(pub);
        setYear(year);
    }

    //конструктор экземпляра книги с авторами
    public Books(String title, String[] authors, Publishers pub, int year) {
        this(title, pub, year);
        setAuthors(authors);
    }

    //блок геттеров и сеттеров
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.isEmpty() || title == null)//проверяем заголовок на наличие и пустоту
            throw new IllegalArgumentException("Заголовок книги не задан или пуст!");
        this.title = title;
    }

    public Publishers getPub() {
        return pub;
    }

    public void setPub(Publishers pub) {
        this.pub = pub;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0 || year == 0)
            throw new IllegalArgumentException("Год не может быть меньше или равен нулю !");
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    
    //метод, возвращающий количество авторов книги
    public int getAutnum (){
        int ai;
        if (authors != null)
            ai = authors.length;
        else
            ai = 0;
        return ai;
    }
    
    //метод, возвращающий автора по индексу
    public String getAuth(int i) {
        if (i < 0)
            throw new IllegalArgumentException("Отрицательный индекс автора!");
        else if (i > authors.length)
            throw new IllegalArgumentException("Запрашиваемый индекс выше длины массива!");
        System.out.println(authors[i]);
        return authors[i];  
    }

    //вывод на печать экземпляра класса   
    public void print(){
        if (authors != null){
            if (authors.length > 1) {
                System.out.println("Название: " + getTitle() + ". Авторы: "
                        + Arrays.toString(getAuthors())  + ". " + getPub().getCity() + ": "
                        + getPub().getName() + ", " + getYear()+ " // " + getAutnum());
                }
            else {
                System.out.println("Название: " + getTitle() + ". Автор: "
                        + Arrays.toString(getAuthors()) + ". " + getPub().getCity() + ": "
                        + getPub().getName() + ", " + getYear()+ " // " + getAutnum());
            }
        }
        else {
                System.out.println("Название: " + getTitle() + ", "
                        + getPub().getCity() + ": " + getPub().getName() + ". "
                        + getYear() + " // " + getAutnum());
        }
    }
    
    //вывод на печать информации в массиве
    public static void printAll(Books[] booksArr){
        for(Books b : booksArr){
            b.print();
        }
    }
    
    //вывод на печать автора с заданным индексом (индекс для простоты задан в методе)
    public static void getAuthAll(Books[] booksArr) {
        for(Books c : booksArr){
            c.getAuth(0);
        }
    }       
}
