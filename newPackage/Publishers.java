/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Publishers {
    protected String name;
    private String city;

    public Publishers() {
    }

    public Publishers(String name, String city) {
        setName(name);
        setCity(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
            throw new IllegalArgumentException("Название издательства не задано!");
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.isEmpty())
            throw new IllegalArgumentException("Город издательства не задан!");
        //топорное исправление ошибки в названии издательства по вхождению строки
        else if (city == "Санкт-Петебург")
            city = "Санкт-Петебург".replace("Петебург" , "Петербург");
        this.city = city;
    }

    
    
    public void print(){
    }
    
    /*
    static Publishers pub1 = new Publishers ("Проспект", "Москва");
    static Publishers pub2 = new Publishers ("Питер", "Санкт-Петербург");
    static Publishers pub3 = new Publishers ("БХВ", "Санкт-Петебург");
    static Publishers pub4 = new Publishers ("Диалектика", "Киев");
*/
    
}
