package ru.liga.ppr.exam.task_3_inheritance;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import ru.liga.ppr.exam.task_3_inheritance.abstractions.Bird;
import ru.liga.ppr.exam.task_3_inheritance.abstractions.Fish;
import ru.liga.ppr.exam.task_3_inheritance.abstractions.Mammal;
import ru.liga.ppr.exam.task_3_inheritance.abstractions.Vertebrates;
import ru.liga.ppr.exam.task_3_inheritance.animals.Albatross;
import ru.liga.ppr.exam.task_3_inheritance.animals.Human;
import ru.liga.ppr.exam.task_3_inheritance.animals.Iguana;
import ru.liga.ppr.exam.task_3_inheritance.animals.Moray;
import ru.liga.ppr.exam.task_3_inheritance.animals.Shark;
import ru.liga.ppr.exam.task_3_inheritance.enums.FlyType;
import ru.liga.ppr.exam.task_3_inheritance.enums.SwimType;

public class Task3Test {

	@Test
	void testAlbatrossFunctionality() {
		Object albatross = new Albatross();
		assertThat(albatross).isInstanceOf(Bird.class);
		if (albatross instanceof Bird b) {
			assertThat(b.fly()).isEqualTo(FlyType.FLAPPING_OF_WINGS);
			assertThat(b.countOfVertebra()).isEqualTo(50);
		}
	}

	@Test
	void testIguanaFunctionality() {
		Object iguana = new Iguana();
		assertThat(iguana).isInstanceOf(Iguana.class);
		assertThat(iguana).isInstanceOf(Vertebrates.class);
		if (iguana instanceof Vertebrates v) {
			assertThat(((Iguana) iguana).canDropTheTail()).isFalse();
			assertThat( v.countOfVertebra()).isEqualTo(40);
		}
	}

	@Test
	void testMorayFunctionality() {
		Object moray = new Moray();
		assertThat(moray).isInstanceOfAny(Fish.class, Vertebrates.class);
		if (moray instanceof Fish f) {
			assertThat(f.swim()).isEqualTo(SwimType.BODY_BENDING);
		}
		if (moray instanceof Vertebrates v) {
			assertThat(v.countOfVertebra()).isEqualTo(20);
		}
	}

	@Test
	void testSharkFunctionality() {
		Object shark = new Shark();
		assertThat(shark).isInstanceOfAny(Fish.class, Vertebrates.class);
		if (shark instanceof Fish f) {
			assertThat(f.swim()).isEqualTo(SwimType.FIN);
		}
		if (shark instanceof Vertebrates v) {
			assertThat(v.countOfVertebra()).isEqualTo(20);
		}
	}

	@Test
	void testHumanFunctionality() {
		Object human = new Human();
		assertThat(human).isInstanceOf(Mammal.class);
		if (human instanceof Mammal m) {
			assertThat(m.countOfVertebra()).isEqualTo(33);
		}
	}

}
