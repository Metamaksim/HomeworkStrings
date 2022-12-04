public class Main {
    public static void main(String[] args) {
        // Задание 1
        String fistName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = " Ivanovich";
        String fullName = "Иванов Семён Семёнович";
        System.out.println(fistName + middleName + lastName);
        // Задание 2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);
        // Задание 3
        String fullNameForAdmin = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameForAdmin);
        // Задание 4
        String fullNameWithoutYo = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + fullNameWithoutYo);

    }
}