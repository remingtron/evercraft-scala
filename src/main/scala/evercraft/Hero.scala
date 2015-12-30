package evercraft

import evercraft.Alignment._

case class Hero(name: String = "Hero",
                alignment: Alignment = Alignment.Neutral,
                hitPoints: Int = 5,
                strength: Ability = new Ability,
                dexterity: Ability = new Ability,
                constitution: Ability = new Ability) {

  def armorClass: Int = 10

  def isAlive: Boolean = hitPoints > 0

  def attackModifier : Int = strength

  val wisdom = new Ability
  val intelligence = new Ability
  val charisma = new Ability
}
