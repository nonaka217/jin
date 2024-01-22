public class J11_10 {

    public static void main(String[] args){
        // 書籍情報
        BookInfo S = new BookInfo("三国志", "吉川英治", 1989);
        BookInfo Y = new BookInfo("楊令伝", "北方謙三", 2011);
        BookInfo R = new BookInfo("竜馬がゆく", "司馬遼太郎", 1998);
        BookInfo B = new BookInfo("坊ちゃん", "夏目漱石", 1906);
        BookInfo W = new BookInfo("吾輩は猫である", "夏目漱石", 1905);

        // 書籍情報を表示
        S.bookinfo();
        Y.bookinfo();
        R.bookinfo();
        B.bookinfo();
        W.bookinfo();
    }
}

//--- BookInfoクラス ---//
class BookInfo {
    private String book;
    private String name;
    private int year;
    public static int no;

    //--- コンストラクタ ---//
    BookInfo(String book, String name, int year){
        this.book = book; // 書名
        this.name = name; // 著者名
        this.year = year; // 出版年
    }

    //--- 書名・著者名・出版年・書籍番号を取得 ---//
    String getBook() { return book; } // 書名を取得
    String getName() { return name; } // 著者名を取得
    int getYear()    { return year; } // 出版年を取得

    //--- 書名・著者名・出版年・書籍番号を設定 ---//
    void setBook(String book) { this.book = book; } // 書名を設定
    void setName(String name) { this.name = name; } // 著者名を設定
    void setYear(int year)    { this.year = year; } // 出版年を設定

    //--- 書籍情報表示メソッド ---//
    void bookinfo(){
        no++;
        System.out.println("書　　名:" + book);
        System.out.println("著 者 名:" + name);
        System.out.println("出 版 年:" + year);
        System.out.println("書籍番号:" + no);
    }
}
