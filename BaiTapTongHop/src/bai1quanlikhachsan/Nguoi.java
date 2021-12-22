package bai1quanlikhachsan;

public class Nguoi {
    private String name;
    private String birthday;
    private long cmtId;

    public Nguoi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getCmtId() {
        return cmtId;
    }

    public void setCmtId(long cmtId) {
        this.cmtId = cmtId;
    }

    public Nguoi(String name, String birthday, long cmtId) {
        this.name = name;
        this.birthday = birthday;
        this.cmtId = cmtId;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", cmtId=" + cmtId +
                '}';
    }
}
