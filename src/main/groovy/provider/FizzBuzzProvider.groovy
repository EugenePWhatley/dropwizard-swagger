package provider

class FizzBuzzProvider {
    List count(int i) {
        List counter = []
        1.upto(i, {
            if(it % 15 == 0) {
                counter.add('FizzBuzz')
            } else if (it % 3 == 0) {
                counter.add('Fizz')
            } else if (it % 5 == 0) {
                counter.add('Buzz')
            } else {
                counter.add(it)
            }
        })
        counter
    }
}
