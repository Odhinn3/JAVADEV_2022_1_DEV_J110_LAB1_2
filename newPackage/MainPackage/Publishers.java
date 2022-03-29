
package MainPackage;



public class Publishers {
    protected String name;//название издательства
    private String city;//город издательства

    //конструкторы
    public Publishers() {
    }

    public Publishers(String name, String city) {
        setName(name);
        setCity(city);
    }

    public String getName() {
        return name;
    }

    //геттеры и сеттеры
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
        this.city = city;
    }
   
}
