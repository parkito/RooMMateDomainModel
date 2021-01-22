/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.exercise1;

import maths.*;

import java.util.concurrent.atomic.*;

/**
 * This must count how many leaves there are in structure, how many distribution
 * lists and what the average number of contacts in a distribution list.
 * <p/>
 * Use the Statistics class to work out the mean and variance for the list
 * lengths.
 */

public class CountingVisitor implements DefaultVisitor {
    private final LongAdder leaves = new LongAdder();
    private final Statistics stats = new Statistics();

    public void visitAbstractLeafContact(AbstractLeafContact c) {
        leaves.increment();
    }

    public void visitAbstractCompositeContact(AbstractCompositeContact c) {
        stats.add(c.getNumberOfChildren());
    }

    public int getNumberOfLeaves() {
        return leaves.intValue();
    }

    public int getNumberOfComposites() {
        return stats.size();
    }

    public double getAverageNumberOfChildrenPerComposite() {
        return stats.getMean();
    }

    public double getVarianceNumberOfChildrenPerComposite() {
        return stats.getVariance();
    }
}
