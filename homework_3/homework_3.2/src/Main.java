//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值    。
public class Main {
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2 == 0){
                sum-=1.0/(double) i;
            }else {
                sum+=1.0/(double) i;
            }
        }
        System.out.println(sum);
    }
}