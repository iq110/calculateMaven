package homeCompany.homeProdactions;

/**
 * Eeann ?aaeecoao eaeueoeyoi?.
 */
public class Calculator {
    /**
     * ?acoeuoao au?eneaiey.
     */
    private int result;


    /**
     * Выполнение действий над операндами
     *
     * @param first       Первый операнд
     * @param second      Второй операнд
     * @param casedAction Флаг выбранного действия
     *                    Прокидывание исключений (может возникнуть при делении на 0)
     */
    public void implementingAction(String first, String second,
                                   int casedAction) throws Exception {
        switch (casedAction) {
            case 1:
                //Добавление
                add(Integer.valueOf(first), Integer.valueOf(second));
                break;

            case 2:
                //Отнимание
                minus(Integer.valueOf(first), Integer.valueOf(second));
                break;

            case 3:
                //Умножение
                multiply(Integer.valueOf(first), Integer.valueOf(second));
                break;

            case 4:
                //Деление
                div(Integer.valueOf(first), Integer.valueOf(second));
                break;

            case 5:
                //Возведение в степень
                pow(Integer.valueOf(first), Integer.valueOf(second));
                break;
            default:
                throw new Exception("Wrong input!");
        }
    }
    /**

     * Noiie?oai a?aoiaiou.
     *
     * @param params A?aoiaiou noiie?iaaiey.
     */
    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    /**
     * Отнимание
     *
     * @param params Входящие аргументы
     */
    public void minus(int... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result -= params[i];
        }
    }

    /**
     * Умножение
     *
     * @param params Входящие аргументы
     */
    public void multiply(int... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result *= params[i];
        }
    }

    /**
     * Выполняем деление
     *
     * @param params Входящие аргументы
     *               если делитель равен нулю - выкинуть исключение
     */
    public void div(int... params) throws Exception {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            if (params[i] == 0) {
                throw new Exception("Division by zero!!!");
            }
            this.result /= params[i];
        }
    }

    /**
     * Возедение в степень
     *
     * @param params Входящие аргументы
     */
    public void pow(int... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result = (int) Math.pow(this.result, params[i]);
        }
    }


    /**
     * Iieo?eou ?acoeuoao.
     *
     * @return ?acoeuoao au?eneaiey.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * I?enoeou ?acoeuoao au?eneaiey.
     */
    public void cleanResult() {
        this.result = 0;
    }
}