package fakers

import org.scalatest._

class AmountFakerSpec
  extends FlatSpec {

  "consumer" should
    "return amount of consumer product within 10,000.00" in {
    val result = AmountFaker.consumer

    assert(result.isInstanceOf[Double])
    assert(result < 10000.00)
  }
}
