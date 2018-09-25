public class task_F {
    public static void main(String[] args){
        obr(12345);
    }
    public static void obr(int o) {
        if (o >= 1) {
            System.out.print(o % 10 + " ");
            obr(o / 10);
        }
    }

}
