public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("1)Ф.И.О. сотрудника — " + fullName + ".");
        System.out.println("2)Данные Ф. И. О. сотрудника для заполнения отчета — " +
                fullName.toUpperCase() + ".");

        System.out.println("Задача 3:");
        String fullNameNew = "Иванов Семён Семёнович";
        String fullNameNewWithout = fullNameNew.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameNewWithout + ".");



    }
}