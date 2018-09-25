public class task_G {
    public static void main(String[] args){
        obr(12345);
    }

    public static void obr(int o) {
        if (o >= 1) {
            obr(o / 10);
            System.out.print(o % 10 + " ");
        }
    }

}
