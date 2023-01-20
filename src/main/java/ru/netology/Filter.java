package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int x = 0;
        for (int i : source) {
            if (i >= treshold) {
                logger.log("Элемент " + i + " проходит");
                result.add(i);
                x++;
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        logger.log(" Прошел фильтр " + x + " элемента из " + source.size());
        return result;
    }
}

