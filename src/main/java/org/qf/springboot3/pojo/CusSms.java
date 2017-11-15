package org.qf.springboot3.pojo;


import javax.persistence.*;

@Table
@Entity
public class CusSms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    //普通字段映射:默认的字段名称就是属性名称，所以一般不用写
// @Column(name = "cname")
    private String cname;
    private String token;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
