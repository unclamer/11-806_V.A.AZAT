public class task_E {
    public static void main(String[] args){
        System.out.print(sum(12345));
    }
    static int sum(int s){
        if (s < 10){
            return s;
        }else
            return s%10  + sum(s/10);
    }
}
