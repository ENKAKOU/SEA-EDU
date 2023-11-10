package inter;

import java.util.Scanner;

class Book {
    private int no;
    private String bookName;
    private String author;


    public Book(int no, String bookName, String author) {    // 构造
        this.no = no;
        this.bookName = bookName;
        this.author = author;
    }

    public int getNo() {
        return no;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}


interface BookOperate {                                // 图书 接口
    Book addBook(int no, String bookName, String author);
    void selectBook(Book[] books);
}


class BookOperateImpl implements BookOperate {         // 图书 实现类
    @Override
    public Book addBook(int no, String bookName, String author) {
        if (no <= 0 || bookName.isEmpty() || author.isEmpty()) {
            throw new IllegalArgumentException("输入参数不合法");
        }
        return new Book(no, bookName, author);
    }

    @Override
    public void selectBook(Book[] books) {
        for (Book book : books) {
            System.out.println("《" + book.getBookName() + "》这本书的编号为" +
                    book.getNo() + "，作者是" + book.getAuthor());
        }
    }
}


public class BookTest {                      // 图书测试类
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookOperate bookOperate = new BookOperateImpl();

        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {        // 添加图书信息
            try {
                System.out.print("请输入编号：");
                int no = scanner.nextInt();
                scanner.nextLine(); // 消费换行符
                System.out.print("请输入图书名：");
                String bookName = scanner.nextLine();
                System.out.print("请输入作者：");
                String author = scanner.nextLine();

                books[i] = bookOperate.addBook(no, bookName, author);
            } catch (IllegalArgumentException e) {
                System.out.println("输入参数不合法：" + e.getMessage());
                return;
            }
        }

        bookOperate.selectBook(books);        // 打印图书信息
    }
}
