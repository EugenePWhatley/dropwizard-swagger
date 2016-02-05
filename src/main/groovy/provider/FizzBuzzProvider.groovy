package provider

class FizzBuzzProvider {
    List count(int i) {
        List counter = []
        1.upto(i, {
            if(isDivisibleByThree(it) && isDivisibleByFive(it)) {
                counter.add('FizzBuzz')
            } else if (isDivisibleByThree(it)) {
                counter.add('Fizz')
            } else if (isDivisibleByFive(it)) {
                counter.add('Buzz')
            } else {
                counter.add(it)
            }
        })
        counter
    }

    private boolean isDivisibleByFive(int number) {
        number % 5 == 0
    }

    private boolean isDivisibleByThree(int number) {
        number % 3 == 0
    }
}
