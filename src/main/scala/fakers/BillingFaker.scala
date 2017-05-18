package fakers

import scala.util.Random

/**
  * Created by champillon on 5/18/2017 AD.
  */
object BillingFaker
  extends BasedFaker {

  def buying: String = Random.nextInt(4) match {
    case 0 => s"beer of ${faker.beer.name}"
    case 1 => s"book of ${faker.book.title}"
    case 2 => s"cat of ${faker.cat.breed}"
    case 3 => s"ingredient of ${faker.food.ingredient}"
  }

}
