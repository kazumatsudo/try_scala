package hello

object HelloWorld extends App {
  val environment = sys.env.getOrElse("environment", "nothing")
  printf(s"Hello, World\nenvironment: ${environment}\n")
}
