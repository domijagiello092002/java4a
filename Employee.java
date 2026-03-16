public class Employee {
    String name;
    int skill;
    double salary;

    // Konstruktor
    public Employee(String name, int skill, double salary) {
        this.name = name;
        this.skill = skill;
        this.salary = salary;
    }

    // Metoda work
    public int work() {
        return skill;
    }
    
    // Dodatkowa metoda pomocnicza do wyświetlania danych
    public String getInfo() {
        return name + " (Skill: " + skill + ")";
    }
}
