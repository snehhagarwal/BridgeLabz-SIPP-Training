import java.util.*;

public class BonusCalculator {
    public static void main(String[] args) {
        int[][] data = new int[10][2]; // [salary, years]
        double[][] bonusData = new double[10][2]; // [new salary, bonus]
        Random rand = new Random();
        double totalBonus = 0, oldSalary = 0, newSalary = 0;

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // salary
            data[i][1] = rand.nextInt(10); // years
            double bonus = data[i][1] > 5 ? 0.05 : 0.02;
            double bonusAmt = data[i][0] * bonus;
            bonusData[i][1] = bonusAmt;
            bonusData[i][0] = data[i][0] + bonusAmt;

            oldSalary += data[i][0];
            newSalary += bonusData[i][0];
            totalBonus += bonusAmt;
        }

        System.out.println("Emp\tSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\n", i + 1, data[i][0], data[i][1], bonusData[i][0], bonusData[i][1]);
        }

        System.out.printf("Total Old Salary: %.2f, New Salary: %.2f, Bonus: %.2f\n", oldSalary, newSalary, totalBonus);
    }
}

