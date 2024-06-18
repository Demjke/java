package lesson4.controller;

import lesson4.model.Teatcher;
import lesson4.service.TeatchersService;

public class TeatchersController implements GroupController<Teatcher> {
    private TeatchersService teatchers;

    public TeatchersController(TeatchersService teatchers) {
        this.teatchers = teatchers;
    }

    @Override
    public void add(Teatcher teatcher) {
        teatchers.addTeatcher(teatcher);
    }

    @Override
    public void update(int index, Teatcher teatcher) {
        if (index >= 0 && index < teatchers.getTeatchers().size()) {
            teatchers.getTeatchers().set(index, teatcher);
        }
    }
}