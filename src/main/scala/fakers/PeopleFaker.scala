package fakers

object PeopleFaker
  extends BasedFaker {

  def firstName: String = faker.name.firstName

  def lastName: String = faker.name.lastName

  def fullName: String = s"${faker.name.firstName} ${faker.name.lastName}"

  def email: String = faker.internet.emailAddress

  def avatar: String = faker.internet.avatar

  def address: String = faker.address.fullAddress

}
