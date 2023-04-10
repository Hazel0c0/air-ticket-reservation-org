package yougeun.board;

import java.time.LocalDate;

public class BoardVO {

    private static int no;
    private int num;
    private String title;
    private String writer;
    private LocalDate date;
    private int like;

    private String content;

    static {
        no = 0;
    }
    // 제목, 작성자, 컨텐츠
    public BoardVO(String title, String writer, String content) {

        this.title = title;
        this.writer = writer;
        date = LocalDate.now();
        this.like = 0;
        this.content = content;
        num = ++no;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static int getNo() {
        return no;
    }

    public static void setNo(int no) {
        BoardVO.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
