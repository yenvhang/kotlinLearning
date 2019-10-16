package top.nvhang.basic

fun main(args: Array<String>) {
    print("main entrance")
}

/**
 * 带返回值的函数
 */
fun sum(a : Int, b : Int) :Int{
    return a + b
}
fun sum1(a: Int, b : Int) : Int =  a + b

fun sum2(a: Int, b:Int) = a+b

/**
 * 没有返回值的函数
 */
fun printSum(a : Int,b : Int){
    print(a+b)
}

fun printSum1(a:Int,b : Int) : Unit{
    print(a+b)
}


fun useVar(){
    val constant = 1
    // 常量不能重新赋值
    //constant = 2
    // 变量可以重新赋值
    var variable = 1
    variable = 2
}

/**
 * 字符串模板使用
 */
fun strTemplate(){
    var a = 1
    println("a is $a")
    var str = "hello "
    println("${str.replace(" ","kotlin")}!")
}

/**
 * 条件表达式
 */
fun maxOf(a : Int ,b : Int) : Int{
    if(a > b){
        return a
    }
    else{
        return b
    }
}

fun maxOf2(a : Int , b :Int) = if(a > b) a else b

fun maxOf3(a : Int , b : Int) : Int {
   var maxVal = if (a > b) {
       a
   } else {
       b
   }
    return maxVal
}

/**
 * 空值与Null 检测
 */
fun getNull(a : String) : String?{
    return null
}

fun getNull2(a : String) : String {
    // 不能返回空
    //return null
    return "can not be null"
}

fun getNull3(){
    //不能编译通过，因为可能会存在空值
    //getNull("a").replace("a","b")
    var a = getNull("a")
    if (a != null){
        a.replace("a","b")
    }
}

fun getStringLength(obj : Any): Int?{
    //表达式内自动转换
    if(obj is String){
        return obj.length
    }
    //牛逼
    if(obj is String && obj.length > 1){
        return obj.length
    }
    //表达式外不能自动转换
    //return obj.length

    return null
}

fun forLoop(){
    var items = listOf<String>("a","b","c")
    for (item in items){
        println(item)
    }
    for(index in items.indices){
        println(index)
    }
}

/**
 * when 表达式
 */
fun describe(obj : Any) :String{

    return when (obj){
        1 -> "one"
        "hello" -> "greeting"
        is Long -> { return "long"}
        else -> "unknown"
    }
}

fun usingRange(){
    val a = 9
    val b = 10
    if(a in 1..b){
        println("$a is in range")
    }

    for(x in 1..5){
        println("range lop : $x")
    }

    for(x in 1..5  step 2){
        print(x)
    }

    for(x in 9 downTo 0){
        print(x)
    }
    for (x in 1 until 10){
        print(x)
    }
}

fun usingLambda(){
    var items = listOf("a","b","c")
    items.filter { it.startsWith("a") }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}