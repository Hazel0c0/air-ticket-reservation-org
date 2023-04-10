package yougeun.board;

import java.util.Map;
import java.util.Scanner;

public class BoardView {

    private static Map<Integer, BoardVO> map = BoardRepository.map;
    private static final int lastPage = BoardVO.getNo();  // 마지막 페이지를 알 수 있음
    private static int page = lastPage;
    private static final int endPage = lastPage%10==0 ? lastPage/10 : lastPage/10+1;
    private static int currentPage = 1;
    // 제목 30글자 (숫자+영어),
    static Scanner sc;



    static {
        sc = new Scanner(System.in);
    }

    public static String input(String s){
        System.out.print(s);
        return sc.nextLine();
    }

    /**
     * 제목이 30글자 이상일 경우 짜름
     * @return
     */
    public static String title(String title){
        if(title.length()>=25) return title.substring(0, 25);
        else return title;
    }

    public static void menu(){

        System.out.println("No                제목             글쓴이    작성시간   좋아요");
        System.out.println("============================================================");
//        System.out.println("page = " + page);
        for (int i = page; i > page-10 ; i--) {
            BoardVO vo = map.get(i);
            if(vo==null) break;
            System.out.printf("%-4d%-30s%-8s%10s%5d\n", vo.getNum(), title(vo.getTitle()), vo.getWriter(), vo.getDate(), vo.getLike());
        }
        System.out.println("============================================================");
        System.out.printf("[ < 이전 ] |");
        for (int i = 1; i < 6; i++) {
            if(i>endPage) break;
            if(currentPage<=2)
                System.out.printf(" %d |", i);
            else if(currentPage<=endPage-5){
                System.out.printf(" %d |", (currentPage+i-2) );
            } else {
                System.out.printf(" %d |", (endPage+i-5) );
            }
        }
        System.out.printf(" [ 다음 > ]  ");
        System.out.printf("현재 페이지 : %d\n", currentPage);
        System.out.println("[ < ] 이전 페이지  [ > ] 다음 페이지   [ 0 ] 뒤로가기");
        System.out.printf("[1~%d] 해당 게시물 보기  ", lastPage);
        System.out.println("총 페이지 수 : " + lastPage);
    }

    public static void run(){
        while (true) {
            menu();
            String userInput = input(">> ");
            if (userInput.equals("0")) return;
            boardLosic(userInput);
        }

    }

    public static void setCurrentPage(int currentPage) {
        BoardView.currentPage = currentPage;
    }

    /** 보드 로직 작성
     * 
     * @param userInput 사용자 입력에 따른 분기점
     */
    private static void boardLosic(String userInput) {

        try {
            int key = Integer.parseInt(userInput);
//            System.out.println("페이지입니당!!!");    // 게시글 들어가는 로직
//            viewBoard(key);
        } catch (Exception e) {
            switch (userInput.toLowerCase()){
                case "<":
                    prevPage();
                    break;
                case ">":
                    nextPage();
                    break;
                case "q":
                case "quit":
                case "0":
                    return;
                default:
                    break;
            }
        }

    }
    private static void prevPage(){
        if(currentPage<=1) return;
        currentPage-=1;
        page += 10;// 32페이지
    }
    
    private static void nextPage() {
        if(currentPage>= endPage) return;
        currentPage+=1;
        page -= 10;// 32페이지
    }
}
