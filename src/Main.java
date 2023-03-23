import java.net.SocketOption;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int ticket = 110; // цена билета (руб)

        int mile = 20; // стоимость 1 мили (руб)

        int bonus = ticket / mile; // количество начисленных бонусов

        System.out.println("Вам начислено: " + bonus + " бонусов");


    }
}