/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {
        
        //массив издательств
        Publishers[] pubArr = new Publishers[4];
        pubArr[0] = new Publishers("Проспект", "Москва");
        pubArr[1] = new Publishers("Питер", "Санкт-Петербург");
        pubArr[2] = new Publishers("БХВ", "Санкт-Петебург");
        pubArr[3] = new Publishers("Диалектика", "Киев");
 
        //массив книг
        Books[] booksArr = new Books[5];
        booksArr[0] = new Books ("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"}, pubArr[1].getCity(),  2018, pubArr[1].getName());
        booksArr[1] = new Books ("Разработка требований к программному обеспечению. 3-е издание, дополненное", new String[]{"Вигерс Карл"}, pubArr[2].getCity(), 2018, pubArr[2].getName());
        booksArr[2] = new Books ("Java. Полное руководство. 10-е издание", new String[]{"Шилдт Герберт"}, pubArr[3].getCity(), 2018, pubArr[3].getName());
        booksArr[3] = new Books ("C/C++. Процедурное программирование", new String[]{"Полубенцева М.И."}, pubArr[2].getCity(), 2017, pubArr[2].getName());
        booksArr[4] = new Books ("Конституция РФ", pubArr[1].getCity(), 2020, pubArr[1].getName());

        
        Books.printAll(booksArr);
    }
}
