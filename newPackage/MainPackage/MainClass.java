package MainPackage;

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
        
        //издательства
        Publishers pub1 = new Publishers ("Проспект", "Москва");
        Publishers pub2 = new Publishers ("Питер", "Санкт-Петербург");
        Publishers pub3 = new Publishers ("БХВ", "Санкт-Петебург");
        Publishers pub4 = new Publishers ("Диалектика", "Киев");
        
        //массив книг
        Books[] booksArr = new Books[5];
        booksArr[0] = new Books ("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"}, pub2, 2018);
        booksArr[1] = new Books ("Разработка требований к программному обеспечению. 3-е издание, дополненное", new String[]{"Вигерс Карл"}, pub3, 2019);
        booksArr[2] = new Books ("Java. Полное руководство. 10-е издание", new String[]{"Шилдт Герберт"}, pub4, 2018);
        booksArr[3] = new Books ("C/C++. Процедурное программирование", new String[]{"Полубенцева М.И."}, pub3, 2017);
        booksArr[4] = new Books ("Конституция РФ", pub2, 2020);

        //вывод на печать информации из массива книг
        System.out.println("Вывод на печать исходного массива");
        Books.printAll(booksArr);       
        
        //вывод на печать автора по индексу для всех книг массива
        //Books.getAuthAll(booksArr);
        
        //исправление ошибки
        for(int i1 = 0; i1 < booksArr.length; i1++){
            if (booksArr[i1].getPub().getCity().equals("Санкт-Петебург")) {
                booksArr[i1].getPub().setCity("Санкт-Петербург");
            }
            
        }
        //повторный вывод на печать информации из массива книг
        System.out.println();
        System.out.println("Вывод на печать массива с исправленной ошибкой");
        Books.printAll(booksArr);
        
        System.out.println("End app");
        

    }
}
