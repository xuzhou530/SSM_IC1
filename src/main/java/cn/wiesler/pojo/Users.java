package cn.wiesler.pojo;

public class Users {
    private Integer uid;

    private String uname;

    private String upassword;

    private Boolean isbusiness;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Boolean getIsbusiness() {
        return isbusiness;
    }

    public void setIsbusiness(Boolean isbusiness) {
        this.isbusiness = isbusiness;
    }
}