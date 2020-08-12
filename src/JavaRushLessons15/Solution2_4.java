package JavaRushLessons15;

import java.util.LinkedList;
import java.util.List;

/*
4. ООП - книги

1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook расширьте тип возвращаемого результата.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
    5.1. agathaChristieOutput для книг Агаты Кристи;
    5.2. markTwainOutput для книг Марка Твена.

    Требования:
Класс Solution должен содержать public static класс MarkTwainBook.
Класс MarkTwainBook должен быть потомком класса Book.
В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром "Mark Twain".
Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения MarkTwainBook и возвращать текущий объект.
Класс Solution должен содержать public static класс AgathaChristieBook.
Класс AgathaChristieBook должен быть потомком класса Book.
В классе AgathaChristieBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
Конструктор класса AgathaChristieBook должен вызывать конструктор класса предка (Book) с параметром "Agatha Christie".
Метод getBook в классе AgathaChristieBook должен иметь тип возвращаемого значения AgathaChristieBook и возвращать текущий объект.
Метод getTitle в классах AgathaChristieBook и MarkTwainBook должен возвращать название конкретной книги.
Метод getOutputByBookType должен возвращать корректную строку для объектов типа AgathaChristieBook.
Метод getOutputByBookType должен возвращать корректную строку для объектов типа MarkTwainBook.
В классе MarkTwainBook должно быть создано поле title типа String (название книги).
В классе AgathaChristieBook должно быть создано поле title типа String (название книги).
 */
public class Solution2_4 {
    public static void main(String[] args) {

            List<Book> books = new LinkedList<Book>();
            books.add(new MarkTwainBook("Tom Sawyer"));
            books.add(new AgataChristieBook("Hercule Poirot"));
            System.out.println(books);
        }
    public static class MarkTwainBook extends Book{
        public  String bookName = null;
        public MarkTwainBook(String bookName)
        {
            super("Mark Twain");
            this.bookName = bookName;
        }
        public MarkTwainBook getBook() {

            return this;
        }


        public String getName() {
            return this.bookName;
        }
    }


    public static class AgataChristieBook extends Book{
        public String bookName;
        public AgataChristieBook(String book){
            super("Agata Christie");
            this.bookName = book;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getName() {
            return this.bookName;
        }
    }

    public abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + author;

            String output = "output";
            //Add your code here
            if (this instanceof MarkTwainBook) {output = markTwainOutput;}
            else output = agathaChristieOutput;


            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }




}









