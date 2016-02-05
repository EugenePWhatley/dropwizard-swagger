package provider

class FizzBuzzProvider {
    List count(int i) {
        List counter = []
        1.upto(i, {
            counter.add(it)
        })
        counter
    }
}
