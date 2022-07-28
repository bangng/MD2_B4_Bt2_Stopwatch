import java.time.LocalTime;

public class Main {
    public static int [] selectionSort(int...a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        return a;
    }
    public static void main(String[] args) {
        int []arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random()*1000);

        }
        LocalTime start = LocalTime.now();
        arr = selectionSort(arr);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start,end);
        System.out.println("Time: "+ stopWatch.getElapsedTime());
        for (int s: arr
             ) {
            System.out.println(s);
        }

    }
}
