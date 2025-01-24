package org.example.algorithm2;
//피보나치 수열

public class Main {
    public static void main(String[] args) {
        int []arr = new int[100]; //피보나치 수열 값을 저장할 배열 생성(크기 100)

        //초기값 설정 : 피보나치 수열의 첫 번째와 두 번째 값은 1
        arr[1] = 1;
        arr[2] = 1;

        //배열을 이용하여 피보나치 수열의 값을 계산
        for(int i=3; i<100; i++) {
            //현재 값은 이전 두 값의 합
            arr[i] = arr[i-1] + arr[i-2];
        }
        //피보나치 수열의 앞 10개 값 중 1번 인덱스부터 9번 인덱스까지 출력
        for(int i=1; i<10; i++) {
            //계산된 피보나치 수 출력
            System.out.println(arr[i]);
        }
    }
}
