// private class and methods
class FizzBuzzConverter {

    String convert(int toConvertToFizzBuzz) { //, method name is 'convert' takes a string and convert it to an integer

        if ( toConvertToFizzBuzz % 15 == 0 ) {
            return "FizzBuzz";

        } else if ( toConvertToFizzBuzz % 3 == 0 ) {
            return "Fizz";

        } else if ( toConvertToFizzBuzz % 5 == 0 ) {
            return "Buzz";

        } else {
            return String.valueOf(toConvertToFizzBuzz);
        }
    }

}
