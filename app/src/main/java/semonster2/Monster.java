package semonster2;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum, rareNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber, int mrare) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    String evolutionMonsters[] = { "キングスライム", "キングサハギン", "キングドラゴン", "キングデュラハン", "キングシーサーペント" };
    if (mrare >= 3) {
      return evolutionMonsters[mnumber];
    } else {
      return monsters[mnumber];
    }
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
