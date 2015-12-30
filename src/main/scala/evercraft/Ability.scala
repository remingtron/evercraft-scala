package evercraft

class Ability(val score: Int = 10) {
  def modifier = {
    Math.floor((score - 10) / 2.0).toInt
  }
}

object Ability {
  implicit def intToAbility(score : Int): Ability = new Ability(score)
  implicit def abilityToInt(ability: Ability): Int = ability.modifier
}
