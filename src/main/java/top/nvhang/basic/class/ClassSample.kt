package top.nvhang.basic.`class`

/**
 * 无法被继承
 * 默认由public修饰
 */
class Invoice {
    var i = 0
}

class Empty


class Person private constructor(firstName: String)

class Person2(firstName: String)

class Person3(firstName: String = "")
class Person4(firstName: String) {
    init {
        println("init block")
    }

    constructor(firstName: String, secondName: String) : this(firstName) {
        println("second constructor")
    }

}

open class Base(firstName: String)

class Parent(firstName: String, secondName: String) : Base(firstName)

class Parent2 : Base {
    constructor(firstName: String) : super(firstName)
}

open class Base2 {
    open fun baseFun() {}
}

class Parent3 : Base2() {
    override fun baseFun() {
        println("implements base fun")
    }
}

/**
 * 参数覆盖
 */
open class Base3 {
    open var var1 = 0
    open val val2 = 0
}

class Parent4 : Base3() {
    override var var1 = 1
    override var val2 = 1

}


open class Rectangle {
    open fun draw() {

    }
}

interface Polygon {
    fun draw() {

    }
}

/**
 * 对象表达式
 */
class AnonymousClass {
    var polygon = object : Polygon {
        override fun draw() {
            println()
        }
    }


    fun draw(polygon: Polygon) {
        polygon.draw()
    }
}

class Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Polygon>.draw()
        super<Rectangle>.draw()
    }
}

class C{
    private fun foo() = object {
        var x : String = "x"
    }
    fun publicFoo() = object {
         var x : String = "x"
    }

    fun bar(){
        var x1 = foo().x

        // var x2 = publicFoo().x
    }
}

/**
 * 对象声明
 */
// 单例
object DataProviderManager{
    fun fun1(){

    }
    fun  fun2(){

    }
}

class MyClass(str : String){
    var strValue = str

    companion object Factory{
        /**
         * 成员变量的实例对象
         */
        fun create1() = MyClass("a")

        /**
         * 静态变量的实例对象
         */
        @JvmStatic fun create2() = MyClass("b")
    }

    object Factory2{
        fun create3() = MyClass("c")
    }


    fun test(){
        MyClass.create1()
        MyClass.create2()
        MyClass.Factory2.create3()
    }

}



class main {



    var person2 = Person2("hello")
    var person3 = Person3()

    fun main(args: Array<String>) {
        var student = object {
            var age = 0
            var sex = 1
        }
        println("$student.age $student.sex")
    }
}