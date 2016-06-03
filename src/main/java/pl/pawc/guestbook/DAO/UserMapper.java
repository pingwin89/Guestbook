  package pl.pawc.guestbook.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pl.pawc.guestbook.POJO.User;

public class UserMapper implements RowMapper<User>{

  public User mapRow(ResultSet rs, int rowNum) throws SQLException{

    User user = new User();
    user.setId(rs.getInt("id"));
    user.setName(rs.getString("name"));
    user.setLocation(rs.getString("location"));
    user.setHashedPass("hashedPass");
    return user;

  }

}