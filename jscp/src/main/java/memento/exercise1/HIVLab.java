/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */

package memento.exercise1;

import java.util.function.*;

public class HIVLab {
    public static void main(String... args) {
        LabRat mickey = new LabRat();
        while (true) {
            experiment(LabRat::feedDrugs, mickey);
            experiment(LabRat::blastWithRadar, mickey);
        }
    }

    private static void experiment(Consumer<LabRat> experiment, LabRat rat) {
        Memento previous = rat.createMemento();
        experiment.accept(rat);
        if (!rat.isAlive()) rat.setMemento(previous);
    }
}
