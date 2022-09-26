package com.talentful.repos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.talentful.models.Identified;

public abstract class AbstractRepo<T extends Identified> {
    
    protected Map<String, T> datastore = new HashMap<>();

    public T get(String id) {
        return datastore.get(id);
    }

    public void save(T object) {
        datastore.put(object.getId(), object);
    }
    
    public T saveIfAbsent(T object) {
        return datastore.putIfAbsent(object.getId(), object);
    }

    public Collection<T> list() {
        return datastore.values();
    }
}
