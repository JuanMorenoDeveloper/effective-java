package com.proitc.exceptions.item69;

import com.proitc.exceptions.item69.objects.Foo;
import com.proitc.exceptions.item69.objects.Range;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class BadPractice {
  public static void main(final String[] args) {
    final Range[] ranges = new Range[] {new Range(), new Range(), new Range()};
    // Horrible abuse of exceptions. Don't ever do this!
    try {
      int i = 0;
      while (true) {
        ranges[i++].climb();
      }
    } catch (final ArrayIndexOutOfBoundsException e) {
    }

    final List<Foo> collection = Arrays.asList(new Foo(), new Foo());
    // Do not use this hideous code for iteration over a collection!
    try {
      final Iterator<Foo> i = collection.iterator();
      while (true) {
        final Foo foo = i.next();
      }
    } catch (final NoSuchElementException e) {
    }
  }
}
