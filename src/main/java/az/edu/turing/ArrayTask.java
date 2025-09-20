package az.edu.turing;

public class ArrayTask {
    public static void main(String[] args) {
        int [] arr={1,1,0,1,0,0,0,1,1,1,1};
        int max=0;
        int topla=0;
        for(int x=0;x<arr.length;x++){
            topla+=arr[x];
            if (x==arr.length-1||arr[x]==0){
                if(topla>max) {
                    max = topla;
                    topla = 0;
                }else{
                    topla=0;
                }
            }
        }
        System.out.println(max);
    }
}
