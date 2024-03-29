package semonster2;

public class Monster {
  String name;
  int rare; // 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
    if (this.rare >= 3) {
      this.name = this.evolveMonster(this.name);
    }
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  String evolveMonster(String name) {
    // 進化する際の名前を決定します。実際のゲームに合わせて適切な名前に変更してください。
    return name + "（進化）";
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
