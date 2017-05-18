package fakers

import definitions.ShakespeareQuoteType._


/**
  * Created by champillon on 5/18/2017 AD.
  */
object ShakespeareFaker
  extends BasedFaker {

  def quote(quoteType: ShakespeareQuoteType): String =
    quoteType match {
      case ROMEO_AND_JULIET => faker.shakespeare.romeoAndJulietQuote
      case HAMLET => faker.shakespeare.hamletQuote
      case AS_YOU_LIKE_IT => faker.shakespeare.asYouLikeItQuote
      case KING_RICHARD_III => faker.shakespeare.kingRichardIIIQuote
    }


}
