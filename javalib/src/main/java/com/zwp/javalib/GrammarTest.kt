package com.zwp.javalib

import jdk.nashorn.internal.objects.Global.print
import jdk.nashorn.internal.objects.Global.println

fun main(args: Array<String>) {
    var quantity = 5
    val price: Double = 20.3
    val name: String = "大米"

    println("单价:$price")
    println("数量:$quantity")
    println("产品:$name 总计:${quantity * price}")

    //in关键字的使用
    //判断一个对象是否在某一个区间内，可以使用in关键字
//如果存在于区间(1,Y-1)，则打印OK
    var x = 2;
    if (x in 1..5)
        print("OK")

////如果x不存在于array中，则输出Out
//    if (x !in 0..array.lastIndex)
//        print("Out")
//
////打印1到5
//    for (x in 1..5)
//        print(x)
//
////遍历集合(类似于Java中的for(String name : names))
//    for (name in names)
//        println(name)
//
////如果names集合中包含text对象则打印yes
//    if (text in names)
//        print("yes")
}