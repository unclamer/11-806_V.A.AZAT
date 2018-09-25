public class task_H {
    public static void main(String[] args){
        System.out.print(prov(12,2));
    }
    static boolean prov(int chislo,int i){
        if (chislo < 2) {
            return false;
        } else if (chislo == 2) {
            return true;
        } else if (chislo % i == 0) {
            return false;
        } else if (i < chislo / 2) {
            return prov(chislo, i + 1);
        } else {
            return true;
        }
    }
}
