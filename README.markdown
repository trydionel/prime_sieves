#Prime Sieves
##Introduction
I did a lot of work on primes in college. As a result, whenever I'm playing with a new language, I'm compelled to implement a simple primality algorithm while testing things out. This project is a collection of these implementations.

##Caveats
This is the simplest of all primality algorithms -- a factorization loop.  It's naive and inefficient, but easy to understand.  It's by no means geared towards cryptography, number theory or really anything but exploration.  If you're looking for real primality tests, check out Wikipedia's entry on [fast deterministic primality tests](http://en.wikipedia.org/wiki/Primality_test#Fast_deterministic_tests). Lots of good leads there.

##Implementations
###Java
The original language I wrote this in as part of a research project.  It's a standard imperative approach and not especially exciting.

###Ruby
My current favorite language, this implementation feels super clean (unless you have a particular dislike for monkey-patching).  Patches over Integer to put the algorithm on the number itself.  Beautiful.

###Clojure
Still hacking away on this one.

###Erlang
Working through this one too.