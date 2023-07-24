## Задание 1

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать приложение для расчёта миль. Напомним, мили начисляются как 1 миля за каждые 20 рублей в стоимости билета, дробные мили не допускаются.

Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в Main мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

Создайте класс BonusMilesService: File -> New -> Java Class, вводите название и нажимаете Enter.

Определите в нём метод calculate, который:

- принимает на вход один параметр: цену билета, типа int;
- анализируя значение переданного параметра, возвращает рассчитанное количество миль.

Разместите следующий код в классе Main:
https://github.com/AnnaKiryanova/Java3.1/blob/7f33eca96660719dacfb8576498d2153bef1f3a0/src/Main.java#L1-L8

Убедитесь, что выводимое в консоль значение соответствует логике расчёта бонуса. Проверьте на разных примерах.