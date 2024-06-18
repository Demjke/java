package lesson4.view;

import lesson4.model.Teatcher;

import java.util.Collections;
import java.util.List;

public class TeatcherView implements UserView<Teatcher> {

    @Override
    public void sendOnConsole(List<Teatcher> teatchers) {
        Collections.sort(teatchers);
        for (Teatcher teatcher : teatchers) {
            System.out.println(teatcher);
        }
    }

}