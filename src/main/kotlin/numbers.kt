fun main () {
    print("Enter a number from 1 to 10: ")
    when(readLine()!!.toString()) {
        "1" -> print("The number 1 is Nje in Albanian.")
        "2" -> print("The number 2 is Dy in Albanian.")
        "3" -> print("The number 3 is Tre in Albanian.")
        "4" -> print("The number 4 is Kater in Albanian.")
        "5" -> print("The number 5 is Pese in Albanian.")
        "6" -> print("The number 6 is Gjashte in Albanian.")
        "7" -> print("The number 7 is Shtate in Albanian.")
        "8" -> print("The number 8 is Tete in Albanian.")
        "9" -> print("The number 9 is Nente in Albanian.")
        "10" -> print("The number 10 is Dhjete in Albanian.")


        else -> print("You are out of range. I don't know anything about it")
    }
}