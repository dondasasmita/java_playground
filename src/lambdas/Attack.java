package lambdas;

public class Attack {

    public static <T> boolean isAnAttack(T s){

        if (s instanceof String && ((String) s).contains("Attack!")) {
            return true;
        }

        return false;

    }
}
