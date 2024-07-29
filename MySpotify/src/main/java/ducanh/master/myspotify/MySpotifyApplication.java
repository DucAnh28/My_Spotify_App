package ducanh.master.myspotify;

import ducanh.master.myspotify.constant.enums.RoleStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpotifyApplication.class, args);
		System.out.println(RoleStatus.ADMIN_ROLE.name());
	}

}
