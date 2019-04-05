fun main() {

    tutorial1()
    tutorial2()
    tutorial3()

//    class ContainerClass {
//        companion object {
//            fun method() = println("method")
//        }
//    }
//
//    ContainerClass.method()

}

//変数定義
fun tutorial1() {
    println("tutorial1==>")
    //varは再代入可能。
    var a = 1
    a = 2 //再代入
    //valはイミュータブルで再代入できない。
    val b = 2
    println(a)
    println(b)
}

//基本の型とリテラル
fun tutorial2() {
    //数値型
    val int = 123
    val long = 123L
    val float = 1.23F
    val double = 1.23
    //真偽値型
    val bool = true
    //文字列はプリミティブ型
    val char = '型'
    val string = "Kotolin"
    println("Hello $string.")
    println("Hello ${string}")
    println("Hello \$string. ")

}

//配列型
fun tutorial3() {
    val array1 = arrayOf(1,2,3)
    println(array1[0])
    println(array1[1])
    println(array1[2])
}

fun FizzBuzz() {
//    for (i in 1..100) {
//        if (i % 15 == 0)
//            println("FizzBuzz!")
//        else if (i % 3 == 0)
//            println("Fizz")
//        else if (i % 5 == 0)
//            println("Buzz")
//        else
//            println(i)
//    }

    //普通のif文よりwhen式は可読性が高い
    for (i in 1..100) {
        when {
            i % 15 == 0 -> println("FizzBuzz!")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}
