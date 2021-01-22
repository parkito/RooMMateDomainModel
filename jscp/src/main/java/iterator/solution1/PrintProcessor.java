/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package iterator.solution1;

public class PrintProcessor implements Processor<Object> {
    public boolean process(Object o) {
        System.out.println(">>> " + o);
        return true;
    }
}
