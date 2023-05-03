fun getLength(str: String?):Int?{
    return str!!.length

}
fun calcNullValues(input: Array<Int?>):Array<Int>{


    var nullresult:Int=0
    var nonullresult:Int=0

    for (i in input)
        if(i!=null) nonullresult += i.toInt() else nullresult +=1

    val itog:Array<Int> = arrayOf(nullresult,nonullresult)

    return itog
}