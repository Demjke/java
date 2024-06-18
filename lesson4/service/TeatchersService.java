package lesson4.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lesson4.model.Teatcher;

public class TeatchersService {

    private List<Teatcher> teatchers = new ArrayList<>();

    public List<Teatcher> sort() {
        Collections.sort(teatchers);
        return teatchers;
    }

    public List<Teatcher> getAllTeatchers() {
        return new ArrayList<>(teatchers);
    }

    public void addTeatcher(Teatcher teatcher) {
        teatchers.add(teatcher);
    }

    public List<Teatcher> getTeatchers() {
        return teatchers;
    }
}