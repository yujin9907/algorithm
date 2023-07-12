public class Permutation {
    /*
     * 순열 permutation, 조합
     * 자바에는 순열에 관한 함수가 따로 없으므로 재귀함수를 통해 구현함
     */

    /*
     * swap 을 이용한 구현법
     * 1. swap => 순서를 바꾸기 위한 스와핑이 필요함
     * 2. 원상복구(원복) => 상태변화에 따른 원상복구 필요함
     * 3. 순서가 보장되지 않음
     */
    static void permutationSwap(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutationSwap(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    /*
     * 배열을 통한 구현법
     * 1. 순서를 보장함 (사전식으로 순열 구현 가능)
     */
    static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;
                ;
            }
        }
    }

    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
