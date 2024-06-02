package com.anteiku.pruebatcnica

fun main() {
    var npc = BaseCharacter("Andrew", 100, 40)
    var caballero = Knight("Arthur", 200, 70)
    var mago = Mage("Merlin", 50, 100)

    println("El personaje base ${npc.name} ${npc.attack()}")
    println("El caballero ${caballero.name} ${caballero.attack()}")
    println("El mago ${mago.name} ${mago.attack()}")
}