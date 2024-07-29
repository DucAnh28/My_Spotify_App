package ducanh.master.myspotify.domain.user;

import ducanh.master.myspotify.domain.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tbl_customer")
public class Customer extends BaseEntity {

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "password")
    private String password;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;
}
