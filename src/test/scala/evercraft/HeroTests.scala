package evercraft

import org.scalatest.{Matchers, path}

class HeroTests extends path.FunSpec with Matchers {

  describe("evercraft.Hero") {

    it("has a name") {
      val hero: Hero = new Hero(name = "Ovi")
      hero.name shouldBe "Ovi"
    }

    it("has an alignment") {
      val hero = new Hero(name = "Brian", alignment = Alignment.Evil)
      hero.alignment shouldBe Alignment.Evil
    }

    it("has a default alignment of Neutral") {
      val hiro: Hero = new Hero(name = "Hiro")
      hiro.alignment shouldBe Alignment.Neutral
    }

    it("can have a good alignment") {
      val hero = new Hero(name = "Brian", alignment = Alignment.Good)
      hero.alignment shouldBe Alignment.Good
    }

    it("has a default armor class of 10") {
      val hero = new Hero(name = "Brandon")
      hero.armorClass shouldBe 10
    }

    it("has default hitpoints of 5") {
      val hero = new Hero(name = "Remy")
      hero.hitPoints shouldBe 5
    }

    it("is dead when hit points is 0") {
      val hero = new Hero(name = "Guy", hitPoints = 0)
      hero.isAlive shouldBe false
    }

    it("is alive when hit points is greater than 0") {
      val hero = new Hero(name = "Guy", hitPoints = 1)
      hero.isAlive shouldBe true
    }

    it("has 10 strength by default") {
      val hero = new Hero(name = "Guy")
      hero.strength.score shouldBe 10
    }

    it("also has 10 dexterity, constitution, wisdom, intelligence and charisma") {
      val hero = new Hero(name = "Guy")
      hero.dexterity.score shouldBe 10
      hero.constitution.score shouldBe 10
      hero.wisdom.score shouldBe 10
      hero.intelligence.score shouldBe 10
      hero.charisma.score shouldBe 10
    }

    it("has default attack power of one") {
      val attackerWithSomeStrength = new Hero()
      attackerWithSomeStrength.attackModifier shouldBe 0
    }

    it("has modified attack power based on strength") {
      val attackerWithSomeStrength = new Hero(strength = 12)
      attackerWithSomeStrength.attackModifier shouldBe 1
    }

    /*
    it("adds strength modifier to roll and damage dealt") {
      val attackerWithStrengthModifierOne = new Hero(strength = new Ability(12))
      val defenderResult: Hero = new Attack(attackerWithStrengthModifierOne, defender, 9).attack
      defenderResult.hitPoints shouldBe 3
    }

    it("adds double strength modifier to damage dealt for critical hits") {
      val attackerWithStrengthModifierOne = new Hero(strength = 12)
      val defenderResult: Hero = new Attack(attackerWithStrengthModifierOne, defender, 20).attack
      defenderResult.hitPoints shouldBe 1
    }

    it("inflicts a damage of no less than 1 even when strength modifier is negative") {
      val attackerWithStrengthModifierNegativeOne = new Hero(strength = 8)
      val defenderResult = new Attack(attackerWithStrengthModifierNegativeOne, defender, 11).attack
      defenderResult.hitPoints shouldBe 4
    }

    it("inflicts a minimum of one damage even on critical hits") {
      val attackerWithStrengthModifierNegativeTwo = new Hero(strength = 6)
      val defenderResult = new Attack(attackerWithStrengthModifierNegativeTwo, defender, 20).attack
      defenderResult.hitPoints shouldBe 4
    }

    it("adds positive dexterity modifier to armor class") {
      val defenderWithDexterityOne = new Hero(dexterity = 12)
      val defenderResult = new Attack(attacker, defenderWithDexterityOne, 10).attack
      defenderResult.hitPoints shouldBe 5
    }

    it("applies defender's positive constitution modifier to hit points") {
      val defenderWithPositiveConstitution = new Hero(constitution = 12)
      val defenderResult = new Attack(attacker, defenderWithPositiveConstitution, 10).attack
      defenderResult.hitPoints shouldBe 5
    }
    */
  }

}
