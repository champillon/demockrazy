package fakers

import org.scalatest.FlatSpec

/**
  * Created by champillon on 5/18/2017 AD.
  */
class BillingFakerSpec
  extends FlatSpec {

  "buying" should
    "return things that can buy" in {
    val result = BillingFaker.buying

    assert(result.isInstanceOf[String])
  }

}
