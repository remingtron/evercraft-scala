package evercraft

class Attack(attacker: Hero, defender: Hero, roll: Int) {

  def attack: Hero = {
    val attackLanded = (roll + attacker.attackModifier) >= (defender.armorClass + defender.dexterity)
    if (attackLanded) {
      val multiplier = if (roll == 20) 2 else 1
      val damageDealt = 1 + attacker.strength
      val startingHitPoints = defender.hitPoints + defender.constitution
      defender.copy(hitPoints = startingHitPoints - (multiplier * damageDealt).max(1))
    }
    else
      defender
  }
}


