package fakers

import java.util.Date
import java.util.concurrent.TimeUnit

import org.joda.time.DateTime

import scala.util.Random

/**
  * Created by champillon on 5/18/2017 AD.
  */
object DateFaker
  extends BasedFaker {

  def futureDate(day: Int): DateTime =
    new DateTime(faker.date.future(day, TimeUnit.SECONDS, new Date))

  def futureDateRandom: DateTime =
    new DateTime(faker.date.future(Random.nextInt(20)
      , TimeUnit.SECONDS, new Date))

}
