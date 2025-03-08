package study.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CrudApplication.class, args);
        String[][] boardArr=new String[5][];
        Scanner scanner = new Scanner(System.in);
        int boardArrCnt=0;
        int seq=1;
        while (true) {
            System.out.println("1.등록 2.전체조회 3.선택조회 4.수정 5. 삭제 0.종료");
            String choice=scanner.next();
            if(choice.equals("1")){
                if(boardArrCnt>=boardArr.length){
                    System.out.println("더이상 등록 불가");
                }else{
                    String[] boardArrVar=new String[4];
                    boardArrVar[0] = String.valueOf(seq);
                    System.out.println(boardArrVar[0] + "번 등록할 제목");
                    boardArrVar[1]= scanner.next();
                    System.out.println(boardArrVar[0] + "번 등록할 내용");
                    boardArrVar[2]= scanner.next();
                    System.out.println(boardArrVar[0] + "번 등록할 추가 정보");
                    boardArrVar[3]= scanner.next();
                    boardArr[boardArrCnt]=boardArrVar;
                    boardArrCnt++;
                    seq++;
                }
            }else if(choice.equals("2")){
                System.out.println("전체 조회");
                if (boardArrCnt == 0) {
                    System.out.println("등록 값 없음");
                }else {
                    for (int i = 0; i < boardArrCnt; i++) {
                        System.out.println(boardArr[i][0] + "번에 등록내용");
                        System.out.println("제목: " + boardArr[i][1] + " 내용: " + boardArr[i][2] + " 추가정보: " + boardArr[i][3]);
                    }
                    System.out.println("-------------------");
                }
            }
            else if(choice.equals("3")){
                System.out.print("선택 조회");
                String searchNum=scanner.next();
                boolean flag=false;
                for (int i = 0; i < boardArrCnt; i++) {
                    if(boardArr[i][0].equals(searchNum)){
                        System.out.println(boardArr[i][0] + "번의 내용");
                        System.out.println("제목: " + boardArr[i][1] + " 내용: " + boardArr[i][2] + " 추가정보: " + boardArr[i][3]);
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    System.out.println("선택 내용 없음");
                }
            }
            else if(choice.equals("4")){
                System.out.println("수정");
                if (boardArrCnt == 0) {
                    System.out.println("등록값 없음");
                }else {
                    System.out.print("수정 번호 입력:");
                    String searchNum=scanner.next();
                    boolean flag=false;
                    for (int i = 0; i < boardArrCnt; i++) {
                        if(boardArr[i][0].equals(searchNum)){
                            String[] newBoardArrVar=new String[4];
                            newBoardArrVar[0] = boardArr[i][0];
                            System.out.println("제목 ");
                            newBoardArrVar[1] = scanner.next();
                            System.out.print("내용 ");
                            newBoardArrVar[2] = scanner.next();
                            System.out.print("추가정보 ");
                            newBoardArrVar[3] = scanner.next();
                            boardArr[i]=newBoardArrVar;
                            flag=true;
                            break;
                        }
                    }
                    if(flag==false){
                        System.out.println("선택 정보 존재하지 않음");
                    }
                }
            }
            else if(choice.equals("5")){
                System.out.println("삭제");
                if (boardArrCnt == 0) {
                    System.out.println("등록 값 없음");
                }else{
                    System.out.print("삭제 번호 ");
                    String searchNum=scanner.next();
                    boolean flag=false;
                    for (int i = 0; i < boardArrCnt; i++) {
                        if(boardArr[i][0].equals(searchNum)){
                            boardArr[i]=null;
                            boardArrCnt--;
                        }
                        flag=true;
                        break;
                    }
                    if(flag==false){
                        System.out.println("선택값 없음");
                    }
                }
            }
            else if(choice.equals("0")){
                System.out.println("종료");
                break;
            }
        }
    }
}



