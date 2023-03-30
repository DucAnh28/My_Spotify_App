package ducanh.master.myspotify.domain.role;

import ducanh.master.myspotify.constant.enums.RoleStatus;
import ducanh.master.myspotify.domain.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "role")
@Table(name = "tbl_role")
public class Role extends BaseEntity implements GrantedAuthority{

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private RoleStatus roleStatus;

    @Override
    public String getAuthority() {
        return roleStatus.name();
    }
}
