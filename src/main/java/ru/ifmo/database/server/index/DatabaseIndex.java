package ru.ifmo.database.server.index;

import java.util.Optional;

public interface DatabaseIndex<K, V> {
    void onIndexedEntityUpdated(K key, V value);

    Optional<V> searchForKey(K key);
}
