public class task_I {
    public static void main(String[] args){
        razl(12,2);
    }
    public static void razl(int chislo, int i) {
        if (i > chislo / 2) {
            System.out.println(chislo);
            return;
        }

        if (chislo % i == 0) {
            System.out.println(i);
            razl(chislo / i, i);
        } else {
            razl(chislo, ++i);
        }
    }
}
