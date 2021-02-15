public class Primes {
    // Verifica se o número n é primo (apenas divisível por 1 e por si próprio)

    static boolean isPrime(int n) {

    int flag=0;

    for (int i=2; i < Math.sqrt(n);i++){
      if(n % i == 0){
        flag++;
        break;
}
}
    if(flag==0)
      return true;
    else
      return false;
}

    public static void main(String[] args) {

	int n=1000; // Limite dos números

	for (int i=2; i<=n; i++)
	    if (isPrime(i))
		System.out.println(i);
    }
}
