package basepack;

import java.util.LinkedList;

class Prime {
    public static int getFirstPrimeNumber(int startingNumber) {
        int potentialPrime = startingNumber;
        boolean isPrime;
        boolean found=false;
        int i;
        while (true){
            i = 2;
            isPrime=true;
            while (i < potentialPrime) {
                if (potentialPrime % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if(!isPrime){
                potentialPrime++;
            }else {
                return potentialPrime;
            }
        }
    }
    public static LinkedList<Integer> getPrimeNumbers(int index) {
        var primes=new LinkedList<Integer>();
        int prime=1;
        for (int i = 0; i < index; i++) {
            primes.add(getFirstPrimeNumber(prime+1));
            prime=primes.getLast();
        }
        return primes;
    }
    public static int getPrimeNumberAt(int index){
        int prime=1;
        for(int i=0;i<index;i++){
            prime=getFirstPrimeNumber(prime+1);
        }
        return prime;
    }
}
