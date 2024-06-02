package com.anteiku.pruebatcnica

open class BaseCharacter(name:String, health:Int,damage:Int){
    var name: String = name
    var health: Int = health
    var damage: Int = damage

   open fun attack(damage:Int = this.damage): String {
        return "Tiene daño de ${damage} puntos"
    }
}
