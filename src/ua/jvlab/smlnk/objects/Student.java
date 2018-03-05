package ua.jvlab.smlnk.objects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String SdtName;
    private String SdtLastN;
    private Date StdBirth;

    public String getSdtName() {
        return SdtName;
    }

    public void setSdtName(String sdtName) {
        SdtName = sdtName;
    }

    public String getSdtLastN() {
        return SdtLastN;
    }

    public void setSdtLastN(String sdtLastN) {
        SdtLastN = sdtLastN;
    }

    public String getStdBirth() {
        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(StdBirth);
    }

    public void setStdBirth(Date stdBirth) {
        StdBirth = stdBirth;
    }

    public Student(String StdName, String StdLastN, Date StdBirth) {
        super();
        this.SdtName = StdName;
        this.SdtLastN = StdLastN;
        this.StdBirth = StdBirth;
    }

    public Student() {
        super();
    }
}
