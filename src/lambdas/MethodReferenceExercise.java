package lambdas;

public class MethodReferenceExercise {

    public static void main(String[] args) {

        String word = "Attack!";
        SuperAttack power = Attack::isAnAttack;

        System.out.println(power.check(word));

    }

}
