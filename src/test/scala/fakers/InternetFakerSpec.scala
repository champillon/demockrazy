package fakers

import org.scalatest.FlatSpec

/**
  * Created by champillon on 5/18/2017 AD.
  */
class InternetFakerSpec
  extends FlatSpec {

  "imageUrl" should
    "return random url of image" in {
    val result = InternetFaker.imageUrl

    assert(result.isInstanceOf[String])
  }

}
