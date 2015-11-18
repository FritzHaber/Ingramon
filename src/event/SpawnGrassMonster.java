package event;

import creature.Creature;
import creature.Tanimonster;

public class SpawnGrassMonster extends SpawnMonster {

	public SpawnGrassMonster() {

	}
	

	@Override
	public String toString() {
		return "SpawnGrassMonster";
	}


	@Override
	public Creature getCreature() {
		return new Tanimonster();
	}

}
