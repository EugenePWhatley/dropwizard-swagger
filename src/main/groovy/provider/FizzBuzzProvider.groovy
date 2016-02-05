package provider

class FizzBuzzProvider {
    List count(int i) {
        List counter = []
        1.upto(i, {
            if (it == 3) {
                counter.add('fizz')
            } else if (it == 5) {
                counter.add('buzz')
            } else {
                counter.add(it)
            }
        })
        counter
    }
}
