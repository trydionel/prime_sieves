public class Primes
{
	/* Tests whether a given value is a real prime.
     @param testVal value to test
	 */
	private boolean isPrime(long testVal)
	{
		if ( testVal % 2 == 0 ) return false;
		double maxVal = Math.sqrt( testVal );
		for( long i = 3; i <= maxVal; i += 2 )
			if( testVal % i == 0 )
				return false;
		return true;
	}
}