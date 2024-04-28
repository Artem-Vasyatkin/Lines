public class Main {
    public static void main(String[] args) {
        String phone = "+(918)-957 68 28";
        phone = '7' + phone;
        phone = phone.replace(" ", "");
        phone = phone.replace(")", "");
        phone = phone.replace("(", "");
        phone = phone.replace("+", "");
        phone = phone.replace("-", "");

        if (phone.length() == 10) {
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() <= 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);

        String expectedPhone = "79189576828";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("Homework");
        System.out.println("Task №1\n");


        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich.";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.printf("Ф. И. О. сотрудника — %s\n", fullName);

        System.out.println("Task №2\n");

        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s\n",
                fullName.toUpperCase());

        System.out.println("Task №3\n");

        String twoFullName2 = "Иванов Семён Семёнович";
        twoFullName2 = twoFullName2.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s", twoFullName2);
    }
}