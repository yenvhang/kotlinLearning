package top.nvhang.basic.`class`

/**
 * 无法被继承
 * 默认由public修饰
 */
class Invoice{
    var i = 0
}

class Empty



class Person private constructor(firstName :String)

class Person2 (firstName: String)

class Person3 (firstName : String = "")
class Person4(firstName: String){
    init {
        println("init block")
    }
    constructor(firstName:String,secondName:String) : this(firstName){
        println("second constructor" )
    }

}

open class Base(firstName: String)

class Parent(firstName: String,secondName: String) : Base(firstName)

class Parent2 : Base{
    constructor(firstName: String) : super(firstName)
}

open class Base2{
    open fun baseFun() {}
}

class Parent3 : Base2() {
    override fun baseFun() {
        println("implements base fun")
    }
}

open class Base3{
    open var var1 = 0
    open val val2 = 0
}
class Parent4 : Base3() {
    override var var1 = 1
    override var val2 = 1

}
class main{

    var person2 = Person2("hello")
    var person3 = Person3()

    fun main(args: Array<String>) {


    }
}