package semonster2;

import java.util.HashMap;
import java.util.LinkedList;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();
  LinkedList<Integer> randomNumberList = new LinkedList<Integer>();

  /**
   * 0~4までの値がランダムに一定数格納されたLinkedList
   *
   * @param randomNumberList
   */
  SeMonsterGame(LinkedList<Integer> randomNumberList) {
    this.randomNumberList = randomNumberList;
  }

  /**
   * プレイヤーを追加
   *
   * @param playerName
   */
  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(this.randomNumberList, playerName, 100));
  }

  void draw(String playerName) {
    Player player = this.playerMap.get(playerName);
    if (player != null) {
      System.out.println(player);
    } else {
      System.out.println("Player not found: " + playerName);
    }
  }
}
