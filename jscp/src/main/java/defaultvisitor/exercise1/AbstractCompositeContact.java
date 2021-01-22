/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package defaultvisitor.exercise1;

import java.util.*;

public abstract class AbstractCompositeContact extends Contact {
    public abstract void add(Contact contact);
    public abstract void remove(Contact contact) ;
    public abstract int getNumberOfChildren();
}
