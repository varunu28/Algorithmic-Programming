import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        showingNotifications();
    }

    public static int getMedian(int freq[],int d){
        int prefix_sum[] = new int[201];
        prefix_sum[0] = freq[0];
        for(int i=1;i<201;i++){
            prefix_sum[i] = prefix_sum[i-1] + freq[i];
        }
        int median;
        int a = 0;
        int b = 0;
        if(d%2==0){
            int first = d/2;
            int second = first+1;
            int i = 0;
            for(;i<201;i++){
                if(first<=prefix_sum[i]){
                    a = i;
                    break;
                }
            }
            for(;i<201;i++){
                if(second<=prefix_sum[i]){
                    b = i;
                    break;
                }
            }

        }else{
            int first = d/2 + 1;
            for(int i=0;i<201;i++){
                if(first<=prefix_sum[i]){
                    a = i;
                    break;
                }
            }
        }
        median = a + b;
        return median;
    }


    public static void showingNotifications() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int total = 0;
        int freq[] = new int[201];
        boolean first_time = true;
        int pop_element = 0;

        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        for (int index = d; index < n; index++) {
            if (first_time) {
                first_time = false;
                for (int i = index - d; i <= index - 1; i++)
                    freq[arr[i]]++;
            } else {
                freq[pop_element]--;
                freq[arr[index - 1]]++;
            }
            int median = getMedian(freq, d);
            if (d % 2 == 0) {
                if (arr[index] >= median)
                    total++;
            } else {
                if (arr[index] >= 2 * median)
                    total++;
            }
            pop_element = arr[index - d];
        }
        System.out.println(total);
    }
}