fun getYearEra(year: Int): String {

    return when (year) {

        in 0..1969 -> "before"
        1970 -> "equals"
        in 1900..2000 -> "after (XX century)"
        in 2001..2100 -> "after (XXI century)"
        in 2100..10000 -> "distant future"
        else -> {
        "don't now"
        }
    }
}
    //before
    //equals
    //after (XX century)
    //after (XXI century)
    //distant future
    //Например:
    //
    //2712  -> "distant future"
    //1971  -> "after (XX century)"
    //Из консоли/в консоль ничего читать/писать не нужно!enter your function implementation here

