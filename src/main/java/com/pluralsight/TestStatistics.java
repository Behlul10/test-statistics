package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        float[] testScores = {90, 100, 55, 68, 70, 88, 54, 49, 99, 73};
        float average;
        float highScore = 0;
        float lowScore = 100;
        float total = 0;
        float median;

        for (float grade : testScores) {
            total += grade;

            //find lowest grade
            if (grade < lowScore) {
                lowScore = grade;
            }
            //find highest grade
            if (grade > highScore) {
                highScore = grade;
            }
        }
        average = total / testScores.length;

        if(testScores.length % 2 == 0) {
            //if even, median = index at two middle vals / 2 + 1
            int rightMiddleIndex = testScores.length / 2;
            int leftMiddleIndex = rightMiddleIndex - 1;
            float avgs = (testScores[rightMiddleIndex] + testScores[leftMiddleIndex]) / 2;
            median = (avgs / 2) + 1;

        } else{
            //if odd, median = middle value of list
            median = (testScores[testScores.length / 2] + 1)/2;
        }



        System.out.println("average score: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Lowest Score: " + lowScore);
        System.out.println("The median value is: " + median);


    }
}
