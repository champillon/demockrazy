package fakers

import org.joda.time.DateTime
import org.scalatest.FlatSpec

/**
  * Created by champillon on 5/18/2017 AD.
  */
class DateFakerSpec
  extends FlatSpec {

  "futureDate" should
    "return next day:Int day from today" in {
    val result = DateFaker.futureDate(3)

    assert(result.isInstanceOf[DateTime])
    assert(result.isAfter(DateTime.now))
  }

  "futureDateRandom" should
    "return next random(20) day from today" in {
    val result = DateFaker.futureDateRandom

    assert(result.isInstanceOf[DateTime])
    assert(result.isAfter(DateTime.now))
  }

}
