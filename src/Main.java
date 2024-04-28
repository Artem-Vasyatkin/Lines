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
    }
}