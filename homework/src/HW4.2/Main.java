package HW4;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Степанов Роман", 20, "Курьер", "8-916-889-22-25", 30000 , 1);
        Employee emp2 = new Employee("Геральт из Ривии", 100, "Ведьмак", "Только голубиная почта", 20000 , 1);
        Employee emp3 = new Employee("Рик Декарт", 45, "Охотник на андроидов", "8-9ХХ-ХХХ-ХХ-ХХ", 50000, 1);
        Employee emp4 = new Employee("Говард Лавкрафт", 40, "Писатель", "8-9ХХ-ХХХ-ХХ-ХХ", 45000, 1);
        Employee emp5 = new Employee("Рик Санчез", 70, "Ученый", "8-9XX-XXX-XX-XX", 100000, 1);

        Employee[] collective = new Employee[5];

        collective[0] = emp1;
        collective[1] = emp2;
        collective[2] = emp3;
        collective[3] = emp4;
        collective[4] = emp5;

        for (int i = 0; i < collective.length; i++) {
            System.out.println("Имя - " + collective[i].getName() + ", должность - " + collective[i].getPosition() + ";\n");
        }

        for (int j = 0; j < collective.length; j++) {

            if (collective[j].getAge() > 40 ) System.out.println("Сотрудники старше 40 - " + collective[j].getName() + "\n");

        }

        for (int i = 0; i < collective.length; i++) {
            collective[i].salaryUp();
            if (collective[i].getAge() >= 45) System.out.println(collective[i].getName() + " зарплата повышена\nТекущая зп - " + collective[i].getSalary());
        }

        // Не получилось придумать другую реализацию задания 7

        for (int i = 0; i < collective.length; i++) {
            System.out.println("Номер сотрудника " + collective[i].getName() + " - " + collective[i].setId() + "\n");
        }

    }
}
