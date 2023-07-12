# 알고리즘
10주차 c++ 완성 강의 기반

### print
```java
static void print(int[] arr, int r) {
    for (int i = 0; i < r; i++)
        System.out.print(arr[i] + " ");
    System.out.println();
}
```

### swap
```java
private static <T> void swap(T[] a, int f, int r) {
	T temp;
    temp = a[f];
    a[f] = a[r];
    a[r] = temp;
}
```
함수는 입력받은 값을 가공하고 return 함(return 하지 않을 수도 있음)  
함수가 내부에서 사용하는 변수(지역변수)는 local variable 이기 때문에 값을 변경하더라도 함수가 종료되면 반영 x  

__함수 호출시 값을 전달하는 방법__
* call by value : 값 자체 또는 변수에 담긴 값을 복사하여 매개변수로 전달
* call by reference : 값이 저장된 메모리 공간의 주소를 전달하여, 참조하도록함 

__자바에서는__  
포인터가 없고 기본적으로 call by value 임  
=> swap을 따로 구현해야 됨

__참고__
https://co1nam.tistory.com/21

### 백트래킹  
현재 상태에서 가능한 모든 후보군을 따라 들어가며 탐색하는 알고리즘  

__참고__
https://velog.io/@dnflrhkddyd/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%ED%8A%B8%EB%9E%98%ED%82%B9#%EC%88%9C%EC%97%B4java