
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

