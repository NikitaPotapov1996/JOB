package Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89531422662", "iPhone7", "Никита");
        Phone phone2 = new Phone("89811084860", "iPhone11", 1, "Маша");
        Phone phone3 = new Phone();
        System.out.println("Номер телефона 1 - " + phone1.getNumber());
        System.out.println("Модель телефона 1 - " + phone1.getModel() + "\n");
        System.out.println("Номер телефона 2 - " + phone2.getNumber());
        System.out.println("Модель телефона 2 - " + phone2.getModel());
        System.out.println("Вес телефона 2 - " + phone2.getWeight() + "\n");

        phone1.receiveCall(phone1.getNumber());
        phone2.receiveCall(phone1.getPerson(), phone1.getNumber());
    }
}
