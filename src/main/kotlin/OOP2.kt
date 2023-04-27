
class NibirunianClass {

    public var namePlate :String = ""
    public fun createNamePlate(name:String){

        namePlate  += "Live long and prosper, $name"


    }
}

class SimpleClass(var h:Int, var w:Int) {
    constructor(x1:Int,y1:Int,x2:Int,y2:Int):
        this(y2-y1,x2-x1)
}



class player(var str:Int =0, var dex:Int = 0, var XP:Int = 0, var lvl:Int = 1, var nextlvlxp:Int = 10 ){
    public fun recivexp(xp:Int){
        XP+=xp
        if(XP >=nextlvlxp) lvlUP()
        println("str=${str} dex=${dex} lvl=${lvl}")


    }
    private fun lvlUP(){
        lvl +=1
        str += if(lvl % 2 ==0) 1 else 0
        dex += if(lvl % 2 !=0) 0 else 1
        nextlvlxp += 100
    }
}

class SugarStorage(){
    var volume:Int = 0

    fun decreaseSugar(v:Int){
        if(v>0) volume - v
        if(volume<0) volume = 0
    }

    fun increaseSugar(v:Int){
        if(v>0) volume+v
    }
}

open class item (var lvl: Int, var weight: Double)

open class weapon (lvl:Int, weight:Double):item(lvl,weight){
    open fun calcDamage(): Int =42
}
class magic_weapon (lvl:Int, weight:Double):weapon(lvl,weight){
    override fun calcDamage():Int = super.calcDamage()*2
}

open class Bug(val rank: Int, val name:String) {
    open fun getSugarLimit(): Int{
        return rank
    }

    fun getId(): String{
        return "${rank}.${name}"
    }
}

class  BugCivilian(rank: Int, name:String):Bug(rank,name){
    override fun getSugarLimit(): Int {
        return rank/2
    }
}