package java;

import java.util.Iterator;

public class HashMap implements Iterable {

    private Entry[] table;
    private int capacity;
    private int size;

    @Override
    public Iterator iterator() {
        return new HashMapIterator();
    }

    private class Entry {
        private K key;
        private V value;
        private Entry next;
    }

    private class HashMapIterator implements Iterator {
        private int currentIndex;
        private Entry currentEntry;

        public HashMapIterator() {
            currentIndex = 0;
            currentEntry = table[currentIndex];
        }

        @Override
        public boolean hasNext() {
            while (currentIndex < capacity && currentEntry == null) {
                currentIndex++;
                if (currentIndex < capacity) {
                    currentEntry = table[currentIndex];
                }
            }
            return currentIndex < capacity && currentEntry != null;
        }

        @Override
        public V next() {
            V value = currentEntry.value;
            currentEntry = currentEntry.next;
            if (currentEntry == null && currentIndex < capacity) {
                currentIndex++;
                while (currentIndex < capacity && currentEntry == null) {
                    currentEntry = table[currentIndex];
                    currentIndex++;
                }
            }
            return value;
        }
    }
}


HashMap map = new HashMap();

map.put(1, "one");
map.put(2, "two");
map.put(3, "three");
