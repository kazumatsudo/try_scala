import org.scalatest.{ DiagrammedAssertions, FunSuite }

class HelloWorldSpec extends FunSuite with DiagrammedAssertions {
  test("Hello should start with H") {
    assert("Hello".startsWith("H"))
  }
}