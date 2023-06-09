class PrimeNumber {
    public static void main(String[] args) {
        // Input range: 1 - 10,000,000
        // call the isPrimeNumberMethod
        long startTime = System.nanoTime();

        System.out.println(isPrimeNumber(97));

        long endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime));
    }

    public static boolean isPrimeNumber(int num) {
        // check if number is less than or equal to 1
        if (num <= 1) {
            return false;
        } 

        // check if number is divisible by other numbers 
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}