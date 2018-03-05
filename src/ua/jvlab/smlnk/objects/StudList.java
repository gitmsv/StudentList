package ua.jvlab.smlnk.objects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StudList {

    private int n = 0;

    public int getN() {
        return n;
    }

    Student[] list = new Student[4];

    public void addStd(Student s) throws UsrExp {
        if (getN() == list.length) {
            throw new UsrExp();
        }
        list[n++] = s;
    }

    public Student getStd(int n) {
        return list[n];
    }

    public StudList(){
        super();
    }

    public int findStd(String name) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSdtName().equalsIgnoreCase(name)) return i;
        }
        return -1;
    }

    public void infoAll() {
        for (int i = 0; i < list.length; i++) {
            Student lst = list[i];
            if (lst != null) {
                System.out.println(lst.getSdtName() + " " + lst.getSdtLastN() + " " + lst.getStdBirth());
            }
        }

    }

    public String findStdFaml(String newName) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSdtLastN().equalsIgnoreCase(newName)) {
                return "find is Last name -> " + newName;
            }
        }
        return "no such Famile!";
    }

    public String findStdBirth(Date dt) {
        for (int i = 0; i < list.length; i++) {
            DateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
            if (list[i].getStdBirth().equals(sdf1.format(dt))) {
                return "find Date -> " + sdf1.format(dt);
            }
        }
        return "No such Date!"; /**доработать: >>> не выводит "No such Date!"
         // -- > Exception in thread "main" java.lang.NullPointerException*/
    }

    public String delStdNameAndFaml(String newNfaml) {
           for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSdtName().equals(newNfaml)) {
                list[i] = null;
                break;
            } else {
                if (list[i] != null && list[i].getSdtLastN().equals(newNfaml)) {
                    list[i] = null;
                    break;
                }
            }
        }
        return "Success...delete!";
    }

    }





