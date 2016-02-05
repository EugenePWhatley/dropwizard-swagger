package provider

class FizzBuzzProvider {
    List count(int i) {
        List counter = []
        1.upto(i, {
            if (it == 3) {
                counter.add('fizz')
            } else {
                counter.add(it)
            }
        })
        counter
    }
}
