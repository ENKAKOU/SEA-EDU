package List;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        BookAction bookAction = new BookActionImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择：1.添加图书 2.显示图书信息 3.退出");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 消耗换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入图书名称：");
                    String bookName = scanner.nextLine();
                    System.out.print("请输入作者名称：");
                    String author = scanner.nextLine();
                    Book newBook = bookAction.addBook(bookName, author);
                    bookList.add(newBook);
                    System.out.println("图书添加成功！");
                    break;
                case 2:
                    bookAction.selectBook(bookList);
                    break;
                case 3:
                    System.out.println("退出成功！");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("无效的选项，请重新选择！");
            }
        }
    }
}



class Book {
    String bookName;
    String author;
}

interface BookAction {
    Book addBook(String bookName, String author);
    void selectBook(List<Book> list);
}

class BookActionImpl implements BookAction {

    @Override
    public Book addBook(String bookName, String author) {
        Book newBook = new Book();
        newBook.bookName = bookName;
        newBook.author = author;
        return newBook;
    }

    @Override
    public void selectBook(List<Book> list) {
        if (list.isEmpty()) {
            System.out.println("图书库为空！");
        } else {
            for (Book book : list) {
                System.out.println("这本书的作者是：" + book.author + "，书名是：" + book.bookName);
            }
        }
    }
}
