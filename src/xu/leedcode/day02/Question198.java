package xu.leedcode.day02;

public class Question198 {

    public int rob(int[] houses) {
        int arrSize = houses.length;
        if (arrSize == 0) {
            return 0;
        }
        int[] optimizedResults = new int[arrSize + 1];
        optimizedResults[0] = 0;
        optimizedResults[1] = houses[0];

        for (int i = 2; i <= arrSize; i++) {
            optimizedResults[i] = max(
                    optimizedResults[i - 1],
                    optimizedResults[i - 2] + houses[i - 1]
            );
        }
        return optimizedResults[arrSize];
    }

    private int max(int numA, int numB) {
        return (numA > numB) ? numA : numB;
    }
}
