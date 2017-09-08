package fakers

import org.scalatest.FlatSpec

class PeopleFakerSpec
  extends FlatSpec {

  "firstName" should
    "return firstName" in {
    val result = PeopleFaker.firstName

    assert(result.isInstanceOf[String])
  }

  "lastName" should
    "return lastName" in {
    val result = PeopleFaker.lastName

    assert(result.isInstanceOf[String])
  }

  "fullName" should
    "return firstName + lastName" in {
    val result = PeopleFaker.fullName

    assert(result.isInstanceOf[String])
  }

  "email" should
    "return email" in {
    val result = PeopleFaker.email

    assert(result.isInstanceOf[String])
  }

  "avatar" should
    "return avatar" in {
    val result = PeopleFaker.avatar

    assert(result.isInstanceOf[String])
  }

  "address" should
    "return address" in {
    val result = PeopleFaker.address

    assert(result.isInstanceOf[String])
  }

}
