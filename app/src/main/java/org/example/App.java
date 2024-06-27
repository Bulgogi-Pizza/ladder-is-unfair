/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.util.Date;
import org.example.util.Prompt;
import org.example.util.LinkedList;
import org.example.vo.MoneyFlow;


public class App {
    public static String Title = "-----reach to rich-----";
    public static String[] menus = {"작성", "조회", "수정", "삭제"};
    public static LinkedList accountBook = new LinkedList();

    public static void main(String[] args) {

        int selectMenu = 0;

        System.out.println(Title);
        for (int i = 0; i < menus.length; i++) {
            System.out.println((i+1) + ". " + menus[i]);
        }

        mainLoop:
        while(true) {
            System.out.println("메뉴를 선택하세요.");
            selectMenu = Prompt.inputInt("메인 >> ");

            switch (selectMenu) {
                case 1:
                    executeCreate();
                    break mainLoop;
                case 2:
                    executeRead();
                    break mainLoop;
                case 3:
                    executeUpdate();
                    break mainLoop;
                case 4:
                    executeDelete();
                    break mainLoop;
                default:
                    System.out.println("올바른 메뉴를 선택하세요");
                    break;
            }
        }

        System.out.println("프로그램을 종료합니다.");

    }

    public static void executeCreate(){

        Date date = Prompt.inputDate("날짜 (yyyy-mm-dd, default = today) : ");
        int amount = Prompt.inputInt("금액 : ");
        String incomeOrSpend = Prompt.input("수입 or 지출 : ");

        String category = Prompt.input("항목 선택");
        String note = Prompt.input("설명 : ");

        Object paymentMethod = Prompt.input("결제 수단 : ");


        MoneyFlow moneyFlow = new MoneyFlow(accountBook.size, date, amount, incomeOrSpend, category, note, paymentMethod);

        accountBook.add(moneyFlow);

    }

    public static void executeRead() {
        System.out.println(Title);

        for (int i = 0; i < accountBook.size; i++) {
            accountBook.get(i);
        }

    }

    public static void executeUpdate() {

    }

    public static void executeDelete() {

    }
}

