package org.example.Formula1_Api.Exceptions;

public class PilotNotFoundException extends RuntimeException {
  public PilotNotFoundException(String message) {
    super(message);
  }
}
