package machine
import kotlin.system.exitProcess
class CoffeeMaker{
    var havewater: Int = 400
    var havemilk: Int = 540
    var havebean: Int = 120
    var disposablecups: Int = 9
    var havemoney = 550
    fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        val typecoffee = readln()
        if (typecoffee == "1") {
            if (havewater >= 250 && havebean >= 16 && disposablecups >= 1) {
                havewater -= 250
                havebean -= 16
                disposablecups -= 1
                havemoney += 4
            } else if (havewater < 250) {
                println("Sorry, not enough water!\n")
            } else if (havebean < 16) {
                println("Sorry, not enough coffee beans!\n")
            } else if (disposablecups < 1) {
                println("Sorry, not enough disposable cups!\n")
            }
        } else if (typecoffee == "2") {
            if (havewater >= 350 && havemilk >= 75 && havebean >= 20 && disposablecups >= 1) {
                havewater -= 350
                havemilk -= 75
                havebean -= 20
                disposablecups -= 1
                havemoney += 7
            } else if (havewater < 350) {
                println("Sorry, not enough water!\n")
            } else if (havemilk < 75) {
                println("Sorry, not enough coffee beans!\n")
            } else if (havebean < 16) {
                println("Sorry, not enough coffee beans!\n")
            } else if (disposablecups < 1) {
                println("Sorry, not enough disposable cups!\n")
            }
        } else if (typecoffee == "3") {
            if (havewater >= 200 && havemilk >= 100 && havebean >= 12 && disposablecups >= 1) {
                havewater -= 200
                havemilk -= 100
                havebean -= 12
                disposablecups -= 1
                havemoney += 6
            } else if (havewater < 200) {
                println("Sorry, not enough water!\n")
            } else if (havemilk < 100) {
                println("Sorry, not enough coffee beans!\n")
            } else if (havebean < 12) {
                println("Sorry, not enough coffee beans!\n")
            } else if (disposablecups < 1) {
                println("Sorry, not enough disposable cups!\n")
            }
        }
        else if(typecoffee == "back"){
            return main()
        }
    }
    fun fill(){
        println("Write how many ml of water you want to add: ")
        val addwater = readln().toInt()
        havewater += addwater
        println("Write how many ml of milk you want to add: ")
        val addmilk = readln().toInt()
        havemilk += addmilk
        println("Write how many grams of coffee beans you want to add: ")
        val addbean = readln().toInt()
        havebean += addbean
        println("Write how many disposable cups you want to add: ")
        val adddiscup = readln().toInt()
        disposablecups += adddiscup
    }
    fun take(){
        println("I gave you \$$havemoney\n")
        havemoney = 0
    }
    fun remaining(){
        println("The coffee machine has:\n" +
                "$havewater ml of water\n" +
                "$havemilk ml of milk\n" +
                "$havebean g of coffee beans\n" +
                "$disposablecups disposable cups\n" +
                "\$$havemoney of money")
    }
}
fun main() {
//    println("Starting to make a coffee\n" +
//            "Grinding coffee beans\n" +
//            "Boiling water\n" +
//            "Mixing boiled water with crushed coffee beans\n" +
//            "Pouring coffee into the cup\n" +
//            "Pouring some milk into the cup\n" +
//            "Coffee is ready!")
//    println("Write how many cups of coffee you will need:")
//    val cup = readln().toInt()
//    println("For $cup cups of coffee you will need:")
//    println("${cup*200} ml of water\n" +
//            "${cup*50} ml of milk\n" +
//            "${cup*15} g of coffee beans")
//    println("Write how many ml of water the coffee machine has:")
//    val water = readln().toInt()
//    println("Write how many ml of milk the coffee machine has:")
//    val milk = readln().toInt()
//    println("Write how many grams of coffee beans the coffee machine has:")
//    val bean = readln().toInt()
//    val cupw = water / 200
//    val cupm = milk / 50
//    val cupb = bean / 15
//    val cupcanserve = minOf(cupw, cupb, cupm)
//    if (cupcanserve > 0) {
//        println("Write how many cups of coffee you will need:")
//        val need = readln().toInt()
//        if (cupcanserve - need > 0) {
//            val N = cupcanserve - need
//            println("Yes, I can make that amount of coffee (and even $N more than that)")
//        } else if (cupcanserve - need == 0) {
//            println("Yes, I can make that amount of coffee")
//        } else {
//            println("No, I can make only $cupcanserve cups of coffee")
//        }
//    }
//    println("The coffee machine has:\n" +
//            "400 ml of water\n" +
//            "540 ml of milk\n" +
//            "120 g of coffee beans\n" +
//            "9 disposable cups\n" +
//            "\$550 of money")
    val coffeeMaker = CoffeeMaker()
    while (true) {
        println("Write action (buy, fill, take, remaining, exit): ")
        when(readln()) {
            "buy" -> coffeeMaker.buy()
            "fill" -> coffeeMaker.fill()
            "take" -> coffeeMaker.take()
            "remaining" -> coffeeMaker.remaining()
            "exit" -> exitProcess(0)
        }
    }
}
