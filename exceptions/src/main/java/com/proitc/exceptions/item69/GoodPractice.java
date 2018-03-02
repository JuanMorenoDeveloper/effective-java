package com.proitc.exceptions.item69;

import com.proitc.exceptions.item69.objects.Foo;
import com.proitc.exceptions.item69.objects.Mountain;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class GoodPractice {
  public static void main(final String[] args) {
    final Mountain[] montains = new Mountain[] {new Mountain(), new Mountain(), new Mountain()};
    for (final Mountain m : montains) {
      m.climb();
    }

    final List<Foo> collection = Arrays.asList(new Foo(), new Foo());
    for (final Iterator<Foo> i = collection.iterator(); i.hasNext();) {
      final Foo foo = i.next();
    }
    //or better
    for (Foo foo:collection) {
      
    }
  }
}
