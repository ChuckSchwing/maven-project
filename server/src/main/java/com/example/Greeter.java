package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param the name of the person
   * @return return the name of the person in the greeting
   *
   **/

  final public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
