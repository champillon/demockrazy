package fakers

import scala.util.Random

/**
  * Created by champillon on 5/18/2017 AD.
  */
object AmountFaker
  extends BasedFaker {

  def consumer: Double =
    faker.number.randomDouble(Random.nextInt(5), 1, 10000)

}
