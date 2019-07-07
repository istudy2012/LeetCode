package array;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar {

    private List<Integer> list = new ArrayList<>();

    public boolean book(int start, int end) {
        if (start < 0 || end < 0 || start >= end) {
            return false;
        }

        int index = binarySearch(start);
        if (index == 0) {
            if (list.isEmpty()) {
                list.add(start);
                list.add(end);
                return true;
            } else {
                return false;
            }
        } else if (index > 0) {
            if (index % 2 == 0) {
                return false;
            } else {
                if (index + 1 < list.size()) {
                    if (end <= list.get(index + 1)) {
                        list.add(index + 1, start);
                        list.add(index + 2, end);
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    list.add(start);
                    list.add(end);
                    return true;
                }
            }
        } else {
            index = -index - 1;
            if (index >= list.size()) {
                list.add(list.size(), start);
                list.add(list.size(), end);
                return true;
            } else {
                if (index % 2 == 1) {
                    return false;
                } else {
                    if (end <= list.get(index)) {
                        list.add(index, start);
                        list.add(index + 1, end);
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    private int binarySearch(int value) {
        int l = 0;
        int r = list.size() - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (list.get(m) == value) {
                return m;
            } else if (list.get(m) > value) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -l - 1;
    }

}
