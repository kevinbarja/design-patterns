package com.alenasoft.behavioral.strategy;

public class CornerKickStrategy implements GameStrategy {

  @Override
  public void play(int numberOfPlayers) {
    System.out.printf("Ataque completo con %d jugadores\n", numberOfPlayers);
  }
}
