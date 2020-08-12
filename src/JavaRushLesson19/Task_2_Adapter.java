package JavaRushLesson19;

import java.util.HashMap;
import java.util.Map;

/*
Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры)
Обратите внимание на формат вывода фамилии и имени человека
 */
public class Task_2_Adapter {


    public static Map<String, String> countries = new HashMap<String, String>();
    static  {
        Task_2_Adapter.countries.put("UA","Ukraine");
        Task_2_Adapter.countries.put("RU", "Russia");
        Task_2_Adapter.countries.put("CA", "Canada");

    }

    public static class IncomeDataAdapter implements Contact, Customer {
        private IncomeData incomeData;
        IncomeDataAdapter(IncomeData incomeData)
        {
            this.incomeData = incomeData;
        }

        public String getCompanyName()
        {
            return this.incomeData.getCompany();
        }

        public String getCountryName()
        {
            return countries.get(this.incomeData.getCountryCode());

        }

        public String getName()
        {
            return this.incomeData.getContactLastName() + ", " + this.incomeData.getContactFirstName();
        }

        public String getPhoneNumber()
        {
            String temp = "";
            String z = Integer.toString(this.incomeData.getPhoneNumber());
            int count = z.length();
            for (int i = 0; i < 10 - count; i++)
            {
                temp = temp + 0;
            }
            temp = temp + z;

            return "+" + this.incomeData.getCountryPhoneCode() +"(" + temp.substring(0,3) + ")" + temp.substring(3,6) + "-" + temp.substring(6,8) + "-" + temp.substring(8);
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}
