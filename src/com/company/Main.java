package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k, x, y, res;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();

        //Math.max(x, y) выбираем команду с наибольшим количеством очков
        //Math.min(x, y) + 2 проверяем условие отрыва в 2 очка
        //Если предыдущее значение больше, чем k, значит игра идет до больше k количества очков, пока отрыв не достигнет 2 очков
        //Если меньше k, то игра идет до минимального требования в k очков
        //Разница между требуемым количеством очков и текущим количеством очков у лидирующей команды - результат
        //Если вводимые данные дают отрицательный результат (пример: k = 8, x = 9, y = 2), то игра должна быть уже окончена, выводится 0
        res = Math.max(k, Math.min(x, y) + 2) - Math.max(x, y);
        if (res < 0) res = 0;
        System.out.println(res);
        in.close();
    }
}
