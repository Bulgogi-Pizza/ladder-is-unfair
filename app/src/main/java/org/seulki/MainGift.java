package org.seulki;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MainGift {

    static ArrayList<Human> human = new ArrayList<>();
    static ArrayList<Gift> gifts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 사용자 추가 */
        while(true){
            System.out.println("인원을 추가하시겠습니까(Y/N)?");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("Y") ){
                System.out.print("이름을 입력하세요 : ");
                String name = scanner.nextLine();
                System.out.println("나이를 입력하세요 : ");
                int age = scanner.nextInt();
                scanner.nextLine();
                Human test = new Human(name,age);
                human.add(test);
            }else if(answer.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("이름\t나이");

        for (Human humans : human){
            System.out.println(humans.getName() +"\t"+ humans.getAge());
        }
        /* 선물 추가 */
        for (int i=0; i< human.size();i++){
            System.out.printf("%s 만큼 선물을 추가해야됩니다.", human.size());
            int giftNo = i+1;
            System.out.print(giftNo + "번째 상품 : ");
            String gift = scanner.nextLine();
            Gift get = new Gift(giftNo,gift);
            gifts.add(get);
        }
        System.out.println("상품 목록");
        System.out.println("index\t상품명");
        for (Gift gift : gifts){
            System.out.println(gift.getNo() +"\t"+ gift.getGift());
        }






    }
}
