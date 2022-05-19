package testDataExample;

public class OrderData {  // Класс создает тестовые данные для формы заказа
    public String nameUser = "Владимир"; // Имя заказчика
    public String surnameUser = "Бабубик"; // Фамилия заказчика
    public String addressUser = "Москва, улица Пушкина, дом Колотушкина"; // Адрес заказчика
    public Integer subwayStationUser = 23; // Метро заказчика
    public String phoneNumberUser = "+79932104433"; // Телефон заказчика
    public Integer deliveryDateUser = 23; // Дата доставки
    public Integer rentalPeriodUser = 1; // Период аренды скутера
    public Integer scooterColorUser = 0; // Цвет скутера
    public String commentForCourierUser = "купи мне заодно блок сигарет, верну на 500р больше"; // Комментарий для курьера

    public OrderData(String nameUser,
                     String surnameUser,
                     String addressUser,
                     Integer subwayStationUser,
                     String phoneNumberUser,
                     Integer deliveryDateUser,
                     Integer rentalPeriodUser,
                     Integer scooterColorUser,
                     String commentForCourierUser)
    {
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.addressUser = addressUser;
        this.subwayStationUser = subwayStationUser;
        this.phoneNumberUser = phoneNumberUser;
        this.deliveryDateUser = deliveryDateUser;
        this.rentalPeriodUser = rentalPeriodUser;
        this.scooterColorUser = scooterColorUser;
        this.commentForCourierUser = commentForCourierUser;
    }

    public OrderData(){

    }


}


