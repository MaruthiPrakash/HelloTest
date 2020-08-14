package com.PraticePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students {
    int sid;
    String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Students(int sid, String sName) {
        this.sid = sid;
        this.sname = sName;
    }

    public String toString() {
        return sid + " " + sname;
    }
}

public class Student {
    public static void main(String[] args) {
        List<Students> sList = new ArrayList<>();
        sList.add(new Students(03, "AAA"));
        sList.add(new Students(02, "DDD"));
        sList.add(new Students(04, "CCC"));
        sList.add(new Students(01, "BBB"));

        //Collections.sort(sList, (e1, e2) -> (e1.sid > e2.sid) ? 1 : (e1.sid > e2.sid) ? 0 : -1);

        Collections.sort(sList, (e1,e2) -> (e1.sname.compareTo(e2.sname)));
        System.out.println(sList);

    }


}
