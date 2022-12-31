package br.com.felipeb.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

  @Test
  void testarSeIgualADois() {
    int a = 1+1;
    
    assertEquals(2,a);
  }
  
  @Test
  void testarSeIgualATres() {
    int a = 1+2 - 7+ 7;
    
    assertEquals(3,a);
  }
}
