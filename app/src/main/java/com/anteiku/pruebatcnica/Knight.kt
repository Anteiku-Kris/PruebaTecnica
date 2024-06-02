package com.anteiku.pruebatcnica

class Knight(name:String, health:Int, damage:Int): BaseCharacter(name,health,damage){

    override fun attack(damage: Int ): String {
        return "Tiene ${damage} puntos de daño FÍSICO"
    }
}