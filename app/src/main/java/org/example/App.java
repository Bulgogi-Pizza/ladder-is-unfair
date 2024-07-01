package org.example;

import org.example.util.Prompt;
import java.util.ArrayList;
import java.util.LinkedList;

class App {
    static String[] menus = {"게임 시작", "게임 설명", "종료"};

    public static void main(String[] args) {
        // For a Test
        boolean TestMode;

        int menuNo;

        // print title and menus
        System.out.println("사다리 타기 게임");
        for (int i = 0; i < menus.length; i++) {
            System.out.println(i+1 + ". " + menus[i]);
        }

        while(true) {
            try {
                menuNo = Prompt.inputInt("메뉴 선택 >>");

                switch (menuNo) {
                    case 1:
                        startGame();
                        break;
                    case 2:
                        readMe();
                        break;
                    case 3:
                        return;
                    case 8417:
                        testMode();
                        break;
                    default:
                        System.out.println("올바른 값을 입력하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해 주세요.");
            }
        }
    }

    static void startGame() {
        int numOfPlayer;
        ArrayList playerNameList = new ArrayList();

        System.out.println("플레이 할 인원을 정하세요");
        numOfPlayer = Prompt.inputInt("인원 수 입력 >>");


        for (int i = 0; i < numOfPlayer; i++) {
            String playerName = Prompt.input("플레이어(" + i+1 + ") 이름 >>");
            playerNameList.add(playerName);
        }

        for (int i = 0; i < numOfPlayer; i++) {
            String resultList
        }
    }
}