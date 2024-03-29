### Баллов за выполнение - 1

Дана DB имеющая следующую структуру: [file](db_schema.png)

Схема БД состоит из трёх таблиц:
1) Goods(producer, model, type)
   2) Computer(code, model, frequency, price)
   3) MFP(code, model, price)

   * Таблица Goods состоит из производителя (producer), модели (model) и типа ('Computer' - системный блок или 'MFP' - МФУ). Принимаем, что модели в таблице Goods уникальны для всех типов и производителей.
   * Таблица Computer состоит из уникального кода – code, модели – model (внешний ключ к таблице Goods), частоты - frequency и цены - price.
   * Таблица MFP состоит из уникального кода – code, модели – model (внешний ключ к таблице Goods) и цены - price.

**Задача**
   
   Найдите producer (и количество моделей системных блоков), выпускающих не менее minModels (задается параметром) различных моделей системных блоков ('Computer')
   
   **Ограничения:**
   Изменять можно только строку SQL выражения в [file](ProducerDAO.java) в методе queryForRowSet.
   Результат должен содержать колонки "producer" и "count".
   Результат отсортировать по "producer" по убыванию
   Авто-тест [file](Task8Test.java) должен стать "зелеными"