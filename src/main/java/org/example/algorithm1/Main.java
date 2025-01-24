package org.example.algorithm1;
//학생 이름 저장 및 검색

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("손오공", "1234");
        Student st2 = new Student("손오궁", "1235");
        Student st3 = new Student("김오공", "1236");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student stu : list) { //foreach문 : 첫번째 놈의 인스턴스인 손오공, 학번 가리키다가 for문 끝나면 두 번째 놈 가리킴
            System.out.println(stu.getName());
            System.out.println(stu.getNo());
        }
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("계속 검색을 하고싶으시면 y, 종료 하고싶으시면 n");
            String input = sc.nextLine();

            if (input.equals("y")) {
                System.out.println("검색을 시작합니다.");
                String name = sc.nextLine();
                boolean flag = false;

                for (Student stu : list) {
                    if (stu.getName().equals(name)) {
                        System.out.println("해당하는 학생의 학번은 : " + stu.getNo());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("해당하는 학생이름이 없습니다.");
                } else if (input.equals("n")) {
                    break;
                }
            }
                System.out.println("프로그램이 종료되었습니다.");
            }
        }
    }


