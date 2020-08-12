package JavaRushLessons21;
/*
2. Формируем Where

Сформируйте часть запроса WHERE, используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}

Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
 */


public class WhereRequestTask {
    public static void main(String[] args) {
        String[] mas={"name", "Ivanov", "country", "Ukraine", "city", "Kyiv", "age", null};
        System.out.println(WhereRequest(mas));
    }

    public static StringBuilder WhereRequest(String[] mas) {
        StringBuilder answer=new StringBuilder("");

        for (int i=0; i < mas.length-1; i++) {
            try {
                if (!mas[i+1].equals(null)) {
                    if (!mas[i].equals(null)) {
                        answer.append(mas[i]);
                        if (i%2==0) {
                            answer.append(" = '");
                        }else {
                            answer.append("' and "); //лишний and
                        }
                    }

                }else {
                    i++;
                }

            } catch (NullPointerException e) {
            }
        }
        return answer;
    }
}


