public class Main {
    public static void main(String[] args) {
        // Tworzenie pracowników (Moduł B)
        Employee anna = new Employee("Anna", 8, 7000);
        Employee piotr = new Employee("Piotr", 6, 5500);
        Employee jan = new Employee("Jan", 9, 8500);

        // Ćwiczenie: Wypisanie danych
        System.out.println("--- Zespół TechCorp ---");
        System.out.println(anna.getInfo());
        System.out.println(piotr.getInfo());
        System.out.println(jan.getInfo());

        // Ćwiczenie z metodą work (Moduł B4)
        System.out.println("\n--- Wyniki pracy ---");
        int workAnna = anna.work();
        int workPiotr = piotr.work();
        int workJan = jan.work();

        System.out.println("Anna wykonała: " + workAnna);
        System.out.println("Piotr wykonał: " + workPiotr);
        System.out.println("Jan wykonał: " + workJan);

        int totalWork = workAnna + workPiotr + workJan;
        System.out.println("Łączna praca zespołu: " + totalWork);
        
        // Przykładowe zdania z ćwiczenia A1 (poprawione literówki)
        System.out.println("\n--- Informacje dodatkowe ---");
        System.out.println("drugie zdanie");
        System.out.println("trzecie zdanie");
        System.out.println("TechCorp Simulator");
    }
}
