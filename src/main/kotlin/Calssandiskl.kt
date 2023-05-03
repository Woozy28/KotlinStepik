import java.util.Collections

fun calculateWordStat(input:String): String{

    val names = input.split(" ") //Создаём список слов
    var maxNumber = 0  //Значение максимального количества повторений
    var maxName = ""  //Значение максимально повторяемого слова

    for(item in names.distinct()){  //цикл по "Различным" значениям списка
        var a = names.count{it == item} //переменная с количество повторений слова
        if (a > maxNumber){ //Если переменная с количеством повторений слова больше макимума
            maxNumber = a //то переменная максимум
            maxName = item //слово самое повторяемое
        }
    }
    return maxName
}

class DogException() : Exception()
open class CatException() : Exception()

fun checkClient(client : String) {
    if ("dog" in client)  throw DogException()
    if ("cat" in client)  throw CatException()
}

open class SphinxesException():Exception(){

}

//fun engineStatus(engineNumber:Int): String{
//    return try{rawEngineStatus(engineNumber)
//    }
//    catch (e:EngineNotFoundException){
//        return "engine <number> not found"
//    }
//    catch (e:SensorsMeltException){
//        return "engine <number> offline"
//    }
//}

