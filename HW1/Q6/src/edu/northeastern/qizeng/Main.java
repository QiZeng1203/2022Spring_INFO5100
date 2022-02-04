package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int calls = 160;
        float bill = calcTelBill(calls);
        System.out.println("Bill = " + bill);
    }

    private static float calcTelBill(int calls) {
        float bill;
        switch ((calls-1) / 50 - 1) {
            case 0:
                System.out.println("less than 100 calls");
                bill = 200;
                break;
            case 1:
                System.out.println("more than 100 calls but less than 150 calls");
                bill = 200 + (calls-100) * 0.6f;
                break;
            case 2:
                System.out.println("more than 150 calls but less than 200 calls");
                bill = 200 + 0.6f * 50 + (calls-150) * 0.5f;
                break;
            default:
                System.out.println("more than 200 calls");
                bill = 200 + 0.6f * 50 + 0.5f * 50 + (calls-200) * 0.4f;
                break;
        }
        return bill;
    }
}
