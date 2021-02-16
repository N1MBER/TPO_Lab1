package main.firstBlock.java;

public class Calculator {
    private Double calcX (Double x){
        double del = Math.PI * 2;
        if(x < 0) del *= -1;
        while(Math.abs(x) > 30.0) {
            x -= del;
        }
        return x;
    }

    public double calculateSex (double x) throws Exception{
        try{
            double xn = 1.0, prevSum = 0.0, sum = 1.0;
            final double EPS = 1e-10, INF = 1.0e8;
            for(int n = 0; Math.abs(sum - prevSum) > EPS; n++)
            {
                prevSum = sum;
                xn *= (-1.0 * Math.pow(x, 2.0) / (2*n + 2) / (2*n + 1));
                sum += xn;
            }
            return Math.abs(1/sum) > INF ? INF : 1/sum;
        }catch (Exception e){
            System.err.println("Возникла ошибка");
            throw e;
        }
    }
}
