package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * プレイヤーはモンスターデッキを持つ
 * Deck：MonsterのArrayList
 */
public class Player {
  String name;
  ArrayList<Monster> deck = new ArrayList<>();
  LinkedList<Integer> rndNumList = new LinkedList<Integer>();
  int hp;

  Player(LinkedList<Integer> rndNumList, String playerName, int hp) {
    this.rndNumList = rndNumList;
    this.name = playerName;
    this.hp = hp;
    drawMonsters();
  }

  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.deck.add(new Monster(this.rndNumList.pop(), this.rndNumList.pop()));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Player: " + this.name + "\n");
    sb.append("HP: " + this.hp + "\n");
    sb.append("Deck:" + this.name + "\n");
    for (Monster m : this.deck) {
      sb.append(m.toString()).append("\n");
    }
    return sb.toString();
  }
}
