package evercraft

import org.scalatest.{Matchers, path}

class AttackTests extends path.FunSpec with Matchers {

  describe("evercraft.Attack") {

    val attacker = new Hero(name = "Foo")
    val defender = new Hero(name = "Bar")

    def defenderAfterAttackWithRoll(roll: Int): Hero = {
      new Attack(attacker, defender, roll).attack
    }

    it("removes one damage when attack roll is greater than armor") {
      defenderAfterAttackWithRoll(11).hitPoints shouldBe 4
    }

    it("does not remove damage when attack roll is less than armor") {
      defenderAfterAttackWithRoll(9).hitPoints shouldBe 5
    }

    it("removes one damage when attack roll is same as armor") {
      defenderAfterAttackWithRoll(10).hitPoints shouldBe 4
    }

    it("doubles damage when roll is 20") {
      defenderAfterAttackWithRoll(20).hitPoints shouldBe 3
    }
  }
}